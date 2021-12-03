package tank;

import java.util.Vector;

public class Mytank extends Tank{
	Vector<Zidan>zdjh=new Vector<Zidan>();
	Zidan zd=null;
	private int zds=2;
	public int getZds() {
		return zds;
	}
	public void setZds(int zds) {
		this.zds = zds;
	}
	Mytank(int x,int y){//构造
		super(x,y);
	}
	public void fszd(){//发射子弹

		switch (this.getFx()) {
		case 1://上
			zd=new Zidan(getX()+17,getY(),getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		case 2://下
			zd=new Zidan(getX()+17,getY()+40,getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		case 3://左
			zd=new Zidan(getX(),getY()+17,getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		case 4://右
			zd=new Zidan(getX()+40,getY()+17,getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		}
		Thread xc=new Thread(zd);
		xc.start();
	}
	public void shang(){//上
		int y=super.getY();
		int sd=super.getSd();
		if(y>0&&super.tkpz()){
		y-=sd;
		super.setY(y);
		}
	}
	public void xia(){//下
		int y=super.getY();
		int sd=super.getSd();
		if(y<620&&super.tkpz()){
		y+=sd;
		super.setY(y);
		}
	}
	public void zuo(){//左
		int X=super.getX();
		int sd=super.getSd();
		if(X>0&&super.tkpz()){
		X-=sd;
		super.setX(X);
		}
	}
	public void you(){//右
		int X=super.getX();
		int sd=super.getSd();
		if(X<860&&super.tkpz()){
		X+=sd;
		super.setX(X);
		}
	}
}
