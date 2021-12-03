package mysql;

import java.sql.*;  

//mysql连接类
public class DBConnection {

    String driver = "com.mysql.jdbc.Driver";
    String url= "jdbc:mysql://www.blart.pw:3306/blartsql";
    String user = "blart";
    String password = "Kongh15601!";
    
    public Connection conn;
    
//    public static void main(String[] args) {
//    	DBConnection sdsd=new DBConnection();
//    	sdsd.close();
//    	
//	}

    public DBConnection(String ur) {
    	url=ur;

        try {
            Class.forName(driver);// 加载驱动程序
            conn = (Connection) DriverManager.getConnection(url, user, password);// 连续数据库
            
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