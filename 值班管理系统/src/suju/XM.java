package suju;



public class XM {
	static final String cj=" �̽�";
	static final String sjj=" ��Ѽ�";
	static final String lh=" ���";
	static final String njw=" �߼�ΰ";
	static final String yf=" ���";
	static String y1;
	static String y2;
	static String y3;
	static String y4;
	static String y5;
	
	
	
	

	public static void setxm(int sum){

		//		y1=cj;y2=sjj;y3=lh;y4=njw;y5=yf;
		//		y2=cj;y3=sjj;y4=lh;y5=njw;y1=yf;
		//		y3=cj;y4=sjj;y5=lh;y1=njw;y2=yf;
		//		y4=cj;y5=sjj;y1=lh;y2=njw;y3=yf;
		y5=cj;y1=sjj;y2=lh;y3=njw;y4=yf;
		//System.out.println("**************"+sum);//��ʾͳ����������
		if (guize.gdr(sum)) {//�����պ���
			
		}else{
			switch (sum%5) {

			case 1:
				jisun.xm=y1;
				break;
			case 2:
				jisun.xm=y2;
				break;
			case 3:
				jisun.xm=y3;
				break;
			case 4:
				jisun.xm=y4;
				break;
			case 0:
				jisun.xm=y5;
				break;

			default:
				break;
			}
		}
	}
}
