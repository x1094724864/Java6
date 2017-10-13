<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<html>
<head><title>01</title></head>
<body>
<%	// 设置属性
	session.setAttribute("name","李兴华") ;
	session.setAttribute("birthday",new Date()) ;
%>
	<jsp:forward page="session_scope_02.jsp"></jsp:forward>
</body>
</html>