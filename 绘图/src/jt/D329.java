package jt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class mb29 extends JPanel implements ActionListener{//���
	JTextArea wbk;
	JScrollPane gdt;
	String lj=null;
	mb29(){
		wbk=new JTextArea();
		gdt=new JScrollPane(wbk);
		this.setLayout(new BorderLayout());
		this.add(gdt);
	}


	public void actionPerformed(ActionEvent e) {//����
		if(e.getActionCommand().equals("dk")){
			JFileChooser dk=new JFileChooser();
			dk.setVisible(true);
			dk.setDialogTitle("��");
			dk.showOpenDialog(null);
			lj=dk.getSelectedFile().getAbsolutePath();
			System.out.println(lj);
			try {
				FileReader dq=new FileReader(lj);
				BufferedReader hc=new BufferedReader(dq);
				String nr="",jl="";
				char jj=0;
				while(hc.readLine()!=null){
					jl=hc.readLine();
					System.out.println(jl);
					nr+=jl+"\n";
				}
				wbk.setText(nr);
				dq.close();
				dq.close();
			} catch (Exception e2) {
				System.exit(-1);
			}
		}else if(e.getActionCommand().equals("bc")){
//			JFileChooser bc=new JFileChooser();
//			bc.showSaveDialog(null);
//			bc.setDialogTitle("����");
//			bc.setVisible(true);
			try {
				PrintStream xr=new PrintStream(lj);
				System.setOut(xr);
				System.out.println(this.wbk.getText());
				xr.close();
				
			} catch (Exception e2) {
			
			}
			System.out.println("����");
		}else if(e.getActionCommand().equals("lcw")){
			JFileChooser lcw=new JFileChooser();
			lcw.showSaveDialog(null);
			lcw.setDialogTitle("����");
			lcw.setVisible(true);
			String lj2=lcw.getSelectedFile().getAbsolutePath();
			try {
				PrintStream sc=new PrintStream(lj2);
				System.setOut(sc);
				System.out.println(this.wbk.getText());
				sc.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		this.repaint();
	}

}

public class D329 extends JFrame{//������
	JMenuBar cdl;
	JMenu tu,wj;
	JMenuItem dk,bj,bc,lcw;
	mb29 mb;

	public static void main(String[] args){//main
		new D329();
	}


	D329(){
		//------------------------�ؼ�����------------------
		cdl=new JMenuBar();mb=new mb29();
		tu=new JMenu("�ļ�(W)");wj=new JMenu("ͼƬ(P)");
		dk=new JMenuItem("��(D)",new ImageIcon("src/jt/��.png"));
		bj=new JMenuItem("�༭(E)",new ImageIcon("src/jt/�༭.png"));
		bc=new JMenuItem("����(S)",new ImageIcon("src/jt/����.png"));
		lcw=new JMenuItem("�ļ����Ϊ(L)",new ImageIcon("src/jt/���Ϊ.png"));
		tu.setMnemonic('W');wj.setMnemonic('P');
		dk.setMnemonic('D');bj.setMnemonic('E');
		bc.setMnemonic('S');lcw.setMnemonic('L');
		//--------����-------------------------------------------
		dk.addActionListener(mb);dk.setActionCommand("dk");
		bj.addActionListener(mb);bj.setActionCommand("dk");
		bc.addActionListener(mb);bc.setActionCommand("bc");
		lcw.addActionListener(mb);lcw.setActionCommand("lcw");
		//----------add-----------------------------------


		tu.add(dk);tu.add(bj);tu.add(bc);tu.add(lcw);
		cdl.add(tu);cdl.add(wj);
		this.add(cdl,BorderLayout.NORTH);
		this.add(mb);
		this.setTitle("ͼƬ����");
		this.setIconImage(new ImageIcon("src/jt/�ļ�.png").getImage());
		this.setSize(600, 600);
		this.setLocation(222,222);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
