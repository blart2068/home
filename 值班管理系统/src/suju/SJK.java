package suju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import jm.*;

public class SJK {
	//public static String path="D:/222ָ�������ݿ�/wh201610.txt";
	public static FileReader file ;
	public static FileWriter fw;
	public static BufferedWriter bw;
	public static BufferedReader br;
	public static String nr ="";
	
	//public static void main(String[] args){
	public static String pdsj(String lj){//�ж����޼�¼
		String nr1=dqjl(lj);
		if(nr1.equals("")){
			System.out.println("��.....");
			return nr1;
		}else{
			System.out.println(nr1);
			return nr1;
		}
		
	
}
	public static void xrjl(String lj,String sj){//д���¼
		try {
			fw = new FileWriter(lj);
			bw = new BufferedWriter(fw);
			bw.write(sj);
			bw.close();
			fw.close();
			
		} catch (Exception e) {}
	
}
	public static String dqjl(String lj){//��ȡ�ĵ���Ϣ
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
