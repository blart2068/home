
public class �ټ��� {
	static int win;
	static int sum = 10000;
	static int yz = 300;
	static int i;
	static boolean b=true;
	public static void main(String[] args) throws InterruptedException {
		
		while (b) {
			if(sum<=0&&sum>=50000){
				return;
			}
			i=i+1;
			win = (int)(Math.random()*2);
			if (win==0) {
				sum=sum+yz;
				yz=300;
			}
			if (win==1) {
				sum=sum-yz;
				yz=yz*2;
			}
			System.out.println(win+"����"+sum+"����"+i+"nextѺ��"+yz);
			Thread.sleep(100);
		}
	}
	
}
