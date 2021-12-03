package jt;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class D324 extends JFrame implements ActionListener {
	//----------组件---
	JButton an1,an2;
	JPanel mb1,mb;
	JLabel bq1,bq2;
	public static void main(String [] args){//---主函数
		new D324();
	}
	D324(){//--构造方法
		mb1=new JPanel();mb=new JPanel();
		an1=new JButton("猫跑");an2=new JButton("猫趟");//--定义按钮
		an1.addActionListener(this);//监听按钮 an1
		an1.setActionCommand("an1");//对监听的an1 赋String类型的值     用于在接口区别其他按钮
		an2.addActionListener(this);//同an1
		an2.setActionCommand("an2");//同an1
		//------以下显示面板--------------------------
		mb1.add(an1);mb1.add(an2);
		this.add(mb1,BorderLayout.SOUTH);
		this.add(mb);
		this.setIconImage(new ImageIcon("src/tiantiansifangmao-04.png").getImage());
		this.setTitle("测试监听");
		this.setVisible(true);
		this.setSize(600, 500);
		this.setLocation(200,220);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){//--实现接口
		if(e.getActionCommand().equals("an1")){//--判断赋予按钮的值
			mb.setBackground(Color.RED);//-------面板设置颜色
		}else if(e.getActionCommand().equals("an2")){
			mb.setBackground(Color.BLUE);//----同上
			
		}
	}
}


