<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String action = request.getParameter("user_name");
	action = action.trim();
	if (action == null ){
		action = "이름이 없습니다.";
	} else if (action.equals("")) {
		action = "이름을 입력하세요.";
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY JSP Page</title>
</head>
<body>
	<%=action %>
</body>
</html>