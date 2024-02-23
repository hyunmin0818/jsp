<%@page import="com.codingbox.web.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
        MemberDTO mdto = (MemberDTO) session.getAttribute("session_id");
		if(mdto != null){
    %>
    <script>
        alert("<%= mdto.getUsername()%>님 안녕하세요~!");
    </script>
	<p>
		<%= mdto.getUsername() %>님 도망치기<input type="button" value="로그아웃">
	</p>
	<%} else { %>
		<script>
			alert("로그인 후 이용하세요");
			location.href = "login_view.jsp";
		</script>
	<%} %>
</body>
</html>