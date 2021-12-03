package jiemian;



import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class wytime {  
	static String ss;
	static String ulr="http://biaozhunshijian.51240.com";
	//static String ulr="https://paimai.alltobid.com";
	//https://paimai.alltobid.com
	//	public static void main(String[] args) throws MalformedURLException, IOException, ParseException,  
	//	InterruptedException {  

	public static void wysj()  {  
		try{
			URLConnection conn = new URL(ulr).openConnection();  
			String dateStr = conn.getHeaderField("Date");  
			// 解析为北京时间：GMT+8  
			DateFormat httpDateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z", Locale.US);  
			httpDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));  
			Date date = httpDateFormat.parse(dateStr); 
			SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
			ss =sdf.format(date);
			//System.out.println(ss);
		}catch (Exception e) {
//			System.out.println("时间异常'''");
//			ulr="http://www.baidu.com";
//			wysj();
		}


	}
}
