<%@ page contentType="text/html" pageEncoding="GBK"%>
<html>
<head><title>www.mldnjava.cn��MLDN�߶�Java��ѵ</title></head>
<body>
<%
	String dbDriver = config.getInitParameter("driver") ;
	String dbUrl = config.getInitParameter("url") ;
%>
<h3>��������<%=dbDriver%></h3>
<h3>���ӵ�ַ��<%=dbUrl%></h3>
</body>
</html>