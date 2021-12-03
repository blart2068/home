package io;
import java.io.*;
import java.util.Scanner;
public class D322{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		try {
			PrintStream zc=new PrintStream("C:/Users/blart/Desktop/zq.txt");
			PrintStream yc=new PrintStream("C:/Users/blart/Desktop/cw.txt");
			System.setOut(zc);
			System.setErr(yc);
			for(;;){
				sc.ssc();
				System.out.println(in.nextInt());
			}
			
		} catch (Exception e) {
			System.err.println("输入有误");
		}
	}
}
class sc{
	public static void ssc(){
		System.out.println("请输入你的年龄:");
	}
}








//	public static void main(String[] args){
//		PrintStream zq;
//		PrintStream cw;
//		Scanner in;
//		try{
//			zq=new PrintStream("C:/Users/blart/Desktop/zq.txt");
//			cw=new PrintStream("C:/Users/blart/Desktop/cw.txt");
//			System.setOut(zq);
//			System.setErr(cw);
//			while(true){
//				in= new Scanner(System.in);
//				int sz=in.nextInt();
//				System.out.println(sz);
//			}
//			
//		}catch(Exception e){
//			System.err.println("输入错误!!");
//		}
//		
//		
//	}
//}