<%@page import="java.sql.ResultSet"%>
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
	conn = DriverManager.getConnection(url, user, password);

	String sql = "select * from car";
	PreparedStatement pstm = conn.prepareStatement(sql);

	ResultSet rs = pstm.executeQuery();

	while (rs.next()) {
		out.print("차번호: " + rs.getString(1) + "<br>");
		out.print("차종류: " + rs.getString("BRAND") + "<br>");
		out.print("차색상: " + rs.getString(3) + "<br>");
		out.print("차종류: " + rs.getString("PRICE") + "원<br>");
		out.print("<br><hr>");
	}

	out.print("<br><hr>");
	String carnum = "3";
// 	sql = "SELECT * FROM CAR WHERE CARNUM = '" + carnum + "'";
	sql = "SELECT * FROM CAR WHERE CARNUM = ?";
	pstm = conn.prepareStatement(sql);
	pstm.setString(1, carnum);
	
	rs = pstm.executeQuery();
	if(rs.next()){
		out.print("차번호: " + rs.getString(1) + "<br>");
		out.print("차종류: " + rs.getString("BRAND") + "<br>");
		out.print("차색상: " + rs.getString(3) + "<br>");
		out.print("차종류: " + rs.getString("PRICE") + "원<br>");
		out.print("<br><hr>");
	}
	


// 객체 반납
	rs.close();
	pstm.close();
	conn.close();
	%>
</body>
</html>