package jiemian;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class yzzb extends Thread{
	static int i=1;
	static int sj=0;
	static Robot r;
	public void run() {
		for(int j=0;j<i;j++){
			JM.jln.setText("以点击次数:"+(j+1));
		yzzb.Yzzb(JM.x, JM.y);
		try {//休眠
			Thread.sleep(sj*1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		}
	}

	public static void Yzzb(int x, int y){
		try {
			r = new Robot();
			r.mouseMove(x+200,y+140);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			r.keyPress(KeyEvent.VK_F5);//按下f5
			r.keyRelease(KeyEvent.VK_F5);//松开F5
			r.delay(2000);//延迟1秒
			for(int i=0;i<6;i++){
				r.keyPress(KeyEvent.VK_PAGE_DOWN);//按下f5
				r.keyRelease(KeyEvent.VK_PAGE_DOWN);//松开F5
			}
			r.mouseMove(x+100,y+485);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 -------点击输入位置
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			hx();
			r.keyPress(KeyEvent.VK_TAB);//按下tab
			r.keyRelease(KeyEvent.VK_TAB);//松开
			hx();
			r.keyPress(KeyEvent.VK_TAB);//按下
			r.keyRelease(KeyEvent.VK_TAB);//松开
			hx();
			r.keyPress(KeyEvent.VK_TAB);//按下
			r.keyRelease(KeyEvent.VK_TAB);//松开
			tel();
			r.mouseMove(x+180,y+520);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 -------点击输入位置
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			r.delay(2000);//延迟2秒
			r.keyPress(KeyEvent.VK_ENTER);//按下
			r.keyRelease(KeyEvent.VK_ENTER);//松开

		} catch (AWTException e) {e.printStackTrace();}
	}

	public static void hx() {//输入户型

		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(3)+1;// 返回[1,3)集合中的整数
		if(result==1){
			r.keyPress(KeyEvent.VK_1);
			r.keyRelease(KeyEvent.VK_1);
		}   else if (result==2) {
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
		}   else if (result==3) {
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
		}           

	}
	
	public static void tel() {//输入电话
		java.util.Random random=new java.util.Random();// 定义随机类
		int result=random.nextInt(5);// 返回[0,4)集合中的整数
		r.keyPress(KeyEvent.VK_1);//输入首号1
		r.keyRelease(KeyEvent.VK_1);
		if(result==0){//输入138
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
			r.keyPress(KeyEvent.VK_8);
			r.keyRelease(KeyEvent.VK_8);
		}   else if (result==1) {//139
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
		}   else if (result==2) {//189
			r.keyPress(KeyEvent.VK_8);
			r.keyRelease(KeyEvent.VK_8);
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
		}  else if (result==3) {//130
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
			r.keyPress(KeyEvent.VK_0);
			r.keyRelease(KeyEvent.VK_0);
		}    else if (result==4) {//135
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
			r.keyPress(KeyEvent.VK_5);
			r.keyRelease(KeyEvent.VK_5);
		}  
		for(int i =0;i<8;i++){//输入后8位
			int result2=random.nextInt(10);// 返回[0,9)集合中的整数
			if(result2==0){//
				r.keyPress(KeyEvent.VK_0);
				r.keyRelease(KeyEvent.VK_0);
			}else if (result2==1) {
				r.keyPress(KeyEvent.VK_1);
				r.keyRelease(KeyEvent.VK_1);
			}else if (result2==2) {
				r.keyPress(KeyEvent.VK_2);
				r.keyRelease(KeyEvent.VK_2);
			}else if (result2==3) {
				r.keyPress(KeyEvent.VK_3);
				r.keyRelease(KeyEvent.VK_3);
			}else if (result2==4) {
				r.keyPress(KeyEvent.VK_4);
				r.keyRelease(KeyEvent.VK_4);
			}else if (result2==5) {
				r.keyPress(KeyEvent.VK_5);
				r.keyRelease(KeyEvent.VK_5);
			}else if (result2==6) {
				r.keyPress(KeyEvent.VK_6);
				r.keyRelease(KeyEvent.VK_6);
			}else if (result2==7) {
				r.keyPress(KeyEvent.VK_7);
				r.keyRelease(KeyEvent.VK_7);
			}else if (result2==8) {
				r.keyPress(KeyEvent.VK_8);
				r.keyRelease(KeyEvent.VK_8);
			}else if (result2==9) {
				r.keyPress(KeyEvent.VK_9);
				r.keyRelease(KeyEvent.VK_9);
			}
			
		}
		
	}
}
