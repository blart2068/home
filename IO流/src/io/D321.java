package io;
import java.io.*;
public class D321 {
	public static void main(String[] args){
		try{
		FileReader wj=new FileReader("C:\\Users\\blart\\Desktop\\222.txt");
		int sj=wj.read();
		System.out.println("内容为************");
		while(sj!=-1){
			System.out.print((char)sj);
			sj=wj.read();
		}
		wj.close();
		}catch(Exception e){System.out.println("不行么?");}
		
		
	}
}
