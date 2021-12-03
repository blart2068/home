package znkz;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Mypanel extends JPanel implements MouseListener,MouseMotionListener{
	static Image ktbj,ktyk,sk,sg,jia,sptx,deng,deng1,tv,tv1,kt,cl1,cl,ck,yy,yy1,jk,ykq,th;
	static boolean ktbjkg,ktykkg,skg,dkg,tkg,ckg,kkg,jkg,ykkg,thkg,sptxkg=false;
	int kg,tvkg,clkg,ktkg,jkkg,ykqkg,hhkg,spkg,mskg,ktbjkgi;
	static int ktwz;
	static int tvxz;

	Mypanel(){
		jia=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/jia.jpg"));
		deng=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/deng.png"));
		tv=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/tv1.png"));
		cl=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/cl.png"));
		kt=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/kt.png"));
		jk=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/jk.png"));
		ykq=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/ykq.png"));
		th=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/th.png"));
		sptx=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/sptx.png"));
		sk=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/sk.png"));
		sg=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/sg.png"));
		ktyk=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/ktyk.png"));
		ktbj=Toolkit.getDefaultToolkit().getImage
				(Paint.class.getResource("/ktbj.png"));

	}


	public void mouseDragged(MouseEvent e) {
		// ---鼠标拖拽-----
		System.out.println("Dragged+++的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseMoved(MouseEvent e) {///读取位置-----------
		//-----鼠标移到-----
		//		System.out.println("Moved----的位置是:");
		//		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseClicked(MouseEvent e) {//鼠标监听-----------
		//---取鼠标点击的位置--------
		System.out.println("鼠标被点击的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
		if(dkg){//---------------灯
			if(e.getX()>170&&e.getX()<200&&e.getY()>360&&e.getY()<400){
				Sjxs.ktdxs();
				this.dkg();
			}
			if(e.getX()>310&&e.getX()<340&&e.getY()>315&&e.getY()<355){
				System.out.println("书房灯打开");
				Sjxs.sfdxs();
				this.dkg();
			}
			if(e.getX()>340&&e.getX()<470&&e.getY()>230&&e.getY()<275){
				System.out.println("主卧灯打开");
				Sjxs.zwdxs();
				this.dkg();
			}
			if(e.getX()>290&&e.getX()<320&&e.getY()>120&&e.getY()<165){
				System.out.println("次卧灯打开");
				Sjxs.cwdxs();
				this.dkg();
			}
			if(e.getX()>185&&e.getX()<246&&e.getY()>185&&e.getY()<222){
				System.out.println("洗手间灯打开");
				Sjxs.xsjdxs();
				this.dkg();
			}
			if(e.getX()>118&&e.getX()<147&&e.getY()>238&&e.getY()<272){
				System.out.println("厨房灯打开");
				Sjxs.cfdxs();
				this.dkg();
			}
		}
		if(ckg){
			if(e.getX()>242&&e.getX()<276&&e.getY()>500&&e.getY()<530){
				System.out.println("客厅窗帘打开");
				Sjxs.ktclxs();
				this.clkg();
			}

			if(e.getX()>360&&e.getX()<400&&e.getY()>376&&e.getY()<410){
				System.out.println("书房窗帘打开");
				Sjxs.sfclxs();
				this.clkg();
			}

			if(e.getX()>480&&e.getX()<520&&e.getY()>320&&e.getY()<350){
				System.out.println("主卧窗帘灯打开");
				Sjxs.zwclxs();
				this.clkg();
			}
		}
		if(tkg){
			if(e.getX()>225&&e.getX()<260&&e.getY()>345&&e.getY()<381){
				System.out.println("客厅电视打开");
				tvxz=1;
				Sjxs.kttv=true;
				ykkg=true;
				this.tvkg();
			}
		}
		if(tkg){
			if(e.getX()>375&&e.getX()<414&&e.getY()>239&&e.getY()<276){
				System.out.println("主卧电视打开");
				tvxz=2;
				Sjxs.zwtv=true;
				ykkg=true;
				this.tvkg();
			}
		}
		if(kkg){
			if(e.getX()>157&&e.getX()<204&&e.getY()>365&&e.getY()<407){
				System.out.println("客厅空调开");
				ktwz=1;
				Sjxs.ktkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(kkg){
			if(e.getX()>303&&e.getX()<345&&e.getY()>306&&e.getY()<346){
				System.out.println("书房空调开");
				ktwz=2;
				Sjxs.sfkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(kkg){
			if(e.getX()>427&&e.getX()<474&&e.getY()>257&&e.getY()<300){
				System.out.println("主卧空调开");
				ktwz=3;
				Sjxs.zwkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(kkg){
			if(e.getX()>275&&e.getX()<325&&e.getY()>128&&e.getY()<164){
				System.out.println("次卧空调开");
				ktwz=4;
				Sjxs.cwkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(jkg){
			if(e.getX()>257&&e.getX()<300&&e.getY()>400&&e.getY()<435){
				System.out.println("客厅监控");
				this.ktbjkg();
				Sjxs.jk=true;
			}
		}
		if(ktbjkg){
			if(e.getX()>0&&e.getX()<588&&e.getY()>495&&e.getY()<566){
				ktbjkg=false;
				Sjxs.jk=false;
				this.jkkg();
			}
		}

		if(ktykkg&&e.getX()>370&&e.getX()<590&&e.getY()>0&&e.getY()<560){//空调遥控器显示界面
			ktykkg=false;
			this.repaint();
		}
		if(ykkg&&e.getX()>274&&e.getX()<322&&e.getY()>37&&e.getY()<88){//TV遥控器开关界面
			if(tvxz==1){
				ykkg=false;
				Sjxs.kttv=false;
			}
			if(tvxz==2){
				ykkg=false;
				Sjxs.zwtv=false;
			}
		}
		if(ktykkg&&e.getX()>141&&e.getX()<170&&e.getY()>220&&e.getY()<251){//空调遥控器开关界面
			if(ktwz==1){
				ktykkg=false;
				Sjxs.ktkt=false;
			}
			if(ktwz==2){
				ktykkg=false;
				Sjxs.sfkt=false;
			}
			if(ktwz==3){
				ktykkg=false;
				Sjxs.zwkt=false;
			}
			if(ktwz==4){
				ktykkg=false;
				Sjxs.cwkt=false;
			}
			this.repaint();
		}

		if(ykkg&&e.getX()>480&&e.getX()<590&&e.getY()>0&&e.getY()<560){//TV遥控器显示界面
			ykkg=false;
			this.repaint();
		}

		if(e.getX()>420&&e.getX()<550&&e.getY()>357&&e.getY()<420){//通话显示界面

			sptxkg=false;
			this.repaint();
		}
		if(thkg){
			if(e.getX()>159&&e.getX()<203&&e.getY()>393&&e.getY()<436){
				System.out.println("视频会话");
				sptxkg=true;
				this.thkg();

			}
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		//----鼠标进入窗口-----------
		//System.out.println("鼠标进来了!!");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// --鼠标离开窗口--------
		//System.out.println("鼠标出去了****");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// --鼠标按下--------
		System.out.println("鼠标被按下--的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		//--鼠标松开-----
		System.out.println("鼠标被松开+++的位置是:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}



	public void paint(Graphics g) {//绘画-------------
		super.paint(g);
		//----灯------
		g.drawImage(jia, 0, 0, this);

		if(dkg){
			g.drawImage(deng, 150, 330, this);
			g.drawImage(deng, 290, 280, this);
			g.drawImage(deng, 420, 200, this);
			g.drawImage(deng, 270, 90, this);
			g.drawImage(deng, 170, 150, this);
			g.drawImage(deng, 100, 200, this);
		}
		//----TV---------
		if(tkg){
			g.drawImage(tv, 210, 300, this);
			g.drawImage(tv, 360, 200, this);
		}
		//--------窗帘-------------
		if(ckg){
			g.drawImage(cl, 230, 460, this);
			g.drawImage(cl, 350, 340, this);
			g.drawImage(cl, 470, 280, this);
		}
		//-------空调---------
		if(kkg){
			g.drawImage(kt, 150, 330, this);
			g.drawImage(kt, 290, 270, this);
			g.drawImage(kt, 420, 220, this);
			g.drawImage(kt, 270, 90, this);
		}
		//--------监控
		if(jkg){
			g.drawImage(jk, 250, 360, this);
		}
		//-------------通话-------
		if(thkg){
			g.drawImage(th, 150, 360, this);
		}
		//------门锁--------
		if(skg){
			g.drawImage(sg, 55, 280, this);
			this.repaint();
		}else{
			g.drawImage(sk, 55, 280, this);
			this.repaint();
		}
		//---------信息面板--------
		g.setColor(Color.RED);
		if(Sjxs.ktd){
			g.drawImage(deng, 20, 550,40,40, this);
			g.drawString(" 客厅灯", 20, 600);
		}
		if(Sjxs.sfd){
			g.drawImage(deng, 80, 550,40,40, this);
			g.drawString(" 书房灯", 80, 600);
		}
		if(Sjxs.zwd){
			g.drawImage(deng, 140, 550,40,40, this);
			g.drawString(" 主卧灯", 140, 600);
		}
		if(Sjxs.cwd){
			g.drawImage(deng, 200, 550,40,40, this);
			g.drawString(" 次卧灯", 200, 600);
		}
		if(Sjxs.xsjd){
			g.drawImage(deng, 260, 550,40,40, this);
			g.drawString("洗手间灯", 260, 600);
		}
		if(Sjxs.cfd){
			g.drawImage(deng, 320, 550,40,40, this);
			g.drawString(" 厨房灯", 320, 600);
		}
		if(Sjxs.ktcl){
			g.drawImage(cl, 380, 550,40,40, this);
			g.drawString("  客厅", 380, 600);
		}
		if(Sjxs.sfcl){
			g.drawImage(cl, 440, 550,40,40, this);
			g.drawString("  书房", 440, 600);
		}
		if(Sjxs.zwcl){
			g.drawImage(cl, 500, 550,40,40, this);
			g.drawString("  主卧", 500, 600);
		}
		if(Sjxs.ktkt){
			g.drawImage(kt, 20, 620,40,40, this);
			g.drawString("  客厅", 20, 675);
		}
		if(Sjxs.sfkt){
			g.drawImage(kt, 80, 620,40,40, this);
			g.drawString("  书房", 80, 675);
		}
		if(Sjxs.zwkt){
			g.drawImage(kt, 140, 620,40,40, this);
			g.drawString("  主卧", 140, 675);
		}
		if(Sjxs.cwkt){
			g.drawImage(kt, 200, 620,40,40, this);
			g.drawString("  次卧", 200, 675);
		}
		if(Sjxs.kttv){
			g.drawImage(tv, 260, 620,40,40, this);
			g.drawString("  客厅", 260, 675);
		}
		if(Sjxs.zwtv){
			g.drawImage(tv, 320, 620,40,40, this);
			g.drawString("  主卧", 320, 675);
		}
		if(Sjxs.jk){
			g.drawImage(jk, 380, 620,40,40, this);
			g.drawString("  视频", 380, 675);
		}
		if(Sjxs.th){
			g.drawImage(th, 440, 620,40,40, this);
			g.drawString("  会话", 440, 675);
		}

		if(ykkg){//tv遥控器
			g.drawImage(ykq, 120, 5, this);
		}
		if(ktykkg){//空调遥控器
			g.drawImage(ktyk, 120, 150, this);
		}
		if(sptxkg){//视频显示
			g.drawImage(sptx, 50, 100, this);
		}
		if(ktbjkg){//客厅背景
			g.drawImage(ktbj, 20, 60,550,400, this);
		}
	}
	public void dkg(){//灯开关

		kg++;
		if(kg%2==0){
			dkg=false;
		}else{
			dkg=true;
		}
		this.repaint();
	}
	public void tvkg(){//tv开关

		tvkg++;
		if(tvkg%2==0){
			tkg=false;
		}else{
			tkg=true;
		}
		this.repaint();
	}
	public void ktkg(){//空调开关

		ktkg++;
		if(ktkg%2==0){
			kkg=false;
		}else{
			kkg=true;
		}
		this.repaint();
	}
	public void jkkg(){//监控

		jkkg++;
		if(jkkg%2==0){
			jkg=false;
		}else{
			jkg=true;
		}
		this.repaint();
	}
	public void clkg(){//窗帘开关

		clkg++;
		if(clkg%2==0){
			ckg=false;
		}else{
			ckg=true;
		}
		this.repaint();
	}
	public void ktbjkg(){//客厅背景

		ktbjkgi++;
		if(ktbjkgi%2==0){
			ktbjkg=false;
		}else{
			ktbjkg=true;
		}
		this.repaint();
	}
	public void thkg(){//通话

		hhkg++;
		if(hhkg%2==0){
			thkg=false;
		}else{
			thkg=true;
		}
		this.repaint();
	}
	public void skg(){//通话

		mskg++;
		if(mskg%2==0){
			skg=false;
			System.out.println("门关闭---");
		}else{
			skg=true;
			System.out.println("门打开---");
		}
		this.repaint();
	}


}
