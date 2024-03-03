package com.codingbox.web.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Do2 {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("result", "do2으로 요청 보내기");
		return "do2.jsp";
	}
}