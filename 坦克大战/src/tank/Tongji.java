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
	public static void save(){//保存游戏
		dsl=0;
		try {
			for(int i=0;i<Mypanel.dtk.size();i++){
				if(Mypanel.dtk.get(i).getTksm()){
					dsl++;
				}
			}
			fw=new FileWriter("src/save.txt");
			fw.write(dzsl+" "+wzsl+" "+dsl+"\r\n");//写入敌总数量，我总数量，敌存在的数量-- 第1行

			if(Mypanel.mt.getTksm()){//写入我方坦克数据-- 第2行
				int x=Mypanel.mt.getX();
				int y=Mypanel.mt.getY();
				int fx=Mypanel.mt.getFx();
				fw.write(x+" "+y+" "+fx+"\r\n");
			}

			for(int i=0;i<Mypanel.dtk.size();i++){//写入敌坦克数据
				if(Mypanel.dtk.get(i).getTksm()){
					int x=Mypanel.dtk.get(i).getX();
					int y=Mypanel.dtk.get(i).getY();
					int fx=Mypanel.dtk.get(i).getFx();
					fw.write(x+" "+y+" "+fx+"\r\n");
				}
			}

			for(int i=0;i<Mypanel.mp.zkjh.size();i++){//写入砖块数据
				if(Mypanel.mp.zkjh.get(i).getSm()){
					int x=Mypanel.mp.zkjh.get(i).getX();
					int y=Mypanel.mp.zkjh.get(i).getY();
					fw.write(x+" "+y+"\r\n");
				}
			}

		} catch (Exception e) {}finally {//异常处理
			try {
				fw.close();
			} catch (Exception e2) {}
		}

	}
	public static void land(){//载入游戏
		String s="";
		String[]sz=null;
		int dsl;
		try {
			fr=new FileReader("src/save.txt");
			br=new BufferedReader(fr);
			//---敌 我 总数量---敌坦克数量--
			s=br.readLine();
			sz=s.split(" ");
			dzsl=Integer.parseInt(sz[0]);
			wzsl=Integer.parseInt(sz[1]);
			dsl=Integer.parseInt(sz[2]);
			//----我坦克坐标--------
			{
				s=br.readLine();
				sz=s.split(" ");
				int x=Integer.parseInt(sz[0]);
				int y=Integer.parseInt(sz[1]);
				int fx=Integer.parseInt(sz[2]);
				mt=new Mytank(x,y);
				mt.setFx(fx);
			}
			//-----敌坦克坐标-------
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
			//-------砖块坐标---------
			while((s=br.readLine())!=null){
				sz=s.split(" ");
				int x=Integer.parseInt(sz[0]);
				int y=Integer.parseInt(sz[1]);
				Zhuankuai zk=new Zhuankuai(x,y);
				zkjh.add(zk);
			}

		} catch (Exception e) {}finally {//异常处理
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
