package ldcd;



import mysql.*;

 
 
public class jl {
	private static String imm="lvdijituan2018";//���� 
	private static String url = "jdbc:mysql://101.37.150.13:3306/blartsql";//���ݿ��ַ
	private static String url2= "jdbc:mysql://www.blart.pw:3306/blartsql";//���ݿ��ַ
	
    

	static String ph ="/home/tomcat/apache-tomcat-8.5.8/webapps/jl.txt";
    public static String  rn(String yhm,String mm){//��ȡ����
    	
    	
    	if ((yhm+mm).equals(imm)) {//�ж�����
    	String rn="";

    	try {
    		rn=new sqltool(url). show();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
         return rn;
    		
    		
        
    	}else{
    		
    		return "�û����������";
    	}
       
    	
     }  
    	
    
 
    
    public static void xr(String time,String website,String name,String tel,String ip) {//д���ļ�
    	
    	

        try {
        	new sqltool(url).add(time, website, name,tel,ip);
        	new sqltool(url2).add(time, website, name,tel,ip);
        	
        	
		} catch (Exception e) {
			
		}
        
        
        
        
    }
    
}
	
