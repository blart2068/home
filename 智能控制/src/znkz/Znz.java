package znkz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Znz extends JFrame implements ActionListener{
	Mypanel mb;
	JPanel mbn;
	JButton deng,tv, cl, kt ,jk,th,skg;
	public static void main(String[] args){
		new Znz();
	}

	public void actionPerformed(ActionEvent e) {//����
		String zl=e.getActionCommand();
		if(zl.equals("deng")){
			mb.dkg();
			System.out.println("��");
			}
		if(zl.equals("tv")){
			mb.tvkg();
			System.out.println("����");
			}
		if(zl.equals("cl")){
			mb.clkg();
			System.out.println("����");
			}
		if(zl.equals("kt")){
			mb.ktkg();
			System.out.println("�յ�");
			}
		if(zl.equals("jk")){
			mb.jkkg();
			System.out.println("���");
			}
		if(zl.equals("th")){
			mb.thkg();
			System.out.println("�Ự");
			}
		if(zl.equals("skg")){
			mb.skg();
			System.out.println("����");
			}
	}

	Znz(){
		mb=new Mypanel();mbn=new JPanel();
		deng =new JButton(new ImageIcon("src/deng.png"));
		cl=new JButton(new ImageIcon("src/cl.png"));
		kt=new JButton(new ImageIcon("src/kt.png"));
		tv=new JButton(new ImageIcon("src/tv1.png"));
		jk=new JButton(new ImageIcon("src/jk.png"));
		th=new JButton(new ImageIcon("src/th.png"));
		skg=new JButton(new ImageIcon("src/sg.png"));
		
		
		deng.setBackground(Color.green);
		deng.setBorder(BorderFactory.createLoweredBevelBorder());
		cl.setBackground(Color.green);
		cl.setBorder(BorderFactory.createLoweredBevelBorder());
		kt.setBackground(Color.green);
		kt.setBorder(BorderFactory.createLoweredBevelBorder());
		tv.setBackground(Color.green);
		tv.setBorder(BorderFactory.createLoweredBevelBorder());
		jk.setBackground(Color.green);
		jk.setBorder(BorderFactory.createLoweredBevelBorder());
		th.setBackground(Color.green);
		th.setBorder(BorderFactory.createLoweredBevelBorder());
		skg.setBackground(Color.green);
		skg.setBorder(BorderFactory.createLoweredBevelBorder());
		
		
		deng.addActionListener(this);
		deng.setActionCommand("deng");
		cl.addActionListener(this);
		cl.setActionCommand("cl");
		kt.addActionListener(this);
		kt.setActionCommand("kt");
		tv.addActionListener(this);
		tv.setActionCommand("tv");
		jk.addActionListener(this);
		jk.setActionCommand("jk");
		th.addActionListener(this);
		th.setActionCommand("th");
		skg.addActionListener(this);
		skg.setActionCommand("skg");
		
		mbn.add(deng);mbn.add(cl);mbn.add(kt);
		mbn.add(tv);mbn.add(jk);mbn.add(th);mbn.add(skg);
		add(mb);add(mbn,BorderLayout.SOUTH);
		addMouseListener(mb);//������갴�½ӿ�
		addMouseMotionListener(mb);//��������Ƶ��ӿ�
		this.setTitle("Blart_�ǿ�  1.0 bata");
		setSize(600, 800);
		setVisible(true);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
