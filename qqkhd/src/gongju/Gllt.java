package gongju;

import java.util.HashMap;

import jiemian.Ltjm;

public class Gllt {
	public static String ltck="";
	private static HashMap<String,Ltjm>ltjh=new HashMap<String,Ltjm>();
	
	public static void addLtjm(String id,Ltjm lt){//集合类添加聊天界面
		ltjh.put(id,lt);
	}
	public static Ltjm GetLtjm(String id){//取出聊天页面
		return ltjh.get(id);
	}
}
