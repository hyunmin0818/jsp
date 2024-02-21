package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/calc4")
public class Calc4 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		//session 객체
		HttpSession session = arg0.getSession();
		
		PrintWriter out = arg1.getWriter();
		
		String value_ = arg0.getParameter("value");
		String op = arg0.getParameter("operator");
		
		int value = 0;
		
		if( !value_.equals("") && !value_.equals(null) ) {
			value = Integer.parseInt(value_);
		}
		
		if( op.equals("=") ) {
			// session 영역에 저장된 값 꺼내오기
			int x = (int) session.getAttribute("value");
			String operator = (String) session.getAttribute("op");
			
			int y = value;
			int result = 0;
			
			if( operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}
			
			out.printf("결과 값 : %d\n", result);
		} else {	// 값 저장 ( session )
			session.setAttribute("value", value);
			session.setAttribute("op", op);
		}
	}
}
