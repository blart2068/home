package jiemian;
import javax.swing.*;
import java.io.*;
import gonggong.*;
import moxing.*;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import gongju.*;

public class Ltjm extends JFrame implements ActionListener,KeyListener{
	JTextArea wby;
	JScrollPane gdt;
	JPanel mb;
	JTextField wbk;
	JButton an;
	String dx,nc;
	String dc;

	public Ltjm(String dx,String nc){
		this.dx=dx;this.nc=nc;
		dc=dx+nc;
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		mb=new JPanel();
		wbk=new JTextField(20);
		an=new JButton("����");
		mb.add(wbk);mb.add(an);
		an.addActionListener(this);//�������Ͱ�ť
		this.add(gdt);this.add(mb,BorderLayout.SOUTH);
		this.setTitle("(��)"+nc+"�ں�"+dx+"����");
		this.setIconImage(new ImageIcon("image/msr.png").getImage());
		this.setSize(400, 300);
		this.setLocation(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		//--�˳���Ӧ�¼�
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//-----------
				String sxx="";
				String ss[]=Gllt.ltck.split(" ");
				for(int i=0;i<ss.length;i++){//�˳�ʱɾ�����촰��
					if(!dc.equals(ss[i])){
						sxx+=ss[i]+" ";
					}
				}
				Gllt.ltck=sxx;
				System.out.println(Gllt.ltck);
			}
		});
	}
	public void showMg(Message m){
		wby.append(m.getTime()+"\r\n"+m.getNc()+"˵:"+m.getNr()+"\r\n");
	}

	public void actionPerformed(ActionEvent e) {//������ť
		if(e.getSource()==an){//���������µİ�ť
			Message m=new Message();
			m.setXx(MessageSx.wzxx);
			m.setDx(dx);
			m.setNc(nc);
			m.setNr(wbk.getText());
			Date d = new Date();  //ʱ�亯��
			String sj = null;  
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			sj = sdf.format(d);
			m.setTime(sj);
			try {
				ObjectOutputStream oos=new ObjectOutputStream(Glxc.getLjfwqxc(nc).getS().getOutputStream());
				oos.writeObject(m);
				wbk.setText("");
				wby.append(m.getTime()+"\r\n"+"��˵:"+m.getNr()+"\r\n");
			} catch (Exception e2) {}
			System.out.println(new Date().toString());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

}
