<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ajax를 이용해 실시간 순위 나타내기</h1>
	<table border="1">
		<tr>
			<th>실시간 검색 순위</th>
			<th>키워드</th>
		</tr>
		<tr>
			<td id="td1">순위</td>
			<td id="td2">키워드</td>
		</tr>
	</table>
	<script>
    window.onload = function() {
	//HTML 이 다 load가 완료 됐을 때 실행
	
	let td1 = document.getElementById("td1");
	let td2 = document.getElementById("td2");
	
	let xhr = new XMLHttpRequest();
	xhr.open("GET", "data2.json", true);
	xhr.send();
	xhr.onreadystatechange = function() {
		if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200){
			let obj = JSON.parse(xhr.responseText);
			
			let i = 0;
			setInterval(function () {
				if(i == obj.search_word.length){
					i = 0;
				}
				td1.innerHTML = obj.search_word[i].rank;
				td2.innerHTML = obj.search_word[i].name;
				i++;				
			}, 2000);
			
		}
   }
}      