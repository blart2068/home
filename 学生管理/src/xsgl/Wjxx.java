package xsgl;
import java.sql.*;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class Wjxx extends AbstractTableModel{
	static JTable bg;
	static PreparedStatement ps;
	static Connection ct;
	static ResultSet rs;
	static Vector zd,jl;
	static JScrollPane gdt;
	static String cx="select * from wj";

	Wjxx(String ks){//----------------------构造-----------
		this.kx(ks);
	}
	public static void kx(String zl){//--开始信息

		if(!zl.equals("ks")){
			cx=zl;
			System.out.println(cx);
		}
		if(zl.equals("select * from wj where xm=''or bh=''"))
			cx="select * from wj";
		//-----定义字段--------
		zd=new Vector();
		zd.add("编号");zd.add("姓名");zd.add("性别");zd.add("年龄");zd.add("籍贯");zd.add("称号");

		//-----定义记录----------------
		jl=new Vector();
		try {
			//数据库连接----------
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct=DriverManager.getConnection("jdbc:odbc:sql","sa","5337");
			ps=ct.prepareStatement(cx);
			rs=ps.executeQuery();
			jl.add(zd);//添加字段到记录
			while(rs.next()){
				//------读取数据库---------------
				Vector hang=new Vector();
				hang.add(rs.getString(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(rs.getInt(4));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				jl.add(hang);
			}

		} catch (Exception e) {}finally {
			try {
				ps.close();
				ct.close();
				rs.close();
			} catch (Exception e2) {}
		}
	}


	//----------覆盖方法----------------------------
	public int getColumnCount() {//设置表格列

		return this.zd.size();
	}

	public int getRowCount() {//设置表格的行

		return this.jl.size();
	}

	public Object getValueAt(int h, int l) {//设置参数

		return ((Vector)this.jl.get(h)).get(l);
	}

}
