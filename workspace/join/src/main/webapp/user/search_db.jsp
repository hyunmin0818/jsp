<%@page import="com.codingbox.web.dto.MemberDTO"%>
<%@page import="com.codingbox.web.dao.MemberDAO"%>
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
	String userid = request.getParameter("userid");
	MemberDAO mdao = new MemberDAO();
	MemberDTO user =  mdao.searchById(userid);
	request.setAttribute("user", user);
	pageContext.forward("search_view.jsp");
%>
</body>
</html>