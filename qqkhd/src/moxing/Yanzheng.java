package moxing;
import java.net.Socket;

import gonggong.*;
public class Yanzheng {
	public Socket s;
	public boolean yz(User u){
		 Lianjie lj=new Lianjie();//�������ӷ���������
		 boolean b= lj.fs(u);
		 s=lj.s;
		 return b; 
	}
}
