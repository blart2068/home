<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="maximun-scale=1.0,
    minimum-scale-=1.0,user-scalable=0,
    width=device-width,initial-scale=1.0">
<title>语音控制</title>
<style type="text/css">
body{   

    width: 100%;   

    height: 100%;   

    font-family: 'Open Sans',sans-serif;   

    margin: 0;   

    background-color: #4A374A;   

}   
</style>
<script language=javascript>
    	var yhm = sessionStorage.getItem("yhm");
    	if (yhm=="8888") {
			
		}else {
			document.location.href="denglu.html";
			
		}
			
		</script>

</head>
<body >
<br><br><br>
<div align="center">
	<input x-webkit-speech lang="zh-CN" style="width:200px;height:40px"/>
</div>
	<div align="center">
		<input type="image" src="tubiao/yykz.png" >
	</div><br><br>
	<div align="center">
		<a href="zhuye.html"><img alt="" src="tubiao/fanhui.png"></a>
	</div>

</body>
</html>