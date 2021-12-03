class nvren{
	static private char xb='女';
	static public String gn(int money){
		if(money>=100){
		return xb+"M-k-l-o\t";
		}return "--no服务--";
	}
}
class bai extends nvren{
	static private String fs;
	static public String jn(int money){
		if(money>=200){
			
			fs="bai";
		return nvren.gn(100)+fs+"欧O\t";
		}
		fs="hei";
		return nvren.gn(100)+fs+"无技能";
	}
}
class baiaz extends bai{
	static private int age;
	static private char dj;
	static public String mz(int money){
		if(money>=1000){
			age=18;
			dj='S';
			return bai.jn(200)+"年龄为"+age+"货品为"+dj;
		}else if(money<1000&money>500){
			age=25;
			dj='A';
			return bai.jn(200)+"年龄为"+age+"货品为"+dj+"提供服务";
			}else if(money<500&money>200){
				age=30;
				dj='B';
				return bai.jn(200)+"年龄为"+age+"货品为"+dj+"提供服务";
			}
		return bai.jn(200)+"年龄30+货品B- 提供服务";
	}
}
public class D33 {
	public static void main(String[]args){
		System.out.println(baiaz.mz(1000));
		System.out.println(bai.jn(200));
	}
}
