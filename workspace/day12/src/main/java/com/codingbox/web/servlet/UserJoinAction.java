package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.UserDAO;
import com.codingbox.web.dto.UserDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserJoinAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		UserDAO udao = new UserDAO();
		UserDTO udto = new UserDTO();
		ActionForward forward = new ActionForward();
		
		udto.setUserid(req.getParameter("userid"));
		udto.setUserpw(req.getParameter("userpw"));
		udto.setUsername(req.getParameter("username")); 
		udto.setUserphone(req.getParameter("userphone")); 
		udto.setUseraddr(req.getParameter("useraddr"));
		
		if(udao.join(udto)) { // true일 경우 회원가입
			forward.setPath("/app/user/loginview.jsp");
			forward.setRedirect(false);
		}
		
		return forward;
	}

}
