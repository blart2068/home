package ht;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
public class D323 extends JFrame {
	public static void main(String []args){//------������
		new D323();
	}
	D323(){//-------���캯��
		this.add(new mb());
		this.setTitle("��ͼ");
		this.setIconImage(new ImageIcon("src/tiantiansifangmao-16.png").getImage());
		this.setSize(900, 800);
		this.setLocation(300,200);
		//this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
class mb extends JPanel {//�̳� �����  JPanel
	public void paint(Graphics g){//���Ǹ����еķ���
		Image tp=getToolkit().getImage(Panel.class.getResource("/tiantiansifangmao-15.png"));//�½�ͼƬ
		g.drawImage(tp, 0, 0, this);//��ͼ��ӵ������ thisָ��ǰ���
		g.setColor(Color.red);//������ɫ
		g.fillOval(150, 0, 110, 100);//��� ����ɫ����Բ��
		g.draw3DRect(280, 10, 100, 110,true);//��Ӵ���͹Ч���������ľ��� true ��false Ϊ��͹����
		g.drawLine(400, 30, 500, 30);//���һ��ֱ��
		g.drawLine(400, 90, 500, 90);//���һ��ֱ��
		g.setColor(Color.BLUE);//������ɫ
		g.fill3DRect(550, 2, 110, 120,false);//��Ӵ���͹Ч���������ľ��� true ��false Ϊ��͹����
		g.setColor(Color.GREEN);//������ɫ
		g.setFont(new Font("����", Font.BOLD, 50));//������������
		g.drawString("�ֵ���", 300, 400);//�������
		
	}
	
	
	
}



