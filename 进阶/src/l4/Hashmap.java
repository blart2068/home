package l4;
import java.util.*;
public class Hashmap {
	public static void main(String[] args){
		Sp sp1=new Sp("001","�ɿ���",8);
		Sp sp2=new Sp("002","������",3);
		Sp sp3=new Sp("003","��β��",25);
		HashMap aa=new HashMap();
		aa.put("001", sp1);
		aa.put("002", sp2);
		aa.put("003", sp3);
		Iterator it=aa.keySet().iterator();
		while(it.hasNext()){
			String key=it.next().toString();
			System.out.println(aa.get(key));
		}
			
	}
}
