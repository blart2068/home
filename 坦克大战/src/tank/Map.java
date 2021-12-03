package tank;

import java.awt.*;
import java.util.Vector;

public class Map {
	int x=390,y=640;
	Image zt,gb,cd,hl,home;
	boolean homesm=true;
	Zhuankuai zk;
	Gangban gk;
	Caodi ck;
	Heliu hk;
	Home hm;
	static Vector<Zhuankuai> zkjh=new Vector<Zhuankuai>();
	static Vector<Gangban> gkjh=new Vector<Gangban>();
	static Vector<Caodi> ckjh=new Vector<Caodi>();
	static Vector<Heliu> hkjh=new Vector<Heliu>();
	
	Map(){
		zt=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/zt.png"));
		gb=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/gb.png"));
		cd=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/cd.png"));
		hl=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/hl.png"));
		home=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/home.png"));
		{//-----home-----
			hm=new Home(430,620);
			int x=410,y=640;
			for(int i=0;i<8;i++){
				zk=new Zhuankuai(x,y);
				if(i<3){
					zkjh.add(zk);
					y-=20;
				}
				if(i>=3&&i<5){
					zk=new Zhuankuai(x+20,y+20);
					zkjh.add(zk);
					x+=20;
				}
				if(i>=5&&i<8){
					zk=new Zhuankuai(x+20,y+20);
					zkjh.add(zk);
					y+=20;
				}
			}
		}
		//¹Ø¿¨1
			
	}
	public  void dtone(Graphics g){//»­µØÍ¼
		if(hm.getSm()){//home
			g.drawImage(home, hm.getX(), hm.getY(), 40,40,null);
		}
		for(int i=0;i<zkjh.size();i++){//×©¿é
			if(zkjh.get(i).getSm()==true){
				g.drawImage(zt, zkjh.get(i).getX(), zkjh.get(i).getY(), 20, 20, null);
			}
		}
		for(int i=0;i<gkjh.size();i++){//¸Ö°å
			g.drawImage(gb, gkjh.get(i).getX(), gkjh.get(i).getY(),40,40,null);
		}
		for(int i=0;i<ckjh.size();i++){//²ÝµØ
			g.drawImage(cd, ckjh.get(i).getX(), ckjh.get(i).getY(),40,40,null);
		}
		for(int i=0;i<hkjh.size();i++){//ºÓÁ÷
			g.drawImage(hl, hkjh.get(i).getX(), hkjh.get(i).getY(),40,40,null);
		}

	}

}
