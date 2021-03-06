package gx;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import java.util.Properties;

public class GXJM {
	static String localPath = System.getProperty("user.dir")+"/";
	static String url = "blart.pw";
	static String username ="blarthp";
	static String password ="5337";
	static String path = "/ADATA_NH13/hupai_server/hpgx/";
	
	
	public static void main(String[] args)  {
		  
		   Properties props=System.getProperties(); //获得系统属性集  
		   String osName = props.getProperty("os.name"); //操作系统名称  
		   String osArch = props.getProperty("os.arch"); //操作系统构架  
		   String osVersion = props.getProperty("os.version"); //操作系统版本
		   if(osArch.equals("amd64")){
			   path="/ADATA_NH13/hupai_server/hpgx/64bt";
		   }
		   if(osArch.equals("amd32")){
			   path="/ADATA_NH13/hupai_server/hpgx/32bt";
		   }
		   JOptionPane.showMessageDialog(null, osName+osArch+osVersion+path);
		   
		try {
			new GXJM();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "更新失败..");
		}
		
		
	}
	GXJM()throws Exception{//构造函数
		FTPClient ftp =new FTPClient();//创建ftp客户端
		ftp.connect(url);//创建ftp连接
		ftp.login(username, password);//登陆ftp
		ftp.changeWorkingDirectory(path);//判断路径
		System.out.println("path:"+ftp.printWorkingDirectory());//切换到该路径
		ftp.setControlEncoding("UTF-8");// 下面三行代码必须要，而且不能改变编码格式，否则不能正确下载中文文件
      	FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
        conf.setServerLanguageCode("zh");
        
        FTPFile[] fs = ftp.listFiles();//下载文件
        OutputStream is = null;
        File localFile = null;
        for (int i = 0; i < fs.length; i++) {
        	FTPFile ff = fs[i];
        	localFile = new File(localPath + File.separator+ ff.getName());
        	is = new FileOutputStream(localFile);
        	
        	ftp.retrieveFile(new String(ff.getName().getBytes("UTF-8"),"ISO-8859-1"), is);//写入文件
        }
        is.close();//关闭流,退出服务器
    	ftp.logout();
    	ftp.disconnect();
    	JOptionPane.showMessageDialog(null, "已经更新至最新版");
	}
}
	