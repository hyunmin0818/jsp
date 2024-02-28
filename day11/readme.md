# JStl

- **JSP Standard Tab Library**
- **연산자나 조건문, 반복문을 편하게 처리할 수 있으며, JSP페이지 내에서 자바코드를 사용하지 않고도 로직을 구현할 수 있도록 효율적인 방법을 제공한다.**
- **자바 for(초기식; 조건식; 증감식){...}<br> - jstl <c:forEach>...</c:forEach>**
- <http://archive.apache.org/dist/jakarta/taglibs/standard/binaries/><br>- jakarta-taglibs-standard-1.1.2.zip 

## Jstl Taglib 추가
- **<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>**

## Jstl core 태그
- <c:set/><br> - 변수 만들때 사용
- <c:out> </c:out><br> - 값을 출력할때 사용(EL문을 좀 더 많이 쓴다)
- <c:if> </c:if><br> - 조건 제어
- <c:choose> </c:choose<br> - 조건제어 switch문, 내부터 <c:when>, <c:otherwise>만 있어야 한다
- <c:when> </c:when><br> - 조건제어(case문)
- <c:otherwise> </c:otherwise><br> - 조건제어(default)
- <c:forEach> </c:forEach><br> - 반복제어(for문)