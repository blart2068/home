<%@ page contentType="text/html; charset=UTF-8" language="java"
	errorPage=""%>
   <%@ page import="my.*"%>


<%
//设置编码方式
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");
String uid = request.getParameter("uid");
String upwd = request.getParameter("upwd");
String passwd = request.getParameter("passwd");

String s =tgm.zh(upwd,uid,passwd); 

 %>
   
    
    
 

<h1>你的姓名为:<%=uid%></h1>
<h1>你的手机号为:<%=upwd%></h1>
<h1>你的密码为:<%=passwd%></h1>
<h1>你的经纪人码为: <%=s%></h1>
<h1>请妥善保存好以上的信息,这是您日后结算的凭证</h1>




