package com.FresherBuiQuangThi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String diachi = req.getParameter("diachi");
		
		req.setAttribute("name", name);
		req.setAttribute("diachi", diachi);
		
		req.setAttribute("title","Nhận tham số dạng GET");
		req.getRequestDispatcher("indexTo.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("indexTo.jsp").forward(req, resp);
	}
}
