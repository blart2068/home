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
	
	
//	addWindowListener(new WindowAdapter() {  //关闭窗口执行事件
//		  
//		  
//		public void windowClosing(WindowEvent e) {  
//		super.windowClosing(e);  
//		//加入动作  
//		//  
//		 }  
//		  
//		});   
	
	
	public boolean createDirectory() {  
		boolean flag = false;  

		// 创建FTP客户端  
		FTPClient ftpClient = new FTPClient();  

		try {  
			// 建立FTP连接  
			ftpClient.connect(this.url);  
			// 如果登录成功  
			if (ftpClient.login(this.username, this.password)) {  

				// 切换文件路径, 到FTP上的"xxx"文件夹下  
				if (this.Path != null && this.Path.compareTo("") != 0  
						&& ftpClient.changeWorkingDirectory(this.Path)) {  
//					SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");  
//					String time = f.format(new Date());  
//
//					String reTransmitFolderName = time + "_Folder";  
					ftpClient.makeDirectory("007");  //新建文件夹
					//ftpClient.removeDirectory("008");//删除文件夹
					//ftpClient.deleteFile("008.txt");//删除文件
					
					
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
				// 关闭连接  
				ftpClient.disconnect();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  

		return flag;  
	}  

}
