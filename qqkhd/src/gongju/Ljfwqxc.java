package gongju;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import gonggong.Message;
import gonggong.MessageSx;
import jiemian.Hyjm;
import jiemian.Ltjm;
import moxing.Lianjie;
//���ӷ������߳�
public class Ljfwqxc extends Thread{
	public  Socket s;
	Hyjm hy;
	public Ljfwqxc(Socket s,Hyjm hy){//���캯��
		this.s=s;
		this.hy=hy;
	}

	public Socket getS() {
		return s;
	}

	public void setS(Socket s) {
		this.s = s;
	}
	public void run (){
		while(true){
			try {
				ObjectInputStream ois =new ObjectInputStream(s.getInputStream());
				Message m=(Message) ois.readObject();
				if(m.getXx().equals(MessageSx.yhzx)){//ˢ�º���������Ϣ
					System.out.println("----------");
					String sss[]=m.getSss();
					hy.showHy(sss);
				}
				if(m.getXx().equals(MessageSx.wzxx)){//��ͨ������Ϣ
					System.out.println("(����������Ϣ)"+m.getNc()+"˵:"+m.getNr()+m.getSss());
					String ss[]=Gllt.ltck.split(" ");
					String xx=m.getNc()+m.getDx();
					boolean b=true;
					for(int i=0;i<ss.length;i++){
						if(xx.equals(ss[i])){
							Gllt.GetLtjm(m.getNc()).showMg(m);
							new Yinyue("src/ks.wav",false).start();
							b=false;
						}
					}
					if(b){
						Ltjm lt=new Ltjm(m.getNc(),m.getDx());
						Gllt.addLtjm(m.getNc(), lt);
						Gllt.ltck+=m.getNc()+m.getDx()+" ";
						lt.showMg(m);
						new Yinyue("src/ks.wav",false).start();//��Ч
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}



