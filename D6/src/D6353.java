

abstract class Tt{
	 void sj(){
		long a=System.currentTimeMillis();
		cx();
		long b=System.currentTimeMillis();
		System.out.println(b-a);
	}
	abstract void cx();
}
class wo extends Tt{
	void cx(){
		for(int i=0;i<100;i++){
			String mm="ÎÒÊÇblart"+i;
			System.out.println(mm);
		}
	}
}
public class D6353 {
	public static void main(String[] args){
	wo aa=new wo();
	aa.sj();
	}
}
