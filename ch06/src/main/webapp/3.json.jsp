<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>3.json</title>
	<script>
		document.addEventListener('DOMContentLeaded', function(){
			
			const btnUser1 = document.getElementById('btnUser1');
			const user1 = document.querySelector('.user1');
			const spans = user1.getElementsByTagName('span');
			
			btnUser1.onclivk = async function(){
				
				const response = await fetch('./data/user1.jsp');
				const data = await response.json();
				
				user1.
				
			}
		})
	</script>
</head>
<body>
	<h3>3.JSON 실습</h3>
	
	<a href="./data/user1.jsp">user1 요청하기</a><br>
	<a href="./data/user1.jsp">user1 요청하기</a><br>
	<a href="./data/user1.jsp">user1 요청하기</a><br>
	
	<h4>XML</h4>
	<a href="./data/xml1.jsp">xml1 요청하기</a>
	<a href="./data/xml2.jsp">xml1 요청하기</a>
	
	<h4>AJAX</h4>
	<button id="btnUser1">user1 요청</button>
	<p class="user1">
		uid : <span></span><br>
		uid : <span></span><br>
		uid : <span></span><br>
		uid : <span></span><br>
	</p>
</body>
</html>