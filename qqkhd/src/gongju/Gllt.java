package gongju;

import java.util.HashMap;

import jiemian.Ltjm;

public class Gllt {
	public static String ltck="";
	private static HashMap<String,Ltjm>ltjh=new HashMap<String,Ltjm>();
	
	public static void addLtjm(String id,Ltjm lt){//����������������
		ltjh.put(id,lt);
	}
	public static Ltjm GetLtjm(String id){//ȡ������ҳ��
		return ltjh.get(id);
	}
}
