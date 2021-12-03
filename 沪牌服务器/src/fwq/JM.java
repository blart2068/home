package fwq;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class JM extends JFrame implements ActionListener,Runnable{
	JButton jb,jb1;
	JLabel jl;
	static JTextArea jt;
	JScrollPane jsc;
	JPanel jp,jpn;
	static JTextField wbk;
	public static void main(String[]args){
		new JM();
	}
	
	
	
	public void run() {//线程
		new FW().qidong();
	}


	public void actionPerformed(ActionEvent e) {//监听
		if(e.getSource()==jb){
			new Thread(this).start();
			jl.setText("服务器已启动Y");
		}
		if(e.getSource()==jb1){
			FW.bbh=wbk.getText();
		}
		
	}

	public JM(){
		jb=new JButton("启动服务器");
		jb1 = new JButton("设置版本");
		wbk = new JTextField(16);
		wbk.setText(FW.bbh);
		jl=new JLabel("服务器未启动X");
		jt=new JTextArea("以连接的客户端:\n");
		jsc=new JScrollPane(jt);
		jp=new JPanel(new FlowLayout());
		jpn=new JPanel(new FlowLayout());
		jp.add(jb);jp.add(jl);
		jpn.add(wbk);jpn.add(jb1);
		jb.addActionListener(this);
		jb1.addActionListener(this);
		this.add(jsc);this.add(jp,BorderLayout.SOUTH);
		this.add(jpn,BorderLayout.NORTH);
		this.setTitle("拍牌服务器by_blart");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocation(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
