class XC extends Thread{
	public void run(){
		for(int i=0;i<200;i++){
			System.out.println("线程++++++++");
		}
	}
}
public class D317{
	public static void main(String[] args){
		XC xc=new XC();
		xc.start();
		for(int i=0;i<200;i++){
			System.out.println("主线-------------");
		}
	}
}