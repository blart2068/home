package moshi;

import java.util.HashMap;

public class xcbs {
	static HashMap xcjh=new HashMap<String ,Xiancheng>();
	public static void tjxc(String id ,Xiancheng xc){//添加线程 并标号
		xcjh.put(id, xc);
	}
	public static Xiancheng getXc(String id){//按标号取出线程
		
		return (Xiancheng)xcjh.get(id);
	}
}
