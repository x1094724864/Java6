<%@ page contentType="text/html" pageEncoding="GBK"%>
<html>
<head><title>ͣ��ʱ��</title></head>
<body>
	<% 
		response.setHeader("refresh", "1");		//1s refresh
	%>
<%
	long start = session.getCreationTime() ;
	long end = session.getLastAccessedTime() ;
	long time = (end - start) / 1000 ;
%>
<h3>���Ѿ�ͣ����<%=time%>�룡</h3>
</body>
</html>