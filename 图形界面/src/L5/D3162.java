package L5;
import java.awt.*;
import javax.swing.*;
public class D3162 extends JFrame{
	JLabel bqb1,bqb2,bqb3,bqb4;//-----������ǩ
	JPanel mbb;
	JPanel mbn;//---�ϲ����
	JButton ann1,ann2,ann3;
	JTabbedPane xxk;//---�в�ѡ�
	JPanel mbz1,mbz2,mbz3;
	JLabel bqz1,bqz2,bqz3,bqz4;
	JButton anz1;
	JTextField wbkz1;
	JPasswordField mmkz1;
	JCheckBox fxkz1,fxkz2;
	public static void main(String[] args){
		new D3162();
	}
	D3162(){
		//---------------����---------------------
		mbb=new JPanel();
		bqb1=new JLabel(new ImageIcon
				("image/tiantiansifangmao-13.png"));
		bqb2=new JLabel(new ImageIcon
				("image/tiantiansifangmao-14.png"));
		bqb3=new JLabel(new ImageIcon
				("image/tiantiansifangmao-15.png"));
		bqb4=new JLabel(new ImageIcon
				("image/tiantiansifangmao-16.png"));
		mbb.add(bqb1);mbb.add(bqb2);mbb.add(bqb3);mbb.add(bqb4);
		//--------------�ϲ�------------------------
		mbn=new JPanel(new GridLayout(1,3,30,13));
		ann1=new JButton(new ImageIcon
				("image/tiantiansifangmao-06.png"));
		ann2=new JButton(new ImageIcon
				("image/tiantiansifangmao-05.png"));
		ann3=new JButton(new ImageIcon
				("image/tiantiansifangmao-03.png"));
		mbn.add(ann1);mbn.add(ann2);mbn.add(ann3);
		//----------------�в�----------------
		xxk=new JTabbedPane();
		mbz1=new JPanel(new GridLayout(3,3));
		mbz2=new JPanel(new GridLayout(3,3));
		mbz3=new JPanel(new GridLayout(3,3));
		mbz2.setBackground(Color.YELLOW);
		mbz3.setBackground(Color.GREEN);
		bqz1=new JLabel("qq����",JLabel.CENTER);
		wbkz1=new JTextField(12);
		anz1=new JButton("�������");
		bqz2=new JLabel("qq����",JLabel.CENTER);
		mmkz1=new JPasswordField(12);
		bqz3=new JLabel("��������",JLabel.CENTER);//----
		bqz3.setFont(new Font("����",Font.PLAIN,18));
		bqz3.setForeground(Color.MAGENTA);
		bqz3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fxkz1=new JCheckBox("�����½");
		fxkz2=new JCheckBox("��ס����");
		bqz4=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
		bqz4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mbz1.add(bqz1);mbz1.add(wbkz1);mbz1.add(anz1);
		mbz1.add(bqz2);mbz1.add(mmkz1);mbz1.add(bqz3);
		mbz1.add(fxkz1);mbz1.add(fxkz2);mbz1.add(bqz4);
		xxk.add("��ͨ�û�",mbz1);xxk.add("��Ա��½",mbz2);
		xxk.add("����Ա��½",mbz3);
		//-------------JFrame---------------------------
		this.add(mbb,BorderLayout.NORTH);
		this.add(xxk);
		this.add(mbn,BorderLayout.SOUTH);
		this.setIconImage(new ImageIcon
				("image/tiantiansifangmao-04.png")
				.getImage());
		this.setTitle("�û���½");
		this.setSize(600, 500);
		this.setLocation(300,200);
		this.setVisible(true);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


