package com.ddbin.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

	private static final long serialVersionUID = -3547094874667217299L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 获取三种不同对象传递的值
		String str1 = (String) request.getAttribute("fromRequest");
		HttpSession session = request.getSession();
		String str2 = (String) session.getAttribute("fromSession");
		ServletContext context = getServletConfig().getServletContext();
		String str3 = (String) context.getAttribute("fromContext");

		response.setContentType("text/html;charset=UTF-8");// 设置生成的文档类型
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");
		out.println("<HEAD><TITLE>输出范围属性有关信息</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>request值: " + str1 + "</H3>");
		out.println("<H3>session值: " + str2 + "</H3>");
		out.println("<H3>application值: " + str3 + "</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流
	}
}