package tank;

public class Baozha {
	private int x,y,scq=12;
	private boolean bzsm=true;
	public void smzq(){
		if(scq>0){
			scq--;
		}else{
			bzsm=false;
		}
	}
	public void setScq(int scq){
		this.scq=scq;
	}
	public int getScq(){
		return scq;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean getBzsm() {
		return bzsm;
	}
	public void setBzsm(boolean bzsm) {
		this.bzsm = bzsm;
	}
	Baozha(int x,int y){
		this.x=x;
		this.y=y;
	}
}
