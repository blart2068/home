package l4;

import java.util.ArrayList;

class Student{//---------学生类
	private String name;
	private int bh;
	Student(String name,int bh){//构造方法----------
		this.name=name;
		this.bh=bh;
	}
	String getName(){//取姓名-----------
		return name;
	}
	int getBh(){//取编号-------------
		return bh;
	}
}
//--------------------------------------

public class D38 {
	public static void main(String[] args){
		ArrayList jh=new ArrayList();
		Student xs1=new Student("悟空",1);
		Student xs2=new Student("八戒",2);
		Student xs3=new Student("纱僧",3);
		jh.add(xs1);
		jh.add(xs2);
		jh.add(xs3);
		for(int i=0;i<jh.size();i++){
			Student xs=(Student)jh.get(i);
			System.out.println(xs.getName()+xs.getBh());
		}
	}
}



