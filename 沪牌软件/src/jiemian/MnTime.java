package jiemian;

import javax.swing.JLabel;

public class MnTime extends Thread{
	static int i;
	static String sj;
	static String cjsj= "11:29:50";
	JLabel jl;
	String zl1="\t完成第一次出价后目前无需任何操作,请11:20分回到电脑前,按指示操作!\n\n";
	String zl2="\t正在计算获取时间节点......\n\n";
	String zl3="\t加500!!\n\n";
	String zl33="\t加600!!\n\n";
	String zl4="\t加500!!\n\n";
	String zl44="\t加600!\n\n";
	String zl5="\t拍卖结束请不要关闭浏览器等待拍卖结果!祝您好运!!LUCK\n\n";
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

					jl.setText("目前系统时间:"+sj);
					Thread.sleep(1000);
				} catch (Exception e) {}
				
				if(sj.equals(cjsj)){
					new anjl().start();
				}
				
			}
			sj="11:30:00";

			jl.setText("目前系统时间:"+sj);
			JM.jt.append(zl5);
			JM.jt.setCaretPosition(JM.jt.getText().length());//光标位置新
		}
	}
}
