//读取域名
ym=document.domain; 
//document.getElementById("p2").innerText= ym;
//document.write(ym);
if (ym=="www.guyudao.com.cn"||ym=="wap.guyudao.com.cn") { 
	//劲港  
	document.getElementById("p2").innerText= "上海劲港房地产咨询有限公司"; 
	 //document.getElementById("p").innerText= "nice";  
	 
	 
}
else if(ym=="www.shtrdc.com"||ym=="wap.shtrdc.com"){
	//台仁
	document.getElementById("p2").innerText= "上海台仁房地产营销策划有限公司"; 
}else if(ym=="www.ghbgs.com"||ym=="wap.ghbgs.com"){
	//屏歌
	document.getElementById("p2").innerText= "上海屏歌房地产营销策划有限公司";
}else if(ym=="www.lwjkjdsn.com"||ym=="wap.lwjkjdsn.com"){
	//郦湾
	document.getElementById("p2").innerText= "上海郦湾房地产营销策划有限公司";
}else if(ym=="www.shhgdc.cn"||ym=="wap.shhgdc.cn"){
	//航光 畅思
	document.getElementById("p2").innerText= "上海畅思房地产营销策划有限公司";
}else if(ym=="www.cshzjdc.com"||ym=="wap.cshzjdc.com"||"localhost"){
	//舟津
	document.getElementById("p2").innerText= "上海XX房地产经纪中心";
}
