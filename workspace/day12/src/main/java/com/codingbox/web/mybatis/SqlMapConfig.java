/*
 * SqlMapConfig 클래스는 MyBatis의 SqlSessionFactory를 설정하는 클래스입니다.
 * MyBatis 설정 파일(config.xml)을 읽어 SqlSessionFactory를 초기화합니다.
 */
package com.codingbox.web.mybatis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	private static SqlSessionFactory factory;

	// 클래스 초기화 블럭
	static {
		try {
			// MyBatis 설정 파일의 경로를 지정합니다.
			String resource = "./com/codingbox/web/mybatis/config.xml";
			// 설정 파일을 읽어옵니다.
			Reader reader = Resources.getResourceAsReader(resource);
			// SqlSessionFactory를 빌드하여 초기화합니다.
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			// 예외가 발생하면 스택 트레이스를 출력합니다.
			e.printStackTrace();
		}
	}

	/**
	 * 현재 설정된 SqlSessionFactory를 반환합니다.
	 *
	 * @return SqlSessionFactory 객체입니다.
	 */
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
