/**
 * @author blart
 * @version 1.0
 * int����  ���ֵ����	    ���      	ȡƽ����
 * */
public class MyGj {
	private MyGj(){};
	/**
	 * ����
	 * */
	static void px(int []arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
	/**
	 * ���
	 * */
	static int sum(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	/**
	 * ƽ����
	 * */
	static int avg(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum/arr.length;
	}
}
