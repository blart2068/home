package L5;
import java.awt.*;
import javax.swing.*;
public class Mb1 extends JFrame{
	JButton an1,an2,an3,an4,an5,an6,an7,an8;
	JPanel mb1,mb2,mb3;
	public static void main(String[] args){
		new Mb1();
	}
	Mb1(){
		an1=new JButton("����");
		an2=new JButton("�й�");
		an3=new JButton("�ձ�");
		an4=new JButton("Ӣ��");
		an5=new JButton("����˹");
		an6=new JButton("����");
		an7=new JButton("�¹�");
		an8=new JButton("̨��");
		mb1=new JPanel();
		mb1.add(an1);
		mb1.add(an2);
		mb2=new JPanel(new GridLayout(2,2,12,13));
		mb2.add(an3);
		mb2.add(an4);
		mb2.add(an5);
		mb2.add(an6);
		mb3=new JPanel(new BorderLayout());
		mb3.add(an7,BorderLayout.EAST);
		mb3.add(an8,BorderLayout.WEST);
		this.setLayout(new BorderLayout());
		this.setTitle("�ۺ����");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(600, 500);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(mb3,BorderLayout.SOUTH);
		this.add(mb2,BorderLayout.CENTER);
		this.add(mb1,BorderLayout.NORTH);
		
		
	}
}