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
			
			Class.forName(driver);//�������ݿ�
			ct=DriverManager.getConnection(url,user,passwd);//��½���ݿ�
			ps=ct.prepareStatement(sql);//�����ݿ�д��SQL���
			rs=ps.executeQuery();//��ȡ���ݿⷵ����Ϣ
			if(rs.next()){//�ж����ݿ����ܷ������Ϣ
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
