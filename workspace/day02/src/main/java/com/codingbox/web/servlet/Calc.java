package com.codingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Calc extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		//PrintWriter out = arg1.getWriter();
		
		String xstr = arg0.getParameter("x");
		String ystr = arg0.getParameter("y");
		String operator = arg0.getParameter("operator");
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		if(!xstr.equals("") && !xstr.equals(null)) {
			x = Integer.parseInt(xstr);
		}
		if(!ystr.equals("") && !ystr.equals(null)) {
			y = Integer.parseInt(ystr);
		}
		
		
		if(operator.equals("덧셈")) {
			result = x + y;
		}else {
			result = x - y;
		}
		
		
		//out.print("result is " + result);
		arg1.getWriter().printf("result is %d\n", result);
	}
}
