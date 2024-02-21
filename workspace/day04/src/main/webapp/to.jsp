<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ansStr = request.getParameter("ans");
	int ans = 0;
	String result = null;
	if (ansStr != null && !ansStr.equals("") ){
		ans = Integer.parseInt(ansStr);
		if(ans == 300){
			result = "정답입니다.";
		}else{
			result = "정답이 아닙니다.";
		}
	} else {
		result = "응답 내용이 없습니다.";
	}
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>응답결과</h1>
	<p><%=result %></p>
</body>
</html>