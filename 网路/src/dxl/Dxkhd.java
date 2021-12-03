package dxl;
import java.io.*;
import java.net.*;
public class Dxkhd {
	public static void main(String[] args){
		new Dxkhd();
	}
	Dxkhd(){
		try {
			Socket s=new Socket("127.0.0.1", 9999);
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			User u=new User();
			u.setYhm("001khd");u.setMm("001");
			oos.writeObject(u);
			System.out.println(((User)(ois.readObject())).getYhm());
		} catch (Exception e) {
			System.out.println("111");
		}
		
	}
}	
