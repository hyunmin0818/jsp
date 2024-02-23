/**
 * Get방식 Ajax 
 */
function send1() {
	let xhr = new XMLHttpRequest();
	// open(전달방식, URL주소, 동기여부(비동기: true(기본값), 동기: false));
	xhr.open("GET", "request_ajax.jsp?userid=admin&userpw=admin1234", true);
	xhr.send();
	xhr.onreadystatechange = function() {
		// 통신에 성공했을때
		// 만약 readyState값에 DONE이나
		if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
			document.getElementById("result").innerHTML = xhr.responseText;
			// alert(xhr.responseText);
		}
	}
}

function send2() {
	let xhr = new XMLHttpRequest();
	xhr.open("POST", "request_ajax.jsp", true);
	xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xhr.send("userid=postadmin&userpw=post1234");
	xhr.onreadystatechange = function() {
		if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
			document.getElementById("result").innerHTML = xhr.responseText;
			// alert(xhr.responseText);
		}
	}
}

function sendJson() {
	let xhr = new XMLHttpRequest();
	xhr.open("GET", "data.json", true);
	xhr.send();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
//			alert(xhr.responseText);
		let obj = JSON.parse(xhr.responseText);
		alert(obj);
		alert(obj.count);
		alert(obj.result);
		}
	}
}