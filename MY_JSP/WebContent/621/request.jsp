<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request</title>
</head>
<body>
	<form action="" method="post">
		<input type="text" name="name"/>
		<input type="submit" value="提交"/>
		<br/>
		<input type="button" name = "name1" value="确定" >
		<br/>
	</form>
	<br/><br/><br/>
	请求方法名称: <%= request.getMethod() %><br/>
	请求的资源: <%= request.getRequestURI() %><br/>
	请求服务器端口: <%= request.getLocalPort()%><br/>
	请求用户的协议: <%= request.getProtocol()%><br/>
	请求服务器的IP: <%= request.getServerName()%><br/>
	客户端的主机名: <%= request.getRemoteHost()%><br/>
	客户端的主机名: <% String ml=request.getParameter("name");
				if(ml.equals("007")){
					out.print("邦德   ---詹姆斯.邦德");
				}
	
	%><br/>
	
</body>
</html>