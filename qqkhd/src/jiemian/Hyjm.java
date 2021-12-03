package jiemian;
import javax.swing.*;

import gongju.Gllt;
import gongju.Yinyue;

import java.awt.*;
import java.awt.event.*;import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
public class Hyjm extends JFrame implements ActionListener,MouseListener{
	JButton an1,an2,an3,ana,anb,anc,anx,any,anz;
	JScrollPane gdt1,gdt2,gdt3;
	JPanel mb1,mb2,mba,mbb,mbx,mby,mbhy,mbmsr,mbhmd;
	JLabel[] bqs,bqsa,bqsx;
	CardLayout cl;//显示容器
	String nc;

	public Hyjm(String nc){
		this.nc=nc;
		bqs=new JLabel[30];bqsa=new JLabel[10];bqsx=new JLabel[5];
		mb1=new JPanel(new GridLayout(2, 1));mba=new JPanel(new GridLayout(2, 1));
		mbx=new JPanel(new GridLayout(2, 1));
		mb2=new JPanel(new GridLayout(bqs.length, 1));mbb=new JPanel(new GridLayout(bqsa.length+5, 1));
		mby=new JPanel(new GridLayout(bqsx.length+10, 1));
		mbhy=new JPanel(new BorderLayout());mbmsr=new JPanel(new BorderLayout());
		mbhmd=new JPanel(new BorderLayout());
		an1=new JButton("我的好友");ana=new JButton("我的好友");anx=new JButton("我的好友");
		an2=new JButton("陌生人");anb=new JButton("陌生人");any=new JButton("陌生人");
		an3=new JButton("黑名单");anc=new JButton("黑名单");anz=new JButton("黑名单");
		cl=new CardLayout();
		for(int i=0;i<bqs.length;i++){//------好友
			bqs[i]=new JLabel("00"+(i+1),new ImageIcon("image/cat.png"),JLabel.LEFT);
			bqs[i].setEnabled(false);
			mb2.add(bqs[i]);
			bqs[i].addMouseListener(this);//添加鼠标监听
		}
		for(int i=0;i<bqsa.length;i++){//--------陌生人
			bqsa[i]=new JLabel("00"+(i+1),new ImageIcon("image/dog.png"),JLabel.LEFT);
			bqsa[i].setEnabled(true);
			mbb.add(bqsa[i]);
			bqsa[i].addMouseListener(this);
		}
		for(int i=0;i<bqsx.length;i++){//--------黑名单
			bqsx[i]=new JLabel("00"+(i+1),new ImageIcon("image/msr.png"),JLabel.LEFT);
			bqsx[i].setEnabled(true);
			mby.add(bqsx[i]);
			bqsx[i].addMouseListener(this);
		}
		
		gdt1=new JScrollPane(mb2);gdt2=new JScrollPane(mbb);gdt3=new JScrollPane(mby);
		
		mb1.add(an2);mb1.add(an3);mba.add(ana);mba.add(anc);
		mbx.add(anx);mbx.add(any);
		//---监听*------------
		an2.addActionListener(this);an3.addActionListener(this);
		an2.setActionCommand("msr");an3.setActionCommand("hmd");
		ana.addActionListener(this);anc.addActionListener(this);
		ana.setActionCommand("wdhy");anc.setActionCommand("hmd");
		anx.addActionListener(this);any.addActionListener(this);
		anx.setActionCommand("wdhy");any.setActionCommand("msr");
		//-------本地添加----------------------
		mbhy.add(mb1,BorderLayout.SOUTH);mbmsr.add(mba,BorderLayout.SOUTH);
		mbhmd.add(mbx,BorderLayout.SOUTH);
		mbhy.add(an1,BorderLayout.NORTH);mbmsr.add(anb,BorderLayout.NORTH);
		mbhmd.add(anz,BorderLayout.NORTH);
		mbhy.add(gdt1);mbmsr.add(gdt2);mbhmd.add(gdt3);
		this.setLayout(cl);//显示容器
		this.add(mbhy,"hy");//添加面板 赋值
		this.add(mbmsr,"msr");
		this.add(mbhmd,"hmd");
		this.setTitle(nc);
		this.setIconImage(new ImageIcon("image/msr.png").getImage());
		this.setSize(240, 600);
		this.setLocation(1200,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showHy(String sss[]){//显示好友页面
		for(int j=0;j<bqs.length;j++){//默认全部变黑
			bqs[j].setEnabled(false);
		}
		for(int i=0;i<sss.length;i++){//刷新变亮
			for(int j=0;j<bqs.length;j++){
				if(sss[i].equals(bqs[j].getText())){
					bqs[j].setEnabled(true);
					new Yinyue("src/qqsx.wav",false).start();
				}
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {//控件监听
		String zl=e.getActionCommand();
		if(zl.equals("msr")){
			cl.show(this.getContentPane(),"msr");
		}
		if(zl.equals("wdhy")){
			cl.show(this.getContentPane(), "hy");
		}
		if(zl.equals("hmd")){
			cl.show(this.getContentPane(), "hmd");
		}
	}
	
	public void mouseClicked(MouseEvent e) {//监听鼠标点击
		if(e.getClickCount()==2){//双击
			String dx=((JLabel)e.getSource()).getText();//获得聊天对象
			Ltjm lt=new Ltjm(dx,nc);
			System.out.println(dx+"   "+nc);
			Gllt.ltck+=dx+nc+" ";
			Gllt.addLtjm(dx, lt);
		}
		
	}

	public void mouseEntered(MouseEvent e) {
		((JLabel)e.getSource()).setForeground(Color.RED);//鼠标移到到组件时变成红色
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		((JLabel)e.getSource()).setForeground(Color.BLACK);//鼠标离开组件时变成黑色
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
	
	
}
