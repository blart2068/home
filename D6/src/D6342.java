
class cw{
	void hj(){
		System.out.println("我在吼叫");
	}
	void cf(){
		System.out.println("我在---吃饭---");
	}
}
class Cat extends cw{
	void cf(){
		System.out.println("我在吃+++鱼+++");
	}
	void gn(){
		System.out.println("我能抓++老鼠++");
	}
}
class Dog extends cw{
	void cf(){
		System.out.println("我在吃***肉***");
	}
	void gn(){
		System.out.println("我能抓**抓猫**");
	}
}


public class D6342 {
	public static void main(String[] args){
		cw a=new cw();
		cw b=new cw();
		a=new Cat();
		b=new Dog();
		
		a.hj();a.cf();Cat a1=(Cat)a;a1.gn();
		
		b.hj();b.cf();Dog b1=(Dog)b;b1.gn();
		
		
	}
}
