package my;

/**  
* @Title: TestMain.java
* @Package org.test
* @Description: TODO�÷�������Ҫ���ã�
* @author A18ccms A18ccms_gmail_com  
* @date 2017-5-29 ����8:15:33
* @version V1.0  
*/


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**   
*    
* ��Ŀ���ƣ�Test  
* �����ƣ�TestMain   
* ��������   ����
* �����ˣ�Mu Xiongxiong  
* ����ʱ�䣺2017-5-29 ����8:15:33   
* �޸��ˣ�Mu Xiongxiong   
* �޸�ʱ�䣺2017-5-29 ����8:15:33   
* �޸ı�ע��   
* @version    
*    
*/
public class TestMain {
	
	/**
	 * 
	* @Title: main
	* @Description: �÷�������Ҫ���ã�
	* ���¼��ܷ�����һ�����ֽ��м���
	* ���ܹ����Ȱ��⴮���ֽ���Ȼ��ÿ�����ֽ��м�5��
	* ���úͳ���10��������������֣�
	* ��󽫵�һλ�������һλ�����н���,�������
	* @param  @param args �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	public static void main(String[] args) {
		// ����
		System.out.println("��������Ҫ���ܵ����֣�");
		Scanner in = new Scanner(System.in);
		String num = in.next();
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(num.trim());
		if (isNum.matches()) {
			// ִ�м��ܵķ���
			encrypt(num);
		} else {
			System.out.println("����Ĳ������֣�����������");
		}
	}
	
	/**
	 * 
	* @Title: encrypt
	* @Description: �÷�������Ҫ���ã�
	* @param   �趨�ļ�  
	* @return  �������ͣ�void   
	* @throws
	 */
	public static void encrypt(String stuNum){
		String  	encrypt =   "";					//���ܺ���ַ���
		String  	yuan    =   "";					//����λ��ǰ
		int  		num   	=   0;               	//��ֳɵ�������
		int  		sNum  	=   0;               	//ÿ�����ּ�5֮��
		int  		yNum  	=   0;               	//ÿ�����ֵĺͳ���10������ 
		
		
		
		int n [] = new int[stuNum.length()];
		//��ÿ������ת����int���͵�
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(String.valueOf(stuNum.charAt(i)));
			
		}
		
		//ͨ��ð�����򷨽��н�������
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 0; j < n.length - 1 - i; j++) {
				if (n[j] < n[j + 1]) {
					int temp;
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			String cNum = n[i]+"";
			num = Integer.parseInt(cNum);
			//����ÿ�����ּ�5
			sNum = num+5;
			//���úͳ���6���������������
			yNum = sNum % 6;
			//�úͳ���6������
			num  = yNum; 
			//��ÿ�����ֶ�����yuan���ַ�������
			yuan += num;
		}
		//�����һ�����ֺ͵�һ�����ֽ���λ��
		int m [] = new int[yuan.length()];
		//��ÿ������ת����int���͵�
		for (int i = 0; i < m.length; i++) {
			m[i] = Integer.parseInt(String.valueOf(yuan.charAt(i)));
		}
		//����λ��
		int fristNum = m[0];
		m[0]= m[m.length-1];
		m[m.length-1] = fristNum;
		for (int i = 0; i < m.length; i++) {
			encrypt += m[i];
		}
		//�Ѽ��ܺ����������ַ�����
		System.out.println("ԭ���ĵ绰���룺"+stuNum);
		System.out.println("���ܺ�ĵ绰���룺"+encrypt);
	}

}


