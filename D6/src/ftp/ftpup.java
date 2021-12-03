package ftp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class ftpup {
	static String localPath = System.getProperty("user.dir")+"/";
	static String url = "blart.pw";
	static int port = 21;
	static String username ="blarthp";
	static String password ="5337";
	static String path = "/ADATA_NH13/hupaisxkhd/";
	static String filename = "5337.txt";
	static FileInputStream input;
	
	public static void main(String[] args) {//������
		try {
			input = new FileInputStream(new File("d:/test.txt"));
			input.close();
			
		} catch (Exception e) {
			
		}
		boolean b = uploadFile(url, port, username, password, path, filename, input);
		System.out.println(b);
	}
	/**
	 * Description: ��FTP�������ϴ��ļ�
	 * @Version1.0 Jul 27, 2008 4:31:09 PM by �޺챣��cuihongbao@d-heaven.com������
	 * @param url FTP������hostname
	 * @param port FTP�������˿�
	 * @param username FTP��¼�˺�
	 * @param password FTP��¼����
	 * @param path FTP����������Ŀ¼
	 * @param filename �ϴ���FTP�������ϵ��ļ���
	 * @param input ������
	 * @return �ɹ�����true�����򷵻�false
	 */
	public static boolean uploadFile(String url,int port,String username, 
			String password, String path, String filename, InputStream input) {
		boolean success = false;
		FTPClient ftp = new FTPClient();
		try {
			int reply;
			ftp.connect(url, port);//����FTP������
			//�������Ĭ�϶˿ڣ�����ʹ��ftp.connect(url)�ķ�ʽֱ������FTP������
			ftp.login(username, password);//��¼
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return success;
			}
			ftp.changeWorkingDirectory(path);
			ftp.storeFile(filename, input); 

			input.close();
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
		return success;
	}
}
