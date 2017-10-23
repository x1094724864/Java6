<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RequestObjDemo</title>
</head>
<body>
	<%-- 获取request范围属性值  --%>
	<%
		//String changeSessionId = request.changeSessionId();
		//AsyncContext getAsyncContext = request.getAsyncContext();
		String localAddr = request.getLocalAddr();
		int localPort = request.getLocalPort();
		String remoteAddr = request.getRemoteAddr();
		int port = request.getServerPort();
		String encoding= request.getCharacterEncoding();
		String servletPath = request.getServletPath();
		String contextPath= request.getContextPath();
		String QueryString =request.getQueryString();
		String url = request.getRequestURL().toString();
		
	%>
	
	<br/>
	<span>localAddr : </span> <%=localAddr %>
	<br/>
	<span>localPort : </span> <%=localPort %>
	<br/>
	<span>remoteAddr : </span> <%=remoteAddr %>
	<br/>
	<span>port : </span> <%=port %>
	<br/>
	<span>encoding : </span> <%=encoding %>
	<br/>
	<span>servletPath : </span> <%=servletPath %>
	<br/>
	<span>port : </span> <%=port %>
	<br/>
	<span>url : </span> <%=url %>
	<br/>
	<span>contextPath : </span> <%=contextPath %>
	<br/>
	<span>QueryString : </span> <%=QueryString %>
	
</body>
</html>