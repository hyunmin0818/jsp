package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.ReplyDAO;
import com.codingbox.web.dto.BoardDTO;
import com.codingbox.web.dto.ReplyDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddReplyAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		ReplyDAO rdao = new ReplyDAO();
		ReplyDTO rdto = new ReplyDTO();
		BoardDTO bdto = new BoardDTO();

		int boardnum = Integer.parseInt(req.getParameter("boardnum"));
		rdto.setUsername(req.getParameter("username"));
		rdto.setReplycontents(req.getParameter("replycontents"));
		rdto.setPassword(req.getParameter("password"));
		rdto.setBoardnum(boardnum);
		
		if(rdao.addReply(rdto)) {
			forward.setRedirect(true);
			forward.setPath("/board/BoardView.bo" + boardnum);
		}
	
		
		return forward;
	}

}
