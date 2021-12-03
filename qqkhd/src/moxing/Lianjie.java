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
			s=new Socket("127.0.0.1",9999);//连接服务器端口
			ObjectOutputStream oos =new ObjectOutputStream(s.getOutputStream());//输出对象流
			oos.writeObject(o);//发送对象
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());//读取对象流
			Message ms=(Message)ois.readObject();//读取对象
			
			if(ms.getXx().equals("Y")){//判断服务器发回的验证消息
				String []sss=ms.getSss();
				Hyjm hy=new Hyjm(((User)o).getYhm());//创建好友界面
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
