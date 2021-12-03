package ldcd;



import mysql.*;

 
 
public class jl {
	private static String imm="lvdijituan2018";//设置 
	private static String url = "jdbc:mysql://101.37.150.13:3306/blartsql";//数据库地址
	private static String url2= "jdbc:mysql://www.blart.pw:3306/blartsql";//数据库地址
	
    

	static String ph ="/home/tomcat/apache-tomcat-8.5.8/webapps/jl.txt";
    public static String  rn(String yhm,String mm){//读取内容
    	
    	
    	if ((yhm+mm).equals(imm)) {//判读密码
    	String rn="";

    	try {
    		rn=new sqltool(url). show();
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
        	new sqltool(url).add(time, website, name,tel,ip);
        	new sqltool(url2).add(time, website, name,tel,ip);
        	
        	
		} catch (Exception e) {
			
		}
        
        
        
        
    }
    
}
	
