public  class Student{
	private String name;
	
	static private int age;
	
	private double sr;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Student.age = age;
	}
	public double getSr() {
		return sr;
	}
	public void setSr(double sr) {
		this.sr = sr;
	}
	static{
		Student.age=28;
	}
	{
		this.name="xxxxx";
	}
	public  String toString(){
		return name+age+"ÉúÈÕ"+sr;
	}
}