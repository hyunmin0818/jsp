package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;
import com.codingbox.web.dto.BoardDTO;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardWriteOkAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		BoardDTO bdto = new BoardDTO();
		BoardDAO bdao = new BoardDAO();
		// request 파라미터값 getDTO담기
		bdto.setBoardtitle(request.getParameter("boardtitle"));
		bdto.setBoardcontents(request.getParameter("boardcontents"));
		bdto.setUsername(request.getParameter("username"));
		// dao insertBoard(dto)
		if(bdao.InsertBoard(bdto)) {
			forward.setPath(request.getContextPath() + "/board/BoardWrite.bo");
		}
		forward.setRedirect(true);
		
		// 성공시 board/BoardWrite.bo
		return forward;
		
	}
}

