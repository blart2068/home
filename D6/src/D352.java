abstract class Jtgj{
	String lx(){
		return "我是XX";
	}
	static final private int jg=100;
	int getJg(){
		return jg;
	}
	abstract String ff();
}
class Car extends Jtgj{
	String ff(){
		return super.getJg() +"我是汽车";
	}
}
class Mtc extends Jtgj{
	String ff(){
		return super.getJg() +"我是摩托车";
	}
	String lx(){
		return "我是哈雷";
	}
	
}


public class D352 {
	public static void main(String[] args){
		System.out.println(new Car().ff());
		System.out.println(new Mtc().lx());
		System.out.println(new Mtc().ff());
	}
}


