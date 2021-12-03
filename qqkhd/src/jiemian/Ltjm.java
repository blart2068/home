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
		an=new JButton("发送");
		mb.add(wbk);mb.add(an);
		an.addActionListener(this);//监听发送按钮
		this.add(gdt);this.add(mb,BorderLayout.SOUTH);
		this.setTitle("(我)"+nc+"在和"+dx+"聊天");
		this.setIconImage(new ImageIcon("image/msr.png").getImage());
		this.setSize(400, 300);
		this.setLocation(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		//--退出响应事件
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//-----------
				String sxx="";
				String ss[]=Gllt.ltck.split(" ");
				for(int i=0;i<ss.length;i++){//退出时删除聊天窗口
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
		wby.append(m.getTime()+"\r\n"+m.getNc()+"说:"+m.getNr()+"\r\n");
	}

	public void actionPerformed(ActionEvent e) {//监听按钮
		if(e.getSource()==an){//监听被按下的按钮
			Message m=new Message();
			m.setXx(MessageSx.wzxx);
			m.setDx(dx);
			m.setNc(nc);
			m.setNr(wbk.getText());
			Date d = new Date();  //时间函数
			String sj = null;  
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			sj = sdf.format(d);
			m.setTime(sj);
			try {
				ObjectOutputStream oos=new ObjectOutputStream(Glxc.getLjfwqxc(nc).getS().getOutputStream());
				oos.writeObject(m);
				wbk.setText("");
				wby.append(m.getTime()+"\r\n"+"我说:"+m.getNr()+"\r\n");
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
