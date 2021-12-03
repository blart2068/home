package L5;
import java.awt.*;
import javax.swing.*;
public class D314 extends JFrame{
	JPanel mba,mbb,mb1,mb2,mb3,mb4,mb5,mb6,mb7;
	JLabel bq1,bq2,bq3,bq4,bq5,bq6;
	JCheckBox fxk1,fxk2,fxk3;
	JRadioButton dxk1,dxk2,dxk3,dxk4,dxk5;
	JTextField wbk1,wbk2;
	JPasswordField mmk;
	JButton an1,an2,an3,an4;
	ButtonGroup dxl1,dxl2;
	public static void main(String[] args){
		new D314();
	}
	D314(){
		an1=new JButton("11111");an2=new JButton("2222");
		an3=new JButton("33333");an4=new JButton("4444");
		mba=new JPanel(new GridLayout(4,1));
		mbb=new JPanel(new GridLayout(3,1));
		mb1=new JPanel();//-------------面板1
		bq1=new JLabel("国籍：");
		fxk1=new JCheckBox("美国");
		fxk2=new JCheckBox("英国");
		fxk3=new JCheckBox("法国");
		mb1.add(bq1);mb1.add(fxk1);mb1.add(fxk2);mb1.add(fxk3);
		mb2=new JPanel();//---------------面板2
		bq2=new JLabel("肤色：");
		dxk1=new JRadioButton("白");
		dxk2=new JRadioButton("黄");
		dxk3=new JRadioButton("黑");
		dxl1=new ButtonGroup();
		dxl1.add(dxk1);dxl1.add(dxk2);dxl1.add(dxk3);
		mb2.add(bq2);mb2.add(dxk1);mb2.add(dxk2);mb2.add(dxk3);
		mb3=new JPanel();//----------------面板3
		bq3=new JLabel("性别：");
		dxk4=new JRadioButton("男");
		dxk5=new JRadioButton("女");
		dxl2=new ButtonGroup();
		dxl2.add(dxk4);dxl2.add(dxk5);
		mb3.add(bq3);mb3.add(dxk4);mb3.add(dxk5);
		mb4=new JPanel();//----------------面板4
		bq4=new JLabel("年龄：");
		wbk1=new JTextField(10);
		mb4.add(bq4);mb4.add(wbk1);
		mba.add(mb1);mba.add(mb2);mba.add(mb3);mba.add(mb4);
		mb5=new JPanel();//----------------面板5
		bq5=new JLabel("用户名：");
		wbk2=new JTextField(10);
		mb5.add(bq5);mb5.add(wbk2);
		mb6=new JPanel();//---------------面板6
		bq6=new JLabel("密    码：");
		mmk=new JPasswordField(10);
		mb6.add(bq6);mb6.add(mmk);
		mb7=new JPanel(new GridLayout(2,1));//-----------面板7
		an1=new JButton("登            陆");
		an2=new JButton("取            消");
		mb7.add(an1);mb7.add(an2);
		mbb.add(mb5);mbb.add(mb6);mbb.add(mb7);
		this.add(mba);this.add(mbb);
		this.setLayout(new GridLayout(1,2,12,13));
		this.setTitle("---特工过滤系统---");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(450,200);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}