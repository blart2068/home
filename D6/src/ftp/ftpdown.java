package ftp;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class ftpdown {
	
	static String localPath = System.getProperty("user.dir")+"/";//��õ�ǰĿ¼
	static String ip = "blart.pw";
	static int port = 21;
	static String username ="blarthp";
	static String password ="5337";
	static String remotePath = "/ADATA_NH13/hpgx/";
	
	public static void main(String[] args) {
		
		
		
		downloadFile(ip, port, username, password, remotePath, localPath);
		
	}
	
	public static boolean downloadFile(String ip, int port, String username,
            String password, String remotePath, 
            String localPath) {
        boolean success = false;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(ip, port);
            // �������д������Ҫ�����Ҳ��ܸı�����ʽ����������ȷ���������ļ�
            ftp.setControlEncoding("UTF-8");
            FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
            conf.setServerLanguageCode("zh");
            // �������Ĭ�϶˿ڣ�����ʹ��ftp.connect(url)�ķ�ʽֱ������FTP������
            ftp.login(username, password);// ��¼
            reply = ftp.getReplyCode();
             
            //System.out.println("reply:"+reply);
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return success;
            }
            ftp.changeWorkingDirectory(remotePath);// ת�Ƶ�FTP������Ŀ¼
            FTPFile[] fs = ftp.listFiles();
             
             
            for (int i = 0; i < fs.length; i++) {
                FTPFile ff = fs[i];
                if (!ff.getName().equals(".") && !ff.getName().equals("..")) {
 
                    File localFile = new File(localPath + File.separator
                            + ff.getName());
                     
                   // if(!localFile.exists())//����ļ��Ѵ������ظ�����
                   // {
                        OutputStream is = new FileOutputStream(localFile);
 
                        // ע��˴�retrieveFile�ĵ�һ��������GBKתΪISO-8859-1���롣�������غ���ļ�����Ϊ�ա�
                        // ԭ�����������aixϵͳĬ�ϵı���ΪISO-8859-1
                        ftp.retrieveFile(new String(ff.getName().getBytes("UTF-8"),
                                "ISO-8859-1"), is);
                        is.close();
                    //}
                }
            }
 
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                         
            ftp.logout();
            success = true;
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (Exception ioe) {
                    ioe.printStackTrace();
                }
            }
            
           if (success) {
        	   JOptionPane.showMessageDialog(null, "�Ѿ����������°�");
		}else{
			JOptionPane.showMessageDialog(null, "����ʧ��!");
		}
            
            
        }
        return success;
    }
	
}