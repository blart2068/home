package jiemian;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

import com.luwenbin.webbrowser.SimpleWebBrowserExample;

public class JM  implements ActionListener{
	public static  boolean b= false;
	public static int x=0,y=0;
	public static String cjsj="11:29:51";//出价时间
	public static int cjjg=500;//出价价格

	

	public static JLabel jln,jl1,jl2;
	public static JPanel jp,mb;
	public static JButton an,end;

	public static JButton wysj;
	public static Point p=new Point(0, 0);
	public static JTextField jt,jt1;
	public static String wl="";
	public static JScrollPane jsc;
	public static JRadioButton jrb1,jrb2,jrb3,anm,anz,ank;
	public static ButtonGroup bg,bg2;
		public static void main(String[] args) {
			new JM("sdd");
			new SimpleWebBrowserExample().start();
		}

	

	public void actionPerformed(ActionEvent e) {//监听

		if (e.getSource()==end) {

			
			System.exit(0);
		} 



		if (e.getSource()==an) {//获取移动后的坐标＋00
			try {
				yzzb.i = Integer.parseInt(jt.getText());
			} catch (Exception e2) {
				yzzb.i = 1;
			}
			
			try {
				yzzb.sj = (Integer.parseInt(jt1.getText()))*60;
			} catch (Exception e2) {
				yzzb.sj = 0;
			}
			

			 new yzzb().start();
			
				
		}

		
	}

	public JM(String tbh){

		an=new JButton("启动");an.addActionListener(this);

		
		wysj=new JButton("停止");wysj.addActionListener(this);
		
		

		
		end=new JButton("退出");end.setFont(new Font("粗体", 25, 25));end.addActionListener(this);
		end.setForeground(Color.RED);
		
		
		
	
		jp=new JPanel(new FlowLayout());
		mb=new JPanel(new GridLayout(2, 1,12,13));
		jl1 =new JLabel("设置点击次数");
		jl2 =new JLabel("间隔时间[分钟]");
		jt1=new JTextField(5);jt1.addActionListener(this);
		
		jt=new JTextField(5);jt.addActionListener(this);
		
		jt.setForeground(Color.red);
		
		
		jln=new JLabel("以点击次数:"+(yzzb.i-1),0);
		jln.setFont(new Font("粗体", 18, 25));
		jln.setForeground(Color.RED);
		

		jp.add(an);
	
		

		
			try {

				
			} catch (Exception e1) {
				e1.printStackTrace();
			}


			
		}

	}


