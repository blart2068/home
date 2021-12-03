package io;
import java.io.*;
public class D3212 {
	public static void main(String[] args) throws Exception{
		FileInputStream wj=new FileInputStream("C:/Users/blart/Desktop/24.jpg");
		FileOutputStream nt=new FileOutputStream("C:/Users/blart/Desktop/007.jpg");
		int sj=wj.read();
		while(sj!=-1){
			nt.write(sj);
			sj=wj.read();
		}
		nt.flush();
		wj.close();
		nt.close();
	}
}