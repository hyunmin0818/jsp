# Mybatis

- **객체지향 언어인 자바의 관계형 데이터베이스 프로그래밍을 좀 더 쉽게 할 수 있게 도와주는 개발 프레임 워크로서 JDBC를 통해 데이터베이스에 엑세스하는 작업을 캡슐화하고 일반 SQL쿼리, 저장 프로시저 및 고급 매핑을 지원하며 모든 JDBC 코드 및 매개 변수의 중복 작업을 제거한다.**
- **MyBatis는 프로그램에 있는 SQL쿼리들을 한 구성 파일에 구성하여 프로그램 코드와 SQL을 분리할 수 있는 장점을 가지고 있다.**
- **MYBatis는 기존 JDBC 방식과 달리 SQL문을 XML파일에 작성함으로써 코드가 줄어들고 SQL문만 따로 관리하기 때문에 수정이 편해진다.**
- <https://blog.mybatis.org/p/products.html>

# MyBatis Query

- **select <br> - 성공: select문에 해당하는 결과를 return <br> - 실패: error**
- **insert <br> - 성공: 1(여러개인 경우에도 1)<br> - 실패: error**
- **update <br> - 성공: update된 행의 갯수 반환(없다면 0)<br> - 실패: error**
- **delete<br> - 성공: delete된 행의 갯수 반환(없다면 0)<br> - 실패: error**
