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
			ServerSocket ss=new ServerSocket(9999);//����������
			while(true){
				Socket s=ss.accept();//��������������
				System.out.println("�Ѿ�����!!");
				ObjectInputStream ois =new ObjectInputStream(s.getInputStream());//��ȡ������
				User u= (User)ois.readObject();//תΪU����
				System.out.println(u.getYhm()+"   "+u.getMm());
				ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());//���������
				Yanzheng yz=new Yanzheng(u);//ʵ������֤����
				Message m=new Message();//ʵ���� ��Ϣ����
				boolean b= true;
				if(yz.yz()){//������֤����
					String []sss=Zxdk.zxhy.split(" ");
					for(int i=0;i<sss.length;i++){
						if(u.getYhm().equals(sss[i])){
							m.setXx("ZX");
							oos.writeObject(m);
							System.out.println("�û��Ѿ�����");
							b=false;
						}
					}
					if(b){
						m.setXx("Y");//��д��Ϣ����
						oos.writeObject(m);//��ͻ��˷�����Ϣ����
						Xiancheng xc=new Xiancheng(s,u.getYhm());
						xcbs.tjxc(u.getYhm(), xc);
						xc.start();
						System.out.println("��֤ͨ��!!");
						Zxdk.setZsdk(u.getYhm(),s);
					}
				}else{
					m.setXx("N");
					System.out.println("��֤ʧ��!!");
					oos.writeObject(m);
				}
			}

		} catch (Exception e) {
			System.out.println("�쳣???");
		}
		System.out.println("������end!!");
	}
}
