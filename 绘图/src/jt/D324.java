package jt;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class D324 extends JFrame implements ActionListener {
	//----------���---
	JButton an1,an2;
	JPanel mb1,mb;
	JLabel bq1,bq2;
	public static void main(String [] args){//---������
		new D324();
	}
	D324(){//--���췽��
		mb1=new JPanel();mb=new JPanel();
		an1=new JButton("è��");an2=new JButton("è��");//--���尴ť
		an1.addActionListener(this);//������ť an1
		an1.setActionCommand("an1");//�Լ�����an1 ��String���͵�ֵ     �����ڽӿ�����������ť
		an2.addActionListener(this);//ͬan1
		an2.setActionCommand("an2");//ͬan1
		//------������ʾ���--------------------------
		mb1.add(an1);mb1.add(an2);
		this.add(mb1,BorderLayout.SOUTH);
		this.add(mb);
		this.setIconImage(new ImageIcon("src/tiantiansifangmao-04.png").getImage());
		this.setTitle("���Լ���");
		this.setVisible(true);
		this.setSize(600, 500);
		this.setLocation(200,220);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){//--ʵ�ֽӿ�
		if(e.getActionCommand().equals("an1")){//--�жϸ��谴ť��ֵ
			mb.setBackground(Color.RED);//-------���������ɫ
		}else if(e.getActionCommand().equals("an2")){
			mb.setBackground(Color.BLUE);//----ͬ��
			
		}
	}
}


