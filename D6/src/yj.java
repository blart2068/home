import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class yj {
	public static boolean sendGmailEmail() {  
        Properties props = new Properties();  
        props.put("mail.smtp.host", "smtp.gmail.com");  
        props.put("mail.transport.protocol", "smtp");  
        props.put("mail.smtp.auth", "true");  
        props.put("mail.debug", "false");  
        props.put("mail.smtp.port", Integer.parseInt("465"));  
        props.put("mail.smtp.socketFactory.port", Integer.parseInt("465"));  
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  
        props.put("mail.smtp.socketFactory.fallback", "false");  
        // Session session = Session.getInstance(props);  
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {  
            protected PasswordAuthentication getPasswordAuthentication() {  
                return new PasswordAuthentication("formEmail@gmail.com", "77185201314");  
            }  
        });  
        javax.mail.Message msg = new MimeMessage(session);  
        try {  
            msg.setFrom(new InternetAddress("formEmail@gmail.com"));  
            msg.setSubject("Subject");  
            Multipart mp = new MimeMultipart();  
            MimeBodyPart mbp = new MimeBodyPart();  
            mbp.setContent("This is a message.", "text/html;charset=UTF-8");  
            mp.addBodyPart(mbp);  
            msg.setContent(mp);  
            Transport transport = session.getTransport();  
            transport.connect("smtp.gmail.com", Integer.parseInt("465"), "formEmail@gmail.com", "123456");  
            transport.sendMessage(msg, new Address[] { new InternetAddress("toEmail@qq.com") });  
            transport.close();  
  
        } catch (Exception e) {  
            e.printStackTrace();  
            return false;  
        }  
        return true;  
    }  
}
