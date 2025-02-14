<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	//데이터 수신
	String orderId = request.getParameter("orderId");
	String orderProduct = request.getParameter("orderProduct");
	String orderCount = request.getParameter("orderProduct");

	try{
		Context initCtx = new InitialContext();
		Context ctx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) ctx.lookup("jdbc/shop");
		
		Connection conn = ds.getConnection();
		
		String sql = "insert into `order` set `orderId`=?, `orderProduct`=?, `orderCount`=?, `orderDate`=NOW()";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, orderId);
		psmt.setString(2, orderProduct);
		psmt.setString(3, orderCount);
		
		// 재고수량 수정
		String updateSql = "update `product` set `stock` = `stock` - ? where `prodNo` = ?";
		PreparedStatement psmt2 = conn.prepareStatement(updateSql);
		psmt2.setString(1, orderCount);
		psmt2.setString(2, orderProduct);
		psmt2.executeUpdate();
		
		psmt.close();
		psmt2.close();
		conn.close();
		
		
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	//목록이동
	response.sendRedirect("/ch06/shop/order/list.jsp");
	


%>