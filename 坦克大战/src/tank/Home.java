package tank;

public class Home {
private int x,y;
private boolean sm=true;

public boolean getSm() {
	return sm;
}

public void setSm(boolean sm) {
	this.sm = sm;
}

Home(int x,int y){
	this.x=x;
	this.y=y;
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
