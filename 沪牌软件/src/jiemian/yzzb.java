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
			r.mouseMove(x+700,y+460);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
			r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
			
				r.keyPress(KeyEvent.VK_CONTROL); //����ctrl+a ȫѡ 
				r.keyPress(KeyEvent.VK_A); 
				r.keyRelease(KeyEvent.VK_A);  //�ͷ�ȫѡ��
				r.keyRelease(KeyEvent.VK_CONTROL); 
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_9);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_9); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_8);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_8); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_7);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_7); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_6);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_6); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_5);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_5); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_4);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_4); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_3);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_3);
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_2);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_2); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_1);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_1); 
				r.delay(300);//�ӳ�1��
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_CONTROL); //����ctrl+a ȫѡ 
				r.keyPress(KeyEvent.VK_A); 
				r.keyRelease(KeyEvent.VK_A);  //�ͷ�ȫѡ��
				r.keyRelease(KeyEvent.VK_CONTROL); 
				r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
				r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
				r.keyPress(KeyEvent.VK_1);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_1); 
				r.keyPress(KeyEvent.VK_0);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_0); 
				r.keyPress(KeyEvent.VK_0);  //���¼��̵����ּ�
				r.keyRelease(KeyEvent.VK_0); 
				JM.jt.append("��֤���,���㿴��������������б仯���ͣ����100��ô�����������");
				JM.jt.setCaretPosition(JM.jt.getText().length());//���λ����


		} catch (AWTException e) {e.printStackTrace();}
	}
}
