package tank;

public class Zidan implements Runnable {
	private int x,y,fx,sd=10;
	private boolean sm=true;
	Zidan(int x,int y,int fx){//构造
		this.x=x;
		this.y=y;
		this.fx=fx;
	}
	
	public void run(){
		for(;;){//子弹路径
			try {
				Thread.sleep(50);
			} catch (Exception e) {}
			switch (fx) {
			case 1:
				y-=sd;
				break;
			case 2:
				y+=sd;
				break;
			case 3:
				x-=sd;
				break;
			case 4:
				x+=sd;
				break;

			}
			if(x<0||x>900||y<0||y>660){
				sm=false;
				break;
			}
			
		}
	}
	public void setSm(boolean sm){
		this.sm=sm;
	}
	public boolean getSm(){
		return sm;
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

}
