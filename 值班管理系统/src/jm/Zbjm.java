package jm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import suju.*;
import javax.management.Query;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Zbjm extends JFrame implements ActionListener{
	JMenuBar cdl;
	JMenu cd1,cd2;
	JMenuItem zcd1,zcd2,zcd3,zcd4,zcd5;
	JPanel mby,mb2;
	public static JTextArea jta;
	JScrollPane jsp;
	JLabel labeln,labelm,l1,l2;
	JComboBox <String>jcb,jcb2;
	JButton jb;
	String [] month=new String[12];
	static int Year;
	static int Month;
	static int lx=1;
	public static void main(String args[]){//主函数

		new Zbjm();
	}


	public void actionPerformed(ActionEvent e) {//监听
		if (e.getSource().equals(zcd1)) {//查询维护记录
			lx=1;
			l1.setText("查询值班记录:");


		}

		if (e.getSource().equals(zcd2)) {//查询维护记录
			lx=2;
			l1.setText("查询维护记录:");


		}
		if (e.getSource().equals(zcd3)) {//查询维保单位维护记录
			lx=3;
			l1.setText("查询维保单位维护记录:");


		}

		if (e.getSource().equals(zcd4)) {//修改/添加维护记录
			lx=4;
			l1.setText("修改/添加维护记录:");


		}
		if (e.getSource().equals(zcd5)) {//修改/添加维保单位维护记录
			lx=5;
			l1.setText("修改/添加维保单位维护记录:");


		}

		if (e.getSource().equals(jb)) {//确定查询值班表
			String year111=(String)jcb.getSelectedItem();
			String month222=(String)jcb2.getSelectedItem();
			String biaoti="时间:"+year111+"年"+month222+"月\n";
			String fgx = "\n--------------------------------------\n";
			if (lx==1) {//查询值班表
				jisun.js(Integer.parseInt(year111), Integer.parseInt(month222));
				jta.append(jisun.zbb);
				jisun.zbb="\n\n";

			}
			if(lx==2){//查询维护记录
				String lj = "D:/222指挥所数据库/wh"+year111+month222+".txt";
				String nr=SJK.dqjl(lj);

				if(nr.equals("")){
					jta.setText(biaoti+"无记录"+fgx);

				}else{
					jta.setText(biaoti+nr+fgx);
				}
			}
			if(lx==3){//查询维保单位记录
				String lj = "D:/222指挥所数据库/wbdw"+year111+month222+".txt";
				String nr=SJK.dqjl(lj);

				if(nr.equals("")){
					jta.setText(biaoti+"无记录"+fgx);

				}else{
					jta.setText(biaoti+nr+fgx);
				}
			}

		}
		jta.setFont(new Font(getTitle(), ABORT, 22));
		jta.setCaretPosition(jta.getText().length());//光标位置
	}

	public Zbjm() {//构造
		cdl = new JMenuBar();
		cd1 = new JMenu("查询记录(C)");cd1.setMnemonic('C');cd1.setFont(new Font(getTitle(), ABORT, 18));
		cd2 = new JMenu("添加/修改记录(A)");cd2.setMnemonic('A');cd2.setFont(new Font(getTitle(), ABORT, 18));
		zcd1 = new JMenuItem("值班日志");
		zcd2 = new JMenuItem("维护记录");
		zcd3 = new JMenuItem("维保单位维护记录");
		zcd4 = new JMenuItem("维护记录");
		zcd5 = new JMenuItem("维保单位维护记录");
		mby = new JPanel();
		mb2 = new JPanel(new BorderLayout());
		jta=new JTextArea();
		jsp =new JScrollPane(jta);
		labeln = new JLabel("年 ");
		labelm = new JLabel("月 ");
		l1 = new JLabel("查询值班记录:");
		jb = new JButton("查询");
		jb.addActionListener(this);
		zcd1.addActionListener(this);
		zcd2.addActionListener(this);
		zcd3.addActionListener(this);
		zcd4.addActionListener(this);
		zcd5.addActionListener(this);
		//-----------------------------------
		Date date=new Date();//获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM");//设置输出格式
		String rq= sdf.format(date);
		String [] arq=rq.split("-");
		Year=Integer.parseInt(arq[0]);
		Month=Integer.parseInt(arq[1]);
		String year00=""+(Year-1);
		String year11=""+(Year+1);

		//----------------------------------
		String [] year ={year00,arq[0],year11};
		jcb=new JComboBox(year);
		jcb.setSelectedIndex(1);
		for(int i=1;i<=12;i++){
			month[i-1]=""+i;
		}
		jcb2=new JComboBox(month);
		jcb2.setSelectedIndex(Month-1);

		cd1.add(zcd1);
		cd1.add(zcd2);
		cd1.add(zcd3);
		cd2.add(zcd4);
		cd2.add(zcd5);

		cdl.add(cd1);cdl.add(cd2);
		mby.add(l1);
		mby.add(jcb);
		mby.add(labeln);
		mby.add(jcb2);
		mby.add(labelm);
		mby.add(jb);


		mb2.add(jsp);
		mb2.add(mby,BorderLayout.NORTH);
		this.add(cdl,BorderLayout.NORTH);
		this.add(mb2);
		this.setTitle("指挥所值班系统");
		this.setVisible(true);
		//this.setResizable(false);
		this.setSize(1000,800);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
