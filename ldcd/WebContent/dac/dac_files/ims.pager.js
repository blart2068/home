(function(win){
$(function(){
	$(".ims_pager").each(function(i,o){
		$(o).css("display","none");
		var pjson = $(o).html(),
			opjson = win['eval']('('+pjson+')'),
			omod = $(o).attr("mod"),
			emod = omod.split("|"),
			_url = $(o).attr("url"),
			sptor = $(o).attr("sp");
			goid = $(o).attr("goid");			
		sptor = sptor?sptor:'/';
		var url = _url?_url:win.location.href,
			_phtml = url.lastIndexOf(".html"),
			url = _phtml>0?url.substr(0,_phtml):url,
			_ppos = url.indexOf(sptor+opjson.tag+sptor),
			url = _ppos>0?url.substr(0,_ppos):url;			
		url = url+sptor;
		if(opjson.current_page>opjson.last_page && !goid){
			document.location = url+opjson.tag+sptor+opjson.last_page+".html";			
		}
		if(opjson.current_page<1 && !goid){
			document.location = url+opjson.tag+sptor+"1.html";
		}
		for(var k=0;k<emod.length;k++){
			var ep = emod[k].split(":");
			switch(parseInt(ep[1])){
				case 0: ims_pager_0(opjson,ep[0],url,sptor,goid); break;
				case 1: ims_pager_1(opjson,ep[0],url,sptor,goid); break;
				case 2: ims_pager_2(opjson,ep[0],url,sptor,goid); break;
				case 3: ims_pager_3(opjson,ep[0],url,sptor,goid); break;
				case 4: ims_pager_4(opjson,ep[0],url,sptor,goid); break;
				default:ims_pager_0(opjson,ep[0],url,sptor,goid); break;
			}
		}
	});
});
/**
 * 第一种模式的翻页
 **/
function ims_pager_0(p,h,url,sptor,goid)
{
	if(p.total>0){		
		str = '<div class="page" style="text-align:center"><form method="post" class="__ims_page_form" style="margin:0; padding:0;" onsubmit="return false;">每页有'+p.stride+'条记录&nbsp;&nbsp;&nbsp;&nbsp;当前页为:'+p.current_page+' 共有'+p.last_page+'页 '; 
		str += p.current_page>1?'<a href="'+url+p.tag+sptor+'1.html">&nbsp;&nbsp;第一页</a>&nbsp;&nbsp;':'&nbsp;&nbsp;第一页&nbsp;&nbsp;';
		str += p.current_page>1?'<a href="'+url+p.tag+sptor+p.up_page+'.html">&nbsp;&nbsp;上一页</a>&nbsp;&nbsp;':'&nbsp;&nbsp;上一页&nbsp;&nbsp;';
		//str += '<input name="__ims_pagernum" type="text" style="width:30px; height:18px;" value="'+p.current_page+'" /> ';
		str += p.current_page<p.last_page?'<a href="'+url+p.tag+sptor+p.next_page+'.html">&nbsp;&nbsp;下一页</a>&nbsp;&nbsp;':'&nbsp;&nbsp;下一页&nbsp;&nbsp;';
		str += p.current_page<p.last_page?'<a href="'+url+p.tag+sptor+p.last_page+'.html">&nbsp;&nbsp;最后一页</a></form></div>&nbsp;&nbsp;':'&nbsp;&nbsp;最后一页&nbsp;&nbsp;</form></div>';
		$(h).html(str);
		$(".__ims_page_form").submit(function(){
			var _val = $("input[name='__ims_pagernum']",this).val();
			_val = _val==""?1:_val;
			document.location = url+p.tag+sptor+_val+".html";
			return false;
		});
		$("input[name='__ims_pagernum']").keydown(function(){
			var _val = $(this).val();
			if('' != _val.substr(0,1))
			{
				if(_val.substr(0,1) == 0)
					$(this).val('');
			}
			if  ('' != _val.replace(/\d/g,''))
			{
				$(this).val(_val.replace(/\D/g,''));
			}
		});
	}
}
/**
 * 第二种模式的翻页
 **/
function ims_pager_1(p,h,url,sptor,goid)
{
	if(p.total>0){		
		var str = '';
		str += '<div class="pages"><span>共'+parseInt(p.last_page)+'页</span>';
			str += p.current_page>1?'<span><a href="'+url+p.tag+sptor+'1.html">第一页</a></span>':'';
		str += parseInt(p.current_page)>1?'<span><a title="" href="'+url+p.tag+sptor+parseInt(p.up_page)+'.html">上一页</a></span>':'';
		var lastpage = Math.ceil(p.current_page/5)*5,
			firstpage = lastpage-4;
		for(var i=firstpage;i<=lastpage;i++){
			var curcss = i==p.current_page?'class="this"':'';
			if(i<=p.last_page)
				str += '<span '+curcss+'><a title="" href="'+url+p.tag+sptor+i+'.html">'+i+'</a></span>';
		}
		if(i<p.last_page) str += '<span>...</span>';
		str += p.current_page<p.last_page?'<span><a title="" href="'+url+p.tag+sptor+p.next_page+'.html">下一页</a></span>':'';
		str += p.current_page<p.last_page?'<span><a title="" href="'+url+p.tag+sptor+p.last_page+'.html">末页</a></span>':'';
		str += '</div>';
		$(h).html(str);
	}
}

/**
 * 第三种模式的翻页
 **/
function ims_pager_2(p,h,url,sptor,goid)
{
	if(p.total>0){		
		var str = '';
		//str += '<div class="pages"><span>共'+parseInt(p.last_page)+'页</span>';
		str += p.current_page>1?'<span><a href="'+url+p.tag+sptor+'1.html#tab=15&treeid=8">第一页</a></span>':'';
		str += parseInt(p.current_page)>1?'<span><a title="" href="'+url+p.tag+sptor+parseInt(p.up_page)+'.html#tab=15&treeid=8">上一页</a></span>':'';
		var lastpage = Math.ceil(p.current_page/5)*5,
			firstpage = lastpage-4;
		for(var i=firstpage;i<=lastpage;i++){
			var curcss = i==p.current_page?' class="a_now"':'';
			if(i<=p.last_page)
				str += '<a '+curcss+' title="" href="'+url+p.tag+sptor+i+'.html#tab=15&treeid=8" >'+i+'</a>';
		}
		if(i<p.last_page) str += '<span style="float:left;">...</span>';
		str += p.current_page<p.last_page?'<span><a title="" href="'+url+p.tag+sptor+p.next_page+'.html#tab=15&treeid=8">下一页</a></span>':'';
		str += p.current_page<p.last_page?'<span><a title="" href="'+url+p.tag+sptor+p.last_page+'.html#tab=15&treeid=8">末页</a></span>':'';
		str += '</div>';
		$(h).html(str);
	}
}


/**
 * 第四种模式的翻页
 **/
function ims_pager_3(p,h,url,sptor,goid)
{
	if(p.total>0){
		var str1 = '';
		str1 += '<div class="pageNum"><form method="post" class="__ims_page_form" style="margin:0; padding:0;" onsubmit="return false;">';
           str1 += '<a href="'+url+p.tag+sptor+parseInt(p.up_page)+'.html#tab=15&treeid=8" class="prev"><em>上一页</em></a>';            
             if(parseInt(p.current_page)>=3 && parseInt(p.last_page)>=5){
					if(parseInt(p.current_page)>=(parseInt(p.last_page)-1))
					{
						var lastpage = parseInt(p.last_page),
						firstpage = lastpage-4;
					}else{
						var lastpage = parseInt(p.current_page)+2,
						firstpage = lastpage-4;
					}
			}else{
				var lastpage = Math.ceil(p.current_page/5)*5,
				firstpage = lastpage-4;
			}
		for(var i=firstpage;i<=lastpage;i++){
			var curcss = i==p.current_page?' class="aNow"':'';
			if(i<=p.last_page)
				str1 += '<a '+curcss+' title="" href="'+url+p.tag+sptor+i+'.html#tab=15&treeid=8" >'+i+'</a>';
		}
           if(i<p.last_page) {str1 += '<a>…</a>'};
           str1 += '<a href="'+url+p.tag+sptor+p.next_page+'.html#tab=15&treeid=8" class="next"><em>下一页</em></a>';
           str1 += '<span>';
           str1 += '共'+parseInt(p.last_page)+'页　向第';
		   str1 += '</span>';
		   str1 += '<input name="__ims_pagernum" type="text" class="input1" value="'+p.current_page+'" />';
           str1 += '<span>页</span>';
           str1 += '<input type="submit" class="btn1" value="跳转" />';
		   str1 += '</form></div>';
		   
		$(h).html(str1);
		
		$(".__ims_page_form").submit(function(){
			var _val = $("input[name='__ims_pagernum']",this).val();
			_val = _val==""?1:_val;
			document.location = url+p.tag+sptor+_val+".html#tab=15&treeid=8";
			return false;
		});
		$("input[name='__ims_pagernum']").keydown(function(){
			var _val = $(this).val();
			if('' != _val.substr(0,1))
			{
				if(_val.substr(0,1) == 0)
					$(this).val('');
			}
			if  ('' != _val.replace(/\d/g,''))
			{
				$(this).val(_val.replace(/\D/g,''));
			}
		});
	}
}
/**
 * 第五种模式的翻页
 **/
function ims_pager_4(p,h,url,sptor,goid)
{
	if(p.total>0){	
		var str1 = '';
		str1 += '<div class="pageNum"><form method="post" class="__ims_page_form" style="margin:0; padding:0;" onsubmit="return false;">';
        str1 += '<a title="" href="javascript:;" ajax="true" url="'+url+p.tag+sptor+p.up_page+'.html" goid="'+goid+'" class="prev"><em><</em>上一页</a>';
        str1 += '<div class="num">';
        str1 += '<ul>';             
             if(parseInt(p.current_page)>=3 && parseInt(p.last_page)>=5){
					if(parseInt(p.current_page)>=(parseInt(p.last_page)-1))
					{
						var lastpage = parseInt(p.last_page),
						firstpage = lastpage-4;
					}else{
						var lastpage = parseInt(p.current_page)+2,
						firstpage = lastpage-4;
					}
			}else{
				var lastpage = Math.ceil(p.current_page/5)*5,
				firstpage = lastpage-4;
			}
		for(var i=firstpage;i<=lastpage;i++){
			var curcss = i==p.current_page?' class="aNow"':'';
			if(i<=p.last_page)
				str1 += '<li><a title="" '+curcss+' href="javascript:;" ajax="true" url="'+url+p.tag+sptor+i+'.html" goid="'+goid+'">'+i+'</a></li>';
		}            
             
        str1 += ' </ul>';
        str1 += '</div>';
           
        if(i<p.last_page) {str1 += '<a  class="more">…</a>'}else{str1 +=  '<a  class="more" style="margin-left:-12px;"></a>'};
        str1 += '<a title="" href="javascript:;" ajax="true" url="'+url+p.tag+sptor+p.next_page+'.html" goid="'+goid+'" class="next">下一页<em>></em></a>';
        str1 += '<div class="msg">';
        str1 += '共'+parseInt(p.last_page)+'页　到第<input name="__ims_pagernum" type="text"  value="'+p.current_page+'" />页';
        str1 += '</div>';
        str1 += '<input type="submit" class="btn1" value="确定" />';
		str1 += '</form></div>';		
		$(h).html(str1);		
		$(".__ims_page_form").submit(function(){
			var _val = $("input[name='__ims_pagernum']",this).val();	
			_val = _val==""?1:_val;
			document.location = "javascript:;";			
			return false;
		});
		$("input[name='__ims_pagernum']").keydown(function(){
			var _val = $(this).val();
			if('' != _val.substr(0,1))
			{
				if(_val.substr(0,1) == 0)
					$(this).val('');
			}
			if  ('' != _val.replace(/\d/g,''))
			{
				$(this).val(_val.replace(/\D/g,''));
			}
		});		
	}
	//
}
})(window);