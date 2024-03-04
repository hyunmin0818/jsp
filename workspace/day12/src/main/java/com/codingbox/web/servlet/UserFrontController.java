/*
 * UserFrontController 서블릿은 확장자가 ".us"로 끝나는 URL에 대한 요청을 처리합니다.
 * 각 요청에 따라 적절한 Action 클래스의 execute 메서드를 호출하고,
 * 그 결과에 따라 페이지 이동 방식을 결정하여 이동합니다.
 */
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

        // 요청된 URI에 따라 적절한 Action 클래스의 execute 메서드를 호출합니다.
        if (requestURI.equals("/user/UserJoin.us")) {
            forward = new UserJoinAction().execute(req, resp);
        } else if (requestURI.equals("/user/UserLogin.us")) {
            forward = new ActionForward(false, "/app/user/loginview.jsp");
        } else if (requestURI.equals("/user/UsedrLoginOK.us")) {
        	System.out.println(requestURI);
            // 로그인 기능
            // DB select, UserLoginOkAction.java
            // 로그인 기능 완성, 로그인 성공 -> mainview.jsp
            // 페이지 이동: redirect
            forward = new UserLoginOkAction().execute(req, resp);
        }

        // 페이지 이동에 대한 일괄 처리
        if (forward != null) {
            if (forward.isRedirect()) { // Redirect 방식
                resp.sendRedirect(forward.getPath());
            } else { // Forward 방식
                req.getRequestDispatcher(forward.getPath()).forward(req, resp);
            }
        }
    }
}