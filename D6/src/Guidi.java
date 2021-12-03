
public class Guidi {
	
	public static void main(String [] args){
		new Guidi();
	}
	Guidi(){
		for(int i=1;i<21;i++){
			
			System.out.println(this.gd(i));
		}
		
	}
	public int gd(int i){
		if(i<=2){
			return 1;
		}else{
			int j= this.gd(i-1)+this.gd(i-2);
			return j;
		}
	}
}
