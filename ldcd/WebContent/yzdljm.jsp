<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="ldcd.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>

<% 
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");
String yhm = request.getParameter("uid");

String mm = request.getParameter("upwd");
String nr=jl.rn(yhm, mm);
%>

</head>
<body style="text-align: center;">
<h1>报名查询系统</h1>
 <textarea name="eduhistory" cols="80" rows="50" ><%=nr%></textarea>

</body>
</html>