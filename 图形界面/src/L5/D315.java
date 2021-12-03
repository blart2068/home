package L5;
import java.awt.*;
import javax.swing.*;
public class D315 extends JFrame{
	JSplitPane cf;
	public static void main(String[]args){
		new D315();
	}
	D315(){
		String[] lb={"太阳系","银河系","琴女系","三体系"};
		JList lb1=new JList(lb);
		JLabel bq=new JLabel(new ImageIcon("image/yz.jpg"));
		cf=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lb1,bq);
		cf.setOneTouchExpandable(true);
		this.add(cf);
		//this.add();
		//this.add(new JLabel(new ImageIcon("image/yz.jpg")));
		this.setTitle("-*---*-");
		this.setVisible(true);
		//this.setResizable(false);
		this.setSize(900, 650);
		this.setLocation(200,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}