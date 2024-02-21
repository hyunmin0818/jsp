/**
 * 
 */
function sendit() {
	let joinForm = document.getElementById('joinForm');
	let userid = document.getElementById('userid');
	let userpw = document.getElementById('userpw');
	let username = frm.username;
	let userphone = frm.userphone;

	// 아이디 빈값 체크 -> alert 아이디를 입력하세요!
	if (userid.value == "") {
		alert("아이디를 입력하세요");
		userid.focus();
		return false;
	}
	// 비밀번호 빈값 체크 -> alert 비밀번호를 입력하세요!
	if (userpw.value == "") {
		alert("비밀번호를 입력하세요");
		userpw.focus();
		return false;
	}
	// 비밀번호 8자리 이상 체크 -> alert 비밀번호를 8자리 이상 입력하세요!
	if (userpw.value.length < 8) {
		alert("비밀번호를 8자리 이상 입력하세요!");
		userpw.focus();
		return false;
	}
	// 이름 빈값 체크 -> alert 이름을 입력하세요!
	if (username.value == "") {
		alert("이름을 입력하세요");
		username.focus();
		return false;
	}
	
	// 핸드폰번호 빈값 체크 -> alert 핸드폰번호를 입력하세요!
	if (userphone.value == "") {
		alert("핸드폰번호를 입력하세요");
		userphone.focus();
		return false;
	}
	
	if (userphone.value.length > 11) {
		alert("핸드폰번호를 확인!");
		userpw.focus();
		return false;
	}
	// 전부 입력 후, submit();
	joinForm.submit();
}