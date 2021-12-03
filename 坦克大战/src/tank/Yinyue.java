package tank;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
public class Yinyue extends Thread{
	private String mc;//文件路径的
	Yinyue(String mc){//构造方法传入音频文件的路径
		this.mc=mc;
	}
	public void run(){//线程
		for(;;){
			File wjl=new File(mc);//文件流
			AudioInputStream ypsrl=null;//定义音频输入流
			try {
				ypsrl=AudioSystem.getAudioInputStream(wjl);//赋值音频输入流
			} catch (Exception e) {}
			AudioFormat format=ypsrl.getFormat();//读取音频格式
			SourceDataLine aqsj=null;//格式处理
			DataLine.Info info=new DataLine.Info(SourceDataLine.class,format);//数据处理
			try {
				aqsj=(SourceDataLine) AudioSystem.getLine(info);//格式化包装
				aqsj.open(format);//格式化包装
			} catch (Exception e) {}
			aqsj.start();//格式化包装
			int zjtj=0;
			byte[] hczj=new byte[4096];//缓冲字节
			try {
				while(zjtj!=-1){//读取文件
					zjtj=ypsrl.read(hczj, 0, hczj.length);
					if(zjtj>=0){
						aqsj.write(hczj, 0, zjtj);//播放音频
					}
				}
			} catch (Exception e) {}
			finally {
				aqsj.drain();//读取剩余缓冲字节
				aqsj.close();//关闭文件
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}







