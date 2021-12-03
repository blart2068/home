class XC82 extends Thread{
	public void run(){
		
			System.out.println("在执行"+Thread.currentThread().getName());
		
	}
}
class XC83 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"运行中"+i);
		}
	}
}
class XC84 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"运行中"+i);
		}
	}
}
class XC85 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"运行中"+i);
		}
	}
}
public class D3182 {

	public static void main(String[] args){
		XC82 a=new XC82();
		a.setName("a");
		XC82 b=new XC82();
		b.setName("bb");
		XC82 c=new XC82();
		c.setName("ccc");
		XC82 d=new XC82();
		d.setName("dddd");
		
		//-------------------------
		XC83 aa=new XC83();XC84 bb=new XC84();XC85 cc=new XC85();
		Thread aa1=new Thread(aa);
		aa1.setName("aa1");
		aa1.setPriority(Thread.NORM_PRIORITY-4);
		Thread bb1=new Thread(bb);
		bb1.setName("bb1");
		bb1.setPriority(Thread.NORM_PRIORITY+5);
		Thread cc1=new Thread(cc);
		cc1.setName("cc1");
		
		aa1.start();bb1.start();cc1.start();
		//----------------------------------------------------
		a.start();b.start();c.start();d.start();
		System.out.println("在执行"+Thread.currentThread().getName());
	}
}
