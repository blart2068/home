package ht;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
public class D323 extends JFrame {
	public static void main(String []args){//------主函数
		new D323();
	}
	D323(){//-------构造函数
		this.add(new mb());
		this.setTitle("绘图");
		this.setIconImage(new ImageIcon("src/tiantiansifangmao-16.png").getImage());
		this.setSize(900, 800);
		this.setLocation(300,200);
		//this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
class mb extends JPanel {//继承 面板类  JPanel
	public void paint(Graphics g){//覆盖父类中的方法
		Image tp=getToolkit().getImage(Panel.class.getResource("/tiantiansifangmao-15.png"));//新建图片
		g.drawImage(tp, 0, 0, this);//把图添加到面板中 this指当前面板
		g.setColor(Color.red);//设置颜色
		g.fillOval(150, 0, 110, 100);//添加 有颜色填充的圆型
		g.draw3DRect(280, 10, 100, 110,true);//添加带凹凸效果的无填充的矩形 true 或false 为凹凸类型
		g.drawLine(400, 30, 500, 30);//添加一条直线
		g.drawLine(400, 90, 500, 90);//添加一条直线
		g.setColor(Color.BLUE);//设置颜色
		g.fill3DRect(550, 2, 110, 120,false);//添加带凹凸效果的有填充的矩形 true 或false 为凹凸类型
		g.setColor(Color.GREEN);//设置颜色
		g.setFont(new Font("楷体", Font.BOLD, 50));//设置字体类型
		g.drawString("持刀人", 300, 400);//添加文字
		
	}
	
	
	
}



