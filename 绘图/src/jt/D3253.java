package jt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CK extends JPanel implements WindowListener{
	//---继承 面板类  实现 窗口 接口 
	public void paint (Graphics g){//覆盖父类中的函数
		super.paint(g);
	}
//---------以下是窗口类中的抽象方法----
	@Override
	public void windowActivated(WindowEvent e) {
		// --窗口激活
		System.out.println("激活");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//--- 窗口启动特殊函数时关闭基本已经不用
		System.out.println("关闭");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// --窗口关闭
		System.out.println("关闭");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// 窗口暂停
		System.out.println("最小化最大化");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// 窗口暂停
		System.out.println("从最小化变正常");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// 最小化
		System.out.println("最小化");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// 打开
		System.out.println("打开??");
	}
	
} 

public class D3253 extends JFrame{//----启动类
	CK ck;
	public static void main(String [] args){//--主函数
		new D3253();
	}
	D3253(){//---构造方法
		ck=new CK();
		add(ck);
		addWindowListener(ck);//监听鼠标按下接口
		setTitle("Window");
		setIconImage(new ImageIcon("src/tiantiansifangmao-16.png").getImage());
		setSize(600, 400);
		setLocation(222,222);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
