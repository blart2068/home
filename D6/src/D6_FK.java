
import java.util.*;
class Fk{
	void bx(){
		System.out.println("����");
	}
}
class yzx extends Fk{
	 void bx(){
		System.out.println("һ���ڱ���");
	}
}
class zzx extends Fk{
	 void bx(){
		System.out.println("Z���ڱ���");
	}
}
class szx extends Fk{
	void bx(){
		System.out.println("ɽ���ڱ���");
	}
}
class tzx extends Fk{
	 void bx(){
		System.out.println("T���ڱ���");
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
