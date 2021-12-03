package L5;
import java.awt.*;
import javax.swing.*;
public class XL extends JFrame{
	JPanel mba,mbb;
	public static void main(String[] args){
		new XL();
	}
	XL(){
		mba=new JPanel();mbb=new JPanel();
		//------------面板A---------------------------
		mba.add(new JLabel("籍贯"));
		String[] gj={"上海","北京","香港","纽约","巴黎"
				,"东京","伦敦","柏林","台北"};
		mba.add(new JComboBox(gj));
		//-------------面板B-------------------------
		mbb.add(new JLabel("职业"));
		String[] zy={"博士","黑客","骑士","杀手","盗贼","野蛮人","妓女"};
		JList tt=new JList(zy);tt.setVisibleRowCount(3);
		mbb.add(new JScrollPane(tt));
		//---------------------------------------------
		this.setLayout(new GridLayout(2,1));
		this.add(mba);this.add(mbb);
		this.setTitle("下拉");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(400,500);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}