
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class ��������  {
	public static void main(String args[]){
		System.out.println("��������");
		try {
			Robot r =new Robot();
			
			r.mouseMove(1200,410);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
	        r.keyPress(KeyEvent.VK_CONTROL); //����ctrl+a ȫѡ 
	        r.keyPress(KeyEvent.VK_A); 
	        r.keyRelease(KeyEvent.VK_A);  //�ͷ�ȫѡ��
	        r.keyRelease(KeyEvent.VK_CONTROL); 
	        r.keyPress(KeyEvent.VK_BACK_SPACE);//�����˸��
	        r.keyRelease(KeyEvent.VK_BACK_SPACE);//�ͷ��˸��
	     
	        r.keyPress(KeyEvent.VK_5);  //���¼��̵����ּ�
	        r.keyRelease(KeyEvent.VK_5); 
	        r.keyPress(KeyEvent.VK_0);  
	        r.keyRelease(KeyEvent.VK_0);
	        r.keyPress(KeyEvent.VK_0);  
	        r.keyRelease(KeyEvent.VK_0);
	        r.mouseMove(1310, 410);//����Ƶ��õ���Ӧλ��
	        r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
	        r.mouseMove(1310, 520);//����Ƶ��õ���Ӧλ��
	        r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
	        r.delay(6000);//�ӳ�6��
	        r.mouseMove(1070,600);//����Ƶ��õ���Ӧλ��
			r.mousePress(KeyEvent.BUTTON1_MASK); //���������� 
	        r.mouseRelease(KeyEvent.BUTTON1_MASK); //�ɿ�������
		} catch (Exception e) {}
		
	}
	
}
