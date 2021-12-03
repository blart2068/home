var sfhongbao = {
	qddsData: new Object(),
	newcode: false,
	createHongbaoHead: function(maxMoney){
		var maxMoneyLen = maxMoney.length; 
		maxMoney = maxMoneyLen > 3 ? maxMoney.substr(0, maxMoneyLen-3)+','+maxMoney.substr(maxMoneyLen-3) : maxMoney;
		var head = '\
		<div class="popHead pr">\
			<a class="moneyNumPos fred1 by_a2" style=" line-height:32px;">���<span class="moneyNum">'+maxMoney+'</span>Ԫ</a>\
			<div class="popCloseBtn cp" id="hbPopCloseBtn"></div>\
			<img src="http://img1.soufun.com/house/images/hongbao201507/head_11.png" width="758" class="headBanner">\
		</div>\
		';
		return head;
	},
	createHongbaoList: function(redbaginfo){
		var redbagnum = redbaginfo.length;
		var p_cs='', pc_css='', fontsize='', switchimg='<img src="http://img1.soufun.com/house/images/hongbao201507/popRightPic.png" class="popRightPic"/>';
		if (redbagnum == 1) {
			p_css = 'popCont1';
			fontsize = '18px;'
		} else if (redbagnum == 2) {
			p_css = 'popCont2';
			pc_css = 'fl';
			fontsize = '12px;';
		} else {
			p_css = 'popCont3 popCont2';
			pc_css = 'fl';
			fontsize = '12px;';
			switchimg = '\
				<img src="http://img1.soufun.com/house/images/hongbao201507/popRightPic1.png" class="popRightPic1"/>\
				<img src="http://img1.soufun.com/house/images/hongbao201507/popRightPic2.png" class="popRightPic2"/>\
			';
		}
		var hongbaohtml = '';
		for(var i in redbaginfo) {
			var item = redbaginfo[i];
			var startDay = new Date(item.StartDay);
			startDay = parseInt(startDay.getMonth()+1) + '��' + startDay.getDate() + '��';
			var endDay = new Date(item.EndDay);
			endDay = parseInt(endDay.getMonth()+1) + '��' + endDay.getDate() + '��';
			hongbaohtml +='\
				<div class="hbbg pr '+pc_css+'" '+((redbagnum == 2 && i==0)? 'style="margin-left:85px;"' : '')+'>\
					<div class="moneyNum fred1">'+item.Money+'</div>\
					<div class="menNum">\
						<p><span class="fred3">'+item.ReceivedCount+'</span>��</p>\
						<p>����ȡ</p>\
					</div>\
					<div class="right fwhite">\
						<p>�ѷ���� '+item.HuXing+'����</p>\
						<p style="font-size:'+fontsize+'">ǩԼ��Ч�ڣ�<span class="fyellow">'+startDay+'-'+endDay+'</span></p>\
						<a href="javascript:void(0);" class="takebtn" data="'+item.Id+'">������ȡ</a>\
					</div>\
				</div>\
			';
		}
		if (redbagnum >= 3) {
			hongbaohtml = '<div class="needScrolly pr">'+hongbaohtml+'</div>';
		}
		return '<div class="popCont '+p_css+' pr">'+switchimg+hongbaohtml+'</div>';
	},
	createHongbaoDialog: function(onlyShowLogo){
		$.ajax({
			type:'get',
			dataType:'json',
			url:'/house/ajaxrequest/qudaodianshang_get201412.php',
			data:{newcode:sfhongbao.newcode, random:Math.random()},
			complete:function(){},
			error:function(){},
			success:function(msgRes){
				sfhongbao.qddsData = msgRes;
				if (msgRes.info.IsRedBag != 1) {
					return true;
				}
				$('#hbMoneybtn').show();
				var redbagList = msgRes.info.hongbaoList;
				var maxRedbagMoney = msgRes.info.maxHongbaoMoney;
				if (redbagList.length == 0) {
					return true;
				}
				var redbaghtml = '';
					redbaghtml += sfhongbao.createHongbaoHead(maxRedbagMoney);
					redbaghtml += sfhongbao.createHongbaoList(redbagList);
				// $('#hbContent').html(redbaghtml); IE 9 IE10
					document.getElementById("hbContent").innerHTML = redbaghtml;
				if (onlyShowLogo === true || sfhongbao.isPassHongbao()) {
					return true;
				}
				$('#hbPopmask').fadeIn();
				$('#hbContent').fadeIn();
				if(msgRes.resCode == 100) {
					$('#hbMoneybtn').show();
					return true;
				}
			}
		});
	},
	/*huajie.sun token-baoming verify*/
	isPassHongbao : function() {
		// check uri
		var uri = window.location.hash;
		var reg = new RegExp('(token)-(baoming)-([0-9]+)');
		var res =uri.match(reg);
		// parameter verify
		if(res && res[1] == 'token' && res[2] == 'baoming' && res[3]) {
			return true;
		}else{
			return false;
		}
	},
	getCookie: function( name ) {
		var start = document.cookie.indexOf( name + "=" );
		var len = start + name.length + 1;
		if ( ( !start ) && ( name != document.cookie.substring( 0, name.length ) ) )
		{
			return null;
		}
		if ( start == -1 ) return null;
		var end = document.cookie.indexOf( ";", len );
		if ( end == -1 ) end = document.cookie.length;
		return unescape( document.cookie.substring( len, end ) );
	},
	setCookie: function( name, value, expires, path, domain, secure ) {
		var today = new Date();
		today.setTime( today.getTime() );
		document.cookie = name + "=" +escape( value ) +
		( ( expires ) ? ";expires=" + expires.toGMTString() : "" ) + //expires.toGMTString()
		( ( path ) ? ";path=" + path : "" ) +
		( ( domain ) ? ";domain=" + domain : "" ) +
		( ( secure ) ? ";secure" : "" );
	},
	setHongbaoCookie : function() {
		var tdate = new Date();
		tdate.setHours(tdate.getHours()+ 4);
		sfhongbao.setCookie("showHongbao_"+sfhongbao.newcode, 1, tdate, "/", "fang.com", "");
		return true;
	},
	delHongbaoCookie: function() {
		var tdate = new Date();
		tdate.setSeconds(tdate.getSeconds()+0.5);
		sfhongbao.setCookie("showHongbao_"+sfhongbao.newcode, 0, tdate,"/","fang.com","");
		return true;
	}
};
sfhongbao.newcode = currNewcode;
$('#hbPopCloseBtn').live('click', function(){
	$('#hbPopmask').fadeOut();
	$('#hbContent').fadeOut();
});
$('#hbGetMoneybtn').live('click', function(){
	$('#hbPopmask').fadeIn();
	$('#hbContent').fadeIn();
	
});
$('.takebtn').live('click', function(){
	var hongbaoid = $(this).attr('data');
	if(source == 'web_newhousedianping'){
		window.open('http://pcorder.tao.fang.com/NewPCRedBag/index?aid='+sfhongbao.qddsData.info.aid+'&RedBagId='+hongbaoid+'&source='+source+'&fptn=web_'+citysuo+'_'+source.substr(4)+'_1');
	}else{
		window.open('http://pcorder.tao.fang.com/NewPCRedBag/index?aid='+sfhongbao.qddsData.info.aid+'&RedBagId='+hongbaoid+'&fptn=web_'+citysuo+'_'+source.substr(4)+'_1');
	}
});
/*
$(window).bind('beforeunload, unload', function(event) {
	event = event || window.event;
    var n = event.screenX - window.screenLeft;   
    var b =   n > document.documentElement.scrollWidth-20;   
    if(b && event.clientY < 0 || event.altKey){
		
    }
	return sfhongbao.delHongbaoCookie();
});
*/
var params = { 
	right: 10, 
	bottom: 300, 
	currentX: 0, 
	currentY: 0, 
	flag: false 
}; 
//��ȡ���CSS���� 
var getCss = function(o,key){ 
	return o.currentStyle? o.currentStyle[key] : document.defaultView.getComputedStyle(o,false)[key]; 
}; 

//��ק��ʵ�� 
var startDrag = function(bar, target, callback){ 
	if(getCss(target, "right") !== "auto"){ 
		params.right = getCss(target, "right"); 
	} 
	if(getCss(target, "bottom") !== "auto"){ 
		params.top = getCss(target, "bottom"); 
	} 
	//o���ƶ����� 
	bar.onmousedown = function(event){ 
		if(!event){ 
			event = window.event; 
			//��ֹIE����ѡ�� 
			bar.onselectstart = function(){ 
				return false; 
			} 
		} 
		var e = event; 
		//if(e.target.id=='hbGetMoneybtn'||e.srcElement.id=='hbGetMoneybtn'){return}
		var src = e.target?e.target:e.srcElement;
		if(src.id=='hbGetMoneybtn'){return}
		
		params.flag = true; 
		var cy = document.documentElement.clientHeight,cx = document.documentElement.clientWidth; 
		params.currentX = cx-e.clientX; 
		params.currentY = cy-e.clientY; 
	}; 
	document.onmouseup = function(event){ 
		var e = event ? event: window.event; 
		params.flag = false; 
		if(getCss(target, "right") !== "auto"){ 
			params.right = getCss(target, "right"); 
		} 
		if(getCss(target, "bottom") !== "auto"){ 
			params.bottom = getCss(target, "bottom"); 
		} 
	}; 
	document.onmousemove = function(event){ 
		var e = event ? event: window.event; 
		var cy = document.documentElement.clientHeight,cx = document.documentElement.clientWidth; 
		if(params.flag){ 
			var nowX = cx-e.clientX, nowY = cy-e.clientY; 
			var disX = nowX - params.currentX, disY = nowY - params.currentY; 
			target.style.right = parseInt(params.right) + disX + "px"; 
			target.style.bottom = parseInt(params.bottom) + disY + "px"; 
		} 
		if (typeof callback == "function") { 
			callback(parseInt(params.right) + disX, parseInt(params.bottom) + disY); 
		} 
	} 
}; 
$(function(){ 
	var target = document.getElementById('hbMoneybtn'); 
	startDrag(target,target)
})
//��̬��ʾ�����߽��
$.ajax({
			type:'get',
			dataType:'json',
			url:'/house/ajaxrequest/qudaodianshang_get201412.php',
			data:{newcode:sfhongbao.newcode, random:Math.random()},
			complete:function(){},
			error:function(){},
			success:function(msgRes){				
				if (msgRes.info.IsRedBag != 1) {
					return true;
				}
				var maxRedbagMoney = msgRes.info.maxHongbaoMoney;
				var maxMoney = '<center>���<span>'+maxRedbagMoney+'</span>Ԫ</center>';
				//$('.hbp1').html(maxMoney); IE 9 IE10
				$('.hbp1')[0].innerHTML = maxMoney;
				if(msgRes.resCode == 100) {
					$('#hbMoneybtn').show();
					return true;
				}
			}
		});