package L5;
import java.awt.*;
import javax.swing.*;
public class Dxfx extends JFrame{
	JButton an1,an2;
	JLabel bq1,bq2,bq3,bq4,bq5,bq6;
	JTextField wbk1,wbk2;
	JPasswordField mmk;
	JPanel mb1,mb2,mb3,mb4,mb5,mb6,mb7,mbA,mbB;
	JCheckBox fxk1=null;
	JCheckBox fxk2=null;
	JCheckBox fxk3=null;
	JRadioButton dxk1,dxk2,dxk3,dxk4,dxk5;
	ButtonGroup dxl1;
	ButtonGroup dxl2;
	public static void main(String[] args){
		new Dxfx();
	}
	Dxfx(){
		bq1=new JLabel("国籍");
		fxk1=new JCheckBox("美国");
		fxk2=new JCheckBox("英国");
		fxk3=new JCheckBox("德国");
		bq2=new JLabel("肤色");
		dxk1=new JRadioButton("白");
		dxk2=new JRadioButton("黄");
		dxk3=new JRadioButton("黑");
		bq3=new JLabel("性别");
		dxk4=new JRadioButton("男");
		dxk5=new JRadioButton("女");
		bq4=new JLabel("年龄");
		wbk1=new JTextField(8);
		bq5=new JLabel("用户名");
		wbk2=new JTextField(8);
		dxl2=new ButtonGroup();
		dxl1=new ButtonGroup();
		bq6=new JLabel("密    码");
		an1=new JButton("登陆");
		an2=new JButton("取消");
		mmk=new JPasswordField(8);
		this.setLayout(new GridLayout(1,2));
		mbA.setLayout(new GridLayout(4,1));
		mbB.setLayout(new GridLayout(3,1));
		
		mb1.add(bq1);mb1.add(fxk1);mb1.add(fxk2);mb1.add(fxk3);
		
		dxl1.add(dxk1);dxl1.add(dxk2);dxl1.add(dxk3);
		mb2.add(bq2);mb2.add(dxk1);mb2.add(dxk2);mb2.add(dxk3);
		
		dxl2.add(dxk4);dxl2.add(dxk5);
		mb3.add(bq3);mb3.add(dxk4);mb3.add(dxk5);
		
		mb4.add(bq4);mb4.add(wbk1);
		mbA.add(mb1);mbA.add(mb2);mbA.add(mb3);mbA.add(mb4);
		mb5.add(bq5);mb5.add(wbk2);
		
		mb6.add(bq6);mb6.add(mmk);
		
		mb7.add(an1);mb7.add(an2);
		
		mbB.add(mb5);mbB.add(mb6);mbB.add(mb7);
		this.add(mbA);this.add(mbB);
		this.setTitle("new 统计系统");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(800,800);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}