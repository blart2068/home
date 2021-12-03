package tank;

import java.awt.*;
import javax.swing.JPanel;

public class Guanka extends JPanel implements Runnable{
	static Image tanka;
	int jg=0;
	boolean ztsm=true;

	Guanka(){//构造
		tanka=Toolkit.getDefaultToolkit().getImage(Paint.class.getResource("/Tank.png"));
	}

	public void paint(Graphics g) {//画板
		super.paint(g);
		g.drawImage(tanka, 0, 0, 1200,660,this);
		g.setColor(Color.RED);
		if(ztsm){
			Font zt=new Font("楷体", Font.BOLD, 60);
			g.setFont(zt);
			g.drawString("请按开始", 500, 500);
			g.drawString("  游戏", 500, 570);}

	}
	public void qdjg(){//字体生命
		if(jg%2!=0){
			ztsm=false;
		}else{
			ztsm=true;
		}
	}

	public void run(){//线程
		for(;;jg++){
			if(jg>100){
				jg=0;
			}
			try {
				Thread.sleep(300);
			} catch (Exception e) {}
			this.qdjg();
			this.repaint();
		}
	}

}
