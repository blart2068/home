package jiemian;


import java.awt.Robot;
import java.awt.event.KeyEvent;
public class anjl extends Thread {
	static int ycsj=6000;
	static int t =0;
	static boolean zdy=true;//�Զ�������ж�
	public void run() {
		anjl.zb(JM.x, JM.y);
	}

	public static void zb(int x,int y){
		//public static void main(String[] args) {
		//int x=190;int y =202;
		System.out.println("88888888");
		try {
			Robot r =new Robot();

			if(zdy){//�����Զ������ִ��---------------------
				r.mouseMove(x+700,y+460);//����Ƶ��õ���Ӧλ��
				r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
				r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
				r.keyPress(KeyEvent.VK_CONTROL); //����ctrl+a ȫѡ 
				r.keyPress(KeyEvent.VK_A); 
				r.keyRelease(KeyEvent.VK_A);  //�ͷ�ȫѡ��
				r.keyRelease(KeyEvent.VK_CONTROL); 
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				//---------------����ǧλ��----------------
				if(JM.cjjg-2000>=0){
					t=2000;
					r.keyPress(KeyEvent.VK_2);  //���¼��̵����ּ�2
					r.keyRelease(KeyEvent.VK_2);
				}else 
					if(JM.cjjg-1000>=0){
						t=1000;
						r.keyPress(KeyEvent.VK_1);  //���¼��̵����ּ�1
						r.keyRelease(KeyEvent.VK_1);
					}else 
						if(JM.cjjg-3000>=0){
							t=3000;
							r.keyPress(KeyEvent.VK_3);  //���¼��̵����ּ�3
							r.keyRelease(KeyEvent.VK_3);
						}else 
							if(JM.cjjg-4000>=0){
								t=4000;
								r.keyPress(KeyEvent.VK_4);  //���¼��̵����ּ�4
								r.keyRelease(KeyEvent.VK_4);
							}
							else 
								if(JM.cjjg-5000>=0){
									t=5000;
									r.keyPress(KeyEvent.VK_5);  //���¼��̵����ּ�5
									r.keyRelease(KeyEvent.VK_5);
								}else 
									if(JM.cjjg-6000>=0){
										t=6000;
										r.keyPress(KeyEvent.VK_6);  //���¼��̵����ּ�6
										r.keyRelease(KeyEvent.VK_6);
									}else 
										if(JM.cjjg-7000>=0){
											t=7000;
											r.keyPress(KeyEvent.VK_7);  //���¼��̵����ּ�7
											r.keyRelease(KeyEvent.VK_7);
										}else 
											if(JM.cjjg-8000>=0){
												t=8000;
												r.keyPress(KeyEvent.VK_8);  //���¼��̵����ּ�8
												r.keyRelease(KeyEvent.VK_8);
											}else 
												if(JM.cjjg-9000>=0){
													t=9000;
													r.keyPress(KeyEvent.VK_9);  //���¼��̵����ּ�8
													r.keyRelease(KeyEvent.VK_9);
												}
				//-----------�����λ��-----------------

				if(JM.cjjg-t==700){
					r.keyPress(KeyEvent.VK_7);  //���¼��̵����ּ�--����700
					r.keyRelease(KeyEvent.VK_7); 
				}else
					if(JM.cjjg-t==500){
						r.keyPress(KeyEvent.VK_5);  //���¼��̵����ּ�--����500
						r.keyRelease(KeyEvent.VK_5); 
					}else
						if(JM.cjjg-t==600){
							r.keyPress(KeyEvent.VK_6);  //���¼��̵����ּ�--����600
							r.keyRelease(KeyEvent.VK_6); 
						}else
							if(JM.cjjg-t==400){
								r.keyPress(KeyEvent.VK_4);  //���¼��̵����ּ�--����400
								r.keyRelease(KeyEvent.VK_4); 
							}else
								if(JM.cjjg-t==300){
									r.keyPress(KeyEvent.VK_3);  //���¼��̵����ּ�--����300
									r.keyRelease(KeyEvent.VK_3); 
								}else
									if(JM.cjjg-t==200){
										r.keyPress(KeyEvent.VK_2);  //���¼��̵����ּ�--����200
										r.keyRelease(KeyEvent.VK_2); 
									}else
										if(JM.cjjg-t==100){
											r.keyPress(KeyEvent.VK_1);  //���¼��̵����ּ�--����100
											r.keyRelease(KeyEvent.VK_1); 
										}else
											if(JM.cjjg-t==800){
												r.keyPress(KeyEvent.VK_8);  //���¼��̵����ּ�--����800
												r.keyRelease(KeyEvent.VK_8); 
											}else
												if(JM.cjjg-t==900){
													r.keyPress(KeyEvent.VK_9);  //���¼��̵����ּ�--����800
													r.keyRelease(KeyEvent.VK_9); 
												}else
													if(JM.cjjg-t==0){
														r.keyPress(KeyEvent.VK_0);  //���¼��̵����ּ�--����0
														r.keyRelease(KeyEvent.VK_0); 
													}



				r.keyPress(KeyEvent.VK_0);  
				r.keyRelease(KeyEvent.VK_0);
				r.keyPress(KeyEvent.VK_0);  
				r.keyRelease(KeyEvent.VK_0);
			}//�Զ���ִֻ����������:������۸�


			r.mouseMove(x+810, y+450);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			r.mouseMove(x+810, y+560);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			//			r.delay(2000);//�ӳٰ���
			//			r.mouseMove(x+860,y+430);//����Ƶ��õ���Ӧλ��
			//			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
			//			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			//			r.mouseMove(x+1000, y+430);//����Ƶ��õ���Ӧλ��
			//			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
			//			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			r.delay(ycsj);//�ӳٳ���ʱ��
			r.mouseMove(x+570,y+640);//����Ƶ��õ���Ӧλ��--���ȷ������
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
		} catch (Exception e) {}

	}

}
