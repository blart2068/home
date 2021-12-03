package jt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JP extends JPanel implements KeyListener{
	int x=5;int y=5;int x2=300;int y2=5;
	
	public void paint (Graphics g){
		super.paint(g);
		Image tp2=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/tiantiansifangmao-09.png"));
		Image tp=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/tiantiansifangmao-01.png"));
		g.drawImage(tp2,x2,y2,this);
		g.drawImage(tp, x, y, this);
		
	}
	public void keyPressed(KeyEvent e){
		int aa=e.getKeyCode();
		if(aa==KeyEvent.VK_S){
			y+=5;
		}else if(aa==KeyEvent.VK_W){
			y-=5;
		}else if(aa==KeyEvent.VK_A){
			x-=5;
		}else if(aa==KeyEvent.VK_D){
			x+=5;
		}
		if(aa==KeyEvent.VK_DOWN){
			y2+=5;
		}else if(aa==KeyEvent.VK_UP){
			y2-=5;
		}else if(aa==KeyEvent.VK_LEFT){
			x2-=5;
		}else if(aa==KeyEvent.VK_RIGHT){
			x2+=5;
		}
		this.repaint();
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
}

public class D325 extends JFrame{
	JP jp=new JP();
	public static void main(String args[]){//---主函数
		new D325();
		
	}
	D325(){//----构造函数
		
		this.addKeyListener(jp);
		this.add(jp);
		this.setIconImage(new ImageIcon("src/tiantiansifangmao-16.png").getImage());
		this.setTitle("测试");
		this.setSize(600,500);
		this.setLocation(222,222);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
