package my;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ldcd.ip;
import ldcd.ipip;
import ldcd.jl;
import mysql.sqltool;


public class tgm {
	static String ph ="/home/tomcat/apache-tomcat-8.5.8/webapps/tgm.txt";
	

	public static void main(String[] args) {
		
		
	
		
	}
	
	public static String zh(String ss ,String xm,String passwd){//电话号码转16进制
		Long a=(long)17;
		 try {
			 a= Long.parseLong(ss);
			 System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		 	//System.out.println(Long.toHexString(a));
		 String st = Long.toHexString(a);
		 String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()); //获取系统时间 
		 
//		if (ip.ippb(ss)) {
//			 jl.xr(datetime, xm, ss, st,passwd);//写入数据库
//			 return st;
//		}else{
//			 return "用户信息已存在";
//		}
		 jl.xr(datetime, xm, ss, st,passwd);//写入数据库
		 return st;
		
	}
	
	 
	 
	 public static String  rn(String dh){//读取内容
	    	 File file=new File(ph); 
	    	 BufferedReader reader=null;  
	         String temp="";  
	         int line=0;        
	         try{  
	                 reader=new BufferedReader(new FileReader(file)); 
	                 while((temp=reader.readLine())!=null){ 
	                	 if (line!=0) {
	                		 String []lsrn = temp.split("[+]");
	                		 if(lsrn[2].equals(dh)){
	                			 String nr = "时间："+lsrn[0]+"  姓名："+lsrn[1]+"  电话："+lsrn[2]+"  团购码："+lsrn[3];
	                			 return nr;
	                		 }
	                   
						} 
	                	 line++; 
	                 }  
	         }  
	         catch(Exception e){  
	             e.printStackTrace();  
	         }  
	         finally{  
	             if(reader!=null){  
	                 try{  
	                     reader.close();  
	                 }  
	                 catch(Exception e){  
	                     e.printStackTrace();  
	                 }  
	             } 
	            
	             
	         } 
	        
	         return "没有该用户信息！";
	        
	    
	    	
	     }  
	 
	 
	 
}
