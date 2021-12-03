package jiemian;


import java.awt.Robot;
import java.awt.event.KeyEvent;
public class anjl extends Thread {
	static int ycsj=6000;
	static int t =0;
	static boolean zdy=true;//自定义出价判断
	public void run() {
		anjl.zb(JM.x, JM.y);
	}

	public static void zb(int x,int y){
		//public static void main(String[] args) {
		//int x=190;int y =202;
		System.out.println("88888888");
		try {
			Robot r =new Robot();

			if(zdy){//不是自定义出价执行---------------------
				r.mouseMove(x+700,y+460);//鼠标移到得到相应位置
				r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
				r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
				r.keyPress(KeyEvent.VK_CONTROL); //按下ctrl+a 全选 
				r.keyPress(KeyEvent.VK_A); 
				r.keyRelease(KeyEvent.VK_A);  //释放全选键
				r.keyRelease(KeyEvent.VK_CONTROL); 
				r.keyPress(KeyEvent.VK_BACK_SPACE);//按下退格键
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//释放退格键
				//---------------输入千位数----------------
				if(JM.cjjg-2000>=0){
					t=2000;
					r.keyPress(KeyEvent.VK_2);  //按下键盘的数字键2
					r.keyRelease(KeyEvent.VK_2);
				}else 
					if(JM.cjjg-1000>=0){
						t=1000;
						r.keyPress(KeyEvent.VK_1);  //按下键盘的数字键1
						r.keyRelease(KeyEvent.VK_1);
					}else 
						if(JM.cjjg-3000>=0){
							t=3000;
							r.keyPress(KeyEvent.VK_3);  //按下键盘的数字键3
							r.keyRelease(KeyEvent.VK_3);
						}else 
							if(JM.cjjg-4000>=0){
								t=4000;
								r.keyPress(KeyEvent.VK_4);  //按下键盘的数字键4
								r.keyRelease(KeyEvent.VK_4);
							}
							else 
								if(JM.cjjg-5000>=0){
									t=5000;
									r.keyPress(KeyEvent.VK_5);  //按下键盘的数字键5
									r.keyRelease(KeyEvent.VK_5);
								}else 
									if(JM.cjjg-6000>=0){
										t=6000;
										r.keyPress(KeyEvent.VK_6);  //按下键盘的数字键6
										r.keyRelease(KeyEvent.VK_6);
									}else 
										if(JM.cjjg-7000>=0){
											t=7000;
											r.keyPress(KeyEvent.VK_7);  //按下键盘的数字键7
											r.keyRelease(KeyEvent.VK_7);
										}else 
											if(JM.cjjg-8000>=0){
												t=8000;
												r.keyPress(KeyEvent.VK_8);  //按下键盘的数字键8
												r.keyRelease(KeyEvent.VK_8);
											}else 
												if(JM.cjjg-9000>=0){
													t=9000;
													r.keyPress(KeyEvent.VK_9);  //按下键盘的数字键8
													r.keyRelease(KeyEvent.VK_9);
												}
				//-----------输入百位数-----------------

				if(JM.cjjg-t==700){
					r.keyPress(KeyEvent.VK_7);  //按下键盘的数字键--出价700
					r.keyRelease(KeyEvent.VK_7); 
				}else
					if(JM.cjjg-t==500){
						r.keyPress(KeyEvent.VK_5);  //按下键盘的数字键--出价500
						r.keyRelease(KeyEvent.VK_5); 
					}else
						if(JM.cjjg-t==600){
							r.keyPress(KeyEvent.VK_6);  //按下键盘的数字键--出价600
							r.keyRelease(KeyEvent.VK_6); 
						}else
							if(JM.cjjg-t==400){
								r.keyPress(KeyEvent.VK_4);  //按下键盘的数字键--出价400
								r.keyRelease(KeyEvent.VK_4); 
							}else
								if(JM.cjjg-t==300){
									r.keyPress(KeyEvent.VK_3);  //按下键盘的数字键--出价300
									r.keyRelease(KeyEvent.VK_3); 
								}else
									if(JM.cjjg-t==200){
										r.keyPress(KeyEvent.VK_2);  //按下键盘的数字键--出价200
										r.keyRelease(KeyEvent.VK_2); 
									}else
										if(JM.cjjg-t==100){
											r.keyPress(KeyEvent.VK_1);  //按下键盘的数字键--出价100
											r.keyRelease(KeyEvent.VK_1); 
										}else
											if(JM.cjjg-t==800){
												r.keyPress(KeyEvent.VK_8);  //按下键盘的数字键--出价800
												r.keyRelease(KeyEvent.VK_8); 
											}else
												if(JM.cjjg-t==900){
													r.keyPress(KeyEvent.VK_9);  //按下键盘的数字键--出价800
													r.keyRelease(KeyEvent.VK_9); 
												}else
													if(JM.cjjg-t==0){
														r.keyPress(KeyEvent.VK_0);  //按下键盘的数字键--出价0
														r.keyRelease(KeyEvent.VK_0); 
													}



				r.keyPress(KeyEvent.VK_0);  
				r.keyRelease(KeyEvent.VK_0);
				r.keyPress(KeyEvent.VK_0);  
				r.keyRelease(KeyEvent.VK_0);
			}//自定义只执行以下内容:不输入价格


			r.mouseMove(x+810, y+450);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			r.mouseMove(x+810, y+560);//鼠标移到得到相应位置
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			//			r.delay(2000);//延迟半秒
			//			r.mouseMove(x+860,y+430);//鼠标移到得到相应位置
			//			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
			//			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			//			r.mouseMove(x+1000, y+430);//鼠标移到得到相应位置
			//			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
			//			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
			r.delay(ycsj);//延迟出价时间
			r.mouseMove(x+570,y+640);//鼠标移到得到相应位置--点击确定出价
			r.mousePress(KeyEvent.BUTTON1_MASK); //按下鼠标左键 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //松开鼠标左键
		} catch (Exception e) {}

	}

}
