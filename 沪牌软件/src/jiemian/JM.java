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
	public static String cjsj="11:29:51";//����ʱ��
	public static int cjjg=500;//���ۼ۸�

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

	
	

	public void actionPerformed(ActionEvent e) {//����

		if (e.getSource()==end) {

			



			System.exit(0);
		} 



		if (e.getSource()==an) {//��ȡ�ƶ�������꣫00

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
		if (tbh.equals("ģ��ҳ��")) {
			SimpleWebBrowserExample.ul=System.getProperty("user.dir")+"/moni.html";
			SimpleWebBrowserExample.cs=0;
		}else{
			
		}

		jrb1=new JRadioButton("������ר��1");jrb1.setFont(new Font("������", 18, 18));
		jrb2=new JRadioButton("������ר��2");jrb2.setFont(new Font("������", 18, 18));
		jrb3=new JRadioButton("������ר��3");jrb3.setFont(new Font("������", 18, 18));
		an=new JButton("��Ҽ��");

		szsj=new JButton("�ֶ���ʱ");szsj.addActionListener(this);
		wysj=new JButton("���ñ�׼ʱ��");wysj.addActionListener(this);
		jts = new JTextField(2);jtf = new JTextField(2);jtm = new JTextField(2);
		jls =new JLabel("��");jlf =new JLabel("��");jlm =new JLabel("��");

		anm=new JRadioButton("�����֡�");anm.setFont(new Font("������", 18, 12));anm.addActionListener(this);
		anz=new JRadioButton("�����֡��");anz.setFont(new Font("������", 18, 12));anz.addActionListener(this);
		ank=new JRadioButton("������֡��");ank.setFont(new Font("������", 18, 12));ank.addActionListener(this);
		end=new JButton("�˳�");end.setFont(new Font("����", 25, 25));end.addActionListener(this);
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
		jl1=new JLabel("���������ӳɹ�...",0);
		jl1.setFont(new Font("������", 18, 24));
		jl2=new JLabel("����ģʽ:",0);
		jl2.setFont(new Font("������", 18, 18));
		jl3=new JLabel("������·����:"+wl,0);

		jl3.setFont(new Font("������", 18, 24));
		jt=new JTextArea("����11��ǰ��ɵ�һ�γ���!\n",3,3);
		jt.setLineWrap(true);
		jt.setForeground(Color.red);
		jt.setFont(new Font("������", 18, 25));
		jt.setBackground(Color.BLACK);
		jsc=new JScrollPane(jt);
		jl=new JLabel("", 0);
		jl.setFont(new Font("������", 18, 25));
		jl.setForeground(Color.RED);
		jln=new JLabel("�����:"+tbh,0);
		jln.setFont(new Font("����", 18, 25));
		jln.setForeground(Color.RED);
		bg.add(jrb1);bg.add(jrb2);bg.add(jrb3);

		jp.add(an);
		if(tbh.equals("�Զ���")){//--------------�Զ����������------
			anjl.zdy=false;
			b=true;

			shizhong.time();
			cjsj="11:29:05";//---����ʱ��
			anjl.ycsj=52000;



		}else{

			
		


			if(!tbh.equals("ģ��ҳ��")){//������������--------------
				b=true;

				shizhong.time();

			}

			else{//ģ���������------------------------------
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
