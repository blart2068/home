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
	public static void main(String args[]){//������

		new Zbjm();
	}


	public void actionPerformed(ActionEvent e) {//����
		if (e.getSource().equals(zcd1)) {//��ѯά����¼
			lx=1;
			l1.setText("��ѯֵ���¼:");


		}

		if (e.getSource().equals(zcd2)) {//��ѯά����¼
			lx=2;
			l1.setText("��ѯά����¼:");


		}
		if (e.getSource().equals(zcd3)) {//��ѯά����λά����¼
			lx=3;
			l1.setText("��ѯά����λά����¼:");


		}

		if (e.getSource().equals(zcd4)) {//�޸�/���ά����¼
			lx=4;
			l1.setText("�޸�/���ά����¼:");


		}
		if (e.getSource().equals(zcd5)) {//�޸�/���ά����λά����¼
			lx=5;
			l1.setText("�޸�/���ά����λά����¼:");


		}

		if (e.getSource().equals(jb)) {//ȷ����ѯֵ���
			String year111=(String)jcb.getSelectedItem();
			String month222=(String)jcb2.getSelectedItem();
			String biaoti="ʱ��:"+year111+"��"+month222+"��\n";
			String fgx = "\n--------------------------------------\n";
			if (lx==1) {//��ѯֵ���
				jisun.js(Integer.parseInt(year111), Integer.parseInt(month222));
				jta.append(jisun.zbb);
				jisun.zbb="\n\n";

			}
			if(lx==2){//��ѯά����¼
				String lj = "D:/222ָ�������ݿ�/wh"+year111+month222+".txt";
				String nr=SJK.dqjl(lj);

				if(nr.equals("")){
					jta.setText(biaoti+"�޼�¼"+fgx);

				}else{
					jta.setText(biaoti+nr+fgx);
				}
			}
			if(lx==3){//��ѯά����λ��¼
				String lj = "D:/222ָ�������ݿ�/wbdw"+year111+month222+".txt";
				String nr=SJK.dqjl(lj);

				if(nr.equals("")){
					jta.setText(biaoti+"�޼�¼"+fgx);

				}else{
					jta.setText(biaoti+nr+fgx);
				}
			}

		}
		jta.setFont(new Font(getTitle(), ABORT, 22));
		jta.setCaretPosition(jta.getText().length());//���λ��
	}

	public Zbjm() {//����
		cdl = new JMenuBar();
		cd1 = new JMenu("��ѯ��¼(C)");cd1.setMnemonic('C');cd1.setFont(new Font(getTitle(), ABORT, 18));
		cd2 = new JMenu("���/�޸ļ�¼(A)");cd2.setMnemonic('A');cd2.setFont(new Font(getTitle(), ABORT, 18));
		zcd1 = new JMenuItem("ֵ����־");
		zcd2 = new JMenuItem("ά����¼");
		zcd3 = new JMenuItem("ά����λά����¼");
		zcd4 = new JMenuItem("ά����¼");
		zcd5 = new JMenuItem("ά����λά����¼");
		mby = new JPanel();
		mb2 = new JPanel(new BorderLayout());
		jta=new JTextArea();
		jsp =new JScrollPane(jta);
		labeln = new JLabel("�� ");
		labelm = new JLabel("�� ");
		l1 = new JLabel("��ѯֵ���¼:");
		jb = new JButton("��ѯ");
		jb.addActionListener(this);
		zcd1.addActionListener(this);
		zcd2.addActionListener(this);
		zcd3.addActionListener(this);
		zcd4.addActionListener(this);
		zcd5.addActionListener(this);
		//-----------------------------------
		Date date=new Date();//��ȡ��ǰʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM");//���������ʽ
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
		this.setTitle("ָ����ֵ��ϵͳ");
		this.setVisible(true);
		//this.setResizable(false);
		this.setSize(1000,800);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
