package moshi;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Iterator;

import gonggong.*;
public class Xiancheng extends Thread {//线程类用来接收客户端发送过来的信息
	Socket s;//网络接口

	String yhm;
	public Xiancheng(Socket s,String yhm){
		this.s=s;
		this.yhm=yhm;
	}
	public void run(){//线程
		Zxhy zx=new Zxhy(s);
		zx.start();
		for(;;){
			try {
				//接收-------
				ObjectInputStream ois =new ObjectInputStream(this.s.getInputStream());//输入流
				Message m=(Message)ois.readObject();//读取消息类
				Message mm=new Message();
				if(m.getXx().equals(MessageSx.wzxx)){
					//------转发---
					String ss=Zxdk.zxhy;
					String sss[]=ss.split(" ");
					boolean b=true;
					for(int i=0;i<sss.length;i++){
						if(m.getDx().equals(sss[i])){
							Xiancheng xc=xcbs.getXc(m.getDx());
							ObjectOutputStream oos=new ObjectOutputStream(xc.s.getOutputStream());//输出流
							oos.writeObject(m);//发送信息
							System.out.println(m.getNc()+"对"+m.getDx()+"说:"+m.getNr());
							b=false;
						}
					}
					if(b){
						ObjectOutputStream oos=new ObjectOutputStream(this.s.getOutputStream());
						mm.setXx(MessageSx.wzxx);
						mm.setNr("用户已经离线!!!");
						mm.setNc(m.getDx());
						oos.writeObject(mm);
					}
				}
			} 
			catch (Exception e) {
				System.out.println("服务器线程异常"+e.toString());
				String ss=Zxdk.zxhy;
				String xs="";
				String sss[]=ss.split(" ");
				for(int i=0;i<sss.length;i++){
					if(!yhm.equals(sss[i])){
						xs+=sss[i]+" ";
					}
				}
				System.out.println(xs);
				Zxdk.zxhy=xs;
				zx.xctz();
				break;
			}
		}	
	}
}
