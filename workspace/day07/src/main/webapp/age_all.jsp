<%@page import="com.codingbox.web.dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.codingbox.web.dbconnection.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="mdao" class="com.codingbox.web.dao.MemberDAO" />
	<%
	// 	MemberDAO mdao = new MemberDAO();
	ArrayList<MemberDTO> result = mdao.selectAll();
	%>
	<table border="1">
		<tr>
			<th>이름</th>
			<br>
			<th>나이</th>
			<br>
		</tr>
		
			<%
			for (MemberDTO member : result) {
			%>
		
		<tr>
			<th><%=member.getName()%></th>
			<th><%=member.getAge()%></th>
		</tr>
		
		<%} %>
	</table>
	<input type="button" value="다시 검색하기"
		onclick="location.href='age_search.jsp'">
</body>
</html>