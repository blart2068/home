//import java.util.concurrent.SynchronousQueue;

class X1C implements Runnable{
	public void run(){
		for(int i=0;i<200;i++){
			System.out.println("½Ó¿Ú------------");
		}
	}
}
public class D3172 {
	public static void  main(String[] args){
		X1C xc=new X1C();
		Thread cxxc=new Thread(xc);
		cxxc.start();
		for(int i=0;i<200;i++){
			System.out.println("main++++++++++");
		}
	}
}
