package jiemian;

import javax.swing.JLabel;

public class MnTime extends Thread{
	static int i;
	static String sj;
	static String cjsj= "11:29:50";
	JLabel jl;
	String zl1="\t��ɵ�һ�γ��ۺ�Ŀǰ�����κβ���,��11:20�ֻص�����ǰ,��ָʾ����!\n\n";
	String zl2="\t���ڼ����ȡʱ��ڵ�......\n\n";
	String zl3="\t��500!!\n\n";
	String zl33="\t��600!!\n\n";
	String zl4="\t��500!!\n\n";
	String zl44="\t��600!\n\n";
	String zl5="\t���������벻Ҫ�ر�������ȴ��������!ף������!!LUCK\n\n";
	public MnTime(JLabel jl){
		this.jl=jl;
	}
	public void run(){
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		while(true){
			for(i=0;i<60;i++){
				try {
					sj="11:29:";
					if(i<10){
						sj=sj+"0"+i;
					}else{
						sj=sj+i;
					}

					jl.setText("Ŀǰϵͳʱ��:"+sj);
					Thread.sleep(1000);
				} catch (Exception e) {}
				
				if(sj.equals(cjsj)){
					new anjl().start();
				}
				
			}
			sj="11:30:00";

			jl.setText("Ŀǰϵͳʱ��:"+sj);
			JM.jt.append(zl5);
			JM.jt.setCaretPosition(JM.jt.getText().length());//���λ����
		}
	}
}
