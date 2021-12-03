package suju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import jm.*;

public class SJK {
	//public static String path="D:/222指挥所数据库/wh201610.txt";
	public static FileReader file ;
	public static FileWriter fw;
	public static BufferedWriter bw;
	public static BufferedReader br;
	public static String nr ="";
	
	//public static void main(String[] args){
	public static String pdsj(String lj){//判断有无记录
		String nr1=dqjl(lj);
		if(nr1.equals("")){
			System.out.println("空.....");
			return nr1;
		}else{
			System.out.println(nr1);
			return nr1;
		}
		
	
}
	public static void xrjl(String lj,String sj){//写入记录
		try {
			fw = new FileWriter(lj);
			bw = new BufferedWriter(fw);
			bw.write(sj);
			bw.close();
			fw.close();
			
		} catch (Exception e) {}
	
}
	public static String dqjl(String lj){//读取文档信息
		nr="";
		try {
			file = new FileReader(lj);
			br =new BufferedReader(file);
			String xx="";
			while ((xx=br.readLine())!=null) {
				nr+="\n"+xx;
			}
			br.close();
			file.close();
		} catch (Exception e) {
			
		}
		return nr;
		
		
	}
}
