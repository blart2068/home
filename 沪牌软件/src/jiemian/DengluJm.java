package jiemian;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.luwenbin.webbrowser.*;
public class DengluJm extends JFrame implements ActionListener {
	JLabel jl1,jl2,jl3;
	JButton jb1,jb2,jb3,jb4;
	JTextField jt;
	JPasswordField jps;
	JPanel jp1,jp2;
	//public static int jg=88;
	private static String bbh = "----------��ǰ�汾181212�����ư�----------";
	public static String xx="",ul="https://paimai.alltobid.com/";
	public static void main(String[]args){
		new DengluJm();
	}


	public void actionPerformed(ActionEvent e) {//����
		if(e.getSource()==jb1){
			 xx=jt.getText()+jps.getText();
			
			 
			
				 new JM(jt.getText());
					new SimpleWebBrowserExample().start();
					
			
	}
		
		
		if(e.getSource()==jb4){//ģ�����
			shizhong.tbh = false;
			 xx=jt.getText()+jps.getText();
		
				

					new JM("ģ��ҳ��");
					new SimpleWebBrowserExample().start();
					
					
					this.dispose();
				
			
		}
		if(e.getSource()==jb2){
			jt.setText("");
			jps.setText("");
		}
		if(e.getSource()==jb3){
			new Shezhi();
		}
	}
	public DengluJm() {
		jp1=new JPanel(new FlowLayout());
		jp2=new JPanel(new FlowLayout());
		jps=new JPasswordField(20);
		jt=new JTextField(20);
		jb1=new JButton("��   ½");jb2=new JButton("��  ��");jb3=new JButton("��  ��");
		jb4=new JButton("ʹ��˵��/ģ��");
		jb1.addActionListener(this);jb2.addActionListener(this);
		jb3.addActionListener(this);jb4.addActionListener(this);
		jl1=new JLabel("Ͷ���:");jl2=new JLabel("��  ��:");jl3=new JLabel(bbh);
		jp1.add(jl1);jp1.add(jt);jp1.add(jl2);jp1.add(jps);
		jp2.add(jb1);jp2.add(jb2);jp2.add(jb3);jp1.add(jb4);jp1.add(jl3);
		this.add(jp1);this.add(jp2,new BorderLayout().SOUTH);
		
		this.setTitle("by_blart");
		this.setSize(270, 250);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
