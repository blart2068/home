package io;
import java.io.*;
public class D3214 {
	public static void main(String[] args)throws Exception{
		/*ByteArrayOutputStream zjbm=new ByteArrayOutputStream();
		DataOutputStream sjbm=new DataOutputStream(zjbm);
		double aa=3.141526;
		sjbm.writeDouble(aa);
		byte[]sjsz=zjbm.toByteArray();
		ByteArrayInputStream zjjm=new ByteArrayInputStream(sjsz);
		DataInputStream sjjm=new DataInputStream(zjjm);
		double bb=sjjm.readDouble();
		System.out.println(bb);*/
		int cc=19840105;//----要传送的数据
		ByteArrayOutputStream zjbm=new ByteArrayOutputStream();
		//----定义一个输出的字节数组流     zjbm   ()内无参数
		DataOutputStream sjbm=new DataOutputStream(zjbm);
		//----定义一个输出数据的字节数据流把刚才定义的输出字节数组流放进参数内     sjbm   ()内添加zjbm
		sjbm.writeInt(cc);
		//数据流写入要传送的数据
		byte zjsz[]=zjbm.toByteArray();
		//输出字节流中传好的数据把它编译成 字节数组    定义一个字节数组来接收     zjsz[]
		ByteArrayInputStream zjjm=new ByteArrayInputStream(zjsz);
		//定义一个接收字节数组流 zjjm ()内添加编译后的byte数组
		DataInputStream sjjm=new DataInputStream(zjjm);
		//定义一个接收字节数据流 sjjm   ()内添加字节数组流
		int yy=sjjm.readInt();
		//定义一个 变量名     把接收到的数据还原成原类型 并用这个变量来接收
		System.out.println(yy);
	}
}
