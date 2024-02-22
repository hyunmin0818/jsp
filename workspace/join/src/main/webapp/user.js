/**
 * 회원가입 validation check
 */
function sendit() {
	// 폼 요소 가져오기
	let frm = document.joinForm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	let userpwre = frm.userpw_re;
	let username = frm.username;
	let userphone = frm.userphone;

	// 아이디 빈값 체크 -> alert: 아이디를 입력하세요!
	if (userid.value === "") {
		alert("아이디를 입력하세요!");
		userid.focus();
		return false;
	}

	// 아이디 길이 체크 -> 알림: 아이디는 5자리 이상, 16자리 미만으로 작성하세요!
	if (userid.value.length < 5 || userid.value.length > 16) {
		alert("아이디는 5자리 이상, 16자리 미만으로 작성하세요!");
		userid.focus();
		return false;
	}

	// 비밀번호 체크 -> 알림: 비밀번호를 입력하세요!
	if (userpw.value === "") {
		alert("비밀번호를 입력하세요!");
		userpw.focus();
		return false;
	}

	// 비밀번호 길이 체크 -> 알림: 비밀번호는 8자리 이상으로 입력하세요
	if (userpw.value.length < 8) {
		alert("비밀번호는 8자리 이상으로 입력하세요!");
		userpw.focus();
		return false;
	}

	// 비밀번호 재확인 -> 알림: 비밀번호와 비밀번호 확인이 일치하지 않습니다!
	if (userpw.value !== userpwre.value) {
		alert("비밀번호와 비밀번호 확인이 일치하지 않습니다!");
		return false;
	}

	// 이름 빈값 체크 -> 알림: 이름을 입력하세요!
	if (username.value === "") {
		alert("이름을 입력하세요!");
		username.focus();
		return false;
	}

	// 성별 체크
	let flag = false;
	for (let i = 0; i < joinForm.usergender.length; i++) {
		if (joinForm.usergender[i].checked) {
			// 성별이 체크된 경우 flag를 true로 설정
			flag = true;
			break;
		}
	}

	// flag가 false인 경우 알림을 통해 사용자에게 성별 체크 누락을 알림
	if (!flag) {
		alert("성별을 체크해주세요.");
		return false;
	}


	// 휴대폰번호 체크 -> 알림: 전화번호를 입력하세요!
	if (userphone.value === "") {
		alert("전화번호를 입력하세요!");
		userphone.focus();
		return false;
	}

	// 모든 체크가 통과되면 폼 제출
	joinForm.submit();
}
/*
	로그인 validation check
*/

function loginit(){
	let frm = document.joinForm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	
	if (userid.value === "") {
		alert("아이디를 입력하세요!");
		userid.focus();
		return false;
	}
	
	if(userpw.value === ""){
		alert("비밀번호를 입력하세요!");
		userpw.focus();
		return false;
	}
}