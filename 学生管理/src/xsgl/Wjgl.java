package xsgl;
import java.sql.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;


public class Wjgl extends JFrame implements ActionListener{
	JTable bg;
	JPanel mbb,mbn;
	JScrollPane gdt;
	JLabel bq,bqz;
	JTextField wbk;
	JButton anz,ans,ang,anc;
	PreparedStatement ps;
	Connection ct;
	ResultSet rs;
	Vector zd,jl;
	Wjxx wjxx;

	public static void main(String[] args){//---主函数---
		new Wjgl();
	}

	public void actionPerformed(ActionEvent e) {//--监听
		String zl=e.getActionCommand();
		if(zl.equals("cx")){//--查询------------
			String cxxx=this.wbk.getText().trim();
			String sqlcx="select * from wj where xm='"+cxxx+"'or bh='"+cxxx+"'";
			wjxx=new Wjxx(sqlcx);
			bg.setModel(wjxx);
		}
		if(zl.equals("xz")){//--新增------------
			new Tjwj(this,"新增武将",true,0,-7,wjxx);
			wjxx=new Wjxx("ks");
			bg.setModel(wjxx);
		}
		if(zl.equals("sc")){//--删除------------

			int hs=this.bg.getSelectedRow();//获得被鼠标选中的行数  没有选中返回-1
			if(hs==-1){
				JOptionPane.showMessageDialog(this, "请选择要删除的对象!");//提示信息
				return;//返回退出函数
			}else{
				if(JOptionPane.showConfirmDialog(this, "确认删除?")!=0){//确认返回0
					return;
				}
			}
			String st=(String)wjxx.getValueAt(hs, 0);//读取被选中行数的第一个字段返回值需要转换
			try {//----sql 操作
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				ct=DriverManager.getConnection("jdbc:odbc:sql","sa","5337");
				ps=ct.prepareStatement("delete from wj where bh=?");
				ps.setString(1, st);
				ps.executeQuery();

			} catch (Exception e2) {}finally{
				try{
					ps.close();
					ct.close();
				}catch(Exception re){}
			}
			wjxx=new Wjxx("ks");
			bg.setModel(wjxx);
		}
		if(zl.equals("xg")){//--修改------------
			int hs=this.bg.getSelectedRow();//读取选中的行数
			if(hs==-1){
				JOptionPane.showMessageDialog(this, "请选择要删除的对象!");//提示信息
				return;//返回退出函数
			}
			new Tjwj(this,"修改信息",true,1,hs,wjxx);
			wjxx=new Wjxx("ks");
			bg.setModel(wjxx);
		}
	}

	Wjgl(){//构造-----------------------------------

		//----定义组件-----------------------
		anz=new JButton("新增武将");ans=new JButton("删除武将");ang=new JButton("修改武将信息");anc=new JButton("查询");
		bq=new JLabel("武将名称/武将编号  :");
		wbk=new JTextField(12);
		mbb=new JPanel();mbn=new JPanel();

		wjxx=new Wjxx("ks");
		bg=new JTable(wjxx);
		bg.setModel(wjxx);//立刻显示

		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(JLabel.CENTER);
		bg.setDefaultRenderer(Object.class, tcr);
		gdt=new JScrollPane(bg);

		//---设置监听接口------
		anc.addActionListener(this);
		anc.setActionCommand("cx");
		anz.addActionListener(this);
		anz.setActionCommand("xz");
		ans.addActionListener(this);
		ans.setActionCommand("sc");
		ang.addActionListener(this);
		ang.setActionCommand("xg");
		//--添加组件-----设置主窗口--------------

		mbb.add(bq);mbb.add(wbk);mbb.add(anc);
		mbn.add(anz);mbn.add(ans);mbn.add(ang);
		this.add(mbb,BorderLayout.NORTH);
		this.add(mbn,BorderLayout.SOUTH);
		this.add(gdt);
		this.setTitle("武将管理系统");
		this.setSize(500, 400);
		this.setLocation(300,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}