<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>jstl test3(제어문-choose)</h2>
	chhose문을 사용, if~else문의 경우 jstl에서는 choose문을 사용
	<br />

	<c:set var="num" value="100" />
	<c:choose>
		<c:when test="${num > 50}">
			이 수는 50보다 크다<br>
		</c:when>
		<c:when test="${num > 30}">
			이 수는 30보다 크다<br>
		</c:when>
		<c:when test="${num > 10}">
			이 수는 10보다 크다<br>
		</c:when>
		<c:otherwise>
			이 수는 그 외의 숫자입니다.<br>
		</c:otherwise>
	</c:choose>
	
	＼゜＼、＼・、＼ 、＼・。゜、＼・＼。゜＼、・＼＼・ ＼。゜＼、<br>
＼゜＼、＼・、＼、＼・。 ゜(’ω’)우아아아아아아아아＼・＼。゜＼、、<br>
 ＼・。゜＼、・＼＼・＼。゜＼、＼゜ ＼、＼・、＼、＼・。゜、＼・＼。゜<br>
	
</body>
</html>