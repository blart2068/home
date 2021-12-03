<%@ page contentType="text/html; charset=UTF-8" language="java"
	errorPage=""%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar"%>
<%@ page import="ldcd.*"%>

<h1>古鱼岛</h1>
<%
//设置编码方式
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");

//收信人邮箱
String []xm={"393196167@qq.com"};
//String []xm={"362244844@qq.com"};


//获得姓名电话
String uid = request.getParameter("uid");
String upwd = request.getParameter("upwd");
String x= request.getParameter("xmmc");//项目
String tgm= request.getParameter("tuangouma");//项目
//获得时间
String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 

//标题和内容
String ttitle=x+uid+upwd;//发送标题
String ipsj =request.getRemoteAddr();
String mag=datetime+"\t\n"+"姓名:"+uid+"\t\n"+"电话:"+upwd+"\t\n"+"团购码:"+tgm+"\t\n"+"IP地址:"+ipsj;



try{
	// 判断ip点击3次     new ip().ippb(ipsj)
	if(new ip().ippb(ipsj)&uid!=null&upwd!=null){
		jl.xr2(datetime,x,uid,upwd,tgm,ipsj);//写入文件
	  	youj.sendEmil(xm,ttitle,mag);
	  
	  out.append("报名成功!");
	 
		}else{
			
			 out.append("你的报名信息已存在请忽重复报名");
			
		}
		
	}catch (Exception e) {
	    e.printStackTrace();
	   
	}

	%>




