<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<html>
<head><title>02</title></head>
<body>
<%
	String username = (String) application.getAttribute("name") ;
	Date userbirthday = (Date)application.getAttribute("birthday") ;
%>
<h2>������<%=username%></h2>
<h2>���գ�<%=userbirthday%></h2>
</body>
</html>