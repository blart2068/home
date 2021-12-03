class SPJ implements Runnable{//实现多线程接口 Runnable
	int cp=1000;
	static String ys=new String("1111");//设置唯一性的字符串 

	public void run(){//实现接口中的run函数
		for(;;){	
			synchronized (ys){//----使得此线程在{}中的代码一次执行完后才应许计算机重新分配线程 (ys)确保唯一性
				if(cp>0){
					System.out.println
					(Thread.currentThread().getName()
							+"已经卖出第"+(1001-cp)+"车票!");
					--cp;
				}else{
					System.out.println(Thread.currentThread().getName()
							+"的车票已经全部卖完了!!");
					break;
				}
			}
		}
	}
}
public class D3184 {
	static String xx=new String("2222");
	public static void main(String[] args){

		SPJ aa=new SPJ();//新建实现了多线程的类
		Thread sp1=new Thread(aa);//新建多线程的类
		sp1.setName("AAAA");//取名
		sp1.start();//启动线程
		Thread sp2=new Thread(aa);
		sp2.setName("BBBB");
		Thread sp3=new Thread(aa);
		sp3.setName("CCCC");
		Thread sp4=new Thread(aa);
		sp4.setName("DDDD");
		sp2.start();sp3.start();sp4.start();//启动4条线程
	}
}


