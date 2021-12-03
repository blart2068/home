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
		//--------写入的是2进制代码---------有可能显示不正确----
		PrintStream bb=new PrintStream
				((new FileOutputStream("C:/Users/blart/Desktop/AAA.txt")));
		bb.print("说得1984");
		bb.close();
		//--------写入的是字符串的文本可以看懂---------------
		
		
	}
}
