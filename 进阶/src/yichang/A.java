package yichang;

import java.util.Scanner;

class A {
	Scanner in=new Scanner(System.in);
	
	void sc()throws Exception {
		System.out.println("请输入一个2个整数");
		int a,b,c;
		a=in.nextInt();
		b=in.nextInt();
		c=a%b;
		System.out.println((a/b)+"余数为"+c);
	}
}
