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
		//------------���A---------------------------
		mba.add(new JLabel("����"));
		String[] gj={"�Ϻ�","����","���","ŦԼ","����"
				,"����","�׶�","����","̨��"};
		mba.add(new JComboBox(gj));
		//-------------���B-------------------------
		mbb.add(new JLabel("ְҵ"));
		String[] zy={"��ʿ","�ڿ�","��ʿ","ɱ��","����","Ұ����","��Ů"};
		JList tt=new JList(zy);tt.setVisibleRowCount(3);
		mbb.add(new JScrollPane(tt));
		//---------------------------------------------
		this.setLayout(new GridLayout(2,1));
		this.add(mba);this.add(mbb);
		this.setTitle("����");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(400,500);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}