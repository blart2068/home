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
	JLabel bqb1,bqb2,bqb3,bqb4;//-----北部标签
	JPanel mbb;
	JPanel mbn;//---南部面板
	JButton ann1,ann2,ann3;
	JTabbedPane xxk;//---中部选项卡
	JPanel mbz1,mbz2,mbz3;
	JLabel bqz1,bqz2,bqz3,bqz4;
	JButton anz1;
	JTextField wbkz1;
	JPasswordField mmkz1;
	JCheckBox fxkz1,fxkz2;
	public static void main(String[] args){//主函数
		new Dljm();
	}


	public void actionPerformed(ActionEvent e) {//监听
		String zl=e.getActionCommand();//取得指令
		if(zl.equals("dl")){//判断是否点击登陆
			String yhm=wbkz1.getText();//取出文本框输入的内容 去除开头空格个尾部空格
			String mm=new String(mmkz1.getPassword());//取出密码框内容
			User u=new User(yhm,mm);//封装用户名和密码
			Yanzheng yz=new Yanzheng();//实例化验证类

			if(yz.yz(u)){//验证是否能登陆
				this.dispose();//关闭登陆界面
			}else{
				if(Lianjie.lx.equals("ZX")){
					JOptionPane.showMessageDialog(this, "用户已经在线");//弹出窗口提示错误
					mmkz1.setText("");//密码框清空	
					Lianjie.lx="CW";
				}
				else{
					JOptionPane.showMessageDialog(this, "用户名或者密码错误");//弹出窗口提示错误
					mmkz1.setText("");//密码框清空
				}
			}
		}
	}

	Dljm(){
		//---------------北部---------------------
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
		//--------------南部------------------------
		mbn=new JPanel(new GridLayout(1,3,30,13));
		ann1=new JButton(new ImageIcon
				("image/tiantiansifangmao-06.png"));
		ann2=new JButton(new ImageIcon
				("image/tiantiansifangmao-05.png"));
		ann3=new JButton(new ImageIcon
				("image/tiantiansifangmao-03.png"));
		mbn.add(ann1);mbn.add(ann2);mbn.add(ann3);
		//----------------中部----------------
		xxk=new JTabbedPane();
		mbz1=new JPanel(new GridLayout(3,3));
		mbz2=new JPanel(new GridLayout(3,3));
		mbz3=new JPanel(new GridLayout(3,3));
		mbz2.setBackground(Color.YELLOW);
		mbz3.setBackground(Color.GREEN);
		bqz1=new JLabel("qq号码",JLabel.CENTER);
		wbkz1=new JTextField(12);
		anz1=new JButton("清除号码");
		bqz2=new JLabel("qq密码",JLabel.CENTER);
		mmkz1=new JPasswordField(12);
		bqz3=new JLabel("忘记密码",JLabel.CENTER);//----
		bqz3.setFont(new Font("楷体",Font.PLAIN,18));
		bqz3.setForeground(Color.MAGENTA);
		bqz3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fxkz1=new JCheckBox("隐身登陆");
		fxkz2=new JCheckBox("记住密码");
		bqz4=new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");
		bqz4.addMouseListener(this);
		
		bqz4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mbz1.add(bqz1);mbz1.add(wbkz1);mbz1.add(anz1);
		mbz1.add(bqz2);mbz1.add(mmkz1);mbz1.add(bqz3);
		mbz1.add(fxkz1);mbz1.add(fxkz2);mbz1.add(bqz4);
		xxk.add("普通用户",mbz1);xxk.add("会员登陆",mbz2);
		xxk.add("管理员登陆",mbz3);
		//----------------监听---------
		ann1.addActionListener(this);
		ann1.setActionCommand("dl");
		//-------------JFrame---------------------------
		this.add(mbb,BorderLayout.NORTH);
		this.add(xxk);
		this.add(mbn,BorderLayout.SOUTH);
		this.setIconImage(new ImageIcon
				("image/tiantiansifangmao-04.png")
				.getImage());
		this.setTitle("用户登陆");
		this.setSize(600, 500);
		this.setLocation(300,200);
		this.setVisible(true);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==bqz4){
			System.out.println("nice??");
		}
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
}


