package jiemian;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import com.luwenbin.webbrowser.SimpleWebBrowserExample;
/**
 * ͨ��URL��ȡҳ������
 * */

public class web {

    public static boolean tbhh(String tbh){

      boolean b=false;

        try {
            //����һ��URLʵ��
            URL url = new URL("http://www.blart.pw:5271/yz/yz.html");

            try {
                //ͨ��URL��openStrean������ȡURL��������ʾ����Ը�ֽ�������
                InputStream is = url.openStream();
                InputStreamReader isr = new InputStreamReader(is,"utf-8");

                //Ϊ�ַ���������ӻ���
                BufferedReader br = new BufferedReader(isr);
                String data = "";//��ȡ����
                SimpleWebBrowserExample.ul=br.readLine();
                while (data!=null){//ѭ����ȡ����
                	data = br.readLine();
                	if (tbh.equals(data)) {
						b=true;
					}
                    System.out.println(data+b);//�������
                    
                }
                br.close();
                isr.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return b;
    }
}//�������ܻ�ȡ�ٶ�ҳ���html������