package blart;




import java.awt.GridLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class jp extends JFrame implements ActionListener{
	static JPanel mb;
	static  JButton j7,j8,j9,j4,j3,j2,j5,j6,j1,j0,jd,jent;
	static Robot r ;
	public static void main(String[] args) {
		new jp();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==j0) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			r.keyPress(KeyEvent.VK_0);
			r.keyRelease(KeyEvent.VK_0);
			
			System.out.println("aaa");
		}
		
	}



	public jp() {
		try {
			r=new Robot();
		} catch (Exception e) {
			// TODO: handle exception
		}
		mb=new JPanel(new GridLayout(4,3));
		mb.add(j7=new JButton("7"));
		mb.add(j8=new JButton("8"));
		mb.add(j9=new JButton("9"));
		mb.add(j4=new JButton("4"));
		mb.add(j5=new JButton("5"));
		mb.add(j6=new JButton("6"));
		mb.add(j1=new JButton("1"));
		mb.add(j2=new JButton("2"));
		mb.add(j3=new JButton("3"));
		mb.add(j0=new JButton("0"));
		mb.add(jd=new JButton("."));
		mb.add(jent=new JButton("ENT"));
		j0.addActionListener(this);
		
		add(mb);
		this.setTitle("虚拟键盘");
		this.setSize(300, 300);
		this.setVisible(true);
		//this.setResizable(false);
		this.setLocation(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
