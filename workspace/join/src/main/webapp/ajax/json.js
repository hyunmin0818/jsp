/**
 * 
 */
// 페이지가 로드 됐을 때
window.onload = function() {
	// data2.json 파일 데이터 읽어와서 실시간 검색어엔 초마다 검색이 나오게
	// 2초뒤에 2 JSP
	// ...
	// 5 키워드 나오게
	// 2초뒤에 실시간 검색어엔 1 키워드로 독감
	let td1 = document.getElementById("td1");
	let td2 = document.getElementById("td2");

	let xhr = new XMLHttpRequest();
	xhr.open("GET", "data2.json", true);
	xhr.send();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
			let obj = JSON.parse(xhr.responseText);
			let i = 0;
			let a = 0;

			const interval = setInterval(function() {
				if (i == obj.search_word.length) {
					i = 0;
				}
				td1.innerHTML = obj.search_word[i].rank;
				td2.innerHTML = obj.search_word[i].name;
				i++;
				a++;
				
				if (a > 50) {
					alert(A);
					clearInterval(interval);
				}
			}, 2000);
		}
	}
	setTimeout(function(){
			// clearInterval(인터벌); : 해당 인터벌을 삭제
			clearInterval(interval);
		}, 2000);
}