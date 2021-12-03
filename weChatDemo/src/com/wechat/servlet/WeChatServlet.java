package com.wechat.servlet;
import my.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.wechat.msgtype.Articles;
import com.wechat.msgtype.Item;
import com.wechat.msgtype.ReplyTextMessage;
import com.wechat.msgtype.ReplyTuwenMessage;
import com.wechat.msgtype.RequestTextMessage;
import com.wechat.util.SignUtil;

public class WeChatServlet extends HttpServlet {

	private static final long serialVersionUID = 7204395413984843787L;

	/* �޲ι����� */
	public WeChatServlet() {
		super();
	}

	/* ΢�ŷ����������� GET �Խӷ��������󵽴˴� */
	public void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {

		// ΢�ż���ǩ��
		String signature = request.getParameter("signature");

		// ʱ���
		String timestamp = request.getParameter("timestamp");

		// �����
		String nonce = request.getParameter("nonce");

		// ����ַ���
		String echostr = request.getParameter("echostr");
		PrintWriter out = response.getWriter();

		// ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ�Խӳɹ�������Խ�ʧ��
		if (SignUtil.checkSignature(signature, timestamp, nonce)) 
			out.print(echostr);

		out.close();
		out = null;

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		String echo = request.getParameter("echostr");
		echo = new String(echo.getBytes("ISO-8859-1"), "UTF-8");
		pw.println(echo);

	}

	/* ΢�ŷ��������ᷢ���û��� POST ��Ϣ���˴� */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ΢�Ÿ�ƽ̨������Ϣʱ�ᵽ����
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();

		String wxMsgXml = IOUtils.toString(request.getInputStream(), "utf-8");
		RequestTextMessage textMsg = null;

		try {
			textMsg = getRequestTextMessage(wxMsgXml);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* ��ȡ�û����͵���Ϣ */
		StringBuffer replyMsg = new StringBuffer();
		String receive = textMsg.getContent().trim();
		String returnXml = null;
		String  tgm = "----";
		String  t = "222";
		try {
			tgm = receive.split(" ")[1];
			t = receive.split(" ")[0];
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		if (textMsg != null && !receive.equals("")) {
			
			/* ������Ӧ�Ĵ��� */
			if (receive.equals("����") || receive.equals("xq")) {

				replyMsg.append("�ظ���Ӧ��Ż�ȡ���飡 ");
				replyMsg.append("\r\n0��000000");
				replyMsg.append("\r\n1��������ȡ�ƹ���");
				replyMsg.append("\r\n2���̵س����ƹ�����");
				replyMsg.append("\r\n3����ѯ���˿ͻ���̬");
				replyMsg.append("\r\n��������������ֱ������������Ϣ");

				returnXml = getReplyTextMessage(replyMsg.toString(),textMsg.getFromUserName(), textMsg.getToUserName());

			} 
			else if (receive.equals("0")) {
				replyMsg.append(" 00000000000000000 ");
				returnXml = getReplyTextMessage(replyMsg.toString(),textMsg.getFromUserName(), textMsg.getToUserName()); // �ظ����ı�
			} 
			else if (receive.equals("1")) {
				returnXml = getReplyTuwenMessage2(textMsg.getFromUserName(),textMsg.getToUserName());// �ظ�ͼ��
			}
			else if (receive.equals("2")) {
				returnXml = getReplyTuwenMessage(textMsg.getFromUserName(),textMsg.getToUserName());// �ظ�ͼ��
			}
			else if (receive.equals("3")) {
				returnXml = getReplyTuwenMessage3(textMsg.getFromUserName(),textMsg.getToUserName());	// �ظ�ͼ��
			} 
			//---�Զ���----------------------------------------
			else if (t.equals("cx")) {//��ѯ
				replyMsg.append(my.tgm.rn(tgm));
				returnXml = getReplyTextMessage(replyMsg.toString(),textMsg.getFromUserName(), textMsg.getToUserName()); // �ظ����ı�
			} 
			
			else {
				replyMsg.append("���ã������Ѿ��յ������͵����� ��" + textMsg.getContent()+ "�� �����ɻظ������顱���ߡ�xq���鿴�˵�Ŷ");
				returnXml = getReplyTextMessage(replyMsg.toString(),textMsg.getFromUserName(), textMsg.getToUserName());
			}
			
			
		} 
		else {
			replyMsg.append("��˵��ʲô��");
			returnXml = getReplyTextMessage(replyMsg.toString(),textMsg.getFromUserName(), textMsg.getToUserName());
		}

		pw.println(returnXml);

	}

	// ��ȡ�����ı���Ϣ
	private RequestTextMessage getRequestTextMessage(String xml) {

		XStream xstream = new XStream(new DomDriver());

		xstream.alias("xml", RequestTextMessage.class);
		xstream.aliasField("ToUserName", RequestTextMessage.class, "toUserName");
		xstream.aliasField("FromUserName", RequestTextMessage.class,"fromUserName");
		xstream.aliasField("CreateTime", RequestTextMessage.class, "createTime");
		xstream.aliasField("MsgType", RequestTextMessage.class, "messageType");
		xstream.aliasField("Content", RequestTextMessage.class, "content");
		xstream.aliasField("MsgId", RequestTextMessage.class, "msgId");

		RequestTextMessage requestTextMessage = (RequestTextMessage) xstream
				.fromXML(xml);
		return requestTextMessage;

	}

	// �ظ��ı���Ϣ
	private String getReplyTextMessage(String content, String fromUserName,String toUserName) {

		ReplyTextMessage we = new ReplyTextMessage();
		we.setMessageType("text");
		we.setFuncFlag("0");
		we.setCreateTime(new Long(new Date().getTime()).toString());
		we.setContent(content);
		we.setToUserName(fromUserName);
		we.setFromUserName(toUserName);
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("xml", ReplyTextMessage.class);
		xstream.aliasField("ToUserName", ReplyTextMessage.class, "toUserName");
		xstream.aliasField("FromUserName", ReplyTextMessage.class,"fromUserName");
		xstream.aliasField("CreateTime", ReplyTextMessage.class, "createTime");
		xstream.aliasField("MsgType", ReplyTextMessage.class, "messageType");
		xstream.aliasField("Content", ReplyTextMessage.class, "content");
		xstream.aliasField("FuncFlag", ReplyTextMessage.class, "funcFlag");
		String xml = xstream.toXML(we);
		return xml;

	}

	/**
	 * �ظ�ͼ����Ϣ
	 */
	private String getReplyTuwenMessage2(String fromUserName, String toUserName) {

		ReplyTuwenMessage we = new ReplyTuwenMessage();
		Articles articles = new Articles();
		Item item = new Item();

		we.setMessageType("news");
		we.setCreateTime(new Long(new Date().getTime()).toString());
		we.setToUserName(fromUserName);
		we.setFromUserName(toUserName);
		we.setFuncFlag("0");
		we.setArticleCount(1);
		
		item.setTitle("�����"); // ����
		item.setDescription("ע���ȡ�ƹ���"); // ����
		item.setPicUrl("http://www.blart.pw:5271/img/wxtg.jpg"); // ��ʾͼƬ
		item.setUrl("http://www.jundiweilin.com/weChatDemo/qmyx.html"); // ���ȥ�鿴�ĵ�ַ����
		articles.setItem(item);
		we.setArticles(articles);
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("xml", ReplyTuwenMessage.class);
		xstream.aliasField("ToUserName", ReplyTuwenMessage.class, "toUserName");
		xstream.aliasField("FromUserName", ReplyTuwenMessage.class,"fromUserName");
		xstream.aliasField("CreateTime", ReplyTuwenMessage.class, "createTime");
		xstream.aliasField("MsgType", ReplyTuwenMessage.class, "messageType");
		xstream.aliasField("Articles", ReplyTuwenMessage.class, "Articles");
		xstream.aliasField("ArticleCount", ReplyTuwenMessage.class,"articleCount");
		xstream.aliasField("FuncFlag", ReplyTuwenMessage.class, "funcFlag");
		xstream.aliasField("item", Articles.class, "item");
		xstream.aliasField("Title", Item.class, "title");
		xstream.aliasField("Description", Item.class, "description");
		xstream.aliasField("PicUrl", Item.class, "picUrl");
		xstream.aliasField("Url", Item.class, "url");
		String xml = xstream.toXML(we);
		return xml;
	}

	// �ظ�ͼ����Ϣ
	private String getReplyTuwenMessage(String fromUserName, String toUserName) {

		ReplyTuwenMessage we = new ReplyTuwenMessage();
		Articles articles = new Articles();
		Item item = new Item();

		we.setMessageType("news");
		we.setCreateTime(new Long(new Date().getTime()).toString());
		we.setToUserName(fromUserName);
		we.setFromUserName(toUserName);
		we.setFuncFlag("0");
		we.setArticleCount(1);
		item.setTitle("�̵س���");
		item.setDescription("�򿪴������뽫����Ź���һ������������Ȧ");
		item.setPicUrl("http://www.blart.pw:5271/img/wxtg.jpg");
		item.setUrl("http://mp.weixin.qq.com/s/_eEFDTbpKSfkiNatadgp3A");
		articles.setItem(item);
		we.setArticles(articles);
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("xml", ReplyTuwenMessage.class);
		xstream.aliasField("ToUserName", ReplyTuwenMessage.class, "toUserName");
		xstream.aliasField("FromUserName", ReplyTuwenMessage.class,"fromUserName");
		xstream.aliasField("CreateTime", ReplyTuwenMessage.class, "createTime");
		xstream.aliasField("MsgType", ReplyTuwenMessage.class, "messageType");
		xstream.aliasField("Articles", ReplyTuwenMessage.class, "Articles");
		xstream.aliasField("ArticleCount", ReplyTuwenMessage.class,"articleCount");
		xstream.aliasField("FuncFlag", ReplyTuwenMessage.class, "funcFlag");
		xstream.aliasField("item", Articles.class, "item");
		xstream.aliasField("Title", Item.class, "title");
		xstream.aliasField("Description", Item.class, "description");
		xstream.aliasField("PicUrl", Item.class, "picUrl");
		xstream.aliasField("Url", Item.class, "url");

		String xml = xstream.toXML(we);
		return xml;
	}

	// �ظ�ͼ����Ϣ
	private String getReplyTuwenMessage3(String fromUserName, String toUserName) {

		ReplyTuwenMessage we = new ReplyTuwenMessage();
		Articles articles = new Articles();
		Item item = new Item();

		we.setMessageType("news");
		we.setCreateTime(new Long(new Date().getTime()).toString());
		we.setToUserName(fromUserName);
		we.setFromUserName(toUserName);
		we.setFuncFlag("0");
		we.setArticleCount(1);
		item.setTitle("��summer ������");
		item.setDescription("summer �� ��");
		item.setPicUrl("http://1.wechatne.applinzi.com/img/IMG_9212.PNG");
		item.setUrl("http://1.wechatne.applinzi.com/img/IMG_9212.PNG");
		articles.setItem(item);
		we.setArticles(articles);
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("xml", ReplyTuwenMessage.class);
		xstream.aliasField("ToUserName", ReplyTuwenMessage.class, "toUserName");
		xstream.aliasField("FromUserName", ReplyTuwenMessage.class,"fromUserName");
		xstream.aliasField("CreateTime", ReplyTuwenMessage.class, "createTime");
		xstream.aliasField("MsgType", ReplyTuwenMessage.class, "messageType");
		xstream.aliasField("Articles", ReplyTuwenMessage.class, "Articles");
		xstream.aliasField("ArticleCount", ReplyTuwenMessage.class,"articleCount");
		xstream.aliasField("FuncFlag", ReplyTuwenMessage.class, "funcFlag");
		xstream.aliasField("item", Articles.class, "item");
		xstream.aliasField("Title", Item.class, "title");
		xstream.aliasField("Description", Item.class, "description");
		xstream.aliasField("PicUrl", Item.class, "picUrl");
		xstream.aliasField("Url", Item.class, "url");

		String xml = xstream.toXML(we);
		return xml;
	}

	/* ��ʼ�� */
	public void init() throws ServletException {
	}

	/* �ͷ���Դ */
	public void destroy() {
		super.destroy();
	}

}
