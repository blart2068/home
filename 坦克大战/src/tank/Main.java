package tank;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Main extends JFrame implements ActionListener{//主函数
	Mypanel mb;
	Guanka gk;
	JMenuBar cdl;
	JMenu zcd;
	JMenuItem cda,cdb,cdzt,cdbc,cdzr;
	int gs=1;
	public static void main(String [] args){
		new Main();
	}

	public void actionPerformed(ActionEvent e) {//事件监控
		if(e.getActionCommand().equals("xyx")){//新游戏
			this.remove(gk);
			Thread xc;
			mb=new Mypanel("new",gs);
			xc=new Thread(mb);
			xc.start();
			add(mb);
			addKeyListener(mb);
			setVisible(true);
		}
		if(e.getActionCommand().equals("zt")){//暂停
			mb.yxzt();
			
		}
		if(e.getActionCommand().equals("bc")){//保存
			Tongji.save();
		}
		if(e.getActionCommand().equals("zr")){//载入
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
		if(e.getActionCommand().equals("tc")){//退出
			System.exit(0);
		}

	}

	Main(){//构造方法
		gk=new Guanka();
		cdl=new JMenuBar();
		zcd=new JMenu("游戏(G)");
		cda=new JMenuItem("新游戏(N)");cda.addActionListener(this);cda.setActionCommand("xyx");
		cdzt=new JMenuItem("暂停/继续_游戏(P)");cdzt.addActionListener(this);cdzt.setActionCommand("zt");
		cdbc=new JMenuItem("保存游戏(S)");cdbc.addActionListener(this);cdbc.setActionCommand("bc");
		cdzr=new JMenuItem("载入游戏(L)");cdzr.addActionListener(this);cdzr.setActionCommand("zr");
		cdb=new JMenuItem("退出游戏(X)");cdb.addActionListener(this);cdb.setActionCommand("tc");
		zcd.setMnemonic('G');cda.setMnemonic('N');cdzt.setMnemonic('P');
		cdbc.setMnemonic('S');cdzr.setMnemonic('L');cdb.setMnemonic('x');
		zcd.add(cda);zcd.add(cdzt);zcd.add(cdbc);zcd.add(cdzr);zcd.add(cdb);
		cdl.add(zcd);
		add(cdl,BorderLayout.NORTH);
		add(gk);
		Thread xcgk=new Thread(gk);
		xcgk.start();
		setIconImage(new ImageIcon("src/TK.png").getImage());
		setTitle("坦克大战");
		setSize(1200,725);
		setLocation(222,122);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
