package ldcd;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mysql.sqltool;

public class ip {
	private static String url = "jdbc:mysql://101.37.150.13:3306/blartsql";//���ݿ��ַ

	
	
	
	public static void main(String[] args) {
		System.out.println( new ip().ippb("222.785.76.153"));
		
	}
	
	
	
	
	
	public   boolean ippb(String ip) {
		String time=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		
		sqltool sql =new sqltool(url);
		return  sql.mhcz(time, ip);
	
		
	}


}
