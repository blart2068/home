
import java.io.IOException;  
import java.net.MalformedURLException;  
import java.net.URL;  
import java.net.URLConnection;  
import java.text.DateFormat;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  
import java.util.TimeZone;  
  
public class OSTime {  
  
    public static void main(String[] args) throws MalformedURLException, IOException, ParseException,  
            InterruptedException {  
  
        
        URLConnection conn = new URL("http://paimai.alltobid.com").openConnection();  
        String dateStr = conn.getHeaderField("Date");  
        System.out.println("��ȡ���ķ�����ʱ�䣺" + dateStr);  
  
        // ����Ϊ����ʱ�䣺GMT+8  
        DateFormat httpDateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z", Locale.US);  
        httpDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));  
        Date date = httpDateFormat.parse(dateStr); 
        SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
        String ss =sdf.format(date);
        System.out.println(ss);
        
        System.out.println("�����ɱ���ʱ���ʽ��" + date);  
  
        // �����ɼ������ڸ�ʽ  
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);  
        dateTimeFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));  
        System.out.println("�����ɱ�׼ʱ���ʽ��" + dateTimeFormat.format(date));  
  
        // ȡ����  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);  
        dateTimeFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));  
        String currDate = dateFormat.format(date);  
  
        // ����Windowsϵͳ����  
        Process exec = Runtime.getRuntime().exec("cmd /c date " + currDate);  
        if (exec.waitFor() == 0) {  
            System.out.println("����ϵͳ���ڳɹ���" + currDate);  
        } else {  
            System.out.println("����ϵͳ����ʧ�ܣ�" + currDate);  
        }  
  
        // ȡʱ��  
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);  
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));  
        String currTime = timeFormat.format(date);  
  
        // ����Windowsϵͳʱ��  
        exec = Runtime.getRuntime().exec("cmd /c time " + currTime);  
        if (exec.waitFor() == 0) {  
            System.out.println("����ϵͳʱ��ɹ���" + currTime);  
        } else {  
            System.out.println("����ϵͳʱ��ʧ�ܣ�" + currTime);  
        }  
  
    }  
}  