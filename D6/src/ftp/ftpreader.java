package ftp;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.net.ftp.FTPClient;

public class ftpreader {//读取ftp文件内容
	
	static String localPath = System.getProperty("user.dir")+"/";
	static String url = "blart.pw";
	static int port = 21;
	static String username ="blarthp";
	static String password ="5337";
	static String path = "/ADATA_NH13/hpyz/";
	static String filename = "5337.txt";
	static FileInputStream input;
	
	public static void main(String[] args) throws Exception, Exception {
		FTPClient ftp =new FTPClient();//创建ftp客户端
		ftp.connect(url);//创建ftp连接
		ftp.login(username, password);//登陆ftp
		boolean b = ftp.changeWorkingDirectory(path);//判断路径
		System.out.println("path:"+ftp.printWorkingDirectory());//切换到该路径
		InputStream in = ftp.retrieveFileStream("tbh.txt");//读取文件内容,到内存
		BufferedReader br = new BufferedReader(new InputStreamReader(in));//读取内容到缓冲流
		String data =null;
		while ((data=br.readLine())!=null) {//遍历
			System.out.println(data);
			
		}
		br.close();//关闭各种流
		in.close();
		ftp.disconnect();
	}
}
