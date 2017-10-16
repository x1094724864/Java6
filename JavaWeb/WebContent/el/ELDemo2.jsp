<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ddbin.javaweb.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%
	pageContext.setAttribute("color", "green");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL 表达式</title>
<%
	Cookie cookie1 = new Cookie("country", "chn");
	cookie1.setMaxAge(120);
	response.addCookie(cookie1);
%>

</head>
<body bgcolor="${pageScope.color}">
	<p>
		<b>EL 表达式</b><br>
	</p>
	<!-- 算术运算 -->
	<br />10 + 5 = ${10 + 5 }
	<br /> 10 - 5 = ${10 - 5 }
	<br /> 10 * 5 = ${10 * 5 }
	<br /> 10 / 5 = ${10 / 5 }
	<%-- <br /> 10 div 5 = ${10 div 5 } --%>
	<br /> 10 % 5 = ${10 % 5 }
	<br /> 10 mod 5 = ${10 mod 5 }
	<!-- 关系运算 -->
	<hr />
	<br />10 > 5 = ${10 > 5 }
	<br />10 gt 5 = ${10 gt 5 }
	<br /> 10 < 5 = ${10 < 5 }
	<br /> 10 lt 5 = ${10 lt 5 }
	<br /> 10 >= 5 = ${10 >= 5 }
	<br /> 10 ge 5 = ${10 ge 5 }
	<br /> 10 <= 5 = ${10 <= 5 }
	<br /> 10 le 5 = ${10 le 5 }
	<br /> 10 != 5 = ${10 != 5 }
	<%-- <br /> 10 ne 5 = ${10 ne 5 } --%>
	<br /> 10 == 5 = ${10 == 5 }
	<br /> 10 eq 5 = ${10 eq 5 }
	<!-- Empty判空运算符 -->
	<hr />
	${'${'}empty param.name}：${empty param.name}
	<br /> ${'${'}5>3? 6+3:4-5}:${5>3? 6+3:4-5 }
	<br /> ${'${'}6*(3+5)}:${6*(3+5)}
	<br />
	<!-- Cookie的获取 -->
	<hr />
	${'${'}cookie.country.name}：${cookie.country.name}<br/>
	${'${'}cookie.country.value}：${cookie.country.value}<br/>
	${'${'}cookie['country'].name}：${cookie['country'].name }<br/>
	${'${'}cookie['country'].value}：${cookie['country'].value }<br/>
	<hr />
	<!-- 读取web.xml中的应用程序初始化参数-->
	${'${'}initParam.name}:${initParam.name}
	<%
		String nameValue = application.getInitParameter("name");
		out.println("nameValue:"+nameValue);
	%>
	
	<%
		String[] names = {"zhangsan","lisi","wangwu"};
			
		List<Integer> ages = new ArrayList<Integer>();
			ages.add(25);
			ages.add(30);
			ages.add(35);
			
		Map<String,Integer> ids = new HashMap<String,Integer>();
			ids.put("id001", 1000);
			ids.put("id002", 2000);
			ids.put("id003", 3000);
			
		//设定容器的归属
		pageContext.setAttribute("names", names);
		pageContext.setAttribute("ages", ages);
		pageContext.setAttribute("ids", ids);
		
	%>
		<!-- 用EL表达式读取容器元素 -->
	<hr/>
	${'${'}names[0]}:${names[0]} <br/>
	${'${'}ages[0]}:${ages[0]} <br/>
	${'${'}ages.get(1)}:${ages.get(1)} <br/>
	${'${'}ids['id001']}:${ids['id001']} <br/>
	${'${'}ids.get('id001')}:${ids.get('id001')} <br/>
	${'${'}ids.getOrDefault('id003',4000)}:${ids.getOrDefault('id003',4000)} <br/>
	${'${'}ids.getOrDefault('id004',4000)}:${ids.getOrDefault('id004',4000)} <br/>
		
	
</body>
</html>