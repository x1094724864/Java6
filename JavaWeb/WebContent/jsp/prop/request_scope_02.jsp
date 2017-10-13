<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<html>
<head><title>02</title></head>
<body>
<%
	String username = (String) request.getAttribute("name") ;
	Date userbirthday = (Date)request.getAttribute("birthday") ;
%>
<h2>аеУћЃК<%=username%></h2>
<h2>ЩњШеЃК<%=userbirthday%></h2>
</body>
</html>