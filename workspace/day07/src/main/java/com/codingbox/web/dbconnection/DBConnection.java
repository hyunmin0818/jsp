package com.codingbox.web.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    /**
     * getConnection 메서드: 데이터베이스에 연결하여 Connection 객체를 반환한다.
     * @return 연결된 Connection 객체
     */
    public static Connection getConnection() {
        Connection conn = null; // Connection 객체를 초기화
        try {
            // 데이터베이스 연결을 위한 드라이버, URL, 사용자 이름, 암호 설정
            String driver = "oracle.jdbc.driver.OracleDriver"; // Oracle JDBC 드라이버 클래스
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 연결 URL
            String user = "jsp"; // 데이터베이스 사용자 이름
            String pass = "jsp"; // 데이터베이스 암호
            
            // JDBC 드라이버 로드
            Class.forName(driver);
            // DriverManager를 사용하여 데이터베이스에 연결
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 로딩 실패"); // ClassNotFoundException 발생 시 메시지 출력
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DB 접속 오류"); // SQLException 발생 시 메시지 출력
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("알 수 없는 오류"); // 기타 예외 발생 시 메시지 출력
        }

        return conn; // 연결된 Connection 객체 반환
    }
}
