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

# EL문과 JSTL

- **JSP페이지 내에 자바코드와 HTML 코드가 섞여있으면 가독성이 떨어진다.**
- **EL문과 JSTL문을 사용하면 HTML과 같은 태그로만 구성된 일관된 소스코드를 볼 수 있다는 장점이 있다.**

## EL

- **Expression Language**
- **값을 간결하고 간편하게 출력할 수 있도록 해주는 언어**
- **<%= %>, out.println()과 같은 자바코드를 더 이상 사용하지 않고 좀 더 간편하게 출력을 지원하기 위한 도구**
- **배열이나 컬렉션에도 사용되고, JavaBean 프로퍼티에서도 사용된다.**
- **${...}내에 표현한다.**
- **EL식에서 Attribute의 이름으로 해석이 된다<br> - 값을 찾을때는 Attribute는 작은 Scope에서 큰 Scope으로 찾는다.<br> - page > request > session > application**

## EL연산자

- **산술연산자: +, -, \*, /(div), %(mode)**
- **논리연산자: &&(and), ||(od), !(not)**
- **비교연산자: ==(eq), !=(ne), <(lt), >(ge), <=(le), >=(ge)**
- **empty연산자: 값이 null이거나 공백문자인지를 판단하는 연산자<br> - ${empty ""} -> true<br> - ${empty null} -> true<br> - ${empty data} -> data 값이 없으면 true**
