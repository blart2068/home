/**
 * @author blart
 * @version 1.0
 * int数组  最大值排序	    求和      	取平均数
 * */
public class MyGj {
	private MyGj(){};
	/**
	 * 排序
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
	 * 求和
	 * */
	static int sum(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	/**
	 * 平均数
	 * */
	static int avg(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum/arr.length;
	}
}
