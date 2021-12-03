package dxl;
import java.io.*;
import java.net.*;
public class Dxfwq {
	public static void main(String[]args){
		new Dxfwq();
	}
	Dxfwq(){
		try {
			ServerSocket ss=new ServerSocket(9999);
			System.out.println("AAAAAAAA");
			Socket s=ss.accept();
			ObjectInputStream ois =new ObjectInputStream(s.getInputStream());
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			User uf=new User();
			uf.setYhm("ffff");
			uf.setMm("f");
			User u=(User)ois.readObject();
			System.out.println(u.getYhm());
			oos.writeObject(uf);
			
		} catch (Exception e) {
			System.out.println("222");
		}
		
	}
}
