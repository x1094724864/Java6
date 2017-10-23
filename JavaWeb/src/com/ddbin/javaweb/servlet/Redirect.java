package com.ddbin.javaweb.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/servlet/Redirect")
public class Redirect extends HttpServlet {

	private static final long serialVersionUID = -3875238968694980385L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = request.getParameter("url");
		System.out.println("url ="+location);
		if (location == null)
			response.sendRedirect("http://www.baidu.com");
		else {
			response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
			response.setHeader("location", location);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
