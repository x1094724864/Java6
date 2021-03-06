package com.ddbin.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/MyLoginServlet2")
public class MyLoginServletDemo extends HttpServlet {

	private static final long serialVersionUID = 7377466740906912232L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");// 设置生成的文档类型
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");// 输出相应的HTML源文件
		out.println("<HEAD><TITLE>用servlet测试get/post方法</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>调用了doGet()方法</H2><p>");
		out.println("<H2>用户输入信息如下：</H2>");
		String username = request.getParameter("username");
		if (username == null || username == "")
			username = "未输入";
		String userpwd = request.getParameter("password");
		if (userpwd == null || userpwd == "")
			userpwd = "未输入";
		out.println("<H2>用户名：" + username + "</H2>");
		out.println("<H2>密　码：" + userpwd + "</H2>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html;charset=UTF-8");// 设置生成的文档类型
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");// 输出相应的HTML源文件
		out.println("<HEAD><TITLE>用servlet测试get/post方法</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>调用了doPost()方法</H2><p>");
		out.println("<H2>用户输入信息如下：</H2>");
		String username = request.getParameter("username");
		if (username == null || username == "")
			username = "未输入";
		String userpwd = request.getParameter("password");
		if (userpwd == null || userpwd == "")
			userpwd = "未输入";
		out.println("<H2>用户名：" + username + "</H2>");
		out.println("<H2>密　码：" + userpwd + "</H2>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流
*/	
		doGet(request, response);
	}
}
