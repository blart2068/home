package moshi;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Iterator;

import gonggong.*;
public class Xiancheng extends Thread {//�߳����������տͻ��˷��͹�������Ϣ
	Socket s;//����ӿ�

	String yhm;
	public Xiancheng(Socket s,String yhm){
		this.s=s;
		this.yhm=yhm;
	}
	public void run(){//�߳�
		Zxhy zx=new Zxhy(s);
		zx.start();
		for(;;){
			try {
				//����-------
				ObjectInputStream ois =new ObjectInputStream(this.s.getInputStream());//������
				Message m=(Message)ois.readObject();//��ȡ��Ϣ��
				Message mm=new Message();
				if(m.getXx().equals(MessageSx.wzxx)){
					//------ת��---
					String ss=Zxdk.zxhy;
					String sss[]=ss.split(" ");
					boolean b=true;
					for(int i=0;i<sss.length;i++){
						if(m.getDx().equals(sss[i])){
							Xiancheng xc=xcbs.getXc(m.getDx());
							ObjectOutputStream oos=new ObjectOutputStream(xc.s.getOutputStream());//�����
							oos.writeObject(m);//������Ϣ
							System.out.println(m.getNc()+"��"+m.getDx()+"˵:"+m.getNr());
							b=false;
						}
					}
					if(b){
						ObjectOutputStream oos=new ObjectOutputStream(this.s.getOutputStream());
						mm.setXx(MessageSx.wzxx);
						mm.setNr("�û��Ѿ�����!!!");
						mm.setNc(m.getDx());
						oos.writeObject(mm);
					}
				}
			} 
			catch (Exception e) {
				System.out.println("�������߳��쳣"+e.toString());
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
