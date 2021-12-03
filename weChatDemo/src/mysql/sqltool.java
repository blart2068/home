package mysql;
import java.sql.*;


public class sqltool {

	static String ur="";
	static String user="";
	static String passwd="";
	
    public static void main(String[] args){
    	//增加一条----
      //add("2018-01-13 15:26:19", "绿地长岛【宝琴（移动）】", "奥巴马","189366521");
    	
    	//查询-----
    	//System.out.println( new sqltool("jdbc:mysql://www.blart.pw:3306/blartsql"). show()); 
    	//System.out.println( new sqltool("jdbc:mysql://www.blart.pw:3306/blartsql"). mhcz("2018-03-19","192.168.1.95")); 
    	
    	//修改----------
        //update("绿地海湾【宝琴（pc）】","18939980599","aya","8");
        
        //删除---------
        //del("7");
      
    }
    public sqltool(String url,String userl,String passwdl) {
		ur=url;
		user=userl;
		passwd=passwdl;
	}
    
    //插入操作
    public  void add(String time,String name,String tel,String tuangouma,String pd) {
         
        String sql="insert into tuangoubiao (time,name,tel,tuangouma,passwd) values (?,?,?,?,?)";
        DBConnection db = new DBConnection(ur,user,passwd);
        try {        
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, time);
            
            preStmt.setString(2, name);
            preStmt.setString(3, tel);
            preStmt.setString(4, tuangouma);
            preStmt.setString(5, pd);
            
            preStmt.executeUpdate();
            //Statement statement = (Statement) db.conn.createStatement();
            //statement.executeUpdate(sql);
            
            preStmt.close();
            db.close();//关闭连接 
            System.out.println("添加完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //插入操作2
    public  void add2(String time,String xmmc,String name,String tel,String tuangouma,String ip) {
         
        String sql="insert into qmyxbiao (time,website,name,tel,tuangouma,ip) values (?,?,?,?,?,?)";
        DBConnection db = new DBConnection(ur,user,passwd);
        try {        
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, time);
            preStmt.setString(2, xmmc);
            preStmt.setString(3, name);
            preStmt.setString(4, tel);
            preStmt.setString(5, tuangouma);
            preStmt.setString(6, ip);
            
            preStmt.executeUpdate();
            //Statement statement = (Statement) db.conn.createStatement();
            //statement.executeUpdate(sql);
            
            preStmt.close();
            db.close();//关闭连接 
            System.out.println("添加完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    //模糊查找、
    public boolean mhcz(String time,String ip){
    	int i=0;
    	
    	 String sql ="select * from qmyxbiao where time like '%"+time+"%' and ip = '"+ip+"'";
    
    	 
         DBConnection db = new DBConnection(ur,user,passwd);
         try {
             Statement stmt = (Statement) db.conn.createStatement();
             ResultSet rs = (ResultSet) stmt.executeQuery(sql);
             while(rs.next()){
                
                 if (rs.getString("ip").equals(ip)) {
                	 i++;
                	 if (i>2) {
                		 rs.close();
                         db.close();//关闭连接 
    					return false;
					}
                	
				}
             }
             rs.close();
             db.close();//关闭连接 
         } catch (SQLException e) {
             e.printStackTrace();
         } 
         return true;
    }
    
    //查找操作
    public  String show(){
         String sql ="select * from tuangoubiao";
         DBConnection db = new DBConnection(ur,user,passwd);
         String biaobi = "------------------------------------------------------------------------------------\n"+
        		"编号"+"\t\t"+"时间" +"\t\t\t"+ "网站" +"\t\t\t"+ "姓名"+"\t"+"    电话\n"+
         "------------------------------------------------------------------------------------\n";
         String suju ="";
         
         try {
            Statement stmt = (Statement) db.conn.createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            while(rs.next()){
            	String number = rs.getString("number");
                String time = rs.getString("time");
                
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String tuangouma = rs.getString("tuangouma");
                //可以将查找到的值写入类，然后返回相应的对象 
                //这里 先用输出的端口显示一下
                suju =suju+ (number+"\t"+time +"\t"+ name+"\t"+ tel+"\t"+ tuangouma+"\n");
            }
            rs.close();
            db.close();//关闭连接 
        } catch (SQLException e) {
            e.printStackTrace();
        } 
         //System.out.println(biaobi+suju);
         return biaobi+suju;
    }
    //更新操作
    public void update(String tuangouma,String tel,String name,String number) {
       
        String sql="update tuangoubiao set tuangouma=?,tel=?,name=? where number=?";
        DBConnection db = new DBConnection(ur,user,passwd);
        
        try {
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, tuangouma);
            preStmt.setString(2, tel);
            preStmt.setString(3, name);
            preStmt.setString(4, number);
 
            preStmt.executeUpdate();
            
            preStmt.close();
            db.close();//关闭连接 
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
    //删除操作
    public void del(String number) {
       
        String sql="delete from tuangoubiao where number=?";
        DBConnection db = new DBConnection(ur,user,passwd);
        try {    
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.setString(1, number);
            preStmt.executeUpdate();
            
            preStmt.close();
            db.close();//关闭连接 
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    }
}