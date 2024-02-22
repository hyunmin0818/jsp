<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="age_db.jsp">
		<!-- 이름 입력 폼 -->
		<label>이름
			<input type="text" name="name">
		</label><br/>
		<!-- 제출 버튼 -->
		<input type="submit">
	</form>
	<!-- 전체 확인 버튼 -->
	<input type="button" value="전체 확인하기" onclick="selectAll();">
	<script>
		// 전체 확인 스크립트
		function selectAll(){
			location.href = "age_all.jsp";
		}
	</script>
</body>
</html>
