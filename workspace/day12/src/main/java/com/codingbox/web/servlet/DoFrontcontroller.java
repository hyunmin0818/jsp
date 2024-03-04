/*
 * DoFrontController 서블릿은 확장자가 ".do"로 끝나는 URL에 대한 요청을 처리합니다.
 * 각 요청에 따라 적절한 Do1, Do2, Do3 클래스의 execute 메서드를 호출하고,
 * 그 결과에 따라 적절한 JSP 페이지로 포워딩합니다.
 */
package com.codingbox.web.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DoFrontcontroller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("URI: " + req.getRequestURI());

		String responseURI = null;

		// 요청된 URI에 따라 적절한 Do 클래스의 execute 메서드를 호출합니다.
		if (req.getRequestURI().equals("/do1.do")) {
			responseURI = new Do1().execute(req, resp);
		} else if (req.getRequestURI().equals("/do2.do")) {
			responseURI = new Do2().execute(req, resp);
		} else if (req.getRequestURI().equals("/do3.do")) {
			responseURI = new Do3().execute(req, resp);
		}

		// 적절한 JSP 페이지로 포워딩합니다.
		req.getRequestDispatcher(responseURI).forward(req, resp);
	}
}
