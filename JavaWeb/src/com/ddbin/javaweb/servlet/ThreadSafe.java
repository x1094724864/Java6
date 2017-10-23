package com.ddbin.javaweb.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/servlet/ThreadSafe")
public class ThreadSafe extends HttpServlet {
	private static final long serialVersionUID = 2896873948679002989L;
	//String name = "";// 实例变量,多线程共享

	// public synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");// 设置文档类型及字符集
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Servlet线程安全问题</TITLE></HEAD>");
		out.println("<BODY>");
		String username = request.getParameter("username");
		//name = new String(username.getBytes("iso-8859-1"), "UTF-8");
		String name = new String(username.getBytes("iso-8859-1"), "UTF-8");

		try {
			Thread.sleep(10000); // 休眠10秒
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<H3>您好, " + name + "!</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
