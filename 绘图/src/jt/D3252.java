package jt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SB extends JPanel implements MouseListener,MouseMotionListener{
	//�̳� ��� ��    ��ʵ��갴�� �ӿ�   ��ʵ����Ƶ��ӿ� 
	public void paint(Graphics g){//����JPanel�еķ���
		super.paint(g);
	}
	//---------������MouseListener�еĳ��󷽷�-------------------
	public void mouseClicked(MouseEvent e) {
		//---ȡ�������λ��--------
		System.out.println("��걻�����λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//----�����봰��-----------
		System.out.println("��������!!");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// --����뿪����--------
		System.out.println("����ȥ��****");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// --��갴��--------
		System.out.println("��걻����--��λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//--����ɿ�-----
		System.out.println("��걻�ɿ�+++��λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	//---------������MouseMotionListener�еĳ��󷽷�--------
	public void mouseDragged(MouseEvent e) {
		// ---�����ק-----
		System.out.println("Dragged+++��λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//-----����Ƶ�-----
		System.out.println("Moved----��λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
}

public class D3252 extends JFrame{//---������----
	SB sb;
	public static void main(String[] args){//--������
		new D3252();
	}
	D3252(){//���캯��
		sb=new SB();
		add(sb);
		addMouseListener(sb);//������갴�½ӿ�
		addMouseMotionListener(sb);//��������Ƶ��ӿ�
		setTitle("���");
		setIconImage(new ImageIcon("src/tiantiansifangmao-16.png").getImage());
		setSize(600, 400);
		setLocation(222,222);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
