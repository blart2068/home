package L5;
import java.awt.*;
import javax.swing.*;
public class D316 extends JFrame{
	JPanel mb1,mb2;
	JLabel bq;
	JTextArea wby;
	JScrollPane gd;
	JComboBox xl;
	JButton an;
	public static void main(String[] args){
		new D316();
	}
	D316(){
		bq=new JLabel(new ImageIcon("image/tiantiansifangmao-06.png"));
		mb1=new JPanel(new GridLayout(1,2));
		mb1.add(bq);
		wby=new JTextArea();
		gd=new JScrollPane(wby);
		mb1.add(gd);
		//---------------------------------------------
		String[] nr={"Îò¿Õ","°Ë½ä","É³É®","ÌÆÉ®"};
		xl=new JComboBox(nr);
		mb2=new JPanel();
		an=new JButton("·¢ËÍ");
		mb2.add(xl);mb2.add(new JTextField(20));mb2.add(an);
		//------------------------------------------
		this.add(mb1);this.add(mb2,BorderLayout.SOUTH);
		this.setTitle("ÁÄÌì´°¿Ú");
		this.setIconImage(new ImageIcon
				("image/tiantiansifangmao-03.png")
				.getImage());
		this.setVisible(true);
		//this.setResizable(false);
		this.setSize(500, 400);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}