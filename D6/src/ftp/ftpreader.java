package ftp;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.net.ftp.FTPClient;

public class ftpreader {//��ȡftp�ļ�����
	
	static String localPath = System.getProperty("user.dir")+"/";
	static String url = "blart.pw";
	static int port = 21;
	static String username ="blarthp";
	static String password ="5337";
	static String path = "/ADATA_NH13/hpyz/";
	static String filename = "5337.txt";
	static FileInputStream input;
	
	public static void main(String[] args) throws Exception, Exception {
		FTPClient ftp =new FTPClient();//����ftp�ͻ���
		ftp.connect(url);//����ftp����
		ftp.login(username, password);//��½ftp
		boolean b = ftp.changeWorkingDirectory(path);//�ж�·��
		System.out.println("path:"+ftp.printWorkingDirectory());//�л�����·��
		InputStream in = ftp.retrieveFileStream("tbh.txt");//��ȡ�ļ�����,���ڴ�
		BufferedReader br = new BufferedReader(new InputStreamReader(in));//��ȡ���ݵ�������
		String data =null;
		while ((data=br.readLine())!=null) {//����
			System.out.println(data);
			
		}
		br.close();//�رո�����
		in.close();
		ftp.disconnect();
	}
}
