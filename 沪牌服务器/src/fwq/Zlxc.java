package fwq;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import gg.User;

public class Zlxc extends Thread{
	Socket s;
	String xm;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	String zl1="\t��ɵ�һ�γ��ۺ�Ŀǰ�����κβ���,����11:00��ɶ��������!!\n\n";
	String zl2="---------------\n\n";
	String zl3="----------------\n\n";
	String zl33="----------------\n\n";
	
	String zl5="\t���������벻Ҫ�ر�������ȴ��������!ף������!!LUCK\n\n";
	public Zlxc(Socket s,String xm){
		this.s=s;
		this.xm=xm;
	}
	public void run() {
		while(true){
			try {
				ois=new ObjectInputStream(s.getInputStream());
				oos=new ObjectOutputStream(s.getOutputStream());
				User u=(User)ois.readObject();
				if(u.getSj()==1){
					u.setZl(zl1);
					oos.writeObject(u);
				}
				if(u.getSj()==2){
					u.setZl(zl2);
					oos.writeObject(u);
				}
				if(u.getSj()==3){
					if((((int)(Math.random()*9))%2)==0){
						u.setZl(zl3);
						oos.writeObject(u);
					}else{
						u.setZl(zl33);
						oos.writeObject(u);
					}
				}
				
				if(u.getSj()==5){
					u.setZl(zl5);
					oos.writeObject(u);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				FW.hm.remove(xm);
				JM.jt.append(xm+"�Ѿ�����!!\n");
				return;
			}
		}
	}
}
