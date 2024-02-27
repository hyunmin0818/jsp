/**
 * 사용자 등록 양식의 유효성 검사 함수입니다.
 * 빈 필드, 길이 제약, 비밀번호 일치 여부를 확인합니다.
 * 유효하지 않은 입력에 대한 적절한 경고를 표시합니다.
 * 모든 유효성 검사를 통과하면 양식을 제출합니다.
 */
function sendit() {
	// 빈값체크 -> 경고
	// 길이체크 -> 아이디 5이상16미만, 비밀번호 8자리 이상
	// 비밀번호 확인 일치 체크
	// 제출();

	// 폼 요소 가져오기
	let joinForm = document.joinForm;
	let userid = joinForm.userid;
	let userpw = joinForm.userpw;
	let userpwre = joinForm.userpw_re;
	let username = joinForm.username;
	let usergender = joinForm.usergender;
	let userphone = joinForm.userphone;

	// 사용자 아이디 유효성 검사
	if (userid.value == "") {
		alert("아이디를 입력하세요");
		userid.focus();
		return false;
	}
	if (userid.value.length < 5 || userid.value.length >= 16) {
		alert("아이디를 5자리 이상 16자리 미만으로 입력해주세요");
		userid.focus();
		return false;
	}

	// 비밀번호 유효성 검사
	if (userpw.value == "") {
		alert("비밀번호를 입력하세요");
		userpw.focus();
		return false;
	}
	if (userpw.value.length < 8) {
		alert("비밀번호를 8자리 이상 입력해주세요");
		userpw.focus();
		return false;
	}

	// 비밀번호 확인 유효성 검사
	if (userpwre.value == "") {
		alert("비밀번호 확인을 입력하세요");
		userpwre.focus();
		return false;
	}
	if (userpw.value != userpwre.value) {
		alert("비밀번호가 일치하지 않습니다.");
		userpwre.focus();
		return false;
	}

	// 이름 유효성 검사
	if (username.value == "") {
		alert("이름을 입력하세요");
		username.focus();
		return false;
	}

	// 성별 유효성 검사
	/*if (!usergender.checked) {
		alert("성별을 선택하세요");
		usergender.focus();
		return false;
	}*/

	// 전화번호 유효성 검사
	if (userphone.value == "") {
		alert("전화번호를 입력하세요");
		userphone.focus();
		return false;
	}

	// 모든 유효성 검사 통과 시 폼 제출
	joinForm.submit();
}

/*
	로그인 validation check
*/
function loginit() {
	let frm = document.frm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	// 아이디 빈값 처리
	if (userid.value == "") {
		alert("아이디를 입력해주세요");
		userid.focus();
		return false;
	}
	// 비밀번호 빈값 처리
	if (userpw.value == "") {
		alert("비밀번호를 입력해주세요");
		userpw.focus();
		return false;
	}
	frm.submit();
}

function PressKey(event) {
	if (event.keyCode === 13) {
		loginit();
	}
}
// userid의 파라미터값을 가져옴
function checkId(userid) {
	if (userid == "") {
		alert("아이디를 입력해주세요");
		return false;
	} else {
		// ajax
		let xhr = new XMLHttpRequest();
		xhr.open("GET", "idcheck.jsp?userid=" + userid, true);
		xhr.send();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
				// 회원가입이 가능한 아이디라면 id가 text인 영역에 "사용할 수 있는 아이디입니다"출력
				// 그렇지 않다면 "중복된 아이디입니다" 출력
				//alert(xhr.responseText.trim());
				if (xhr.responseText.trim() == "ok") {
					document.getElementById("text").innerHTML = "사용할 수 있는 아이디 입니다.";
				} else {
					document.getElementById("text").innerHTML = "이미 사용중인 아이디 입니다.";
				}
			}
		}
	}
}

function checkId2(userid) {
	if (userid == "") {
		alert("아이디를 입력해주세요");
		return false;
	} else {
		// jQuery ajax
		$.ajax({
			type	: 'get',	//	타입작성(get, post)
			url		: 'idcheck.jsp?userid=' + userid,
			async	: true,	// 비동기화여부(비동기: true)
			success	: function(result) {		// 성공시 콜백함수
				if (result.trim() == "ok") {
					document.getElementById("text").innerHTML = "사용할 수 있는 아이디 입니다.";
				} else {
					document.getElementById("text").innerHTML = "이미 사용중인 아이디 입니다.";
				}
			},
			error: function(result, status, error) {	// 실패시 콜백함수
				console.log(error);
			}
		});
	}
}

function checkId3(userid) {
	if (userid == "") {
		alert("아이디를 입력해주세요");
		return false;
	} else {
		// jQuery ajax
		$.ajax({
			type	: 'post',	//	타입작성(get, post)
			url		: 'idcheck.jsp',
			data	: {"userid" : userid}, 	
			async	: true,	// 비동기화여부(비동기: true)
			success	: function(result) {		// 성공시 콜백함수
				if (result.trim() == "ok") {
					document.getElementById("text").innerHTML = "사용할 수 있는 아이디 입니다.";
				} else {
					document.getElementById("text").innerHTML = "이미 사용중인 아이디 입니다.";
				}
			},
			error: function(result, status, error) {	// 실패시 콜백함수
				console.log(error);
			}
		});
	}
}