<%@ page contentType="text/html; charset=UTF-8" language="java"
	errorPage=""%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar"%>
<%
//设置编码方式
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");



//获得姓名电话
String uid = request.getParameter("uid");
String upwd = request.getParameter("upwd");


//获得时间
//String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 
String datetime=new SimpleDateFormat("YYMMddSSms ").format(Calendar.getInstance().getTime()); //获取系统时间 

//标题和内容
String ttitle=uid+upwd;//发送标题




%>

<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新房团购网</title>
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" style="">
<div align="center" class="sz">
  <img src="./index_files/index_1.jpg" width="1197" height="77" alt=""></div>
  <div style="text-align: center;">
  <h1>姓名:<%=uid %></h1>
  <h1>电话:<%=upwd %></h1>
  <h1>你的优惠邀请码为:</h1>
  <h1 style="color: red;"><%=datetime %></h1>
  <h2>请确保以上信息无误!</h2>
  </div>
  </body>
  </html>




