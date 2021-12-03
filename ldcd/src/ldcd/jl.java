package ldcd;




import mysql.*;

 
 
public class jl {
	private static String imm="lvdijituan2018";//设置 
	private static String url = "jdbc:mysql://101.37.150.13:3306/blartsql";//数据库地址
	private static String url2= "jdbc:mysql://hdm515540463.my3w.com:3306/hdm515540463_db";//数据库地址
	private static String user= "blart";//数据库用户名
	private static String user2= "hdm515540463";//数据库用户名
	private static String passwd= "Kongh15601!";//数据库密码
	private static String passwd2= "Kongh15601";//数据库密码
	
    

    public static String  rn(String yhm,String mm){//读取内容
    	
    	
    	if ((yhm+mm).equals(imm)) {//判读密码
    	String rn="";

    	try {
    		rn=new sqltool(url,user,passwd). show();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
         return rn;
    		
    		
        
    	}else{
    		
    		return "用户名密码错误";
    	}
       
    	
     }  
    	
    
 
    
    public static void xr(String time,String website,String name,String tel,String ip) {//写入文件
    	
    	

        try {
        	new sqltool(url,user,passwd).add(time, website, name,tel,ip);
        	new sqltool(url2,user2,passwd2).add(time, website, name,tel,ip);
        	
        	
		} catch (Exception e) {
			
		}
        
        
        
        
    }
    
}
	
