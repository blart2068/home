<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.URLConnection"%>



<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>模式</title>

<%
	URL url;
	URLConnection uc;
	InputStream is;
	
		try {
			String lj = "http://192.168.199.100/?pin=ON7" ;
			url = new URL(lj);
			uc = url.openConnection();
			is = uc.getInputStream();
			Thread.sleep(500);
			is.close();
		} catch (Exception e) {
		} finally {

		}

	
%>

</head>
<body>

</body>
</html>