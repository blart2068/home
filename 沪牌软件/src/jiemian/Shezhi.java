package jiemian;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Shezhi extends JDialog implements ActionListener{
	JPanel JP,JP2,JP1;
	JButton jb1,jb2;
	JLabel jl,jl1,jl2,jl3;
	JTextField jt,jt1,jt2,jt3;


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jb2){
			jt.setText("");
			jt1.setText("");
			jt2.setText("");
			jt3.setText("");
		}

	}

	public Shezhi(){
		jl=new JLabel("                       服务器地址:");
		jt=new JTextField(15);
		jl1=new JLabel("                       登录名:");
		jt1=new JTextField(15);
		jl2=new JLabel("                       密码:");
		jt2=new JTextField(15);
		jl3=new JLabel("                       路径名:");
		jt3=new JTextField(15);
		JP=new JPanel(new GridLayout(4,2,8,8));
		JP1=new JPanel();
		JP2=new JPanel(new FlowLayout());
		jb1=new JButton("确  认");jb2=new JButton("取  消");
		jb1.addActionListener(this);jb2.addActionListener(this);
		JP.add(jl);JP.add(jt);
		JP.add(jl1);JP.add(jt1);
		JP.add(jl2);JP.add(jt2);
		JP.add(jl3);JP.add(jt3);
		JP2.add(jb1);JP2.add(jb2);
		JP1.add(JP);JP1.add(JP2,BorderLayout.SOUTH);
		Container rq=getContentPane();//创建容器---
		rq.add(JP1);
		setBounds(350, 230, 390, 240);//设置面板大小-出现位置--------
		setVisible(true);//--显示面板
	}
}
