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
		mb1=new JPanel();//-------------���1
		bq1=new JLabel("������");
		fxk1=new JCheckBox("����");
		fxk2=new JCheckBox("Ӣ��");
		fxk3=new JCheckBox("����");
		mb1.add(bq1);mb1.add(fxk1);mb1.add(fxk2);mb1.add(fxk3);
		mb2=new JPanel();//---------------���2
		bq2=new JLabel("��ɫ��");
		dxk1=new JRadioButton("��");
		dxk2=new JRadioButton("��");
		dxk3=new JRadioButton("��");
		dxl1=new ButtonGroup();
		dxl1.add(dxk1);dxl1.add(dxk2);dxl1.add(dxk3);
		mb2.add(bq2);mb2.add(dxk1);mb2.add(dxk2);mb2.add(dxk3);
		mb3=new JPanel();//----------------���3
		bq3=new JLabel("�Ա�");
		dxk4=new JRadioButton("��");
		dxk5=new JRadioButton("Ů");
		dxl2=new ButtonGroup();
		dxl2.add(dxk4);dxl2.add(dxk5);
		mb3.add(bq3);mb3.add(dxk4);mb3.add(dxk5);
		mb4=new JPanel();//----------------���4
		bq4=new JLabel("���䣺");
		wbk1=new JTextField(10);
		mb4.add(bq4);mb4.add(wbk1);
		mba.add(mb1);mba.add(mb2);mba.add(mb3);mba.add(mb4);
		mb5=new JPanel();//----------------���5
		bq5=new JLabel("�û�����");
		wbk2=new JTextField(10);
		mb5.add(bq5);mb5.add(wbk2);
		mb6=new JPanel();//---------------���6
		bq6=new JLabel("��    �룺");
		mmk=new JPasswordField(10);
		mb6.add(bq6);mb6.add(mmk);
		mb7=new JPanel(new GridLayout(2,1));//-----------���7
		an1=new JButton("��            ½");
		an2=new JButton("ȡ            ��");
		mb7.add(an1);mb7.add(an2);
		mbb.add(mb5);mbb.add(mb6);mbb.add(mb7);
		this.add(mba);this.add(mbb);
		this.setLayout(new GridLayout(1,2,12,13));
		this.setTitle("---�ع�����ϵͳ---");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(450,200);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}