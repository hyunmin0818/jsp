<%@page import="com.codingbox.web.dao.userDAO"%>
<%@page import="com.codingbox.web.dto.userDTO"%>
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
	String userpw = request.getParameter("userpw");
	String username = request.getParameter("username");
	String userphone = request.getParameter("userphone");
	
	userDTO udto = new userDTO();
	udto.setUserpw(userpw);
	udto.setUserid(userid);
	udto.setUsername(username);
	udto.setUserphone(userphone);
	
	userDAO udao = new userDAO();
	boolean check = udao.join(udto);
	if(check){
		
		// 회원가입
	} else { // 가입실패
		
	}
	%>
	
</body>
</html>