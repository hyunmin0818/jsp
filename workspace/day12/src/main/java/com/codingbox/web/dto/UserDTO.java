/*
 * UserDTO 클래스는 사용자 정보를 담는 데이터 전송 객체(DTO)입니다.
 * 사용자의 아이디, 비밀번호, 이름, 전화번호, 주소 등의 정보를 관리합니다.
 */
package com.codingbox.web.dto;

public class UserDTO {
	private String userid;
	private String userpw;
	private String username;
	private String userphone;
	private String useraddr;

	/**
	 * 사용자 아이디를 반환합니다.
	 *
	 * @return 사용자 아이디 문자열입니다.
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 사용자 아이디를 설정합니다.
	 *
	 * @param userid 사용자 아이디 문자열입니다.
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 사용자 비밀번호를 반환합니다.
	 *
	 * @return 사용자 비밀번호 문자열입니다.
	 */
	public String getUserpw() {
		return userpw;
	}

	/**
	 * 사용자 비밀번호를 설정합니다.
	 *
	 * @param userpw 사용자 비밀번호 문자열입니다.
	 */
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	/**
	 * 사용자 이름을 반환합니다.
	 *
	 * @return 사용자 이름 문자열입니다.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 사용자 이름을 설정합니다.
	 *
	 * @param username 사용자 이름 문자열입니다.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 사용자 전화번호를 반환합니다.
	 *
	 * @return 사용자 전화번호 문자열입니다.
	 */
	public String getUserphone() {
		return userphone;
	}

	/**
	 * 사용자 전화번호를 설정합니다.
	 *
	 * @param userphone 사용자 전화번호 문자열입니다.
	 */
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	/**
	 * 사용자 주소를 반환합니다.
	 *
	 * @return 사용자 주소 문자열입니다.
	 */
	public String getUseraddr() {
		return useraddr;
	}

	/**
	 * 사용자 주소를 설정합니다.
	 *
	 * @param useraddr 사용자 주소 문자열입니다.
	 */
	public void setUseraddr(String useraddr) {
		this.useraddr = useraddr;
	}
}
