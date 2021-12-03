package fwq;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import gg.*;

public class FW {
	public static HashMap hm = new HashMap();
	public static String bbh = "----------当前版本2017116----------";
	public void qidong(){

		try {
			ServerSocket ss = new ServerSocket(5271);
			while(true){
				Socket s=ss.accept();
				System.out.println("+客户端");
				ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
				User u = (User)ois.readObject();
				System.out.println(u.getXm()+"已上线");
				ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());

				if(new Yangzheng().yz(u.getXm())){
					if(hm.get(u.getXm())==null){
						if(u.getBbh().equals(bbh)){
							hm.put(u.getXm(), u.getXm());
							JM.jt.append(u.getXm()+"\n");
							u.setYz(0);
							oos.writeObject(u);
							new Zlxc(s,u.getXm()).start();
						}else{
							u.setYz(3);
							oos.writeObject(u);
						}
					}else{
						u.setYz(2);
						oos.writeObject(u);
					}
				}else{
					u.setYz(1);
					oos.writeObject(u);
				}

			}

		} catch (Exception e) {
			System.out.println("错误??"+e.getMessage());
		}

	}
}
