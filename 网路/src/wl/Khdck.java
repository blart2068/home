package wl;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
public class Khdck extends JFrame implements ActionListener{
	JButton an;
	JTextField wbk;
	JTextArea wby;
	ScrollPane gdt;
	JPanel mb;
	PrintWriter pw=null;
	public static void main(String[] args){
		new Khdck();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("fs")){
			String aa=wbk.getText();
			wby.append("我:"+aa+"\n\r");
			pw.println(aa);
			wbk.setText("");
		}
		
	}
	public Khdck() {
		mb=new JPanel();
		wbk=new JTextField(20);
		wby=new JTextArea();
		an=new JButton("发送");
		gdt=new ScrollPane();
		
		an.addActionListener(this);
		an.setActionCommand("fs");
		
		gdt.add(wby);mb.add(wbk);mb.add(an);
		this.add(gdt);this.add(mb,BorderLayout.SOUTH);
		setTitle("客户端");
		setSize(400,300);
		setLocation(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//--------------网路--------------------
		try{
			Socket s=new Socket("127.0.0.1",9999);
			pw=new PrintWriter(s.getOutputStream(),true);
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			while(true){
				wby.append("服务器:"+br.readLine()+"\n\r");
			}
			
		}catch(Exception e){}
		
	}
	
}
