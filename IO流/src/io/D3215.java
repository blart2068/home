package io;
import java.io.*;
public class D3215 {
	public static void main(String[] args) throws Exception{
		BufferedReader sr=new BufferedReader(new InputStreamReader(System.in));
		String cc=sr.readLine();
		System.out.println(cc+"\n***********");
		System.out.println(cc.equals(null));
		System.out.println(cc.equals(""));
		//------------------------------------------------------
		DataOutputStream aa=new DataOutputStream
				(new FileOutputStream("C:/Users/blart/Desktop/131.txt"));
		aa.writeInt(1984);
		aa.close();
		//--------д�����2���ƴ���---------�п�����ʾ����ȷ----
		PrintStream bb=new PrintStream
				((new FileOutputStream("C:/Users/blart/Desktop/AAA.txt")));
		bb.print("˵��1984");
		bb.close();
		//--------д������ַ������ı����Կ���---------------
		
		
	}
}
