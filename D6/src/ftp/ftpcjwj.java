package ftp;

import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;

public class ftpcjwj {
	static String localPath = System.getProperty("user.dir")+"/";
	static String url = "blart.pw";
	static int port = 21;
	static String username ="blarthp";
	static String password ="5337";
	static String Path = "/ADATA_NH13/hupaisxkhd/";
	static String filename = "5337.txt";
	public static void main(String[] args) {
		boolean b= new ftpcjwj().createDirectory();
		System.out.println(b);
	}
	
	
//	addWindowListener(new WindowAdapter() {  //�رմ���ִ���¼�
//		  
//		  
//		public void windowClosing(WindowEvent e) {  
//		super.windowClosing(e);  
//		//���붯��  
//		//  
//		 }  
//		  
//		});   
	
	
	public boolean createDirectory() {  
		boolean flag = false;  

		// ����FTP�ͻ���  
		FTPClient ftpClient = new FTPClient();  

		try {  
			// ����FTP����  
			ftpClient.connect(this.url);  
			// �����¼�ɹ�  
			if (ftpClient.login(this.username, this.password)) {  

				// �л��ļ�·��, ��FTP�ϵ�"xxx"�ļ�����  
				if (this.Path != null && this.Path.compareTo("") != 0  
						&& ftpClient.changeWorkingDirectory(this.Path)) {  
//					SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");  
//					String time = f.format(new Date());  
//
//					String reTransmitFolderName = time + "_Folder";  
					ftpClient.makeDirectory("007");  //�½��ļ���
					//ftpClient.removeDirectory("008");//ɾ���ļ���
					//ftpClient.deleteFile("008.txt");//ɾ���ļ�
					
					
					flag = true;  
				}  
			}  
		} catch (SocketException e) {  
			e.printStackTrace();  
			flag = false;  
		} catch (IOException e) {  
			e.printStackTrace();  
			flag = false;  
		} catch (Exception e) {  
			e.printStackTrace();  
			flag = false;  
		} finally {  
			try {  
				// �ر�����  
				ftpClient.disconnect();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  

		return flag;  
	}  

}
