package znkz;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetHttp001 extends Thread{
	public static void main(String[]args){
		new GetHttp001().start();
	}
	
	public void run() {
		try {
			
//			System.out.println("0000");
			URL url = new URL("http://192.168.199.101/?pin=ON4");
			URLConnection uc = url.openConnection();
			InputStream is = uc.getInputStream();
			InputStreamReader isr =new InputStreamReader(is);
			BufferedReader br =new BufferedReader(isr);
//			String line;
//			StringBuilder nr=new StringBuilder();
//			while((line=br.readLine())!=null){
//				nr.append(line);
//			}
			br.close();
			isr.close();
			is.close();
	
//			System.out.println(nr);
		} catch (Exception e) {}
		
	}
}
