$(function(){
	//--首页焦点图
	//--顶部下拉菜单
	$('.sNavA').each(function(i){
		$(this).hover(
		  function(){
			  $('.sNav').addClass('on');
			  },
		  function(){
			  $('.sNav').removeClass('on');
			  }
		)
		$('.sNav').find('.list').eq(i).hover(
		  function(){
			  $('.sNavA').eq(i).addClass('on1');
			  $('.sNav').addClass('on');
			  },
		  function(){
			  $('.sNavA').eq(i).removeClass('on1');
			  $('.sNav').removeClass('on');
			  }
		)
		})
	//--首页核心业务
	//--首页企业公民...
	$('.listHover').find('li').hover(
	   function(){
		   $(this).addClass('on');
		   },
	   function(){
		   $(this).removeClass('on');
		   }
	)
	//--首页新闻
	//--首页产业布局
	//--首页地图
	//--走进大爱（复杂特效）
	//--发展历程（复杂特效）
	$('.History').find('li:odd').addClass('liOdd');
	
	$('.culture').find('li:odd').addClass('liOdd');
	//--新闻
	//--产业布局
	//--大爱理念
	//--公益基金
	//--联系我们大爱舞台
	//--联系我们底部按钮
	//--社会责任
	//--底部微信弹出层
	slideFun();
	$(window).scroll(function(){
		slideFun();
		})
	//
	})