package com.codingbox.web.servlet;

import java.io.IOException;

import com.codingbox.web.action.ActionForward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.us")
public class UserFrontController extends HttpServlet{
	
	// *.us url 매핑
	// HttpServler 상속
	// doGet
	// doPost
	// doProcess()
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		ActionForward forward = null;
		
		if(requestURI.equals("/user/UserJoin.us")) {
			forward = new UserJoinAction().execute(req, resp);
		}
		if(forward != null) {
			if(forward.isRedirect()) { // Redirect 방식
				resp.sendRedirect(forward.getPath());
			}else { // forward 방식
				req.getRequestDispatcher(forward.getPath()).forward(req, resp);
			}
		}
	}
}
