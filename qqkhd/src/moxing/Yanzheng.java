package moxing;
import java.net.Socket;

import gonggong.*;
public class Yanzheng {
	public Socket s;
	public boolean yz(User u){
		 Lianjie lj=new Lianjie();//调用连接服务器函数
		 boolean b= lj.fs(u);
		 s=lj.s;
		 return b; 
	}
}
