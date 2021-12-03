<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交内容</title>
</head>
<body>
	<jsp:useBean id="user" class="blart.java_bean"></jsp:useBean>
	<jsp:setProperty property="name" name="user"/>
	<jsp:setProperty property="password" name="user"/>

	<%
		String name= request.getParameter("name");
		String password=request.getParameter("password");
		out.print("用户名:"+name+"<br/>"+"密码:"+password);
	
	%>
	<br/>
	用户名:<jsp:getProperty property="name" name="user"/>
	<br/>
	密码:<jsp:getProperty property="password" name="user"/>
</body>
</html>