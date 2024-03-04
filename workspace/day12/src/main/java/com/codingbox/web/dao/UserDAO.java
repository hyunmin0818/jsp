/*
 * UserDAO 클래스는 사용자 관련 데이터베이스 작업을 처리합니다.
 * MyBatis를 사용하여 SQL 쿼리를 실행하고, 사용자의 가입(join) 및 로그인(login) 기능을 제공합니다.
 */
package com.codingbox.web.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.codingbox.web.dto.UserDTO;
import com.codingbox.web.mybatis.SqlMapConfig;

public class UserDAO {
	// SqlSessionFactory 인스턴스를 가져옴
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	// SqlSession 인스턴스
	SqlSession sqlSession;

	/**
	 * 기본 생성자. SqlSession을 초기화합니다.
	 */
	public UserDAO() {
		// SqlSessionFactory로부터 SqlSession을 생성하며, auto-commit 설정을 true로 합니다.
		sqlSession = factory.openSession(true);
	}

	/**
	 * 사용자 정보를 받아 데이터베이스에 등록하는 메서드입니다.
	 *
	 * @param udto 등록할 사용자 정보를 담고 있는 UserDTO 객체입니다.
	 * @return 등록이 성공하면 true, 실패하면 false를 반환합니다.
	 */
	public boolean join(UserDTO udto) {
		boolean result = false;
		// sqlSession을 사용하여 User 네임스페이스의 join 쿼리를 실행하고 결과를 확인합니다.
		if (sqlSession.insert("User.join", udto) == 1) {
			result = true;
		}
		return result;
	}

	/**
	 * 사용자의 로그인을 처리하는 메서드입니다.
	 *
	 * @param userid 사용자 아이디
	 * @param userpw 사용자 비밀번호
	 * @return 로그인 성공 시 true, 실패 시 false를 반환합니다.
	 */
	public boolean login(String userid, String userpw) {
		boolean result = false;
		// 사용자 아이디와 비밀번호를 Map으로 묶어서 데이터베이스 쿼리에 전달합니다.
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);

		// sqlSession을 사용하여 User 네임스페이스의 login 쿼리를 실행하고 결과를 확인합니다.
		if ((Integer) sqlSession.selectOne("User.login", datas) == 1) {
			result = true;
		}

		return result;
	}
}
