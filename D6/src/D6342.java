
class cw{
	void hj(){
		System.out.println("���ں��");
	}
	void cf(){
		System.out.println("����---�Է�---");
	}
}
class Cat extends cw{
	void cf(){
		System.out.println("���ڳ�+++��+++");
	}
	void gn(){
		System.out.println("����ץ++����++");
	}
}
class Dog extends cw{
	void cf(){
		System.out.println("���ڳ�***��***");
	}
	void gn(){
		System.out.println("����ץ**ץè**");
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
