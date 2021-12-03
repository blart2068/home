package znkz;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class GetHttp {
	public static void main(String[] args) {
		//new Get().start();
		HttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet("http://192.168.199.101/?pin=ON4");
		try {
			client.execute(get);
		} catch (Exception e) {}
		System.out.println("Æô¶¯");
	}
}
