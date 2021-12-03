import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

/** 
 * Description: 从FTP服务器下载文件 
 * @Version. Jul , :: PM by 崔红保（cuihongbao@d-heaven.com）创建 
 * @param url FTP服务器hostname 
 * @param port FTP服务器端口 
 * @param username FTP登录账号 
 * @param password FTP登录密码 
 * @param remotePath FTP服务器上的相对路径 
 * @param fileName 要下载的文件名 
 * @param localPath 下载后保存到本地的路径 
 * @return 
 */
public class Ftp{
	public static void main(String[] args) {
		String url="blart.pw";
		int port =21;
		String username = "blarthp";
		String password = "5337";
		String remotePath = "/java/hupaigengxin";
		String fileName ="hpgx.txt";
		String localPath = "D:/";
		
		boolean b=downFile(url, port, username, password, remotePath, fileName, localPath);
		System.out.println(b);
	}
	public static boolean downFile(String url, int port,String username, String password, String remotePath,String fileName,String localPath) { 
		boolean success = false; 
		FTPClient ftp = new FTPClient(); 
		try { 
			int reply; 
			ftp.connect(url, port); 
			//如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器 
			ftp.login(username, password);//登录 
			reply = ftp.getReplyCode(); 
			if (!FTPReply.isPositiveCompletion(reply)) { 
				ftp.disconnect(); 
				System.out.println("----");
				return success; 
			} 
			ftp.changeWorkingDirectory(remotePath);//转移到FTP服务器目录 
			FTPFile[] fs = ftp.listFiles(); 
			for(FTPFile ff:fs){ 
				if(ff.getName().equals(fileName)){ 
					File localFile = new File(localPath+"/"+ff.getName()); 
					OutputStream is = new FileOutputStream(localFile); 
					ftp.retrieveFile(ff.getName(), is); 
					is.close(); 
				} 
			} 
			ftp.logout(); 
			success = true; 
		} catch (IOException e) { 
			e.printStackTrace(); 
		} finally { 
			if (ftp.isConnected()) { 
				try { 
					ftp.disconnect(); 
				} catch (IOException ioe) { 
				} 
			} 
		} 
		System.out.println("+++++");
		return success; 
	}
}