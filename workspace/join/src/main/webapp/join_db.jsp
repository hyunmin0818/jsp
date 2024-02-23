<%@ page import="com.codingbox.web.dao.MemberDAO"%>
<%@ page import="com.codingbox.web.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 값 넣기</title>
</head>
<body>

	<jsp:useBean id="member" class="com.codingbox.web.dto.MemberDTO" />
	<%-- 모든 요청 매개변수를 JavaBeans의 속성에 자동으로 설정합니다. --%>
	<jsp:setProperty property="*" name="member" />
	<%-- 전달된 name 속성과 필드의 이름이 같으면 value가 자동으로 세팅됩니다. --%>
	<%
	MemberDAO mdao = new MemberDAO();
	/* mdao.join(member); */
	if (mdao.join(member)) { // 성공
	%>
	<script>
		alert("회원가입 성공");
		location.href = "login_view.jsp"
	</script>
	<%
	} else { // 실패
	%>
	<script>
		alert("회원가입 실패");
		location.href = "join_view.jsp"
	</script>
	<%
	}
	%>
</body>
</html>
