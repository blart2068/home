package ldcd;




import mysql.*;

 
 
public class jl {
	private static String imm="lvdijituan2018";//���� 
	private static String url = "jdbc:mysql://101.37.150.13:3306/blartsql";//���ݿ��ַ
	private static String url2= "jdbc:mysql://hdm515540463.my3w.com:3306/hdm515540463_db";//���ݿ��ַ
	private static String user= "blart";//���ݿ��û���
	private static String user2= "hdm515540463";//���ݿ��û���
	private static String passwd= "Kongh15601!";//���ݿ�����
	private static String passwd2= "Kongh15601";//���ݿ�����
	
    

    public static String  rn(String yhm,String mm){//��ȡ����
    	
    	
    	if ((yhm+mm).equals(imm)) {//�ж�����
    	String rn="";

    	try {
    		rn=new sqltool(url,user,passwd). show();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
         return rn;
    		
    		
        
    	}else{
    		
    		return "�û����������";
    	}
       
    	
     }  
    	
    
 
    
    public static void xr(String time,String name,String tel,String tuangouma ,String pd) {//д���ļ�
    	
    	

        try {
        	new sqltool(url,user,passwd).add(time,name,tel,tuangouma,pd);
        	new sqltool(url2,user2,passwd2).add(time,name,tel,tuangouma,pd);
        	
        	
		} catch (Exception e) {
			
		}
        
        
    }
    
 public static void xr2(String time,String xmmc,String name,String tel ,String tuangouma ,String ip){//д���ļ�
    	
    	

        try {
        	new sqltool(url,user,passwd).add2(time,xmmc,name,tel,tuangouma,ip);
        	new sqltool(url2,user2,passwd2).add2(time,xmmc,name,tel,tuangouma,ip);
        	
        	
		} catch (Exception e) {
			
		}
        
        
    }
    
}
	
