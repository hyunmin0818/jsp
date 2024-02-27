package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codingbox.web.dbconnection.DBConnection;
import com.codingbox.web.dto.MemberDTO;

public class MemberDAO_bak {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;

	// 회원가입 메서드
	public boolean join(MemberDTO mDto) {
		boolean result = false;
		String sql = "INSERT INTO TBL_MEMBER VALUES (?,?,?,?,?)";

		try {
			// DB 연결
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);
			// 매개변수로 받은 DTO의 정보로 쿼리 작성
			pstm.setString(1, mDto.getUserid());
			pstm.setString(2, mDto.getUserpw());
			pstm.setString(3, mDto.getUsername());
			pstm.setString(4, mDto.getUsergender());
			pstm.setString(5, mDto.getUserphone());
			// 쿼리 실행
			// pstm.executeUpdate();
			// 쿼리 실행 결과에 따라 결과값 설정
			if (pstm.executeUpdate() != 0) { // 성공
				result = true;
			} else { // 실패
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 예외 발생");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 에러발생");
		}

		return result;
	}

	// 로그인 확인
	public MemberDTO login(String userid, String userpw) {
		MemberDTO member = null;
		String sql = "SELECT * FROM TBL_MEMBER WHERE userid = ? AND userpw=?";

		try {
			// DB 연결
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);
			// 받아온 파라미터 userid를 1번째 ?에 넣는다
			pstm.setString(1, userid);
			// 받아온 파라미터 userpw를 2번째 ?에 넣는다
			pstm.setString(2, userpw);

			// sql문 실행
			rs = pstm.executeQuery();
			if (rs.next()) {
				System.out.println("로그인 성공");
				member = new MemberDTO();
				member.setUserid(rs.getString(1));
				member.setUserpw(rs.getString(2));
				member.setUsername(rs.getString(3));
				member.setUsergender(rs.getString(4));
				member.setUserphone(rs.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 예외 발생");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 에러발생");
		}

		return member;
	}

//	public boolean searchId(String userid) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		boolean flag = false;
//		try {
//			String sql = "SELECT * FROM TBL_MEMBER WHERE userid =?";
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, userid);
//			
//			rs = ps.executeQuery();
//			
//			while(rs.next()) {
//				flag = true;
//			}
//		}catch (SQLException e) {
//			System.out.println("SQL 실행중 오류 발생");
//		} finally {
//			try {
//				if(conn != null)
//					conn.close();
//				
//				if(ps != null)
//					ps.close();
//			}catch (Exception e) {
//				System.out.println("접속종료 실패");
//			}
//		}
//		return flag;
//		
//	}

	public boolean checkId(String userid) {
		boolean result = false;
		String sql = "SELECT * FROM TBL_MEMBER WHERE userid = ?";
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, userid);
			rs = pstm.executeQuery();

			if (rs.next()) {
				if (rs.getString(1).equals(userid)) {
					result = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
