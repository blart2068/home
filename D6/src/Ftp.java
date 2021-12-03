import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

/** 
 * Description: ��FTP�����������ļ� 
 * @Version. Jul , :: PM by �޺챣��cuihongbao@d-heaven.com������ 
 * @param url FTP������hostname 
 * @param port FTP�������˿� 
 * @param username FTP��¼�˺� 
 * @param password FTP��¼���� 
 * @param remotePath FTP�������ϵ����·�� 
 * @param fileName Ҫ���ص��ļ��� 
 * @param localPath ���غ󱣴浽���ص�·�� 
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
			//�������Ĭ�϶˿ڣ�����ʹ��ftp.connect(url)�ķ�ʽֱ������FTP������ 
			ftp.login(username, password);//��¼ 
			reply = ftp.getReplyCode(); 
			if (!FTPReply.isPositiveCompletion(reply)) { 
				ftp.disconnect(); 
				System.out.println("----");
				return success; 
			} 
			ftp.changeWorkingDirectory(remotePath);//ת�Ƶ�FTP������Ŀ¼ 
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