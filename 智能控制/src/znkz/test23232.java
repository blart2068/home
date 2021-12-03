package znkz;

import java.net.URI;
import java.net.URISyntaxException;

public class test23232 {
	public  static void main(String []args){
		try {
			URI url = new URI("http://192.168.199.241/?pin=ON1");
		} catch (URISyntaxException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("---");
	}
}
