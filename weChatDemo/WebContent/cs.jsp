<%@ page contentType="text/html; charset=UTF-8" language="java"
	errorPage=""%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar"%>
<%@ page import="ldcd.*"%>


<%
//设置编码方式
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");



//获得姓名电话
String uid = request.getParameter("uid");
String upwd = request.getParameter("upwd");
String x= "测试"+request.getParameter("xm");//项目
String []xm={"362244844@qq.com","blartxg@163.com"};
String []xm2={"blartusa@163.com"};
 

//获得时间
String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 
String ipsj =request.getRemoteAddr();
String ttitle=x+uid+upwd;//发送标题
String mag=datetime+"\t\n"+"姓名:"+uid+"\t\n"+"电话:"+upwd+"\t\n"+"IP地址:"+request.getRemoteAddr();




try{
	if(uid!=null&upwd!=null){
	
	youj.sendEmil(xm,ttitle,mag);
	//youj.sendEmil(xm2,ttitle,mag);
	
	
	%>
	<script>
	alert("恭喜团购报名成功，马上会有团购专员与你联系！");
	
	parent.location.reload();
	</script>
	<% 
	}else{
		
		%>
		<script>
		alert("你的报名信息已收到请勿重复报名！");
		
		</script>
		<% 
		
	}
	
}catch (Exception e) {
    e.printStackTrace();
    %>
    <script>
	alert("邮件未发送");
	</script>
    
    
    <% 
}

%>


	







