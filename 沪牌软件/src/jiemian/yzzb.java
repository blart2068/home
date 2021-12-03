package jiemian;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class yzzb extends Thread{

	
	
	public void run() {
		yzzb.Yzzb(JM.x, JM.y);
	}

	public static void Yzzb(int x, int y){
		
		try {
			Robot r = new Robot();
			r.mouseMove(x+700,y+460);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			
				r.keyPress(KeyEvent.VK_CONTROL); //按下ctrl+a 全选 
				r.keyPress(KeyEvent.VK_A); 
				r.keyRelease(KeyEvent.VK_A);  //释放全选键
				r.keyRelease(KeyEvent.VK_CONTROL); 
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_9);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_9); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_8);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_8); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_7);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_7); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_6);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_6); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_5);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_5); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_4);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_4); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_3);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_3);
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_2);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_2); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_1);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_1); 
				r.delay(300);//延迟1秒
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_CONTROL); //按下ctrl+a 全选 
				r.keyPress(KeyEvent.VK_A); 
				r.keyRelease(KeyEvent.VK_A);  //释放全选键
				r.keyRelease(KeyEvent.VK_CONTROL); 
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				r.keyPress(KeyEvent.VK_1);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_1); 
				r.keyPress(KeyEvent.VK_0);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_0); 
				r.keyPress(KeyEvent.VK_0);  //按下键盘的数字键
				r.keyRelease(KeyEvent.VK_0); 
				JM.jt.append("验证完成,如你看到输入框内数字有变化最后停留在100那么外挂运行正常");
				JM.jt.setCaretPosition(JM.jt.getText().length());//光标位置新


		} catch (AWTException e) {e.printStackTrace();}
	}
}
