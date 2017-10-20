package com.ddbin.javaweb.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterDemo
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/ABCHomePage" })
public class FilterDemo implements Filter {

    public FilterDemo() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("FilterDemo destroy....");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterDemo doFilter 开始执行...");
		HttpServletRequest req = (HttpServletRequest) request;
		// pass the request along the filter chain
		//chain.doFilter(request, response);
		System.out.println("拦截了请求："+ req.getRequestURL().toString());
		System.out.println("FilterDemo doFilter 执行结束...");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterDemo init...");
	}

}
