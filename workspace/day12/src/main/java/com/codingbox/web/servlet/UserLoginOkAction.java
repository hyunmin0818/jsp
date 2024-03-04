/*
 * UserLoginOkAction 클래스는 사용자 로그인 기능을 처리하는 액션입니다.
 */
package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.UserDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserLoginOkAction implements Action {

    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
        // UserDAO 인스턴스 생성
        UserDAO udao = new UserDAO();
        ActionForward forward = new ActionForward();

        // 사용자가 입력한 아이디와 비밀번호를 가져옴
        String userid = request.getParameter("userid");
        String userpw = request.getParameter("userpw");

        // Redirect 전송을 위한 설정
        forward.setRedirect(true);

        // 로그인 성공 시 메인 화면으로 이동, 실패 시 로그인 화면으로 이동 (flag=false를 파라미터로 전달)
        if (udao.login(userid, userpw)) {
            forward.setPath("/app/main/mainview.jsp");
        } else {
            forward.setPath("/app/user/loginview.jsp?flag=false");
        }

        return forward;
    }
}
