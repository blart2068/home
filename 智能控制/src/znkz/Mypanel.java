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
		// ---�����ק-----
		System.out.println("Dragged+++��λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseMoved(MouseEvent e) {///��ȡλ��-----------
		//-----����Ƶ�-----
		//		System.out.println("Moved----��λ����:");
		//		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseClicked(MouseEvent e) {//������-----------
		//---ȡ�������λ��--------
		System.out.println("��걻�����λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
		if(dkg){//---------------��
			if(e.getX()>170&&e.getX()<200&&e.getY()>360&&e.getY()<400){
				Sjxs.ktdxs();
				this.dkg();
			}
			if(e.getX()>310&&e.getX()<340&&e.getY()>315&&e.getY()<355){
				System.out.println("�鷿�ƴ�");
				Sjxs.sfdxs();
				this.dkg();
			}
			if(e.getX()>340&&e.getX()<470&&e.getY()>230&&e.getY()<275){
				System.out.println("���Եƴ�");
				Sjxs.zwdxs();
				this.dkg();
			}
			if(e.getX()>290&&e.getX()<320&&e.getY()>120&&e.getY()<165){
				System.out.println("���Եƴ�");
				Sjxs.cwdxs();
				this.dkg();
			}
			if(e.getX()>185&&e.getX()<246&&e.getY()>185&&e.getY()<222){
				System.out.println("ϴ�ּ�ƴ�");
				Sjxs.xsjdxs();
				this.dkg();
			}
			if(e.getX()>118&&e.getX()<147&&e.getY()>238&&e.getY()<272){
				System.out.println("�����ƴ�");
				Sjxs.cfdxs();
				this.dkg();
			}
		}
		if(ckg){
			if(e.getX()>242&&e.getX()<276&&e.getY()>500&&e.getY()<530){
				System.out.println("����������");
				Sjxs.ktclxs();
				this.clkg();
			}

			if(e.getX()>360&&e.getX()<400&&e.getY()>376&&e.getY()<410){
				System.out.println("�鷿������");
				Sjxs.sfclxs();
				this.clkg();
			}

			if(e.getX()>480&&e.getX()<520&&e.getY()>320&&e.getY()<350){
				System.out.println("���Դ����ƴ�");
				Sjxs.zwclxs();
				this.clkg();
			}
		}
		if(tkg){
			if(e.getX()>225&&e.getX()<260&&e.getY()>345&&e.getY()<381){
				System.out.println("�������Ӵ�");
				tvxz=1;
				Sjxs.kttv=true;
				ykkg=true;
				this.tvkg();
			}
		}
		if(tkg){
			if(e.getX()>375&&e.getX()<414&&e.getY()>239&&e.getY()<276){
				System.out.println("���Ե��Ӵ�");
				tvxz=2;
				Sjxs.zwtv=true;
				ykkg=true;
				this.tvkg();
			}
		}
		if(kkg){
			if(e.getX()>157&&e.getX()<204&&e.getY()>365&&e.getY()<407){
				System.out.println("�����յ���");
				ktwz=1;
				Sjxs.ktkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(kkg){
			if(e.getX()>303&&e.getX()<345&&e.getY()>306&&e.getY()<346){
				System.out.println("�鷿�յ���");
				ktwz=2;
				Sjxs.sfkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(kkg){
			if(e.getX()>427&&e.getX()<474&&e.getY()>257&&e.getY()<300){
				System.out.println("���Կյ���");
				ktwz=3;
				Sjxs.zwkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(kkg){
			if(e.getX()>275&&e.getX()<325&&e.getY()>128&&e.getY()<164){
				System.out.println("���Կյ���");
				ktwz=4;
				Sjxs.cwkt=true;
				ktykkg=true;
				this.ktkg();
			}
		}
		if(jkg){
			if(e.getX()>257&&e.getX()<300&&e.getY()>400&&e.getY()<435){
				System.out.println("�������");
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

		if(ktykkg&&e.getX()>370&&e.getX()<590&&e.getY()>0&&e.getY()<560){//�յ�ң������ʾ����
			ktykkg=false;
			this.repaint();
		}
		if(ykkg&&e.getX()>274&&e.getX()<322&&e.getY()>37&&e.getY()<88){//TVң�������ؽ���
			if(tvxz==1){
				ykkg=false;
				Sjxs.kttv=false;
			}
			if(tvxz==2){
				ykkg=false;
				Sjxs.zwtv=false;
			}
		}
		if(ktykkg&&e.getX()>141&&e.getX()<170&&e.getY()>220&&e.getY()<251){//�յ�ң�������ؽ���
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

		if(ykkg&&e.getX()>480&&e.getX()<590&&e.getY()>0&&e.getY()<560){//TVң������ʾ����
			ykkg=false;
			this.repaint();
		}

		if(e.getX()>420&&e.getX()<550&&e.getY()>357&&e.getY()<420){//ͨ����ʾ����

			sptxkg=false;
			this.repaint();
		}
		if(thkg){
			if(e.getX()>159&&e.getX()<203&&e.getY()>393&&e.getY()<436){
				System.out.println("��Ƶ�Ự");
				sptxkg=true;
				this.thkg();

			}
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		//----�����봰��-----------
		//System.out.println("��������!!");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// --����뿪����--------
		//System.out.println("����ȥ��****");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// --��갴��--------
		System.out.println("��걻����--��λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		//--����ɿ�-----
		System.out.println("��걻�ɿ�+++��λ����:");
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
	}



	public void paint(Graphics g) {//�滭-------------
		super.paint(g);
		//----��------
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
		//--------����-------------
		if(ckg){
			g.drawImage(cl, 230, 460, this);
			g.drawImage(cl, 350, 340, this);
			g.drawImage(cl, 470, 280, this);
		}
		//-------�յ�---------
		if(kkg){
			g.drawImage(kt, 150, 330, this);
			g.drawImage(kt, 290, 270, this);
			g.drawImage(kt, 420, 220, this);
			g.drawImage(kt, 270, 90, this);
		}
		//--------���
		if(jkg){
			g.drawImage(jk, 250, 360, this);
		}
		//-------------ͨ��-------
		if(thkg){
			g.drawImage(th, 150, 360, this);
		}
		//------����--------
		if(skg){
			g.drawImage(sg, 55, 280, this);
			this.repaint();
		}else{
			g.drawImage(sk, 55, 280, this);
			this.repaint();
		}
		//---------��Ϣ���--------
		g.setColor(Color.RED);
		if(Sjxs.ktd){
			g.drawImage(deng, 20, 550,40,40, this);
			g.drawString(" ������", 20, 600);
		}
		if(Sjxs.sfd){
			g.drawImage(deng, 80, 550,40,40, this);
			g.drawString(" �鷿��", 80, 600);
		}
		if(Sjxs.zwd){
			g.drawImage(deng, 140, 550,40,40, this);
			g.drawString(" ���Ե�", 140, 600);
		}
		if(Sjxs.cwd){
			g.drawImage(deng, 200, 550,40,40, this);
			g.drawString(" ���Ե�", 200, 600);
		}
		if(Sjxs.xsjd){
			g.drawImage(deng, 260, 550,40,40, this);
			g.drawString("ϴ�ּ��", 260, 600);
		}
		if(Sjxs.cfd){
			g.drawImage(deng, 320, 550,40,40, this);
			g.drawString(" ������", 320, 600);
		}
		if(Sjxs.ktcl){
			g.drawImage(cl, 380, 550,40,40, this);
			g.drawString("  ����", 380, 600);
		}
		if(Sjxs.sfcl){
			g.drawImage(cl, 440, 550,40,40, this);
			g.drawString("  �鷿", 440, 600);
		}
		if(Sjxs.zwcl){
			g.drawImage(cl, 500, 550,40,40, this);
			g.drawString("  ����", 500, 600);
		}
		if(Sjxs.ktkt){
			g.drawImage(kt, 20, 620,40,40, this);
			g.drawString("  ����", 20, 675);
		}
		if(Sjxs.sfkt){
			g.drawImage(kt, 80, 620,40,40, this);
			g.drawString("  �鷿", 80, 675);
		}
		if(Sjxs.zwkt){
			g.drawImage(kt, 140, 620,40,40, this);
			g.drawString("  ����", 140, 675);
		}
		if(Sjxs.cwkt){
			g.drawImage(kt, 200, 620,40,40, this);
			g.drawString("  ����", 200, 675);
		}
		if(Sjxs.kttv){
			g.drawImage(tv, 260, 620,40,40, this);
			g.drawString("  ����", 260, 675);
		}
		if(Sjxs.zwtv){
			g.drawImage(tv, 320, 620,40,40, this);
			g.drawString("  ����", 320, 675);
		}
		if(Sjxs.jk){
			g.drawImage(jk, 380, 620,40,40, this);
			g.drawString("  ��Ƶ", 380, 675);
		}
		if(Sjxs.th){
			g.drawImage(th, 440, 620,40,40, this);
			g.drawString("  �Ự", 440, 675);
		}

		if(ykkg){//tvң����
			g.drawImage(ykq, 120, 5, this);
		}
		if(ktykkg){//�յ�ң����
			g.drawImage(ktyk, 120, 150, this);
		}
		if(sptxkg){//��Ƶ��ʾ
			g.drawImage(sptx, 50, 100, this);
		}
		if(ktbjkg){//��������
			g.drawImage(ktbj, 20, 60,550,400, this);
		}
	}
	public void dkg(){//�ƿ���

		kg++;
		if(kg%2==0){
			dkg=false;
		}else{
			dkg=true;
		}
		this.repaint();
	}
	public void tvkg(){//tv����

		tvkg++;
		if(tvkg%2==0){
			tkg=false;
		}else{
			tkg=true;
		}
		this.repaint();
	}
	public void ktkg(){//�յ�����

		ktkg++;
		if(ktkg%2==0){
			kkg=false;
		}else{
			kkg=true;
		}
		this.repaint();
	}
	public void jkkg(){//���

		jkkg++;
		if(jkkg%2==0){
			jkg=false;
		}else{
			jkg=true;
		}
		this.repaint();
	}
	public void clkg(){//��������

		clkg++;
		if(clkg%2==0){
			ckg=false;
		}else{
			ckg=true;
		}
		this.repaint();
	}
	public void ktbjkg(){//��������

		ktbjkgi++;
		if(ktbjkgi%2==0){
			ktbjkg=false;
		}else{
			ktbjkg=true;
		}
		this.repaint();
	}
	public void thkg(){//ͨ��

		hhkg++;
		if(hhkg%2==0){
			thkg=false;
		}else{
			thkg=true;
		}
		this.repaint();
	}
	public void skg(){//ͨ��

		mskg++;
		if(mskg%2==0){
			skg=false;
			System.out.println("�Źر�---");
		}else{
			skg=true;
			System.out.println("�Ŵ�---");
		}
		this.repaint();
	}


}
