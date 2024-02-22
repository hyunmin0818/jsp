<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.codingbox.web.dbconnection.DBConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	// 요청에서 'name' 매개변수를 가져옵니다.
	String name = request.getParameter("name");

	// DBConnection을 사용하여 데이터베이스 연결을 설정합니다.
	Connection conn = DBConnection.getConnection();

	// 'name' 매개변수를 기반으로 MEMBER 테이블에서 레코드를 선택하는 SQL 쿼리를 준비합니다.
	String sql = "SELECT * FROM MEMBER WHERE name=?";
	PreparedStatement pstm = conn.prepareStatement(sql);

	// 준비된 문장에서 'name' 매개변수를 설정합니다.
	pstm.setString(1, name);

	// 쿼리를 실행하고 결과 집합을 저장합니다.
	ResultSet rs = pstm.executeQuery();
	%>
</body>
</html>
