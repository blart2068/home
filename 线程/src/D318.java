class XC2 implements Runnable {
	public void run(){
		for(int i=0;i<200;i++){
			System.out.println("线程一11111111111");
		}
	}
}
class XC3 implements Runnable{
	public void run(){
		for(int i=0;i<200;i++){
			System.out.println("线程一2222222222");
		}
	}
}
class XC4 extends Thread{
	public void run(){
		for(int i=0;i<200;i++){
			System.out.println("线程一333333333");
		}
	}
}
public class D318 {
	public static void main(String[] args){
		XC2 xc2=new XC2();
		XC3 xc3=new XC3();
		XC4 xc4=new XC4();
		xc4.start();
		Thread x2=new Thread(xc2);
		x2.start();
		Thread x3=new Thread(xc3);
		x3.start();
		for(int i=0;i<200;i++){
			System.out.println("线程一4444444444");
		}
	}

}
