class SPJ implements Runnable{//ʵ�ֶ��߳̽ӿ� Runnable
	int cp=1000;
	static String ys=new String("1111");//����Ψһ�Ե��ַ��� 

	public void run(){//ʵ�ֽӿ��е�run����
		for(;;){	
			synchronized (ys){//----ʹ�ô��߳���{}�еĴ���һ��ִ������Ӧ���������·����߳� (ys)ȷ��Ψһ��
				if(cp>0){
					System.out.println
					(Thread.currentThread().getName()
							+"�Ѿ�������"+(1001-cp)+"��Ʊ!");
					--cp;
				}else{
					System.out.println(Thread.currentThread().getName()
							+"�ĳ�Ʊ�Ѿ�ȫ��������!!");
					break;
				}
			}
		}
	}
}
public class D3184 {
	static String xx=new String("2222");
	public static void main(String[] args){

		SPJ aa=new SPJ();//�½�ʵ���˶��̵߳���
		Thread sp1=new Thread(aa);//�½����̵߳���
		sp1.setName("AAAA");//ȡ��
		sp1.start();//�����߳�
		Thread sp2=new Thread(aa);
		sp2.setName("BBBB");
		Thread sp3=new Thread(aa);
		sp3.setName("CCCC");
		Thread sp4=new Thread(aa);
		sp4.setName("DDDD");
		sp2.start();sp3.start();sp4.start();//����4���߳�
	}
}


