package suju;

public class jisun {
	public static String xm;
	public static String zbb="\n\n";
	public static void js(int year,int month){
		int day=1;
		int sum=0; //����������
		
		for(int i=1900;i<year;i++){//��������
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int i=1;i<month;i++){//��������
			if(i==2){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=29;
			}else{
				sum+=28;
			}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
		}
		int days=0;
		if(month==2){//��������
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}
			}else if(month==4||month==6||month==9||month==11){
				days=30;
			}else{
				days=31;
			}
		sum+=1;//���óɵ��µĵ�һ������������
		int xq=sum%7;
		String lb="���";
		switch((sum+day-1)%7){//�����ѯ���ڵ����ڼ�
		case 0:
			lb="��";
			break;
		case 1:
			lb="һ";
			break;
		case 2:
			lb="��";
			break;
		case 3:
			lb="��";
			break;
		case 4:
			lb="��";
			break;
		case 5:
			lb="��";
			break;
		case 6:
			lb="��";
			break;
		}
		System.out.println(year+"��"+month+"��"+day+"��  ����"+lb);
		String tt="һһһһһһһһһһһһһһһһһһһ"+year+"��"+month+"��"+""
						+ "һһһһһһһһһһһһһһһһһһһ\n";
				
		zbb+=tt;
		System.out.println("    ��\t\t    һ\t\t    ��\t\t    ��\t\t    ��\t\t    ��\t\t    ��\n");
		zbb+="    ��\t    һ\t    ��\t    ��\t    ��\t    ��\t    ��\n";
		for(int i=0;i<xq;i++){//���е���1�ŵ�����λ��
			zbb+="\t";
			System.out.print("\t\t");
		}
		for(int i=1;i<=days;i++){//��ӡ����������
			if(sum%7==6){
					XM.setxm(sum);
					zbb+=i+xm+"\n";
					System.out.print(i+xm+"\n\n");
			}else {
				XM.setxm(sum);
				zbb+=i+xm+"\t";
				System.out.print(i+xm+"\t\t");
			}
			sum+=1;
		}
		//zbb+="\n";
	}
}
	