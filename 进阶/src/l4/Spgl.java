package l4;

import java.util.*;

public class Spgl {
	//------------------------------------------------
	private ArrayList aa;		//���弯����
	Spgl(){					//ͨ�����캯��new��������
		aa=new ArrayList();
	}
	//---------------------------------------------
	public void tv(){
		System.out.println("--------���\t����\t�۸�--------");
		for(int i=0;i<aa.size();i++){
			String mc=((Sp)aa.get(i)).getMc();
			String bh=((Sp)aa.get(i)).getBh();
			double jg=((Sp)aa.get(i)).getJg();
			System.out.println("\t"+bh+"\t"+mc+"\t"+jg);
		}
	}
	//----------------------------------------------
	public void tj(String bh,String mc,double jg){//---���ʳƷ��Ϣ	tj
		Sp a=new Sp();
		a.setBh(bh);a.setMc(mc);a.setJg(jg);
		aa.add(a);
		this.tv();
		System.out.println("���ʳƷ�ɹ�\n*******************************");
	}
	//-------------------------------------------------
	public int cx(String bh){//--------��ѯʳƷ	cx
		Sp a=new Sp();
		int i;
		for(i=0;i<aa.size();i++){
			a=(Sp)aa.get(i);
			if(a.getBh().equals(bh)){
				System.out.println("--------���\t����\t�۸�--------");
				String mc=((Sp)aa.get(i)).getMc();
				double jg=((Sp)aa.get(i)).getJg();
				System.out.println("\t"+bh+"\t"+mc+"\t"+jg+"\n**************************************");
				return i;
			}
		}
		System.out.println("�Բ����������Ʒ�����ڣ�\n***********************************");
		return -9999;
	}
	//---------------------------------------------------------
	public void xg(String bh) throws Exception{//-----------�޸ļ۸�
		int i=this.cx(bh);
		if(i!=-9999){
			Scanner in=new Scanner(System.in);
			System.out.println("��������Ҫ�޸ĵļ۸�");
			double jg=in.nextDouble();
			((Sp)aa.get(i)).setJg(jg);
			this.cx(bh);
		}
	}
	//---------------------------------------------------------
	public void sc(String bh){//------ɾ����Ʒ----------
		int i=this.cx(bh);
		if(i!=-9999){
			aa.remove(i);
			System.out.println("ɾ���ɹ�\n**************************");
		}
	}




}
