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
	protected void doProcess (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("URI: " + req.getRequestURI());

		String responseURI = null;
		
		if(req.getRequestURI().equals("/do1.do")) {
//			req.setAttribute("result", "do1으로 요청 보내기");
//			req.getRequestDispatcher("do1.jsp").forward(req, resp);
			
			responseURI = new Do1().execute(req,resp);
		
		}else if(req.getRequestURI().equals("/do2.do")) {
//			req.setAttribute("result", "do2으로 요청 보내기");
//			req.getRequestDispatcher("do2.jsp").forward(req, resp);

			responseURI = new Do2().execute(req, resp);
			
		}else if(req.getRequestURI().equals("/do3.do")) {
//			req.setAttribute("result", "do3으로 요청 보내기");
//			req.getRequestDispatcher("do3.jsp").forward(req, resp);

			responseURI = new Do3().execute(req, resp);
			
		}
		
		req.getRequestDispatcher(responseURI).forward(req, resp);
	}
}
