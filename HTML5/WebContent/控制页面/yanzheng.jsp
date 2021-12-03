<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"
	name="viewport"
	content="maximun-scale=1.0,
    minimum-scale-=1.0,user-scalable=0,
    width=device-width,initial-scale=1.0">
<style type="text/css">
body {
	font-size: 50px;
	width: 100%;
	height: 100%;
	font-family: 'Open Sans', sans-serif;
	margin: 0;
	background-color: #4A374A;
}

h1 {
	height: 50%;
	color: red;
}

a {
	height: 100%;
	color: red;
	line-height: 500px;
}

html {
	width: 100%;
	height: 100%;
	overflow: hidden;
	font-style: sans-serif;
}
</style>
<title>验证页面</title>
</head>
<body>
	<%
 String user_name= request.getParameter("uid");
 String pass_word = request.getParameter("upwd");
 String dlm =user_name+pass_word;
 if(user_name!=null && !user_name.equals("")){
 	try{
	 
	 	FileReader fr = new FileReader("/home/pi/Desktop/yhm.txt");
	 	BufferedReader br =new BufferedReader(fr);
	 	String yhm="";
	 	while((yhm=br.readLine())!=null){
		 System.out.print(yhm);
			 if(dlm.equals(yhm)){
				 %>
				<script language=javascript>
					sessionStorage.setItem("yhm","8888");
					document.location.href="zhuye.html";
				</script>

	<%
			 return;
		 }
			 	 
	 }
	 	%>
	<h1 align="center">用户名或者密码错误!</h1>
	<h1 align="center">
		<a href="denglu.html">点击返回</a>
	</h1>
	<%
           }catch(Exception ee){ee.printStackTrace();}
          
    }    
        

 %>

</body>
</html>

