
import java.util.*;
class Fk{
	void bx(){
		System.out.println("变形");
	}
}
class yzx extends Fk{
	 void bx(){
		System.out.println("一字在变形");
	}
}
class zzx extends Fk{
	 void bx(){
		System.out.println("Z字在变形");
	}
}
class szx extends Fk{
	void bx(){
		System.out.println("山字在变形");
	}
}
class tzx extends Fk{
	 void bx(){
		System.out.println("T字在变形");
	}
}

//-----------------------------------------------
public class D6_FK {
	public static void main(String[] args){
		
		int sjs=(int)(Math.random()*4);
		System.out.println(sjs);
		Fk a=null;
	
		if(sjs==0){
			a=new yzx();
		
		}else if(sjs==1){
			a=new zzx();

		}else if(sjs==2){
			a=new szx();
			
		}else if(sjs==3){
			a=new tzx();

		}
		a.bx();

	}
}
