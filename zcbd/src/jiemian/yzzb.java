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
			JM.jln.setText("�Ե������:"+(j+1));
		yzzb.Yzzb(JM.x, JM.y);
		try {//����
			Thread.sleep(sj*1000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		}
	}

	public static void Yzzb(int x, int y){
		try {
			r = new Robot();
			r.mouseMove(x+200,y+140);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			r.keyPress(KeyEvent.VK_F5);//����f5
			r.keyRelease(KeyEvent.VK_F5);//�ɿ�F5
			r.delay(2000);//�ӳ�1��
			for(int i=0;i<6;i++){
				r.keyPress(KeyEvent.VK_PAGE_DOWN);//����f5
				r.keyRelease(KeyEvent.VK_PAGE_DOWN);//�ɿ�F5
			}
			r.mouseMove(x+100,y+485);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� -------�������λ��
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			hx();
			r.keyPress(KeyEvent.VK_TAB);//����tab
			r.keyRelease(KeyEvent.VK_TAB);//�ɿ�
			hx();
			r.keyPress(KeyEvent.VK_TAB);//����
			r.keyRelease(KeyEvent.VK_TAB);//�ɿ�
			hx();
			r.keyPress(KeyEvent.VK_TAB);//����
			r.keyRelease(KeyEvent.VK_TAB);//�ɿ�
			tel();
			r.mouseMove(x+180,y+520);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� -------�������λ��
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			r.delay(2000);//�ӳ�2��
			r.keyPress(KeyEvent.VK_ENTER);//����
			r.keyRelease(KeyEvent.VK_ENTER);//�ɿ�

		} catch (AWTException e) {e.printStackTrace();}
	}

	public static void hx() {//���뻧��

		java.util.Random random=new java.util.Random();// ���������
		int result=random.nextInt(3)+1;// ����[1,3)�����е�����
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
	
	public static void tel() {//����绰
		java.util.Random random=new java.util.Random();// ���������
		int result=random.nextInt(5);// ����[0,4)�����е�����
		r.keyPress(KeyEvent.VK_1);//�����׺�1
		r.keyRelease(KeyEvent.VK_1);
		if(result==0){//����138
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
		for(int i =0;i<8;i++){//�����8λ
			int result2=random.nextInt(10);// ����[0,9)�����е�����
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
