package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		String[] numStr = arg0.getParameterValues("num");
		
		int result = 0;
		for(int i=0; i<numStr.length; i++) {
			result += Integer.parseInt(numStr[i]);
		}
		
		//out.print("result is " + result);
		arg1.getWriter().printf("result is %d\n", result);
	}
}
