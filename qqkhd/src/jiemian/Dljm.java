package jiemian;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.event.AncestorListener;

import gonggong.*;
import moxing.*;
import gongju.*;

public class Dljm extends JFrame implements ActionListener,MouseListener{
	JLabel bqb1,bqb2,bqb3,bqb4;//-----������ǩ
	JPanel mbb;
	JPanel mbn;//---�ϲ����
	JButton ann1,ann2,ann3;
	JTabbedPane xxk;//---�в�ѡ�
	JPanel mbz1,mbz2,mbz3;
	JLabel bqz1,bqz2,bqz3,bqz4;
	JButton anz1;
	JTextField wbkz1;
	JPasswordField mmkz1;
	JCheckBox fxkz1,fxkz2;
	public static void main(String[] args){//������
		new Dljm();
	}


	public void actionPerformed(ActionEvent e) {//����
		String zl=e.getActionCommand();//ȡ��ָ��
		if(zl.equals("dl")){//�ж��Ƿ�����½
			String yhm=wbkz1.getText();//ȡ���ı������������ ȥ����ͷ�ո��β���ո�
			String mm=new String(mmkz1.getPassword());//ȡ�����������
			User u=new User(yhm,mm);//��װ�û���������
			Yanzheng yz=new Yanzheng();//ʵ������֤��

			if(yz.yz(u)){//��֤�Ƿ��ܵ�½
				this.dispose();//�رյ�½����
			}else{
				if(Lianjie.lx.equals("ZX")){
					JOptionPane.showMessageDialog(this, "�û��Ѿ�����");//����������ʾ����
					mmkz1.setText("");//��������	
					Lianjie.lx="CW";
				}
				else{
					JOptionPane.showMessageDialog(this, "�û��������������");//����������ʾ����
					mmkz1.setText("");//��������
				}
			}
		}
	}

	Dljm(){
		//---------------����---------------------
		mbb=new JPanel();
		bqb1=new JLabel(new ImageIcon
				("image/tiantiansifangmao-13.png"));
		bqb2=new JLabel(new ImageIcon
				("image/tiantiansifangmao-14.png"));
		bqb3=new JLabel(new ImageIcon
				("image/tiantiansifangmao-15.png"));
		bqb4=new JLabel(new ImageIcon
				("image/tiantiansifangmao-16.png"));
		mbb.add(bqb1);mbb.add(bqb2);mbb.add(bqb3);mbb.add(bqb4);
		//--------------�ϲ�------------------------
		mbn=new JPanel(new GridLayout(1,3,30,13));
		ann1=new JButton(new ImageIcon
				("image/tiantiansifangmao-06.png"));
		ann2=new JButton(new ImageIcon
				("image/tiantiansifangmao-05.png"));
		ann3=new JButton(new ImageIcon
				("image/tiantiansifangmao-03.png"));
		mbn.add(ann1);mbn.add(ann2);mbn.add(ann3);
		//----------------�в�----------------
		xxk=new JTabbedPane();
		mbz1=new JPanel(new GridLayout(3,3));
		mbz2=new JPanel(new GridLayout(3,3));
		mbz3=new JPanel(new GridLayout(3,3));
		mbz2.setBackground(Color.YELLOW);
		mbz3.setBackground(Color.GREEN);
		bqz1=new JLabel("qq����",JLabel.CENTER);
		wbkz1=new JTextField(12);
		anz1=new JButton("�������");
		bqz2=new JLabel("qq����",JLabel.CENTER);
		mmkz1=new JPasswordField(12);
		bqz3=new JLabel("��������",JLabel.CENTER);//----
		bqz3.setFont(new Font("����",Font.PLAIN,18));
		bqz3.setForeground(Color.MAGENTA);
		bqz3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fxkz1=new JCheckBox("�����½");
		fxkz2=new JCheckBox("��ס����");
		bqz4=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
		bqz4.addMouseListener(this);
		
		bqz4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mbz1.add(bqz1);mbz1.add(wbkz1);mbz1.add(anz1);
		mbz1.add(bqz2);mbz1.add(mmkz1);mbz1.add(bqz3);
		mbz1.add(fxkz1);mbz1.add(fxkz2);mbz1.add(bqz4);
		xxk.add("��ͨ�û�",mbz1);xxk.add("��Ա��½",mbz2);
		xxk.add("����Ա��½",mbz3);
		//----------------����---------
		ann1.addActionListener(this);
		ann1.setActionCommand("dl");
		//-------------JFrame---------------------------
		this.add(mbb,BorderLayout.NORTH);
		this.add(xxk);
		this.add(mbn,BorderLayout.SOUTH);
		this.setIconImage(new ImageIcon
				("image/tiantiansifangmao-04.png")
				.getImage());
		this.setTitle("�û���½");
		this.setSize(600, 500);
		this.setLocation(300,200);
		this.setVisible(true);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==bqz4){
			System.out.println("nice??");
		}
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}
	
}


