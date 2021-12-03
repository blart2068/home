
public class Danli {
	private String mane;
	private int age;
	private Danli(){};
	static Danli A=new Danli();
	static public Danli getMy(){
	return A;
	}
	void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
