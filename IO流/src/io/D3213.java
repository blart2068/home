package io;

import java.io.*;

public class D3213{
	public static void main(String[] args) throws Exception{
		BufferedInputStream hcwjin=new BufferedInputStream(new FileInputStream("C:/Users/blart/Desktop/24.jpg"));
		BufferedOutputStream hcwjout=new BufferedOutputStream(new FileOutputStream("C:/Users/blart/Desktop/22222.jpg"));
		byte[]hcdx=new byte[1024];
		int sj=hcwjin.read(hcdx);
		while(sj!=-1){
			hcwjout.write(hcdx,0,sj);
			sj=hcwjin.read(hcdx);
		}
		hcwjout.flush();
		hcwjin.close();
		hcwjout.close();
	}
}