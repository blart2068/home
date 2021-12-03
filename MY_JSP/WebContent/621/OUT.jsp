<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="10kb" %><!--//设置缓冲区大小  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("我是blart");
		out.print("ssdsdsds");
		out.newLine();
		out.print("<br/>");
		out.flush();//显示缓冲区
		out.clearBuffer();//清除缓冲区
		out.print("缓冲区大小:"+out.getBufferSize());
		out.print("<br/>");
		out.print("剩余缓冲区大小:"+out.getRemaining());
		out.print("<br/>");
	%>
</body>
</html>