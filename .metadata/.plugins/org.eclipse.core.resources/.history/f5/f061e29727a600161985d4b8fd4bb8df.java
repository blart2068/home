import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
package httppake
public class myhttp {
	public static void http(String url) {
		//new Get().start();
		HttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		try {
			client.execute(get);
		} catch (Exception e) {}
		//System.out.println("启动");
	}
}