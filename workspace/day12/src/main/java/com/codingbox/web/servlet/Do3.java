package com.codingbox.web.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Do3 {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("result", "do3으로 요청 보내기");
		return "do3.jsp";
	}
}
