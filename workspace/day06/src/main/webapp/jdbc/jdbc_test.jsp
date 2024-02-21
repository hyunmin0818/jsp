<%@page import="java.sql.PreparedStatement"%>
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
	Connection conn = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "jsp";
	String password = "jsp";
	int check = 0;
	
	
	Class.forName(driver);
	System.out.println("jdbc Driver 로딩 성공");
	
	conn = DriverManager.getConnection(url, user, password);
	System.out.println("Oracle 연결 성공");
	
	String sql = "INSERT INTO car VALUES ('4','K7', 'Black', 70000000)";
	
	PreparedStatement pstm = conn.prepareStatement(sql);
	check = pstm.executeUpdate();
	System.out.println("check: " + check);
	
	if(check != 0) {
		System.out.println("데이터 삽입 성공");	
	} else {
		System.out.println("데이터 삽입 실패");
	}
	
	/*
		Insert, Update, Delete를 사용할때는
			-> pstm.executeUpdate()사용
			-> Insert, Update, Delete가 적용된 건수 return
		Select
			-> select된 결과값을 return
		Drop, Create
			-> 0이라는 결과값을 return
	*/
	
%>
</body>
</html>