package com.ddbin.javaweb.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/servlet/sendError")
public class SendError extends HttpServlet {

	private static final long serialVersionUID = -7235482660293514737L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.sendError(HttpServletResponse.SC_GONE,"Resource no longer available");
		response.sendError(HttpServletResponse.SC_GONE,"请求的资源不可得！");
		//response.sendError(207,"请求的资源不可得！");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
