package moshi;

import java.util.HashMap;

public class xcbs {
	static HashMap xcjh=new HashMap<String ,Xiancheng>();
	public static void tjxc(String id ,Xiancheng xc){//����߳� �����
		xcjh.put(id, xc);
	}
	public static Xiancheng getXc(String id){//�����ȡ���߳�
		
		return (Xiancheng)xcjh.get(id);
	}
}
