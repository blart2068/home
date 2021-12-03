package moshi;
import gonggong.*;
import java.sql.*;

public class Yanzheng {
	private User u;
	Connection ct;
	PreparedStatement ps;
	ResultSet rs;
	String driver="sun.jdbc.odbc.JdbcOdbcDriver";
	String url="jdbc:odbc:sql";
	String user="sa";
	String passwd="5337";
	
	public Yanzheng(User u){
		this.u=u;
	}
	
		
	public boolean yz(){
		String yhm=u.getYhm();
		String mm=u.getMm();
		String sql="select yhm from qq where yhm='"+yhm+"'and mm='"+mm+"'";
		
		boolean b=false;
		try {
			
			Class.forName(driver);//连接数据库
			ct=DriverManager.getConnection(url,user,passwd);//登陆数据库
			ps=ct.prepareStatement(sql);//向数据库写入SQL语句
			rs=ps.executeQuery();//读取数据库返回信息
			if(rs.next()){//判断数据库中能否读到信息
				b=true;
			}
		} catch (Exception e) {}finally{
			try {
				ct.close();
				ps.close();
				rs.close();
			} catch (Exception e2) {}
		}
		return b;
	}
}
