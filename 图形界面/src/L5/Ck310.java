package L5;

import java.awt.*;
import javax.swing.*;

public class Ck310 extends JFrame{
	JButton an1,an2,an3,an4,an5;
	public static void main(String[] args){
		new Ck310();
	}
	Ck310(){
		an1=new JButton();
		an2=new JButton();
		an3=new JButton();
		an4=new JButton();
		an5=new JButton();
		an1.setText("ÉÏ");
		an2.setText("ÏÂ");
		an3.setText("×ó");
		an4.setText("ÓÒ");
		an5.setText("ÖÐ");
		this.setTitle("Î§Æå");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		this.setLocation(300,200);
		this.add(an1,BorderLayout.NORTH);
		this.add(an2,BorderLayout.SOUTH);
		this.add(an3,BorderLayout.WEST);
		this.add(an4,BorderLayout.EAST);
		this.add(an5,BorderLayout.CENTER);
		
	}
}



