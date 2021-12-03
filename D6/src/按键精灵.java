
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class 按键精灵  {
	public static void main(String args[]){
		System.out.println("按键精灵");
		try {
			Robot r =new Robot();
			
			r.mouseMove(1200,410);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
	        r.keyPress(KeyEvent.VK_CONTROL); //按下ctrl+a 全选 
	        r.keyPress(KeyEvent.VK_A); 
	        r.keyRelease(KeyEvent.VK_A);  //释放全选键
	        r.keyRelease(KeyEvent.VK_CONTROL); 
	        r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
	        r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
	     
	        r.keyPress(KeyEvent.VK_5);  //按下键盘的数字键
	        r.keyRelease(KeyEvent.VK_5); 
	        r.keyPress(KeyEvent.VK_0);  
	        r.keyRelease(KeyEvent.VK_0);
	        r.keyPress(KeyEvent.VK_0);  
	        r.keyRelease(KeyEvent.VK_0);
	        r.mouseMove(1310, 410);//鼠标移到得到相应位置
	        r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
	        r.mouseMove(1310, 520);//鼠标移到得到相应位置
	        r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
	        r.delay(6000);//延迟6秒
	        r.mouseMove(1070,600);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
		} catch (Exception e) {}
		
	}
	
}
