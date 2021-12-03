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
		  
		   Properties props=System.getProperties(); //���ϵͳ���Լ�  
		   String osName = props.getProperty("os.name"); //����ϵͳ����  
		   String osArch = props.getProperty("os.arch"); //����ϵͳ����  
		   String osVersion = props.getProperty("os.version"); //����ϵͳ�汾
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
			JOptionPane.showMessageDialog(null, "����ʧ��..");
		}
		
		
	}
	GXJM()throws Exception{//���캯��
		FTPClient ftp =new FTPClient();//����ftp�ͻ���
		ftp.connect(url);//����ftp����
		ftp.login(username, password);//��½ftp
		ftp.changeWorkingDirectory(path);//�ж�·��
		System.out.println("path:"+ftp.printWorkingDirectory());//�л�����·��
		ftp.setControlEncoding("UTF-8");// �������д������Ҫ�����Ҳ��ܸı�����ʽ����������ȷ���������ļ�
      	FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
        conf.setServerLanguageCode("zh");
        
        FTPFile[] fs = ftp.listFiles();//�����ļ�
        OutputStream is = null;
        File localFile = null;
        for (int i = 0; i < fs.length; i++) {
        	FTPFile ff = fs[i];
        	localFile = new File(localPath + File.separator+ ff.getName());
        	is = new FileOutputStream(localFile);
        	
        	ftp.retrieveFile(new String(ff.getName().getBytes("UTF-8"),"ISO-8859-1"), is);//д���ļ�
        }
        is.close();//�ر���,�˳�������
    	ftp.logout();
    	ftp.disconnect();
    	JOptionPane.showMessageDialog(null, "�Ѿ����������°�");
	}
}
	