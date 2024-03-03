package com.codingbox.web.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Do1 {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("result", "do1으로 요청 보내기");
		return "do1.jsp";
	}
}