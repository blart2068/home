abstract class Jtgj{
	String lx(){
		return "����XX";
	}
	static final private int jg=100;
	int getJg(){
		return jg;
	}
	abstract String ff();
}
class Car extends Jtgj{
	String ff(){
		return super.getJg() +"��������";
	}
}
class Mtc extends Jtgj{
	String ff(){
		return super.getJg() +"����Ħ�г�";
	}
	String lx(){
		return "���ǹ���";
	}
	
}


public class D352 {
	public static void main(String[] args){
		System.out.println(new Car().ff());
		System.out.println(new Mtc().lx());
		System.out.println(new Mtc().ff());
	}
}


