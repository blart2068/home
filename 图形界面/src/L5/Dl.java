package L5;
import java.awt.*;
import javax.swing.*;
public class Dl extends JFrame{
	JButton an1,an2;
	JLabel bq1,bq2;
	JPasswordField mmk;
	JTextField wb;
	JPanel mb1,mb2,mb3;
	public static void main(String[] args){
		new Dl();
	}
	Dl(){
		an1=new JButton();
		an1.setText("登陆");
		an2=new JButton("取消");
		bq1=new JLabel("用户名");
		bq2=new JLabel("密    码");
		mmk=new JPasswordField(12);
		wb=new JTextField(12);
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		mb1.add(bq1);
		mb1.add(wb);
		mb2.add(bq2);
		mb2.add(mmk);
		mb3.add(an1);
		mb3.add(an2);
		this.setLayout(new GridLayout(3,1));
		this.add(mb1);
		this.add(mb2);
		this.add(mb3);
		this.setTitle("用户登陆系统");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(300, 200);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


