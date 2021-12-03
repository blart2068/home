package tank;

import java.util.Vector;

public class Ditank extends Tank implements Runnable{
	private int sd=3,zds=3;
	Zidan zd=null;
	Vector<Zidan>dzd=new Vector<Zidan>();
	public int getZds() {
		return zds;
	}
	public void setZds(int zds) {
		this.zds = zds;
	}
	Ditank(int x,int y){
		super(x,y);
	}
	public void fszd(){//发射子弹
		if(getFx()==1){
			zd=new Zidan(getX()+20,getY(),getFx());
			if(dzd.size()<zds){
				dzd.add(zd);
			}
		}else if(getFx()==2){
			zd=new Zidan(getX()+20,getY()+40,getFx());
			if(dzd.size()<zds){
				dzd.add(zd);
			}
		}else if(getFx()==3){
			zd=new Zidan(getX(),getY()+20,getFx());
			if(dzd.size()<zds){
				dzd.add(zd);
			}
		}else if(getFx()==2){
			zd=new Zidan(getX()+40,getY()+20,getFx());
			if(dzd.size()<=zds){
				dzd.add(zd);
			}
		}
		Thread xc=new Thread(zd);
		xc.start();

	}

	public void run(){//线程
		for(;;){//坦克移动
			setFx((int)(Math.random()*4)+1);
			switch (getFx()) {
			case 1://上
				for(int i=0;i<40;i++){
					if(!Mypanel.yxzt){
						return;
					}
					int ys=getY();
					if(ys>0&&super.tkpz()){
						ys-=sd;
						setY(ys);
						try {
							Thread.sleep(50);
						} catch (Exception e) {}
					}else{
						try {
							Thread.sleep(20);
						} catch (Exception e) {}
					}
				}
				break;
			case 2://下
				for(int i=0;i<40;i++){
					if(!Mypanel.yxzt){
						return;
					}
					int yx=getY();
					if(yx<620&&super.tkpz()){
						yx+=sd;
						setY(yx);
						try {
							Thread.sleep(50);
						} catch (Exception e) {}
					}else{
						try {
							Thread.sleep(20);
						} catch (Exception e) {}
					}
				}
				break;
			case 3://左
				for(int i=0;i<40;i++){
					if(!Mypanel.yxzt){
						return;
					}
					int xz=getX();
					if(xz>0&&super.tkpz()){
						xz-=sd;
						setX(xz);
						try {
							Thread.sleep(50);
						} catch (Exception e) {}
					}else{
						try {
							Thread.sleep(20);
						} catch (Exception e) {}
					}
				}
				break;
			case 4://右
				for(int i=0;i<40;i++){
					if(!Mypanel.yxzt){
						return;
					}
					int xy=getX();
					if(xy<860&&super.tkpz()){
						xy+=sd;
						setX(xy);
						try {
							Thread.sleep(50);
						} catch (Exception e) {}
					}else{
						try {
							Thread.sleep(20);
						} catch (Exception e) {}
					}
				}
				break;
			}
			if(dzd.size()!=0&&dzd.get(0).getSm()==false){
				dzd.remove(0);
			}
			if(this.getTksm()==true){
				this.fszd();
			}
		}

	}
	public int getSd() {
		return sd;
	}
	public void setSd(int sd) {
		this.sd = sd;
	}

}
