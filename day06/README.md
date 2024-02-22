1. DTO (Data Transfer Object) / VO(Value Object)

   - 양쪽으로 전송되어 오고가는 데이터들을 담은 객체
     JSP에서는 Bean이라고 부른다. 여러 데이터들을 포장해서 만든 데이터 포장 객체
   - 사용자가 입력한 값을 객체 형태로 받을 수 있게 클래스 구성
   - 폼에서 입력된 데이터들은 하나의 DTO 객체로 변환 가능
   - 하나의 데이터베이스 레코드를 저장하여 레코드와 같은 구조를 가짐
   - 레코드가 50개이면 DTO객체도 50개
   - 한 개의 레코드는빈즈 클래스 객체 하나로 매핑
   - 데이터가 포함된 객체를 한 시스템에서 다른 시스템으로 전달하는 작업을 처리하는 객체

2. DAO(Data ACcess Object)

   - 데이터에 접근, 데이터를 관리하기 위한 객체 데이터들을 관리(추가,수정,삭제,읽기)하는 여러 메소드들이 정의되어 있다.
   - insert, delete, update, select등 레코드 처리를 주 목적으로 한다
   - DTO/VO 객체를 데이터베이스 서버에 저장
   - 데이터베이스 서버로부터 레코드를 select한 후, DTO객체로 변경해 가져온다.
   - SQL을 직접 실행하는 기능을 가짐
   - 데이터 접근을 목적으로 하는 객체
   - 커넥션 같은 것을 하나만 두고 여러 사용자가 DAO의 인터페이스를 사용하여 필요한 자료에 접근하도록 하는 것
   - DB를 사용해 데이터를 조회 및 조작하는 기능을 전담하도록 만든 오브젝트

3. DB connection
   3-1. 계정생성 - system 계정으로 먼저 로그인
   sqlplus username/password
   create user jsp identified by jsp; (user created)
   grant connect, resource to jsp; - 계정생성
   create user jsp identified by jsp;
   grant connect, resource to jsp;
   3-2. ojdbc란? - jdbc: Java DataBase Connectivity - 자바에서 데이터베이스에 접속/관리할 수 있게 해주는 드라이버(API) - 자바에서 작성된 프로그램으로 DB와 관련된 작업을 처리할 수 있도록 제공되는 기능(코드)들을 모아 놓은 것 - ojdbc: oracle jdbc, Oracle에서 제공하는 DB를 관리할 수 있도록 도와주는 jdbc이다
   C:\gb_lhm_1218\util\Oracle\app\oracle\product\11.2.0\server\jdbc\lib - Insert, Update, Delete를 사용할때는
   -> pstm.executeUpdate()사용
   -> Insert, Update, Delete가 적용된 건수 return
   Select
   -> select된 결과값을 return
   Drop, Create
   -> 0이라는 결과값을 return

4. 자바빈즈

   - 자바빈즈(자바 객체)
   - jsp의 표준 액션 태그를 통해 접근할 수 있는 자바 클래스로서 멤버변수(필드)와 setter, getter 메소드로 이루어져 있다.
   - 하나의 jsp 페이지에서도 사용하고 그외 다른 페이지에서도 사용 가능하다.
   - 사용 예
     MemberDTO(DTO, VO, Beans)

     객체생성
     java -> MemberDTO Member = new MemberDTO();
     jsp -> <jsp:userBean class="패키지명.MemberDTO" id="member">

     setter()
     java -> member.setName("자바학생");
     jsp -> <jsp:setProperty name="member" property="name" Value="자바학생">

     getter()
     java -> member.getName();
     jsp -> <jsp:getProperty name="member" property="name">
