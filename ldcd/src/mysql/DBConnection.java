package mysql;

import java.sql.*;  

//mysql连接类
public class DBConnection {

   
    
//    String user = "blart";
//    String password = "Kongh15601!";
    
    public Connection conn;
    
//    public static void main(String[] args) {
//    	DBConnection sdsd=new DBConnection();
//    	sdsd.close();
//    	
//	}

    public DBConnection(String ur,String user,String password) {
    	

        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载驱动程序
            conn = (Connection) DriverManager.getConnection(ur, user, password);// 连续数据库
            
            if(!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            this.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}