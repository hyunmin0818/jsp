Connection conn = null; // Connection 객체를 초기화
// 데이터베이스 연결을 위한 드라이버, URL, 사용자 이름, 암호 설정
String driver = "oracle.jdbc.driver.OracleDriver"; // Oracle JDBC 드라이버 클래스
String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 연결 URL
String user = "jsp"; // 데이터베이스 사용자 이름
String pass = "jsp"; // 데이터베이스 암호
int check = 0;
Class.forName(driver);
