/**
 * 
 */
function sendit() {
	let userid = joinForm.userid;
    let userpw = joinForm.userpw;
    let userpwre = joinForm.userpw_re;
    let username = joinForm.username;
    let userphone = joinForm.userphone;

	// 아이디 빈값체크 -> alert 아이디를 입력하세요!
	if (userid.value === "") {
		alert("아이디를 입력하세요!");
		userid.focus();
		return false;
	}

	// 아이디 길이체크 -> alert 아이디는 5자리 이상, 16자리 미만으로 작성하세요!
	if (userid.value.length < 5 || userid.value.length > 16) {
		alert("아이디는 5자리 이상, 16자리 미만으로 작성하세요!");
		userid.focus();
		return false;
	}

	// 비밀번호 체크 -> alert 비밀번호를 입력하세요!
	if (userpw.value === "") {
		alert("비밀번호를 입력하세요!");
		userpw.focus();
		return false;
	}

	// 비밀번호 길이체크 -> alert 비밀번호는 8자리 이상으로 입력하세요
	if (userpw.value.length < 8) {
		alert("비밀번호는 8자리 이상으로 입력하세요!");
		userpw.focus();
		return false;
	}

	// 비밀번호 재확인 -> alert 비밀번호와 비밀번호 확인이 일치하지 않습니다!
	if (userpw.value !== userpwre.value) {
		alert("비밀번호와 비밀번호 확인이 일치하지 않습니다!");
		return false;
	}

	// 이름 빈값체크 -> alert 이름을 입력하세요!
	if (username.value === "") {
		alert("이름을 입력하세요!");
		username.focus();
		return false;
	}

	// 성별체크
	let flag = false;
	for (let i = 0; i < joinForm.usergender.length; i++) {
		if (joinForm.usergender[i].checked) {
			flag = true;
			break;
		}
	}

	if (!flag) {
		alert("성별을 체크가 누락됐습니다.");
		return false;
	}

	// 휴대폰번호 체크 -> alert 휴대폰번호를 입력하세요!
	if (userphone.value == "") {
		alert("전화번호를 입력하세요!");
		userphone.focus();
		return false;
	}

	joinForm.submit();
}
