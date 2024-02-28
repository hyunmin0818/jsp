<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Insert title here</title>
	</head>
	<body>
	    <form action="search_db.jsp">
⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⣄⡀⠀⠀⡠⠞⠛⢦⣠⢤⡀⠀		<br>
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢠⠏⠀⠀⢱⡀⣸⠁⠀⡴⠋⠀⠀⣹⠀<br>
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠉⢿⢀⡤⠶⣴⠇⣯⠀⣼⠁⠀⢀⡴⠷⣄<br>
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠁⠀⣀⡾⠋⠀⠀⢹⣼⠁⢠⡇⠀⡴⠋⠀⠀⡼<br>
⠀⠀⠀⠀⢠⠊⠑⢦⠀⡴⠋⢀⣠⠞⠉⠀⠀⠀⣠⣿⠧⣄⡾⠁⡼⠁⣀⣤⠾⡁<br>
⠀⠀⠀⠀⢸⠀⠀⣨⠟⠁⢠⡞⠁⠀⠀⠀⣠⡾⠛⠁⠀⣿⠃⣰⠃⣴⠋⠀⠀⣷<br>
⠀⠀⠀⠀⣸⢠⠞⠁⠀⢠⠏⠀⠀⢀⡴⠋⠁⠀⢀⣠⡴⠿⣶⡇⢰⠇⠀⠀⢠⠇<br>
⠀⠀⠀⢠⢿⠏⠀⠀⠀⠉⠀⠀⣠⠞⠁⠀⡴⠚⠉⠁⠀⢀⡟⠀⣼⠀⠀⠀⢸⠀<br>
⠀⠀⠀⡾⣼⢀⠀⠀⠀⠀⠀⠈⠉⠀⣠⠞⠁⠀⠀⢀⡴⠋⠙⢼⠃⠀⠀⠀⣸⠀<br>
⠀⠀⠀⡇⠉⡎⠀⣰⠃⠀⠀⠀⠀⠀⠁⠀⠀⠀⡼⠉⠀⠀⠀⠘⠂⠀⠀⣠⠇⠀<br>
⠀⠀⠀⡇⢸⠀⣰⠃⠀⡴⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⣠⠖⠁⠀⠀<br>
⠀⠀⢸⠁⡏⢠⠃⢀⠞⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⢀⣠⠖⠋⠁⠀⠀⠀⠀<br>
⠀⠀⡞⠀⠃⡎⢀⠏⠀⠀⠀⠀⠀⠀⢀⡏⠀⣀⡤⠴⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀<br>
⡴⢺⠇⠀⠀⠀⠞⠀⠀⠀⠀⠀⠀⢀⡾⠒⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀<br>
⡇⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀<br>
⢳⡀⠘⢦⡀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀<br>
⠀⠳⣄⠀⠙⠲⣤⣀⣠⠴⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀<br>
⠀⠀⠈⠓⠦⣄⣀⡠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀<br>
	        검색하실 회원의 ID<br> 
	        <input type="text" name="userid"><br>
	        <input type="button" value="전체 회원보기" onclick="location.href='list_db.jsp'"> 
	        <input type="submit"><br>
	    </form>
	    <hr />
	    <table border="1">
	        <tr>
	            <th>아이디</th>
	            <th>비밀번호</th>
	            <th>이름</th>
	            <th>성별</th>
	            <th>상세주소</th>
	        </tr>
	        <c:choose>
	            <c:when test="${!empty requestScope.list }">
	                <c:set var="list" value="${requestScope.list }" />
	                <c:forEach var="lists" items="${list }">
		                <tr>
		                    <td>${lists.userid  }</td>
		                    <td>${lists.userpw }</td>
		                    <td>${lists.username }</td>
		                    <td>${lists.usergender }</td>
		                    <td>${lists.addrdetail }</td>
		                </tr>
	                </c:forEach>
	            </c:when>
	        </c:choose>
	    </table>
	    

	</body>
</html>
