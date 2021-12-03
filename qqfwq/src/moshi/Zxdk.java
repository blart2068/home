package moshi;

import java.net.Socket;
import java.util.HashMap;

public class Zxdk{
	static HashMap<String, Socket> zsdk=new  HashMap<String, Socket>();
	static String zxhy="";

	public static HashMap<String, Socket> getZsdk() {
		return zsdk;
	}

	public static void setZsdk(String yhm,Socket s) {
		Zxdk.zsdk.put(yhm, s);
		zxhy+=yhm+" ";
	}
	
}