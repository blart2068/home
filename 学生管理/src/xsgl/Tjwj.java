package xsgl;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Tjwj extends JDialog implements ActionListener {//继承对话框 实现监听接口
	JLabel bq1,bq2,bq3,bq4,bq5,bq6;
	JTextField wbk1,wbk2,wbk3,wbk4,wbk5,wbk6;
	JButton antj,anqx;
	JPanel mbb,mbn,mb;
	Connection ct;
	PreparedStatement ps;

	Tjwj(Frame f,String mc,boolean tf,int a,int hs,Wjxx wjxx){
		super(f,mc ,tf);//覆盖父类的构造函数
		String anmc="添加",anjk="tj";
		if(a==1){//判断添加武将或者修改武将 定义组件
			anmc="修改";
			anjk="xg";
		}
		mb=new JPanel();//创建一个主面板用于放入容器
		//-----new 组件------------------------------------
		bq1=new JLabel("编号:",JLabel.CENTER);bq2=new JLabel("姓名:",JLabel.CENTER);
		bq3=new JLabel("性别:",JLabel.CENTER);bq4=new JLabel("年龄:",JLabel.CENTER);
		bq5=new JLabel("籍贯:",JLabel.CENTER);bq6=new JLabel("称号:",JLabel.CENTER);
		wbk1=new JTextField(12);wbk2=new JTextField(12);
		wbk3=new JTextField(12);wbk4=new JTextField(12);
		wbk5=new JTextField(12);wbk6=new JTextField(12);
		antj=new JButton(anmc);anqx=new JButton("取消");
		antj.addActionListener(this);anqx.addActionListener(this);
		antj.setActionCommand(anjk);anqx.setActionCommand("qx");
		mbb=new JPanel();mbn=new JPanel();
		//-----------在修改选项时---读取文本框参数-------
		if(a==1&&hs!=-7){
			wbk1.setText((String)wjxx.getValueAt(hs, 0));
			wbk1.setEditable(false);
			wbk2.setText((String)wjxx.getValueAt(hs, 1));
			wbk3.setText((String)wjxx.getValueAt(hs, 2));
			wbk4.setText(wjxx.getValueAt(hs, 3).toString());
			wbk5.setText((String)wjxx.getValueAt(hs, 4));
			wbk6.setText((String)wjxx.getValueAt(hs, 5));

		}
		//-----添加组件-------
		mbn.add(antj);mbn.add(anqx);
		mbb.setLayout(new GridLayout(6, 2,0,14));
		mbb.add(bq1);mbb.add(wbk1);mbb.add(bq2);mbb.add(wbk2);
		mbb.add(bq3);mbb.add(wbk3);mbb.add(bq4);mbb.add(wbk4);
		mbb.add(bq5);mbb.add(wbk5);mbb.add(bq6);mbb.add(wbk6);
		//添加进主面板-------------------------
		mb.add(mbb);
		mb.add(mbn,BorderLayout.SOUTH);

		Container rq=getContentPane();//创建容器---
		rq.add(mb);//主面板添加进容器
		setBounds(400, 400, 300, 300);//设置面板大小-出现位置--------
		setVisible(true);//--显示面板
	}
	public void actionPerformed(ActionEvent e) {//---监听---
		String zl=e.getActionCommand();

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//启动数据库服务
			ct=DriverManager.getConnection("jdbc:odbc:sql","sa","5337");//连接数据库
			//----写入字段--------------------------
			if(zl.equals("tj")){//添加武将
				ps=ct.prepareStatement("insert into wj values(?,?,?,?,?,?)");//写入SQL语句
				ps.setString(1,wbk1.getText());
				ps.setString(2,wbk2.getText());
				ps.setString(3,wbk3.getText());
				ps.setInt(4,Integer.parseInt(wbk4.getText()));
				ps.setString(5,wbk5.getText());
				ps.setString(6,wbk6.getText());
				ps.executeUpdate();//执行SQL语句
				this.dispose();//关闭窗口--------------
			}
			if(zl.equals("xg")){//修改武将
				if(JOptionPane.showConfirmDialog(this, "确认修改?")!=0){//确认返回0
					return;
				}
				ps=ct.prepareStatement("update wj set xm=?,xb=?,nl=?,jg=?,lp=? where bh=?");//写入SQL语句
				ps.setString(1, wbk2.getText());
				ps.setString(2, wbk3.getText());
				ps.setInt(3, Integer.parseInt(wbk4.getText()));
				ps.setString(4, wbk5.getText());
				ps.setString(5, wbk6.getText());
				ps.setString(6, wbk1.getText());
				ps.executeUpdate();
				this.dispose();//关闭窗口--------------
			}
		} catch (Exception e2) {}finally{
			try {//关闭流----------
				ct.close();
				ps.close();
			} catch (Exception e3) {}
		}

		this.dispose();

	}
}
