package tank;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Main extends JFrame implements ActionListener{//������
	Mypanel mb;
	Guanka gk;
	JMenuBar cdl;
	JMenu zcd;
	JMenuItem cda,cdb,cdzt,cdbc,cdzr;
	int gs=1;
	public static void main(String [] args){
		new Main();
	}

	public void actionPerformed(ActionEvent e) {//�¼����
		if(e.getActionCommand().equals("xyx")){//����Ϸ
			this.remove(gk);
			Thread xc;
			mb=new Mypanel("new",gs);
			xc=new Thread(mb);
			xc.start();
			add(mb);
			addKeyListener(mb);
			setVisible(true);
		}
		if(e.getActionCommand().equals("zt")){//��ͣ
			mb.yxzt();
			
		}
		if(e.getActionCommand().equals("bc")){//����
			Tongji.save();
		}
		if(e.getActionCommand().equals("zr")){//����
			Tongji.land();
			this.remove(gk);
			Thread xc;
			mb=new Mypanel("land",gs);
			xc=new Thread(mb);
			xc.start();
			add(mb);
			addKeyListener(mb);
			setVisible(true);
			Mypanel.js=0;
		}
		if(e.getActionCommand().equals("tc")){//�˳�
			System.exit(0);
		}

	}

	Main(){//���췽��
		gk=new Guanka();
		cdl=new JMenuBar();
		zcd=new JMenu("��Ϸ(G)");
		cda=new JMenuItem("����Ϸ(N)");cda.addActionListener(this);cda.setActionCommand("xyx");
		cdzt=new JMenuItem("��ͣ/����_��Ϸ(P)");cdzt.addActionListener(this);cdzt.setActionCommand("zt");
		cdbc=new JMenuItem("������Ϸ(S)");cdbc.addActionListener(this);cdbc.setActionCommand("bc");
		cdzr=new JMenuItem("������Ϸ(L)");cdzr.addActionListener(this);cdzr.setActionCommand("zr");
		cdb=new JMenuItem("�˳���Ϸ(X)");cdb.addActionListener(this);cdb.setActionCommand("tc");
		zcd.setMnemonic('G');cda.setMnemonic('N');cdzt.setMnemonic('P');
		cdbc.setMnemonic('S');cdzr.setMnemonic('L');cdb.setMnemonic('x');
		zcd.add(cda);zcd.add(cdzt);zcd.add(cdbc);zcd.add(cdzr);zcd.add(cdb);
		cdl.add(zcd);
		add(cdl,BorderLayout.NORTH);
		add(gk);
		Thread xcgk=new Thread(gk);
		xcgk.start();
		setIconImage(new ImageIcon("src/TK.png").getImage());
		setTitle("̹�˴�ս");
		setSize(1200,725);
		setLocation(222,122);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
