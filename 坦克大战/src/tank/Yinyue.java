package tank;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
public class Yinyue extends Thread{
	private String mc;//�ļ�·����
	Yinyue(String mc){//���췽��������Ƶ�ļ���·��
		this.mc=mc;
	}
	public void run(){//�߳�
		for(;;){
			File wjl=new File(mc);//�ļ���
			AudioInputStream ypsrl=null;//������Ƶ������
			try {
				ypsrl=AudioSystem.getAudioInputStream(wjl);//��ֵ��Ƶ������
			} catch (Exception e) {}
			AudioFormat format=ypsrl.getFormat();//��ȡ��Ƶ��ʽ
			SourceDataLine aqsj=null;//��ʽ����
			DataLine.Info info=new DataLine.Info(SourceDataLine.class,format);//���ݴ���
			try {
				aqsj=(SourceDataLine) AudioSystem.getLine(info);//��ʽ����װ
				aqsj.open(format);//��ʽ����װ
			} catch (Exception e) {}
			aqsj.start();//��ʽ����װ
			int zjtj=0;
			byte[] hczj=new byte[4096];//�����ֽ�
			try {
				while(zjtj!=-1){//��ȡ�ļ�
					zjtj=ypsrl.read(hczj, 0, hczj.length);
					if(zjtj>=0){
						aqsj.write(hczj, 0, zjtj);//������Ƶ
					}
				}
			} catch (Exception e) {}
			finally {
				aqsj.drain();//��ȡʣ�໺���ֽ�
				aqsj.close();//�ر��ļ�
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}







