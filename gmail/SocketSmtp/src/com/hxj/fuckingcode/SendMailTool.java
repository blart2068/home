package com.hxj.fuckingcode;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.codec.binary.Base64;


/**
 * 
 * @Description: socket发送邮件工具

 * @File: SendMailTool.java

 * @Paceage com.meiya.app.tool

 * @Author huangxj

 * @Date 下午1:54:33

 * @Version 
 */
public class SendMailTool {
	
    
    private static final String LINE_END = "\r\n";
    
    
    private boolean isDebug = true;
    
    
    private boolean isAllowReadSocketInfo = true;
    
    
    private String host;
    
    
    private String from;
    
    private String randomFromName;
    
    private int port = 25;
    
    
    private List<String> to;
    
    
    private List<String> cc;
    
    
    private List<String> bcc;
    
    
    private String subject;
    
    
    private String user;
    
    
    private String password;
    
    
    private String contentType;
    
    
    private String boundary;
    
    
    private String boundaryNextPart;
    
    
    private String contentTransferEncoding;
    
    
    private String charset;
    
    
    private String contentDisposition;
    
    
    private String content;
    
    
    private String simpleDatePattern;
    
    
    private String defaultAttachmentContentType;
    
    
    private List<MailPart> partSet;
    
    
    private static Map<String, String> contentTypeMap;
    
    /**
     * 错误信息
     */
    public String errorMsg = "";
    
    /**
     *  克隆对象
     */
    public SendMailTool clone(){
    	SendMailTool temp = new SendMailTool();
    	
    	temp.isDebug = this.isDebug;
    	temp.isAllowReadSocketInfo = this.isAllowReadSocketInfo;
    	temp.host = this.host;
    	temp.from = this.from;
    	temp.randomFromName = this.randomFromName;
    	temp.port = this.port;
    	temp.to .addAll( this.to);
    	temp.cc .addAll( this.cc);
    	temp.bcc .addAll( this.bcc);
    	temp.partSet.addAll(this.partSet);
    	
    	temp.subject = this.subject;
    	temp.user = this.user;
    	temp.password = this.password;
    	temp.contentType = this.contentType;
    	temp.boundary = this.boundary;
    	temp.boundaryNextPart = this.boundaryNextPart;
    	temp.contentTransferEncoding = this.contentTransferEncoding;
    	temp.charset = this.charset;
    	temp.contentDisposition = this.contentDisposition;
    	temp.content = this.content;
    	temp.simpleDatePattern = this.simpleDatePattern;
    	temp.defaultAttachmentContentType = this.defaultAttachmentContentType;
    	temp.errorMsg = this.errorMsg;
    	temp.contentTypeMap .putAll(this.contentTypeMap);
    	
    	return temp;
    }
    
    static {
        // MIME Media Types
        contentTypeMap = new HashMap<String, String>();
        contentTypeMap.put("xls", "application/vnd.ms-excel");
        contentTypeMap.put("xlsx", "application/vnd.ms-excel");
        contentTypeMap.put("xlsm", "application/vnd.ms-excel");
        contentTypeMap.put("xlsb", "application/vnd.ms-excel");
        contentTypeMap.put("doc", "application/msword");
        contentTypeMap.put("dot", "application/msword");
        contentTypeMap.put("docx", "application/msword");
        contentTypeMap.put("docm", "application/msword");
        contentTypeMap.put("dotm", "application/msword");
    }
    
    private class MailPart extends SendMailTool {
        public MailPart() {
        }
    }
    
    
    public SendMailTool() {
        defaultAttachmentContentType = "application/octet-stream";
        simpleDatePattern = "yyyy-MM-dd HH:mm:ss";
        boundary = "--=_NextPart_zlz_3907_" + System.currentTimeMillis();
        boundaryNextPart = "--" + boundary;
        contentTransferEncoding = "base64";
        contentType = "multipart/alternative";
        charset = Charset.defaultCharset().name();
        partSet = new ArrayList<MailPart>();
        to = new ArrayList<String>();
        cc = new ArrayList<String>();
        bcc = new ArrayList<String>();
    }
    
    
    private String getPartContentType(String fileName) {
        String ret = null;
        if (null != fileName) {
            int flag = fileName.lastIndexOf(".");
            if (0 <= flag && flag < fileName.length() - 1) {
                fileName = fileName.substring(flag + 1);
            }
            ret = contentTypeMap.get(fileName);
        }
        
        if (null == ret) {
            ret = defaultAttachmentContentType;
        }
        return ret;
    }
    

    
    
    private String getAllParts() {
        int partCount = partSet.size();
        StringBuilder sbd = new StringBuilder(LINE_END);
        for (int i = partCount - 1; i >= 0; i--) {
        	SendMailTool attachment = partSet.get(i);
            String attachmentContent = attachment.getContent();
            if (null != attachmentContent && 0 < attachmentContent.length()) {
                sbd.append(getBoundaryNextPart()).append(LINE_END);
                sbd.append("Content-Type: ");
                sbd.append(attachment.getContentType());
                sbd.append(LINE_END);
                sbd.append("Content-Transfer-Encoding: ");
                sbd.append(attachment.getContentTransferEncoding());
                sbd.append(LINE_END);
                if (i != partCount - 1) {
                    sbd.append("Content-Disposition: ");
                    sbd.append(attachment.getContentDisposition());
                    sbd.append(LINE_END);
                }
                
                sbd.append(LINE_END);
                sbd.append(attachment.getContent());
                sbd.append(LINE_END);
            }
        }
        
        sbd.append(LINE_END);
        sbd.append(LINE_END);
        // sbd.append(boundaryNextPart).
        // append(LINE_END);
        partSet.clear();
        return sbd.toString();
    }
    
    
    private void addContent() {
        if (null != content) {
            MailPart part = new MailPart();
            part.setContent(Base64Util.encode(content.getBytes()));
            part.setContentType("text/html;charset=\"" + charset + "\"");
            partSet.add(part);
        }
    }
    
    private String listToMailString(List<String> mailAddressList) {
        StringBuilder sbd = new StringBuilder();
        if (null != mailAddressList) {
            int listSize = mailAddressList.size();
            for (int i = 0; i < listSize; i++) {
                if (0 != i) {
                    sbd.append(";");
                }
                sbd.append("<").append(mailAddressList.get(i)).append(">");
            }
        }
        return sbd.toString();
    }
    
    private List<String> getrecipient() {
        List<String> list = new ArrayList<String>();
        list.addAll(to);
        list.addAll(cc);
        list.addAll(bcc);
        return list;
    }
    
    
    public void addAttachment(String filePath) {
        addAttachment(filePath, null);
    }
    
    public void addTo(String mailAddress) {
        this.to.add(mailAddress);
    }
    
    public void addCc(String mailAddress) {
        this.cc.add(mailAddress);
    }
    
    public void addBcc(String mailAddress) {
        this.bcc.add(mailAddress);
    }
    
    
    public void addAttachment(String filePath, String charset) {
        if (null != filePath && filePath.length() > 0) {
            File file = new File(filePath);
            try {
                addAttachment(file.getName(), new FileInputStream(file),
                        charset);
            } catch (FileNotFoundException e) {
                System.out.println("错误：" + e.getMessage());
                System.exit(1);
            }
        }
    }
    
    
    public void addAttachment(String fileName, InputStream attachmentStream,
            String charset) {
        try {
            
            byte[] bs = null;
            if (null != attachmentStream) {
                int buffSize = 1024;
                byte[] buff = new byte[buffSize];
                byte[] temp;
                bs = new byte[0];
                int readTotal = 0;
                while (-1 != (readTotal = attachmentStream.read(buff))) {
                    temp = new byte[bs.length];
                    System.arraycopy(bs, 0, temp, 0, bs.length);
                    bs = new byte[temp.length + readTotal];
                    System.arraycopy(temp, 0, bs, 0, temp.length);
                    System.arraycopy(buff, 0, bs, temp.length, readTotal);
                }
            }
            
            if (null != bs) {
                MailPart attachmentPart = new MailPart();
                charset = null != charset ? charset : Charset.defaultCharset()
                        .name();
                String contentType = getPartContentType(fileName)
                        + ";name=\"=?" + charset + "?B?" + Base64Util.encode(fileName.getBytes())
                        + "?=\"";
                attachmentPart.setCharset(charset);
                attachmentPart.setContentType(contentType);
                attachmentPart.setContentDisposition("attachment;filename=\"=?"
                        + charset + "?B?" + Base64Util.encode(fileName.getBytes()) + "?=\"");
                attachmentPart.setContent(Base64Util.encode(bs));
                partSet.add(attachmentPart);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != attachmentStream) {
                try {
                    attachmentStream.close();
                    attachmentStream = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            Runtime.getRuntime().gc();
            Runtime.getRuntime().runFinalization();
        }
    }
    
    /**
     * @Description：发送
     * @Author：huangxj
     * @Date：2013-7-7  下午2:56:03
     * @return
     */
    public String send(){
    	return send(false);
    }
    
    /**
     * @Description：校验
     * @Author：huangxj
     * @Date：2013-7-7  下午2:55:56
     * @return
     */
    public String validate(){
    	return send(true);
    }
    
    private String send(boolean isValidate) {
        
        // 对象申明
        // 当邮件发送完毕后，以下三个对象（Socket、
        // PrintWriter,
        // BufferedReader）需要关闭。
        Socket socket = null;
        SSLSocket sslsocket;
        PrintWriter pw = null;
        BufferedReader br = null;
        boolean isSSL = false;
        
        if(host.equals("smtp.gmail.com") || host.equals("smtp.qq.com")){
        	port = 465;
        	isSSL = true;
        }else{
        	isSSL = false;
        }
        
        try {
        	
        	if(!isSSL){
        		
        		socket = new Socket(host, port);
        		
        		pw = new PrintWriter(socket.getOutputStream());
        	
        		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        	}
        	else{
        		
				TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
					public java.security.cert.X509Certificate[] getAcceptedIssuers() {
						return null;
					}

					public void checkClientTrusted(
							java.security.cert.X509Certificate[] certs,
							String authType) {
					}

					public void checkServerTrusted(
							java.security.cert.X509Certificate[] certs,
							String authType) {
					}
				} };

    	        SSLContext sc = SSLContext.getInstance("SSL");
    	        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        	        
        		sslsocket = (SSLSocket)((SSLSocketFactory)sc.getSocketFactory()).createSocket(host,port);
        	
        		pw = new PrintWriter(sslsocket.getOutputStream());
            	
        		br = new BufferedReader(new InputStreamReader(sslsocket.getInputStream()));
        	}
            
            
            StringBuilder infoBuilder = new StringBuilder("\nServer info: \n------------\n");
            
            if(!readResponse(pw, br, infoBuilder, "220")){
            	errorMsg = "无法连接到SMTP服务器";
                return infoBuilder.toString();
            }
            
            // 与服务器建立连接
            pw.write("HELO ".concat(host).concat(LINE_END)); // 连接到邮件服务
            
            if (!readResponse(pw, br, infoBuilder, "250")){
            	errorMsg = "连接到SMTP服务器失败";
                return infoBuilder.toString();
            }
            
            pw.write("AUTH LOGIN".concat(LINE_END)); // 登录
            
            if (!readResponse(pw, br, infoBuilder, "334")){
            	errorMsg = "连接到SMTP服务器失败";
                return infoBuilder.toString();
            }
            
            pw.write(Base64Util.encode(user.getBytes()).concat(LINE_END)); // 输入用户名
            
            if (!readResponse(pw, br, infoBuilder, "334")){
            	errorMsg = "SMTP账号不存在";
                return infoBuilder.toString();
            }
            
            pw.write(Base64Util.encode(password.getBytes()).concat(LINE_END)); // 输入密码
            
            if (!readResponse(pw, br, infoBuilder, "235")){
            	errorMsg = "SMTP账号密码错误";
                return infoBuilder.toString();
            }
            
            /**
             * 校验执行到这里就可以了
             */
            if(isValidate){
            	return infoBuilder.toString();
            }
            
            pw.write("MAIL FROM:<" + from + ">" + LINE_END); // 发件人邮箱地址
            
            if (!readResponse(pw, br, infoBuilder, "250"))
                return infoBuilder.toString();
            
            List<String> recipientList = getrecipient();
            // 收件邮箱地址
            for (int i = 0; i < recipientList.size(); i++) {
                pw.write("RCPT TO:<" + recipientList.get(i) + ">" + LINE_END);
                if (!readResponse(pw, br, infoBuilder, "250"))
                    return infoBuilder.toString();
            }
            // System.out.println(
            // getAllSendAddress());
            
            pw.write("DATA" + LINE_END); // 开始输入邮件
            if (!readResponse(pw, br, infoBuilder, "354"))
                return infoBuilder.toString();
            
            flush(pw);
            
            StringBuffer sbf = new StringBuffer();
            
            // 设置邮件头信息
            	
            	
           sbf .append("From: =?"+ "gb2312" + "?B?" + Base64Util.encode(randomFromName.getBytes()) + "?=" +  "<" + from + ">"
                        + LINE_END); // 发件人
            sbf.append("To: " + listToMailString(to) + LINE_END);// 收件人
            sbf.append("Cc: " + listToMailString(cc) + LINE_END);// 收件人
            sbf.append("Bcc: " + listToMailString(bcc) + LINE_END);// 收件人
            sbf.append("Subject: =?"+ "gb2312" + "?B?" + Base64Util.encode(  subject.getBytes()) + "?=" + LINE_END);// 邮件主题
           
            String date = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z (z)",Locale.US).format(new Date());
            
            sbf.append("Date: ").append(date);
            sbf.append(LINE_END); // 发送时间
            sbf.append("Content-Type: ");
            sbf.append(contentType);
            sbf.append(";");
            sbf.append("boundary=\"");
            sbf.append(boundary).append("\""); // 邮件类型设置
            sbf.append(LINE_END);
            sbf.append("This is a multi-part message in MIME format.");
            sbf.append(LINE_END);
            
            // 添加邮件正文单元
            addContent();
            
            // 合并所有单元，正文和附件。
            sbf.append(getAllParts());
            
            // 发送
            sbf.append(LINE_END).append(".").append(LINE_END);
            pw.write(sbf.toString());
            readResponse(pw, br, infoBuilder, "250");
            flush(pw);
            
            // QUIT退出
            pw.write("QUIT" + LINE_END);
            if (!readResponse(pw, br, infoBuilder, "221"))
                return infoBuilder.toString();
            flush(pw);
            
            return infoBuilder.toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            errorMsg = "网络连接异常，请重试";
            return "Exception:>" + e.getMessage();
        }catch (ConnectException e) {
            e.printStackTrace();
            errorMsg = "无法连接到SMTP服务器";
            return "Exception:>" + e.getMessage();
		} 
        catch (Exception e) {
            e.printStackTrace();
            errorMsg = "验证出现了异常，请重新验证！";
            return "Exception:>" + e.getMessage();
		}finally {
            // 释放资源
            try {
                if (null != socket)
                    socket.close();
                if (null != pw)
                    pw.close();
                if (null != br)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            // this.to.clear();
            // this.cc.clear();
            // this.bcc.clear();
            this.partSet.clear();
        }
        
    }
    
    
    private void flush(PrintWriter pw) {
        if (!isAllowReadSocketInfo) {
            pw.flush();
        }
    }
    
    
    private boolean readResponse(PrintWriter pw, BufferedReader br,StringBuilder infoBuilder, String msgCode) throws IOException {
        if (isAllowReadSocketInfo) {
            pw.flush();
            String message = br.readLine();
            infoBuilder.append("SERVER:/>");
            infoBuilder.append(message).append(LINE_END);
            if (null == message || 0 > message.indexOf(msgCode)) {
                System.out.println("ERROR: " + message);
                pw.write("QUIT".concat(LINE_END));
                pw.flush();
                return false;
            }
            if (isDebug) {
                System.out.println("DEBUG:/>" + msgCode + "/" + message);
            }
        }
        return true;
    }
    
    public String getBoundaryNextPart() {
        return boundaryNextPart;
    }
    
    public void setBoundaryNextPart(String boundaryNextPart) {
        this.boundaryNextPart = boundaryNextPart;
    }
    
    public String getDefaultAttachmentContentType() {
        return defaultAttachmentContentType;
    }
    
    public void setDefaultAttachmentContentType(
            String defaultAttachmentContentType) {
        this.defaultAttachmentContentType = defaultAttachmentContentType;
    }
    
    public String getHost() {
        return host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public String getFrom() {
        return from;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    
    public void setRandomFromName(String randomFromName) {
        this.randomFromName = randomFromName;
    }
    
    public List<String> getTo() {
        return to;
    }
    
    public void setTo(List<String> to) {
        this.to = to;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getContentType() {
        return contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    
    public String getBoundary() {
        return boundary;
    }
    
    public void setBoundary(String boundary) {
        this.boundary = boundary;
    }
    
    public String getContentTransferEncoding() {
        return contentTransferEncoding;
    }
    
    public void setContentTransferEncoding(String contentTransferEncoding) {
        this.contentTransferEncoding = contentTransferEncoding;
    }
    
    public String getCharset() {
        return charset;
    }
    
    public void setCharset(String charset) {
        this.charset = charset;
    }
    
    public String getContentDisposition() {
        return contentDisposition;
    }
    
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }
    
    public String getSimpleDatePattern() {
        return simpleDatePattern;
    }
    
    public void setSimpleDatePattern(String simpleDatePattern) {
        this.simpleDatePattern = simpleDatePattern;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public boolean isAllowReadSocketInfo() {
        return isAllowReadSocketInfo;
    }
    
    public void setAllowReadSocketInfo(boolean isAllowReadSocketInfo) {
        this.isAllowReadSocketInfo = isAllowReadSocketInfo;
    }
    
	
    public static void main(String[] args) {
        // 应用示例：线程化发送邮件
        new Thread() {
            @Override
            public void run() {
                System.out.println("SENDER-" + this.getId() + ":/>"
                        + "开始发送邮件...");
                
                // 创建邮件对象
                SendMailTool mail = new SendMailTool();
                mail.setHost("smtp.gmail.com"); // 邮件服务器地址
                mail.setFrom("sss@gmail.com"); // 发件人邮箱
                mail.addTo("sss@qq.com"); // 收件人邮箱
                mail.addCc("sss@qq.com");
                mail.addBcc("sss@163.com");
                mail.setSubject("CC Test Mail!! 哈哈"); // 邮件主题
                mail.setUser("sss@gmail.com"); // 用户名
                mail.setPassword("*******"); // 密码       
                mail.setContent("这是一个测试，请不要回复！"); // 邮件正文
                mail.setRandomFromName("****");
                //mail.addAttachment("D:\\software.txt"); // 添加附件
//                for(int i=1;i<2;i++){
//                mail.addAttachment("D:\\button.png"); // 添加附件
//                }
                // mail.addAttachment(
                // "e:/test.htm"); //
                // 添加附件
                
                System.out.println(mail.send()); // 发送
               
                System.out.println("SENDER-" + this.getId() + ":/>"
                        + "邮件已发送完毕！");
            }
        }.start();
        
    }
}
