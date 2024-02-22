<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="join_db.jsp" method="post" name="joinForm">
		<!-- 사용자에게 안내 메시지를 보여주는 부분 -->
		<p id="text">사용할 수 있는 아이디입니다.</p>

		<!-- 아이디 입력란과 중복확인 버튼 -->
		<p>
			<label> 아이디 <input type="text" name="userid"></label>
			<!-- 중복확인 버튼에는 아직 동작을 정의하지 않음 -->
			<input type="button" value="중복확인" onclick="">
		</p>

		<!-- 비밀번호 입력란 -->
		<p>
			<label>비밀번호 <input type="password" name="userpw"></label>
		</p>

		<!-- 비밀번호 확인 입력란 -->
		<p>
			<label>비밀번호 확인 <input type="password" name="userpw_re"></label>
		</p>

		<!-- 이름 입력란 -->
		<p>
			<label>이름 <input type="text" name="username"></label>
		</p>

		<!-- 성별 선택 라디오 버튼 -->
		<p>
			성별 <br> <label> 남자<input type="radio" name="usergender"
				value="M" checked></label> <label> 여자<input type="radio"
				name="usergender" value="W"></label>
		</p>

		<!-- 핸드폰 번호 입력란 -->
		<p>
			<label>핸드폰 번호 <input type="text" name="userphone"></label>
		</p>

		<!-- 추가 입력 항목 (우편번호, 주소, 상세주소, 참고항목) -->
		<p>우편번호</p>
		<p>주소</p>
		<p>상세주소</p>
		<p>참고항목</p>
		
		<!-- 회원가입 버튼 -->
		<p>
			<!-- 회원가입 버튼에 sendit 함수를 호출하는 이벤트 추가 -->
			<input type="button" value="회원가입" onclick="sendit()">
		</p>
	</form>
</body>
<!-- 사용자 정의 JavaScript 파일 로드 -->
<script src="user.js"></script>
</html>
