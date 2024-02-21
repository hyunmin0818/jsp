<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <%= request.getParameter("user_id") %><br/>
	<%= request.getParameter("username") %> 님 어서오세요.<br/>



</body>
</html>