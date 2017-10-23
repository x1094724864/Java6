package com.ddbin.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitServletDemo
 */
@WebServlet(description = "Demo init param", urlPatterns = { "/servlet/InitServletDemo" }, initParams = {
		@WebInitParam(name = "name", value = "zhangsan", description = "student name"),
		@WebInitParam(name = "age", value = "25", description = "student age") }, loadOnStartup = 1)
public class InitServletDemo extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String name;
	private String age;

	/**
	 * @see HttpServlet#HttpServlet() 构造函数
	 */
	public InitServletDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("InitServletDemo init开始执行...");
		name = config.getInitParameter("name");
		age = config.getInitParameter("age");
		System.out.println("InitServletDemo init执行结束！");

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("InitServletDemo 销毁...");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");// 设置文档类型及字符集
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");
		out.println("<HEAD><TITLE>获取初始化参数</TITLE></HEAD>");
		out.println("<BODY>");
		out.print("<H3>姓名:" + name + "<H3>");
		out.print("<H3>年龄:" + age + "<H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
