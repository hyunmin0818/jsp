<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		margin: 0 auto; width: 900px;		
	}
</style>
</head>
<body>
	<div>
		<table style="width: 900px;border: 0px" >
			<tr align="center" valign="middle">
				<td><h3>MVC 게시판</h3></td>
			</tr>
		</table>
		<table border="1" style="border-collapse: collapse; height: 30px">
			<tr>
				<th align="center" width="150px;">제목</th>
				<td>
					${board.boardtitle}
					<span style="font-weight: bold;color: #6a1b9a;float: right;">
						조회수 : ${board.boardreadcount} 
					</span>
				</td>
			</tr>
			<tr>
				<th align="center" width="150px;">글쓴이</th>
				<td>
					${board.username }
				</td>
			</tr>
			<tr height="300px;">
				<th align="center" width="150px;">내용</th>
				<td valign="top" style="padding: 10px;">
					${board.boardcontents }
				</td>
			</tr>
		</table>
		<table style="border: 0px;">
			<tr align="right" valign="middle">
				<td>
					<a href="${pageContext.request.contextPath }/board/BoardList.bo">
						[목록]
					</a>
				</td>
			</tr>
		</table>
		
		<%-- 댓글 리스트 --%>
	<hr/>
      <form name="replyForm" method="post"
         action="${pageContext.request.contextPath }/board/AddReply.bo">
         <input type="hidden" name="boardnum" vlaue="${board.boardnum }">
         <table border="1">
            <tr>
               <td align="center" width="200px">
                  댓글<br><hr>
                  이름 &nbsp;&nbsp;&nbsp;&nbsp;
                  <input type="text" name="username" maxlength="10"/><br/>
                  비밀번호
                  <input type="password" name="password" />
               </td>
               <td style="padding-left: 10px;">
                  <textarea name="replycontent"
                  style="width: 680px;height: 85px;resize: none;"></textarea><br/>
                  <a href="javascript:document.replyForm.submit()">[등록]</a>
               </td>
            </tr>
         </table>
      </form>
	</div>
</body>
</html>