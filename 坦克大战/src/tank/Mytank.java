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
	Mytank(int x,int y){//����
		super(x,y);
	}
	public void fszd(){//�����ӵ�

		switch (this.getFx()) {
		case 1://��
			zd=new Zidan(getX()+17,getY(),getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		case 2://��
			zd=new Zidan(getX()+17,getY()+40,getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		case 3://��
			zd=new Zidan(getX(),getY()+17,getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		case 4://��
			zd=new Zidan(getX()+40,getY()+17,getFx());
			if(zdjh.size()<zds){
				zdjh.add(zd);
			}
			break;
		}
		Thread xc=new Thread(zd);
		xc.start();
	}
	public void shang(){//��
		int y=super.getY();
		int sd=super.getSd();
		if(y>0&&super.tkpz()){
		y-=sd;
		super.setY(y);
		}
	}
	public void xia(){//��
		int y=super.getY();
		int sd=super.getSd();
		if(y<620&&super.tkpz()){
		y+=sd;
		super.setY(y);
		}
	}
	public void zuo(){//��
		int X=super.getX();
		int sd=super.getSd();
		if(X>0&&super.tkpz()){
		X-=sd;
		super.setX(X);
		}
	}
	public void you(){//��
		int X=super.getX();
		int sd=super.getSd();
		if(X<860&&super.tkpz()){
		X+=sd;
		super.setX(X);
		}
	}
}
