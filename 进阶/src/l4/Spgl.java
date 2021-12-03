package l4;

import java.util.*;

public class Spgl {
	//------------------------------------------------
	private ArrayList aa;		//定义集合类
	Spgl(){					//通过构造函数new出集合类
		aa=new ArrayList();
	}
	//---------------------------------------------
	public void tv(){
		System.out.println("--------编号\t名称\t价格--------");
		for(int i=0;i<aa.size();i++){
			String mc=((Sp)aa.get(i)).getMc();
			String bh=((Sp)aa.get(i)).getBh();
			double jg=((Sp)aa.get(i)).getJg();
			System.out.println("\t"+bh+"\t"+mc+"\t"+jg);
		}
	}
	//----------------------------------------------
	public void tj(String bh,String mc,double jg){//---添加食品信息	tj
		Sp a=new Sp();
		a.setBh(bh);a.setMc(mc);a.setJg(jg);
		aa.add(a);
		this.tv();
		System.out.println("添加食品成功\n*******************************");
	}
	//-------------------------------------------------
	public int cx(String bh){//--------查询食品	cx
		Sp a=new Sp();
		int i;
		for(i=0;i<aa.size();i++){
			a=(Sp)aa.get(i);
			if(a.getBh().equals(bh)){
				System.out.println("--------编号\t名称\t价格--------");
				String mc=((Sp)aa.get(i)).getMc();
				double jg=((Sp)aa.get(i)).getJg();
				System.out.println("\t"+bh+"\t"+mc+"\t"+jg+"\n**************************************");
				return i;
			}
		}
		System.out.println("对不起输入的商品部存在！\n***********************************");
		return -9999;
	}
	//---------------------------------------------------------
	public void xg(String bh) throws Exception{//-----------修改价格
		int i=this.cx(bh);
		if(i!=-9999){
			Scanner in=new Scanner(System.in);
			System.out.println("请输入你要修改的价格");
			double jg=in.nextDouble();
			((Sp)aa.get(i)).setJg(jg);
			this.cx(bh);
		}
	}
	//---------------------------------------------------------
	public void sc(String bh){//------删除商品----------
		int i=this.cx(bh);
		if(i!=-9999){
			aa.remove(i);
			System.out.println("删除成功\n**************************");
		}
	}




}
