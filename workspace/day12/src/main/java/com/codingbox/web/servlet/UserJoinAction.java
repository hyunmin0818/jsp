/*
 * UserJoinAction 클래스는 사용자 회원가입 기능을 처리하는 액션입니다.
 */
package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.UserDAO;
import com.codingbox.web.dto.UserDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserJoinAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		// UserDAO와 UserDTO 인스턴스 생성
		UserDAO udao = new UserDAO();
		UserDTO udto = new UserDTO();
		ActionForward forward = new ActionForward();

		// 사용자가 입력한 정보를 UserDTO에 설정
		udto.setUserid(req.getParameter("userid"));
		udto.setUserpw(req.getParameter("userpw"));
		udto.setUsername(req.getParameter("username"));
		udto.setUserphone(req.getParameter("userphone"));
		udto.setUseraddr(req.getParameter("useraddr"));

		// 회원가입을 성공하면 로그인 화면으로 이동
		if (udao.join(udto)) {
			forward.setPath("/app/user/loginview.jsp");
			forward.setRedirect(false);
		}

		return forward;
	}
}
