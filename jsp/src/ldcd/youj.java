package ldcd;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * javaMail���ʼ�������
 * @author wangXgnaw
 *
 */
public class youj {
	
    /**
     * ʹ�ü��ܵķ�ʽ,����465�˿ڽ��д����ʼ�,����ssl
     * @param to    Ϊ�ռ�������
     * @param message    ���͵���Ϣ
     */
//	public static void main(String[] args) {
//		youj.sendEmil("362244844@qq.com","blart2068@gmail.com","�����","45432165456");
//	}
//	
	
    public static void sendEmil(String []xm,String ttitle,String message) {
        try {
        	
        	
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
            //�����ʼ��Ự����
            Properties props = new Properties();
            //����ķ��ͷ�������ַ
            props.setProperty("mail.smtp.host", "smtp.aliyun.com");//"mail.smtp.host", "smtp.163.com"
            props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.setProperty("mail.smtp.socketFactory.fallback", "false");
            //���䷢�ͷ������˿�,��������Ϊ465�˿�
            props.setProperty("smtp.aliyun.com", "465");
            props.setProperty("mail.smtp.socketFactory.port", "465");//���ö˿�
            props.put("mail.smtp.auth", "true");
            final String username = "gucedichang@aliyun.com";//-------------------�����˺�-------------------
            final String password = "changdao1818";
            //��ȡ������Ự,���������ڲ���ķ�ʽ,�������������û�����������Ȩ��jvm
            Session session = Session.getDefaultInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
           
            //ͨ���Ự,�õ�һ���ʼ�,���ڷ���
            Message msg = new MimeMessage(session);
            //���÷�����
            msg.setFrom(new InternetAddress(username));
            //�����ռ���,toΪ�ռ���,ccΪ����,bccΪ����
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(xm[0], false));
            
            
            for(int i=1;i<xm.length;i++){
            	 msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(xm[i], false));
            	 
            }
            //msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc, false));
          
            //msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(to, false));
            msg.setSubject(ttitle);
           
            //�����ʼ���Ϣ
            msg.setText(message);
            //���÷��͵�����
            msg.setSentDate(new Date());
            
            //����Transport��send����ȥ�����ʼ�
            Transport.send(msg);
            System.out.println("�ѷ���");
        } catch (Exception e) {
        	System.out.println("ʧ��");
            e.printStackTrace();
        }

    }
    
}