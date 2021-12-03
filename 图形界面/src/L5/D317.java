package L5;
import java.awt.*;
import javax.swing.*;
public class D317 extends JFrame{
	JPanel mb1;
	JMenuBar cdl;//---------菜单栏-------------------
	JMenu wj,bj,gs,ck,bz,xj;//----父菜单
	JMenuItem dk,bc,lcw,ymsz,dy,tc,wb,tp;//--子菜单
	JToolBar gjl;//----工具栏--------------------------
	JButton anxj,andk,anbc,anjq,anfz,annt;
	JScrollPane gdt;//-----滚动条-------------
	JTextArea wby;
	public static void main(String[] args){
		new D317();
	}
	D317(){
		mb1=new JPanel(new BorderLayout());
		//---------------菜单栏----------------------------
		cdl=new JMenuBar();
		wj=new JMenu("文件(F)");wj.setMnemonic('F');
		bj=new JMenu("编辑(E)");bj.setMnemonic('E');
		gs=new JMenu("格式(O)");gs.setMnemonic('O');
		ck=new JMenu("查看(V)");ck.setMnemonic('V');
		bz=new JMenu("帮助(H)");bz.setMnemonic('H');
		xj=new JMenu("新建(N)");xj.setMnemonic('N');
		tp=new JMenuItem("图文(T)",new ImageIcon
				("image/tiantiansifangmao-01.png"));
		tp.setMnemonic('T');
		wb=new JMenuItem("文本(W)",new ImageIcon
				("image/tiantiansifangmao-02.png"));
		wb.setMnemonic('W');
		dk=new JMenuItem("打开(O)",new ImageIcon
				("image/tiantiansifangmao-03.png"));
		dk.setMnemonic('O');
		bc=new JMenuItem("保存(S)",new ImageIcon
				("image/tiantiansifangmao-04.png"));
		bc.setMnemonic('S');
		lcw=new JMenuItem("另存为(A)",new ImageIcon
				("image/tiantiansifangmao-05.png"));
		lcw.setMnemonic('A');
		ymsz=new JMenuItem("页面设置(U)",new ImageIcon
				("image/tiantiansifangmao-06.png"));
		ymsz.setMnemonic('U');
		dy=new JMenuItem("打印(P)",new ImageIcon
				("image/tiantiansifangmao-07.png"));
		dy.setMnemonic('P');
		tc=new JMenuItem("退出(X)",new ImageIcon
				("image/tiantiansifangmao-08.png"));
		xj.add(tp);xj.add(wb);
		wj.add(xj);wj.add(dk);wj.add(bc);wj.add(lcw);
		wj.addSeparator();
		wj.add(ymsz);wj.add(dy);
		wj.addSeparator();
		wj.add(tc);
		cdl.add(wj);cdl.add(bj);cdl.add(gs);cdl.add(ck);cdl.add(bz);
		//-------------------工具栏----------------------------
		gjl=new JToolBar();
		anxj=new JButton(new ImageIcon
				("image/tiantiansifangmao-09.png"));
		anxj.setToolTipText("新建");
		andk=new JButton(new ImageIcon
				("image/tiantiansifangmao-10.png"));
		andk.setToolTipText("打开");
		anbc=new JButton(new ImageIcon
				("image/tiantiansifangmao-11.png"));
		anbc.setToolTipText("保存");
		anjq=new JButton(new ImageIcon
				("image/tiantiansifangmao-12.png"));
		anjq.setToolTipText("剪切");
		anfz=new JButton(new ImageIcon
				("image/tiantiansifangmao-13.png"));
		anfz.setToolTipText("复制");
		annt=new JButton(new ImageIcon
				("image/tiantiansifangmao-14.png"));
		annt.setToolTipText("黏贴");		
		gjl.add(anxj);gjl.add(andk);gjl.add(anbc);gjl.add(anjq);
		gjl.add(anfz);gjl.add(annt);
		//------------------文本于-------------------------
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		//--------------------THIS------------------------
		mb1.add(gdt);mb1.add(gjl,BorderLayout.NORTH);
		this.add(cdl,BorderLayout.NORTH);
		this.add(mb1);
		this.setIconImage(new ImageIcon
				("image/tiantiansifangmao-03.png").getImage());
		this.setTitle("记事本");
		this.setVisible(true);
		//this.setResizable(false);
		this.setSize(900, 800);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}




