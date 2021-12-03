//--
var slideV1=150;
var slideV2=100;
function slideFun(){
	$('.slide-T').each(function(i){
		if($(window).scrollTop()>$(this).offset().top-$(window).height()+slideV1-slideV2){
			$(this).addClass('slide-Ton');
			}
		})
	$('.slide-B').each(function(i){
		if($(window).scrollTop()>$(this).offset().top-$(window).height()+slideV1-slideV2){
			$(this).addClass('slide-Bon');
			}
		})
	$('.slide-L').each(function(i){
		if($(window).scrollTop()>$(this).offset().top-$(window).height()+slideV1){
			$(this).addClass('slide-Lon');
			}
		})
	$('.slide-R').each(function(i){
		if($(window).scrollTop()>$(this).offset().top-$(window).height()+slideV1){
			$(this).addClass('slide-Ron');
			}
		})
	}