package com.FresherBuiQuangThi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/post.html")
public class post extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("postTo.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		int luong = Integer.parseInt(req.getParameter("luong"));
		
		req.setAttribute("name", name);
		req.setAttribute("luong", luong);
		
		req.getRequestDispatcher("postTo.jsp").forward(req, resp);
	}
	
}
