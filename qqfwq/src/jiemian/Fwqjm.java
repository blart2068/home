package jiemian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import moshi.*;
public class Fwqjm extends JFrame implements ActionListener,Runnable{
	JButton an1,an2,an3;
	JLabel bq1;
	public static void main(String[]args){
		new Fwqjm();
	}
	public void run(){
		new Fuwu();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==an1){
			Thread xc=new Thread(this);
			xc.start();
			System.out.println("����������");
			bq1.setText("��������������");
			
		}
		if(e.getSource()==an2){
			System.exit(0);
		}
		
	}

	public Fwqjm(){
		bq1=new JLabel("������δ����X");
		an1=new JButton("����������");
		an2=new JButton("�رշ�����");
		an1.addActionListener(this);
		an2.addActionListener(this);
		add(an1);add(an2);
		this.add(bq1);
		this.setLayout(new FlowLayout());
		this.setTitle("���������");
		this.setSize(280,150);
		this.setLocation(420,180);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
