package io;
import java.io.*;
class car implements Serializable{
	int jg=0;
	 String pp=null;
	public String getPp() {
		return pp;
	}
	public void setPp(String pp) {
		this.pp = pp;
	}
	public int getJg() {
		return jg;
	}
	public void setJg(int jg) {
		this.jg = jg;
	}
	car(String pp,int jg){
		this.pp=pp;
		this.jg=jg;
	}
}
public class D3222 {
	public static void main(String[] args){
		 car qc=new car("科鲁兹",15);
		 car ww=null;
		 ObjectOutputStream scl=null;
		 ObjectInputStream dq=null;
		 try{
		FileOutputStream xr=new FileOutputStream("C:/Users/blart/Desktop/zq.txt");
		scl=new ObjectOutputStream(xr);
		scl.writeObject(qc);
		dq=new ObjectInputStream
				(new FileInputStream("C:/Users/blart/Desktop/zq.txt"));
		ww=(car)dq.readObject();
		System.out.println(ww.getPp());
		System.out.println(ww.getJg());
		
		 }catch(Exception e){
			 System.out.println("出现错误!!");
		 }finally {
			 try{
			scl.close();
			dq.close();
			System.out.println("正常退出");
			System.exit(-1);
			 }catch(Exception e){
				 System.out.println("關閉出现错误!!");
				 System.exit(-1);
			 }
		}
	}
}
