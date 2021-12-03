
public class kkk {

	public static void main(String[] args) {
		int i=0;
		for(int x=0;;x++){
			if(x%1==0&&x%2==1&&x%3==0&&x%4==1&&x%5==1&&x%6==3&&x%7==0&&x%8==1&&x%9==0){
				System.out.println("¼¦µ°ÊýÁ¿ÊÇ"+x);
				i++;
			}
			if(i==10){
				return;
			}
		}
	}

}
