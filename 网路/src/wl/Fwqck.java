package wl;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
public class Fwqck extends JFrame implements ActionListener{
	JButton an;
	JTextField wbk;
	JTextArea wby;
	ScrollPane gdt;
	JPanel mb;
	 
	PrintWriter pr=null;
	public static void main(String[] args){
		new Fwqck();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("fs")){
			String aa=wbk.getText();
			wby.append("��:"+aa+"\n\r");
			pr.println(aa);
			wbk.setText("");
		}
		
	}
	public Fwqck() {
		mb=new JPanel();
		wbk=new JTextField(20);
		wby=new JTextArea();
		an=new JButton("����");
		gdt=new ScrollPane();
		
		an.addActionListener(this);
		an.setActionCommand("fs");
		
		gdt.add(wby);mb.add(wbk);mb.add(an);
		this.add(gdt);this.add(mb,BorderLayout.SOUTH);
		setTitle("������");
		setSize(400,300);
		setLocation(200,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//--------��·------------------------
		try {
			ServerSocket ss=new ServerSocket(9999);
			Socket s=ss.accept();
			pr=new PrintWriter(s.getOutputStream(),true);
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			while(true){
				wby.append("�ͻ�˵:"+br.readLine()+"\n\r");
			}
			
		} catch (Exception e) {}
		
		
	}
	
}
