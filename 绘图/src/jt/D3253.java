package jt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CK extends JPanel implements WindowListener{
	//---�̳� �����  ʵ�� ���� �ӿ� 
	public void paint (Graphics g){//���Ǹ����еĺ���
		super.paint(g);
	}
//---------�����Ǵ������еĳ��󷽷�----
	@Override
	public void windowActivated(WindowEvent e) {
		// --���ڼ���
		System.out.println("����");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//--- �����������⺯��ʱ�رջ����Ѿ�����
		System.out.println("�ر�");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// --���ڹر�
		System.out.println("�ر�");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// ������ͣ
		System.out.println("��С�����");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// ������ͣ
		System.out.println("����С��������");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// ��С��
		System.out.println("��С��");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// ��
		System.out.println("��??");
	}
	
} 

public class D3253 extends JFrame{//----������
	CK ck;
	public static void main(String [] args){//--������
		new D3253();
	}
	D3253(){//---���췽��
		ck=new CK();
		add(ck);
		addWindowListener(ck);//������갴�½ӿ�
		setTitle("Window");
		setIconImage(new ImageIcon("src/tiantiansifangmao-16.png").getImage());
		setSize(600, 400);
		setLocation(222,222);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
