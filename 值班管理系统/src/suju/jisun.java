package suju;

public class jisun {
	public static String xm;
	public static String zbb="\n\n";
	public static void js(int year,int month){
		int day=1;
		int sum=0; //计算总天数
		
		for(int i=1900;i<year;i++){//计算整年
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int i=1;i<month;i++){//计算整月
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
		if(month==2){//计算整天
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
		sum+=1;//设置成当月的第一天来计算星期
		int xq=sum%7;
		String lb="礼拜";
		switch((sum+day-1)%7){//计算查询日期的星期几
		case 0:
			lb="日";
			break;
		case 1:
			lb="一";
			break;
		case 2:
			lb="二";
			break;
		case 3:
			lb="三";
			break;
		case 4:
			lb="四";
			break;
		case 5:
			lb="五";
			break;
		case 6:
			lb="六";
			break;
		}
		System.out.println(year+"年"+month+"月"+day+"日  星期"+lb);
		String tt="一一一一一一一一一一一一一一一一一一一"+year+"年"+month+"月"+""
						+ "一一一一一一一一一一一一一一一一一一一\n";
				
		zbb+=tt;
		System.out.println("    日\t\t    一\t\t    二\t\t    三\t\t    四\t\t    五\t\t    六\n");
		zbb+="    日\t    一\t    二\t    三\t    四\t    五\t    六\n";
		for(int i=0;i<xq;i++){//排列当月1号的星期位置
			zbb+="\t";
			System.out.print("\t\t");
		}
		for(int i=1;i<=days;i++){//打印出当月天数
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
	