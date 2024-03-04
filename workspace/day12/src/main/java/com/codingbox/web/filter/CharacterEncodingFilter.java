/*
 * CharacterEncodingFilter 클래스는 서블릿 필터로, 요청 및 응답의 문자 인코딩을 설정합니다.
 * 해당 필터는 "*.do" 패턴에 일치하는 URL에만 적용됩니다.
 */
package com.codingbox.web.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("*.do")
public class CharacterEncodingFilter implements Filter {

	/**
	 * 서블릿 필터에서 사용되는 메서드로, 요청 및 응답의 문자 인코딩을 설정합니다.
	 *
	 * @param request  서블릿 요청 객체
	 * @param response 서블릿 응답 객체
	 * @param chain    서블릿 필터 체인
	 * @throws IOException      입출력 예외
	 * @throws ServletException 서블릿 예외
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 요청 및 응답의 문자 인코딩을 UTF-8로 설정합니다.
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		// 다음 필터로 체인을 전달합니다.
		chain.doFilter(request, response);
	}
}
