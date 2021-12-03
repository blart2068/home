
public class D323 {
	public static void main(String[] args){
		String s="";
		
		for(int i=0;i<20;i++){
			s+="00"+i+"  ";
		}
		String []ss=s.split("  ");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
			
		}
		System.out.println(s);
	}
}
