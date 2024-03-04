<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 페이지</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
        }

        form {
            max-width: 300px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        p {
            margin-bottom: 15px;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
	<c:if test="${not empty param.flag}">
		<c:if test="${not param.flag}">
			alert("아이디 또는 비밀번호가 잘못 입력되었습니다.");
		</c:if>
	</c:if>

	
    <form action="${pageContext.request.contextPath}/user/UserLoginOK.us">
        <p>
            아이디 <input type="text" name="userid">
        </p>
        <p>
            비밀번호 <input type="password" name="userpw">
        </p>
        <p>
            <input type="submit" value="로그인">
        </p>
    </form>
</body>
</html>
