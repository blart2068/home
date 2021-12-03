package tank;

import java.io.*;
import java.util.Vector;

public class Tongji {
	private static int dzsl=30,wzsl=3;
	static FileWriter fw;
	static BufferedWriter bw;
	static FileReader fr;
	static BufferedReader br;
	static int dsl;
	static Mytank mt;
	static Vector<Ditank> djh=new Vector<Ditank>();
	static Vector<Zhuankuai> zkjh=new Vector<Zhuankuai>();
	public static void save(){//������Ϸ
		dsl=0;
		try {
			for(int i=0;i<Mypanel.dtk.size();i++){
				if(Mypanel.dtk.get(i).getTksm()){
					dsl++;
				}
			}
			fw=new FileWriter("src/save.txt");
			fw.write(dzsl+" "+wzsl+" "+dsl+"\r\n");//д����������������������д��ڵ�����-- ��1��

			if(Mypanel.mt.getTksm()){//д���ҷ�̹������-- ��2��
				int x=Mypanel.mt.getX();
				int y=Mypanel.mt.getY();
				int fx=Mypanel.mt.getFx();
				fw.write(x+" "+y+" "+fx+"\r\n");
			}

			for(int i=0;i<Mypanel.dtk.size();i++){//д���̹������
				if(Mypanel.dtk.get(i).getTksm()){
					int x=Mypanel.dtk.get(i).getX();
					int y=Mypanel.dtk.get(i).getY();
					int fx=Mypanel.dtk.get(i).getFx();
					fw.write(x+" "+y+" "+fx+"\r\n");
				}
			}

			for(int i=0;i<Mypanel.mp.zkjh.size();i++){//д��ש������
				if(Mypanel.mp.zkjh.get(i).getSm()){
					int x=Mypanel.mp.zkjh.get(i).getX();
					int y=Mypanel.mp.zkjh.get(i).getY();
					fw.write(x+" "+y+"\r\n");
				}
			}

		} catch (Exception e) {}finally {//�쳣����
			try {
				fw.close();
			} catch (Exception e2) {}
		}

	}
	public static void land(){//������Ϸ
		String s="";
		String[]sz=null;
		int dsl;
		try {
			fr=new FileReader("src/save.txt");
			br=new BufferedReader(fr);
			//---�� �� ������---��̹������--
			s=br.readLine();
			sz=s.split(" ");
			dzsl=Integer.parseInt(sz[0]);
			wzsl=Integer.parseInt(sz[1]);
			dsl=Integer.parseInt(sz[2]);
			//----��̹������--------
			{
				s=br.readLine();
				sz=s.split(" ");
				int x=Integer.parseInt(sz[0]);
				int y=Integer.parseInt(sz[1]);
				int fx=Integer.parseInt(sz[2]);
				mt=new Mytank(x,y);
				mt.setFx(fx);
			}
			//-----��̹������-------
			for(int i=0;i<dsl;i++){
				s=br.readLine();
				sz=s.split(" ");
				int x=Integer.parseInt(sz[0]);
				int y=Integer.parseInt(sz[1]);
				int fx=Integer.parseInt(sz[2]);
				Ditank dt=new Ditank(x,y);
				dt.setFx(fx);
				djh.addElement(dt);
			}
			//-------ש������---------
			while((s=br.readLine())!=null){
				sz=s.split(" ");
				int x=Integer.parseInt(sz[0]);
				int y=Integer.parseInt(sz[1]);
				Zhuankuai zk=new Zhuankuai(x,y);
				zkjh.add(zk);
			}

		} catch (Exception e) {}finally {//�쳣����
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {}
		}
	}
	public static void djs(){
		dzsl--;
	}
	public static void wjs(){
		wzsl--;
	}
	public static int getDzsl() {
		return dzsl;
	}
	public static void setDzsl(int dzsl) {
		Tongji.dzsl = dzsl;
	}
	public static int getWzsl() {
		return wzsl;
	}
	public static void setWzsl(int wzsl) {
		Tongji.wzsl = wzsl;
	}

}
