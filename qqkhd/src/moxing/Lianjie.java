package moxing;
import java.util.*;
import java.io.*;
import java.net.*;
import gonggong.*;
import gongju.*;
import jiemian.Hyjm;

public class Lianjie {
	static boolean b=false; 
	public Socket s;
	public static Hyjm hy;
	public static String lx="CW";
	public  boolean fs(Object o){
		try {
			s=new Socket("127.0.0.1",9999);//���ӷ������˿�
			ObjectOutputStream oos =new ObjectOutputStream(s.getOutputStream());//���������
			oos.writeObject(o);//���Ͷ���
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());//��ȡ������
			Message ms=(Message)ois.readObject();//��ȡ����
			
			if(ms.getXx().equals("Y")){//�жϷ��������ص���֤��Ϣ
				String []sss=ms.getSss();
				Hyjm hy=new Hyjm(((User)o).getYhm());//�������ѽ���
				hy.showHy(sss);
				//-------------
				Ljfwqxc ljf=new Ljfwqxc(s,hy);
				ljf.start();
				Glxc.addjlfwqxc(((User)o).getYhm(),ljf);
				b=true;
			}
			if(ms.getXx().equals("ZX")){
				lx="ZX";
			}
			
		} catch (Exception e) {
			System.out.println("yicang??");
		}
		return b;
	}
}
