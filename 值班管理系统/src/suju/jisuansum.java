package suju;
//����sum��
public class jisuansum {
	public static void main(String[] args) {
		js(2019,10,1);
	}

	public static void js(int year,int month,int day){
		
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
//		int days=0;
//		if(month==2){//��������
//			if(year%4==0&&year%100!=0||year%400==0){
//				days=29;
//			}else{
//				days=28;
//			}
//			}else if(month==4||month==6||month==9||month==11){
//				days=30;
//			}else{
//				days=31;
//			}
		sum+=day;//���óɵ��µĵ�һ������������
		System.out.println(sum);
	}
}
