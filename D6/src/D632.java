class cs{
	static{
		System.out.println("我是静态代码块");
	}
	{
		System.out.println("我是构造代码块");
	}
	public static void gz(){
		System.out.println("什么情况");
	}
}


public class D632{
	public static void main(String[] args){
		System.out.println("c-------------s");
		cs.gz();
		cs a=new cs();
		cs b=new cs();
	}
}
