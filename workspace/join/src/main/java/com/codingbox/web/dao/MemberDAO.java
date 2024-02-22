package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import com.codingbox.web.dbconnection.DBConnection;
import com.codingbox.web.dto.MemberDTO;

public class MemberDAO {
	Connection conn;
	PreparedStatement pstm;
	Result rs;
	
	public boolean join(MemberDTO mDTO) {
		System.out.println("=====================");
		boolean result = false;
		String sql = "INSERT INTO tbl_member VALUES (?, ?, ?, ?, ?)";
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, mDTO.getUserid());
			pstm.setString(2, mDTO.getUserpw());
			pstm.setString(3, mDTO.getUsername());
			pstm.setString(4, mDTO.getUsergender());
			pstm.setString(5, mDTO.getUserphone());
            // 쿼리 실행 결과에 따라 결과값 설정
			System.out.println("mDTO.getUserid() : " + mDTO.getUserid());
            if(pstm.executeUpdate() != 0) { // 성공
                result = true;
            } else { // 실패
                result = false;
            }

			
	      }catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("SQL 예외 발생");
	      }catch (Exception e) {
	         e.printStackTrace();
	         System.out.println("SQL 예외 발생");
	      }

		return result;
	}
}
