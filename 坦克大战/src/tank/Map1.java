package tank;

public class Map1 extends Map{
	Map1(){
		super();

		for(int i=0;i<41;i++){
			zk=new Zhuankuai(40+i*20,40);
			zkjh.add(zk);
			zk=new Zhuankuai(40+i*20,60);
			zkjh.add(zk);
		}
		for(int i=0;i<12;i++){
			if(i<10){//------B
				zk=new Zhuankuai(60,100+i*20);
				zkjh.add(zk);
			}else{
				zk=new Zhuankuai(60+(i-9)*20,100);
				zkjh.add(zk);
				zk=new Zhuankuai(60+(i-9)*20,280);
				zkjh.add(zk);
				zk=new Zhuankuai(100+(i-9)*20,100+(i-9)*20);
				zkjh.add(zk);
				zk=new Zhuankuai(160-(i-9)*20,140+(i-9)*20);
				zkjh.add(zk);
				zk=new Zhuankuai(100+(i-9)*20,180+(i-9)*20);
				zkjh.add(zk);
				zk=new Zhuankuai(160-(i-9)*20,220+(i-9)*20);
				zkjh.add(zk);
				zk=new Zhuankuai(60+(i-9)*20,180);
				zkjh.add(zk);
				zk=new Zhuankuai(60+(i-9)*20,200);
				zkjh.add(zk);
			}
		}
		for(int i=0;i<10;i++){//------L
			int x=200;int y=100;
			zk=new Zhuankuai(x,y+i*20);
			zkjh.add(zk);
			if(i<3){
				zk=new Zhuankuai((x+20)+i*20,y+180);
				zkjh.add(zk);
			}
		}
		for(int i=0;i<7;i++){//----A
			int x=380,y=100;
			zk=new Zhuankuai(x-60,y+i*20+60);
			zkjh.add(zk);
			zk=new Zhuankuai(x+60,y+i*20+60);
			zkjh.add(zk);
			if(i==0){
				zk=new Zhuankuai(x,y);
				zkjh.add(zk);
			}
			if(i<2){
				zk=new Zhuankuai(x+i*20+20,y+i*20+20);
				zkjh.add(zk);
				zk=new Zhuankuai(x-20-i*20,y+i*20+20);
				zkjh.add(zk);
			}
			if(i<5){
				zk=new Zhuankuai(x+i*20-40,y+100);
				zkjh.add(zk);
				zk=new Zhuankuai(x+i*20-40,y+120);
				zkjh.add(zk);
			}
		}
		for(int i=0;i<10;i++){//-----R
			int x=500,y=100;
			zk=new Zhuankuai(x,y+i*20);
			zkjh.add(zk);
			if(i<2){
				zk=new Zhuankuai(x+i*20+20,y);
				zkjh.add(zk);
				zk=new Zhuankuai(x+60+i*20,y+i*20);
				zkjh.add(zk);
				zk=new Zhuankuai(x+80,y+i*20+40);
				zkjh.add(zk);
				zk=new Zhuankuai(x+i*20+40,y+i*20+100);
				zkjh.add(zk);

			}
			if(i<4){
				zk=new Zhuankuai(x+i*20+20,y+80);
				zkjh.add(zk);
				if(i<3){
					zk=new Zhuankuai(x+80,y+140+i*20);
					zkjh.add(zk);
				}
			}
		}
		for(int i=0;i<9;i++){//----------T
			int x=720,y=100;
			zk=new Zhuankuai(x,y+i*20+20);
			zkjh.add(zk);
			zk=new Zhuankuai(200,485+i*20);
			zkjh.add(zk);
			zk=new Zhuankuai(220,485+i*20);
			zkjh.add(zk);
			zk=new Zhuankuai(660,485+i*20);
			zkjh.add(zk);
			zk=new Zhuankuai(680,485+i*20);
			zkjh.add(zk);
			if(i<7){
				zk=new Zhuankuai(x-60+i*20,y);
				zkjh.add(zk);
				zk=new Zhuankuai(0,525+i*20);
				zkjh.add(zk);
				zk=new Zhuankuai(20,525+i*20);
				zkjh.add(zk);
				zk=new Zhuankuai(860,525+i*20);
				zkjh.add(zk);
				zk=new Zhuankuai(880,525+i*20);
				zkjh.add(zk);
			}
		}
		
		//------¸Ö°å-------------------------------------


		for(int i=0;i<5;i++){
			int x=100,y=400;
			gk=new Gangban(x+i*40,y);
			gkjh.add(gk);
			gk=new Gangban(x+i*40+250,y);
			gkjh.add(gk);
			gk=new Gangban(x+i*40+500,y);
			gkjh.add(gk);
			if(i>2){
				gk=new Gangban(180+i*40,485);
				gkjh.add(gk);
				gk=new Gangban(400+i*40,485);
				gkjh.add(gk);
			}
		}
		//-------------²ÝµØ-----------------
		for(int i=0;i<20;i++){
			ck=new Caodi(40+i*40,320);
			ckjh.add(ck);
			if(i<2){
				ck=new Caodi(80+i*40,565);
				ckjh.add(ck);
				ck=new Caodi(740+i*40,565);
				ckjh.add(ck);
			}
			
		}
		//---------ºÓÁ÷-------------------
		for(int i=0;i<5;i++){
			int x=0,y=485;
			hk=new Heliu(x+i*40,y);
			hkjh.add(hk);
			hk=new Heliu(x+i*40+700,y);
			hkjh.add(hk);
			if(i<2){
				hk=new Heliu(x+430,y+i*40-5);
				hkjh.add(hk);
			}
		}
	}
}
