package controller.user2;

import java.io.IOException;
import java.util.List;

import dto.User2DTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.User1Service;


@WebServlet("/user2/list.do")
public class ListController extends HttpServlet {

	private static final long serialVersionUID = 9140148960877801421L;
	
	private User2Service service = User2Service.getInstance();
	
	


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		// 전체 사용자 조회
		List<User2DTO> dtos = service.findAllUser1();
		
		
		// 데이터 공유(JSP에서 데이터를 출력하기 위해 request scope 저장)
		req.setAttribute("dtos", dtos);
		
		// view forward
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/user1/list.jsp");
		dispatcher.forward(req, resp);
	}
	
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
