import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.LineListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame implements ActionListener{
	JButton jb;
	Point p=new Point(0, 0);
	public static void main(String[] args) {
		new test();
	}
	public test() {
		jb=new JButton("зјБъ");
		jb.addActionListener(this);
		add(jb);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 400);
		setLocation(100, 100);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		p=getLocation();
		int x=(int)p.getX();
		int y=(int)p.getY();
		
		System.out.println(x+"ssss"+y);
		
	}
}
