package moshi;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import gonggong.*;
import moshi.*;
public class Fuwu {

	public Fuwu(){
		this.qidong();
	}
	public void qidong(){

		try {
			ServerSocket ss=new ServerSocket(9999);//建立服务器
			while(true){
				Socket s=ss.accept();//监听服务器连接
				System.out.println("已经连接!!");
				ObjectInputStream ois =new ObjectInputStream(s.getInputStream());//读取对象流
				User u= (User)ois.readObject();//转为U对象
				System.out.println(u.getYhm()+"   "+u.getMm());
				ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());//输出对象流
				Yanzheng yz=new Yanzheng(u);//实例化验证对象
				Message m=new Message();//实例化 消息对象
				boolean b= true;
				if(yz.yz()){//调用验证函数
					String []sss=Zxdk.zxhy.split(" ");
					for(int i=0;i<sss.length;i++){
						if(u.getYhm().equals(sss[i])){
							m.setXx("ZX");
							oos.writeObject(m);
							System.out.println("用户已经在线");
							b=false;
						}
					}
					if(b){
						m.setXx("Y");//改写消息对象
						oos.writeObject(m);//向客户端发送消息函数
						Xiancheng xc=new Xiancheng(s,u.getYhm());
						xcbs.tjxc(u.getYhm(), xc);
						xc.start();
						System.out.println("验证通过!!");
						Zxdk.setZsdk(u.getYhm(),s);
					}
				}else{
					m.setXx("N");
					System.out.println("验证失败!!");
					oos.writeObject(m);
				}
			}

		} catch (Exception e) {
			System.out.println("异常???");
		}
		System.out.println("服务器end!!");
	}
}
