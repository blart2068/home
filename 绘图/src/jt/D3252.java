package jt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SB extends JPanel implements MouseListener,MouseMotionListener{
	//继承 面板 类    现实鼠标按下 接口   现实鼠标移到接口 
	public void paint(Graphics g){//覆盖JPanel中的方法
		super.paint(g);
	}
	//---------以下是MouseListener中的抽象方法-------------------
	public void mouseClicked(MouseEvent e) {
		//---取鼠标点击的位置--------
		System.out.println("鼠标被点击的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//----鼠标进入窗口-----------
		System.out.println("鼠标进来了!!");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// --鼠标离开窗口--------
		System.out.println("鼠标出去了****");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// --鼠标按下--------
		System.out.println("鼠标被按下--的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//--鼠标松开-----
		System.out.println("鼠标被松开+++的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	//---------以下是MouseMotionListener中的抽象方法--------
	public void mouseDragged(MouseEvent e) {
		// ---鼠标拖拽-----
		System.out.println("Dragged+++的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//-----鼠标移到-----
		System.out.println("Moved----的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
}

public class D3252 extends JFrame{//---启动类----
	SB sb;
	public static void main(String[] args){//--主函数
		new D3252();
	}
	D3252(){//构造函数
		sb=new SB();
		add(sb);
		addMouseListener(sb);//监听鼠标按下接口
		addMouseMotionListener(sb);//监听鼠标移到接口
		setTitle("鼠标");
		setIconImage(new ImageIcon("src/tiantiansifangmao-16.png").getImage());
		setSize(600, 400);
		setLocation(222,222);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
