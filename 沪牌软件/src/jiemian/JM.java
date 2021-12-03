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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.luwenbin.webbrowser.SimpleWebBrowserExample;

public class JM  implements ActionListener{
	public static  boolean b= false;
	public static int x=0,y=0;
	public static String cjsj="11:29:51";//出价时间
	public static int cjjg=500;//出价价格

	public static JTextField jts,jtf,jtm;
	public static MnTime mnt;
	public static JLabel jl,jln,jl1,jl2,jl3,jl5,jls,jlf,jlm;
	public static JPanel jp,mb;
	public static JButton an,end;

	public static JButton szsj;
	public static JButton wysj;
	public static Point p=new Point(0, 0);
	public static JTextArea jt;
	public static String wl="";
	public static JScrollPane jsc;
	public static JRadioButton jrb1,jrb2,jrb3,anm,anz,ank;
	public static ButtonGroup bg,bg2;
	//	public static void main(String[] args) {
	//		new JM("sdd",new Yangzheng());
	//	}

//	public static void main(String[] args) {
//		new JM("");
//		new SimpleWebBrowserExample().start();
//	}

	
	

	public void actionPerformed(ActionEvent e) {//监听

		if (e.getSource()==end) {

			



			System.exit(0);
		} 



		if (e.getSource()==an) {//获取移动后的坐标＋00

			new yzzb().start();

		}

		if (e.getSource()==szsj) {
			try {
				if(Integer.parseInt(jts.getText())>=0&&Integer.parseInt(jts.getText())<24&&
						Integer.parseInt(jtf.getText())>=0&&Integer.parseInt(jtf.getText())<60&
						Integer.parseInt(jtm.getText())>=0&&Integer.parseInt(jtm.getText())<60){
					shizhong.s = Integer.parseInt(jts.getText());
					shizhong.f = Integer.parseInt(jtf.getText());
					shizhong.m = Integer.parseInt(jtm.getText());
				}

			} catch (Exception e2) {	
			}
		}
		if (e.getSource()==wysj) {
			try {
				wytime.wysj();
				String sj[]=wytime.ss.split(":");
				shizhong.s=Integer.parseInt(sj[0]);
				shizhong.f=Integer.parseInt(sj[1]);
				shizhong.m=Integer.parseInt(sj[2]);


			} catch (Exception e22) {

			}
		}
	}

	public JM(String tbh){
		if (tbh.equals("模拟页面")) {
			SimpleWebBrowserExample.ul=System.getProperty("user.dir")+"/moni.html";
			SimpleWebBrowserExample.cs=0;
		}else{
			
		}

		jrb1=new JRadioButton("服务器专线1");jrb1.setFont(new Font("新宋体", 18, 18));
		jrb2=new JRadioButton("服务器专线2");jrb2.setFont(new Font("新宋体", 18, 18));
		jrb3=new JRadioButton("服务器专线3");jrb3.setFont(new Font("新宋体", 18, 18));
		an=new JButton("外挂检查");

		szsj=new JButton("手动矫时");szsj.addActionListener(this);
		wysj=new JButton("设置标准时间");wysj.addActionListener(this);
		jts = new JTextField(2);jtf = new JTextField(2);jtm = new JTextField(2);
		jls =new JLabel("点");jlf =new JLabel("分");jlm =new JLabel("秒");

		anm=new JRadioButton("网★手★");anm.setFont(new Font("新宋体", 18, 12));anm.addActionListener(this);
		anz=new JRadioButton("网★手★★");anz.setFont(new Font("新宋体", 18, 12));anz.addActionListener(this);
		ank=new JRadioButton("网★★手★★");ank.setFont(new Font("新宋体", 18, 12));ank.addActionListener(this);
		end=new JButton("退出");end.setFont(new Font("粗体", 25, 25));end.addActionListener(this);
		end.setForeground(Color.RED);
		anm.setForeground(Color.BLUE);anz.setForeground(Color.BLUE);ank.setForeground(Color.BLUE);
		an.addActionListener(this);
		bg=new ButtonGroup();jrb1.setSelected(true);
		bg2=new ButtonGroup();ank.setSelected(true);
		bg2.add(anm);bg2.add(anz);bg2.add(ank);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jp=new JPanel(new FlowLayout());
		mb=new JPanel(new GridLayout(2, 1,12,13));
		jl1=new JLabel("服务器连接成功...",0);
		jl1.setFont(new Font("新宋体", 18, 24));
		jl2=new JLabel("工作模式:",0);
		jl2.setFont(new Font("新宋体", 18, 18));
		jl3=new JLabel("网络链路质量:"+wl,0);

		jl3.setFont(new Font("新宋体", 18, 24));
		jt=new JTextArea("请于11点前完成第一次出价!\n",3,3);
		jt.setLineWrap(true);
		jt.setForeground(Color.red);
		jt.setFont(new Font("新宋体", 18, 25));
		jt.setBackground(Color.BLACK);
		jsc=new JScrollPane(jt);
		jl=new JLabel("", 0);
		jl.setFont(new Font("新宋体", 18, 25));
		jl.setForeground(Color.RED);
		jln=new JLabel("标书号:"+tbh,0);
		jln.setFont(new Font("粗体", 18, 25));
		jln.setForeground(Color.RED);
		bg.add(jrb1);bg.add(jrb2);bg.add(jrb3);

		jp.add(an);
		if(tbh.equals("自定义")){//--------------自定义出价设置------
			anjl.zdy=false;
			b=true;

			shizhong.time();
			cjsj="11:29:05";//---出价时间
			anjl.ycsj=52000;



		}else{

			
		


			if(!tbh.equals("模拟页面")){//正常出价设置--------------
				b=true;

				shizhong.time();

			}

			else{//模拟出价设置------------------------------
				wysj.setVisible(false);
				jts.setText("11");jtf.setText("29");jtm.setText("20");
				cjsj="11:29:50";
				cjjg=500;
				anjl.ycsj=7000;
				anz.setSelected(true);
				shizhong.time();

			}
		}

	}

}
