
public class D631 {
	public static void main(String[] aa){
		int []arr={32,54,98,24,784,68,741};
		int []arr2={45,47,52,68,92,15,65,74,};
		MyGj.px(arr);
		MyGj.px(arr2);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		System.out.println(MyGj.sum(arr));
		System.out.println(MyGj.avg(arr));
	}
}
