package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		//Application 저장소 선언
		ServletContext application = arg0.getServletContext();
		
		PrintWriter out = arg1.getWriter();
		
		String value_ = arg0.getParameter("value");
		String op = arg0.getParameter("operator");
		
		int value = 0;
		
		if( !value_.equals("") && !value_.equals(null) ) {
			value = Integer.parseInt(value_);
		}
		
		if( op.equals("=") ) {
			// application 영역에 저장된 값 꺼내오기
			int x = (int) application.getAttribute("value");
			String operator = (String) application.getAttribute("op");
			// 이번 요청 (request)에서 받아온 값 가져오기
			int y = value;
			int result = 0;
			
			if( operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}
			
			out.printf("결과 값 : %d\n", result);
		} else {	//값 저장(application)
			application.setAttribute("value", value);
			application.setAttribute("op", op);
		}
	}
}
