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
	
	static String localPath = System.getProperty("user.dir")+"/";//获得当前目录
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
            // 下面三行代码必须要，而且不能改变编码格式，否则不能正确下载中文文件
            ftp.setControlEncoding("UTF-8");
            FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
            conf.setServerLanguageCode("zh");
            // 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
            ftp.login(username, password);// 登录
            reply = ftp.getReplyCode();
             
            //System.out.println("reply:"+reply);
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return success;
            }
            ftp.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
            FTPFile[] fs = ftp.listFiles();
             
             
            for (int i = 0; i < fs.length; i++) {
                FTPFile ff = fs[i];
                if (!ff.getName().equals(".") && !ff.getName().equals("..")) {
 
                    File localFile = new File(localPath + File.separator
                            + ff.getName());
                     
                   // if(!localFile.exists())//如果文件已存在则不重复下载
                   // {
                        OutputStream is = new FileOutputStream(localFile);
 
                        // 注意此处retrieveFile的第一个参数由GBK转为ISO-8859-1编码。否则下载后的文件内容为空。
                        // 原因可能是由于aix系统默认的编码为ISO-8859-1
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
        	   JOptionPane.showMessageDialog(null, "已经更新至最新版");
		}else{
			JOptionPane.showMessageDialog(null, "更新失败!");
		}
            
            
        }
        return success;
    }
	
}
