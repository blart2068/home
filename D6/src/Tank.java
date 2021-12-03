
class Tank extends Weapen {
	private char dir;
	public void setAttack(char dir){
		this.dir=dir;
	}
	public void sc(){
		new Weapen(1);
		System.out.println("我是坦克，向"+dir+"方前进速度为，"+sp+"武器等级为"+Power);
	}
}
