class XC86 implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+i);
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class XC87 implements Runnable{
	public void run(){
		try{Thread.sleep(500);
		}catch(Exception e){}
		for(int i=-100;i<-80;i++){
			System.out.println(Thread.currentThread().getName()+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
public class D3183 {
	public static void main(String[] args){
		XC86 aa=new XC86();      XC87 bb=new XC87();
		Thread a=new Thread(aa);    Thread b=new Thread(bb);
		a.start();                    
		try {
			a.join();
		} catch (Exception e) {
			
		}
		 b.start();
	}
}
