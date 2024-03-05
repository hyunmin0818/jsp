package com.codingbox.web.servlet;

import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;
import com.codingbox.web.dto.BoardDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardViewAction {

    public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
        ActionForward forward = new ActionForward();
        BoardDAO bdao = new BoardDAO();
        BoardDTO bdto = new BoardDTO();
        
        int boardnum = Integer.parseInt(req.getParameter("boardnum"));
        // 게시글 조회
        bdao.updateReadCount(boardnum);
        
        req.setAttribute("board",bdao.getDetail(boardnum));
        forward.setRedirect(false);
        // 조회 성공시: /board/boardview.jsp로 이동
        forward.setPath("/board/boardview.jsp");
        // 필요에 따라 forward.setRedirect(true); 설정 가능

        return forward;
    }
}
