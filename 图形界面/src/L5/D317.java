package L5;
import java.awt.*;
import javax.swing.*;
public class D317 extends JFrame{
	JPanel mb1;
	JMenuBar cdl;//---------�˵���-------------------
	JMenu wj,bj,gs,ck,bz,xj;//----���˵�
	JMenuItem dk,bc,lcw,ymsz,dy,tc,wb,tp;//--�Ӳ˵�
	JToolBar gjl;//----������--------------------------
	JButton anxj,andk,anbc,anjq,anfz,annt;
	JScrollPane gdt;//-----������-------------
	JTextArea wby;
	public static void main(String[] args){
		new D317();
	}
	D317(){
		mb1=new JPanel(new BorderLayout());
		//---------------�˵���----------------------------
		cdl=new JMenuBar();
		wj=new JMenu("�ļ�(F)");wj.setMnemonic('F');
		bj=new JMenu("�༭(E)");bj.setMnemonic('E');
		gs=new JMenu("��ʽ(O)");gs.setMnemonic('O');
		ck=new JMenu("�鿴(V)");ck.setMnemonic('V');
		bz=new JMenu("����(H)");bz.setMnemonic('H');
		xj=new JMenu("�½�(N)");xj.setMnemonic('N');
		tp=new JMenuItem("ͼ��(T)",new ImageIcon
				("image/tiantiansifangmao-01.png"));
		tp.setMnemonic('T');
		wb=new JMenuItem("�ı�(W)",new ImageIcon
				("image/tiantiansifangmao-02.png"));
		wb.setMnemonic('W');
		dk=new JMenuItem("��(O)",new ImageIcon
				("image/tiantiansifangmao-03.png"));
		dk.setMnemonic('O');
		bc=new JMenuItem("����(S)",new ImageIcon
				("image/tiantiansifangmao-04.png"));
		bc.setMnemonic('S');
		lcw=new JMenuItem("���Ϊ(A)",new ImageIcon
				("image/tiantiansifangmao-05.png"));
		lcw.setMnemonic('A');
		ymsz=new JMenuItem("ҳ������(U)",new ImageIcon
				("image/tiantiansifangmao-06.png"));
		ymsz.setMnemonic('U');
		dy=new JMenuItem("��ӡ(P)",new ImageIcon
				("image/tiantiansifangmao-07.png"));
		dy.setMnemonic('P');
		tc=new JMenuItem("�˳�(X)",new ImageIcon
				("image/tiantiansifangmao-08.png"));
		xj.add(tp);xj.add(wb);
		wj.add(xj);wj.add(dk);wj.add(bc);wj.add(lcw);
		wj.addSeparator();
		wj.add(ymsz);wj.add(dy);
		wj.addSeparator();
		wj.add(tc);
		cdl.add(wj);cdl.add(bj);cdl.add(gs);cdl.add(ck);cdl.add(bz);
		//-------------------������----------------------------
		gjl=new JToolBar();
		anxj=new JButton(new ImageIcon
				("image/tiantiansifangmao-09.png"));
		anxj.setToolTipText("�½�");
		andk=new JButton(new ImageIcon
				("image/tiantiansifangmao-10.png"));
		andk.setToolTipText("��");
		anbc=new JButton(new ImageIcon
				("image/tiantiansifangmao-11.png"));
		anbc.setToolTipText("����");
		anjq=new JButton(new ImageIcon
				("image/tiantiansifangmao-12.png"));
		anjq.setToolTipText("����");
		anfz=new JButton(new ImageIcon
				("image/tiantiansifangmao-13.png"));
		anfz.setToolTipText("����");
		annt=new JButton(new ImageIcon
				("image/tiantiansifangmao-14.png"));
		annt.setToolTipText("���");		
		gjl.add(anxj);gjl.add(andk);gjl.add(anbc);gjl.add(anjq);
		gjl.add(anfz);gjl.add(annt);
		//------------------�ı���-------------------------
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		//--------------------THIS------------------------
		mb1.add(gdt);mb1.add(gjl,BorderLayout.NORTH);
		this.add(cdl,BorderLayout.NORTH);
		this.add(mb1);
		this.setIconImage(new ImageIcon
				("image/tiantiansifangmao-03.png").getImage());
		this.setTitle("���±�");
		this.setVisible(true);
		//this.setResizable(false);
		this.setSize(900, 800);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}




