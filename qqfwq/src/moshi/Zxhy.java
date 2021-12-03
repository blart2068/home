package moshi;

import java.io.ObjectOutputStream;
import java.net.Socket;

import gonggong.Message;
import gonggong.MessageSx;

public class Zxhy extends Thread{
	Socket s;
	Message m=new Message();
	String xx="xxxxxx";
	boolean b=true;
	public Zxhy(Socket s){
		this.s=s;
	}
	public void xctz(){
		b=false;
	}
	public void run(){
		while(b){
			try {
				Thread.sleep(2000);
				String ss=Zxdk.zxhy;
				if(!ss.equals(xx)){
					xx=ss;
					String sss[]=ss.split(" ");
					ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
					m.setSss(sss);
					m.setXx(MessageSx.yhzx);
					oos.writeObject(m);
				}
			} catch (Exception e) {}
		}
		System.out.println("ZXhy“—æ≠Õ£÷π");
	}
}
