package jiemian;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import com.luwenbin.webbrowser.SimpleWebBrowserExample;
/**
 * 通过URL读取页面内容
 * */

public class web {

    public static boolean tbhh(String tbh){

      boolean b=false;

        try {
            //创建一个URL实例
            URL url = new URL("http://www.blart.pw:5271/yz/yz.html");

            try {
                //通过URL的openStrean方法获取URL对象所表示的自愿字节输入流
                InputStream is = url.openStream();
                InputStreamReader isr = new InputStreamReader(is,"utf-8");

                //为字符输入流添加缓冲
                BufferedReader br = new BufferedReader(isr);
                String data = "";//读取数据
                SimpleWebBrowserExample.ul=br.readLine();
                while (data!=null){//循环读取数据
                	data = br.readLine();
                	if (tbh.equals(data)) {
						b=true;
					}
                    System.out.println(data+b);//输出数据
                    
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
}//这样就能获取百度页面的html代码了