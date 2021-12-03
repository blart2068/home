package jiemian;


import java.util.TimerTask;


public class shizhong {
	static int s,f,m;
	static String sm,sf;
	static java.util.Timer timer;
	static TimerTask tk;
	static boolean tbh =true;
	
	public static void time() {
		tk =new TimerTask() {
			
			public void run() { 
				m++;
				if (m>=60) {
					m=0;
					f++;
					if (f>=60) {
						f=0;
						s++;
						if (s>=24) {
							s=0;
						}
					}
				}
				if(m<10){
					sm="0"+m;
				}else {
					sm=""+m;
				}
				if(f<10){
					 sf="0"+f;
				}else {
					sf=""+f;
				}
				String sjsj=s+":"+sf+":"+sm;
				if (sjsj.equals(JM.cjsj)) {
					new anjl().start();
				}
				
				JM.jl.setText("系统时间:"+sjsj);//显示当前时间
//				System.out.println(sjsj+"888888888");
			}
		};
			
		
		try {
			wytime.wysj();
			String sj[]=wytime.ss.split(":");
			 s=Integer.parseInt(sj[0]);
			 f=Integer.parseInt(sj[1]);
			 m=Integer.parseInt(sj[2]);
			//System.out.println(s+"+++"+f+"+++"+m);
			
		} catch (Exception e) {
			
		}
		timer = new java.util.Timer();
		
		timer.scheduleAtFixedRate(tk, 0, 1000);
		
  
    }  
	
}
