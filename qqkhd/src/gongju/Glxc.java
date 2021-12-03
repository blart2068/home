package gongju;

import java.util.HashMap;

public class Glxc {
	private static HashMap hm=new HashMap<String,Ljfwqxc>();
	
	public static void addjlfwqxc(String id,Ljfwqxc lfq){
		hm.put(id,lfq);
	}
	public static Ljfwqxc getLjfwqxc(String id){
		return (Ljfwqxc)hm.get(id);
	}

}
