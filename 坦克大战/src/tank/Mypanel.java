package tank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class Mypanel extends JPanel implements KeyListener,Runnable{
	static int js=1;
	static String ys="ys";
	static Mytank mt;
	private Baozha bz=null;
	static Map mp;
	Home hm;
	static boolean yxzt=true;
	int zts=1;
	private int dsl=5,dzs=Tongji.getDzsl(),wzs=Tongji.getWzsl();
	static Image bz1, bz2 ,bz3,bz4;
	static Vector<Ditank>dtk=new Vector<Ditank>();
	Mypanel(String yx,int gs){//构造
		if(yx.equals("new")){//----新游戏
			if(gs==1){
				mp=new Map1();
			}
			if(gs==2){
				mp=new Map2();
			}
			mt=new Mytank(370,620);
			mt.setFx(1);
			for(int i=0;i<dsl;i++){
				Ditank dt=new Ditank(i*200+30,0);
				dtk.add(dt);

				Thread xc=new Thread(dt);
				xc.start();
			}
			bz1=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (1).png"));
			bz2=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (2).png"));
			bz3=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (3).png"));
			bz4=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (4).png"));
			Yinyue yy=new Yinyue("src/tank.wav");
			yy.start();
		}
		if(yx.equals("land")){//----载入游戏
			if(gs==1){
				mp=new Map1();
				mp.zkjh=Tongji.zkjh;
			}
			if(gs==2){
				mp=new Map2();
			}
			mt=Tongji.mt;
			for(int i=0;i<Tongji.djh.size();i++){
				Ditank dt=Tongji.djh.get(i);
				dtk.add(dt);
				Thread xc=new Thread(dt);
				xc.start();
			}
			bz1=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (1).png"));
			bz2=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (2).png"));
			bz3=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (3).png"));
			bz4=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/3 (4).png"));
			Yinyue yy=new Yinyue("src/tank.wav");
			yy.start();
		}
	}
	public void paint(Graphics g){//画图形
		super.paint(g);
		g.fillRect(0, 0, 900, 660);
		this.htj(g);
		if(mt.getTksm()==true){
			this.ctk(mt.getX(), mt.getY(),g,0,mt.getFx());//画我坦克
		}
		if(dtk.size()!=0){
			for(int i=0;i<dtk.size();i++){//画敌坦克
				if(dtk.get(i).getTksm()==true){
					this.ctk(dtk.get(i).getX(),dtk.get(i).getY(), g, 1,dtk.get(i).getFx());
				}
			}
		}
		for(int i=0;i<mt.zdjh.size();i++){//画我方子弹
			Zidan zd=mt.zdjh.get(i);
			if(zd!=null&&zd.getSm()==true){
				g.setColor(Color.RED);
				g.fillOval(zd.getX(), zd.getY(), 6, 6);

			}
		}
		if(dtk.size()!=0){
			for(int i=0;i<dtk.size();i++){//画敌方子弹
				for(int j=0;j<dtk.get(i).dzd.size();j++){
					Zidan zd=dtk.get(i).dzd.get(j);
					if(zd!=null&&zd.getSm()==true){
						g.setColor(Color.WHITE);
						g.fillOval(zd.getX(), zd.getY(), 6, 6);

					}
				}
			}
		}
		if(bz!=null&&bz.getBzsm()==true){//画爆炸
			bz.smzq();
			if(bz.getScq()>9){
				g.drawImage(bz1, bz.getX(), bz.getY(), this);
			}else if(bz.getScq()>6){
				g.drawImage(bz2, bz.getX(), bz.getY(), this);	
			}else if(bz.getScq()>3){
				g.drawImage(bz3, bz.getX(), bz.getY(), this);	
			}else if(bz.getScq()>0){
				g.drawImage(bz4, bz.getX(), bz.getY(), this);	
			}
		}
		mp.dtone(g);//画地图
		g.setColor(Color.red);
		if(dzs==0){
			g.setFont(new Font("华文彩云", Font.BOLD, 100));
			g.drawString("wim  wim", 300, 400);
		}
		if(wzs==0){
			g.setFont(new Font("华文彩云", Font.BOLD, 100));
			g.drawString("game over", 200, 400);
		}
	}
	public void htj(Graphics g){//画统计
		this.ctk(960, 50, g, 0, 1);
		this.ctk(1080, 50, g, 1, 1);
		g.setFont(new Font("楷体",60,30));
		g.setColor(Color.RED);
		g.drawString("数据统计", 980, 30);
		g.setColor(Color.GREEN);
		g.drawString(Tongji.getWzsl()+"", 1010, 80);
		g.drawString(Tongji.getDzsl()+"", 1130, 80);

	}
	public void ctk(int x,int y,Graphics g,int lx,int fx){//画坦克函数
		//---------------------设置类型颜色------
		if(lx==0){
			g.setColor(Color.YELLOW);
		}else {
			g.setColor(Color.WHITE);
		}
		//---------------------设置方向画出坦克----
		if(fx==1){//1=上
			g.fill3DRect(x, y, 10, 40, false);
			g.fill3DRect(x+10, y+5, 20, 30, false);
			g.fill3DRect(x+30, y, 10, 40, false);
			g.fillOval(x+13, y+13, 14, 14);
			g.fill3DRect(x+18, y, 4, 13, false);
		}else if(fx==2){//2=下
			g.fill3DRect(x, y, 10, 40, false);
			g.fill3DRect(x+10, y+5, 20, 30, false);
			g.fill3DRect(x+30, y, 10, 40, false);
			g.fillOval(x+13, y+13, 14, 14);
			g.fill3DRect(x+18, y+27, 4, 13, false);
		}else if(fx==3){//3=左
			g.fill3DRect(x, y, 40, 10, false);
			g.fill3DRect(x+5, y+10, 30, 20,false);
			g.fill3DRect(x, y+30, 40, 10, false);
			g.fillOval(x+13, y+13, 14, 14);
			g.fillRect(x, y+18, 13, 4);
		}else{//=右
			g.fill3DRect(x, y, 40, 10, false);
			g.fill3DRect(x+5, y+10, 30, 20, false);
			g.fill3DRect(x, y+30, 40, 10, false);
			g.fillOval(x+13, y+13, 14, 14);
			g.fill3DRect(x+27, y+18, 13, 4, false);
		}
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {//监听键盘
		if(yxzt){
			if(e.getKeyCode()==KeyEvent.VK_W||e.getKeyCode()==KeyEvent.VK_UP){//上
				mt.setFx(1);
				mt.shang();
			}else if(e.getKeyCode()==KeyEvent.VK_S||e.getKeyCode()==KeyEvent.VK_DOWN){//下
				mt.setFx(2);
				mt.xia();
			}else if(e.getKeyCode()==KeyEvent.VK_A||e.getKeyCode()==KeyEvent.VK_LEFT){//左
				mt.setFx(3);
				mt.zuo();
			}else if(e.getKeyCode()==KeyEvent.VK_D||e.getKeyCode()==KeyEvent.VK_RIGHT){//右
				mt.setFx(4);
				mt.you();
			}
			if(e.getKeyCode()==KeyEvent.VK_SPACE){//发射子弹

				if(mt.zdjh.size()!=0&&mt.zdjh.get(0).getSm()==false){
					mt.zdjh.remove(0);
				}
				if(mt.getTksm()==true){
					mt.fszd();
				}
			}
			this.repaint();
		}
	}
	public void mzmb(Zidan zd,Ditank dt){//命中敌坦克
		if(dt.getTksm()==true&&zd.getSm()==true
				&&zd.getX()+3>dt.getX()&&zd.getX()+3<dt.getX()+40&&
				zd.getY()+3>dt.getY()&&zd.getY()+3<dt.getY()+40){
			zd.setSm(false);
			dt.setTksm(false);
			dzs--;
			bz=new Baozha(zd.getX(),zd.getY());//爆炸效果
			Tongji.djs();
			if(dzs==25||dzs==20||dzs==15){//刷新剩余坦克
				dtk.removeAllElements();
				for(int i=0;i<dsl;i++){
					Ditank dt1=new Ditank(i*200+30,0);
					dtk.add(dt1);
					Thread xc=new Thread(dt1);
					xc.start();
				}
			}
			if(dzs==10){//刷新剩余坦克
				dtk.removeAllElements();
				for(int i=0;i<10;i++){
					Ditank dt1=new Ditank(i*90+30,0);
					dtk.add(dt1);
					Thread xc=new Thread(dt1);
					xc.start();
				}
			}
		}
	}
	public void mzmy(Zidan zd){//命中我的坦克
		int mx=mp.hm.getX()+20;int my=mp.hm.getY()+20;
		if(mp.hm.getSm()&&zd.getSm()&&zd.getX()+3>mx-20&&zd.getX()+3<mx+20&&
				zd.getY()+3>my-20&&zd.getY()<my+20){//命中home
			mp.hm.setSm(false);
			zd.setSm(false);
			bz=new Baozha(zd.getX(),zd.getY());//爆炸效果
			wzs=0;
			mt.setTksm(false);
		}
		if(mt.getTksm()==true&&zd.getSm()==true
				&&zd.getX()+3>mt.getX()&&zd.getX()+3<mt.getX()+40&&
				zd.getY()+3>mt.getY()&&zd.getY()+3<mt.getY()+40){
			zd.setSm(false);
			mt.setTksm(false);
			bz=new Baozha(mt.getX(),mt.getY());
			Tongji.wjs();
			wzs--;
			if(wzs>0){//我方总为0
				mt=new Mytank(370,620);
				mt.setFx(1);
			}

		}
	}
	public void mzzd(Zidan zd,Zidan dfzd){//命中子弹   命中Home
		if(zd.getSm()==true&&dfzd.getSm()==true&&mp.hm.getSm()){
			int mx=mp.hm.getX()+20;int my=mp.hm.getY()+20;
			if(zd.getX()+3>mx-20&&zd.getX()+3<mx+20&&//命中home
					zd.getY()+3>my-20&&zd.getY()<my+20){
				mp.hm.setSm(false);
				zd.setSm(false);
				bz=new Baozha(zd.getX(),zd.getY());//爆炸效果
				wzs=0;
				mt.setTksm(false);
			}
			if(zd.getX()+20>dfzd.getX()-20&&zd.getX()+20<dfzd.getX()+20//命中子弹
					&&zd.getY()+20>dfzd.getY()-20&&zd.getY()+20<dfzd.getY()+20){
				zd.setSm(false);
				dfzd.setSm(false);
			}
		}

	}
	public void mzzk(Zidan zd,Zhuankuai zk){//我方命中砖块
		if(zd.getSm()&&zk.getSm()){
			if(zd.getX()+3>=zk.getX()&&zd.getX()+3<=zk.getX()+20&&
					zd.getY()+3>=zk.getY()&&zd.getY()+3<=zk.getY()+20){
				zk.setSm(false);
				zd.setSm(false);
			}

		}
	}
	public void dmzzk(Zidan zd,Zhuankuai zk){//敌方命中砖块
		if(zd.getSm()&&zk.getSm()){
			if(zd.getX()+3>=zk.getX()&&zd.getX()+3<=zk.getX()+20&&
					zd.getY()+3>=zk.getY()&&zd.getY()+3<=zk.getY()+20){
				zd.setSm(false);
				zk.setSm(false);
			}
		}
	}
	public void mzgk(Zidan zd,Gangban gk){//我方命中钢板
		if(zd.getSm()&&zd.getX()+3>=gk.getX()&&zd.getX()+3<=gk.getX()+40&&
				zd.getY()+3>=gk.getY()&&zd.getY()+3<=gk.getY()+40){
			zd.setSm(false);
		}
	}
	public void dmzgk(Zidan zd,Gangban gk){//敌方命中钢板
		if(zd.getSm()&&zd.getX()+3>=gk.getX()&&zd.getX()+3<=gk.getX()+40&&
				zd.getY()+3>=gk.getY()&&zd.getY()+3<=gk.getY()+40){
			zd.setSm(false);
		}
	}
	public void yxzt(){//游戏暂停

		if(zts%2==0){
			this.yxzt=true;
			for(int i=0;i<dtk.size();i++){
				Ditank tk=dtk.get(i);
				Thread xc=new Thread(tk);
				xc.start();
			}
		}else{
			this.yxzt=false;
		}
		zts++;

	}

	public  void  run(){//线程重绘
		for(;;){
			try{
				Thread.sleep(50);
			}catch(Exception e){}

			for(int i=0;i<mt.zdjh.size();i++){//命中 
				Zidan zd=mt.zdjh.get(i);
				for(int u=0;u<mp.gkjh.size();u++){//命中钢板
					Gangban gk=mp.gkjh.get(u);
					this.mzgk(zd,gk);
				}
				for(int j=0;j<dtk.size();j++){//命中敌坦克
					Ditank dt=dtk.get(j);
					this.mzmb(zd,dt);
					for(int k=0;k<dt.dzd.size();k++){//命中敌子弹
						Zidan dfzd=dt.dzd.get(k);
						this.mzzd(zd,dfzd);
						for(int t=0;t<mp.zkjh.size();t++){//命中砖块
							Zhuankuai zk=mp.zkjh.get(t);
							this.mzzk(zd,zk);
						}
					}
				}
			}
			if(dtk.size()!=0){
				for(int i=0;i<dtk.size();i++){//命中我的坦克
					for(int j=0;j<dtk.get(i).dzd.size();j++){
						Zidan zd=dtk.get(i).dzd.get(j);
						this.mzmy(zd);
						for(int u=0;u<mp.gkjh.size();u++){
							Gangban gk=mp.gkjh.get(u);
							this.dmzgk(zd,gk);
						}
						for(int t=0;t<mp.zkjh.size();t++){//命中砖块
							Zhuankuai zk=mp.zkjh.get(t);
							this.dmzzk(zd,zk);
						}
					}
				}
			}
			this.repaint();
		}
	}
}


