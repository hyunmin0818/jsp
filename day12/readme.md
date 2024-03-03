# 화면 이동방식

- **Redirect**

  - **클라이언트가 요청했을 때 이전의 값이 남아있지 않도록 하기 위해 사용**

- **Forward**
  - **목록 검색할때 사용**
  - **검색 결과를 유지한 채로 페이지 이동처리**

**index.jsp -> joinview.jsp
joinview.jsp
-> UserFronController.java
-> UserJoinAction.java(DTO, Action, ActionForward)
-> UserDAO(MyBatis Connection)
-> user.xml
-> loginview.jsp**

# 상대경로 절대경로

- **EL 내 현재 위치**
- **${pageContext.request.contextPath}**
- **JSP : <%= request.getContextPath() %>**
- **상대 경로(내 위치에 따라 변하는 값)가 아닌 절대경로로 고정된다.**
