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
		int cc=19840105;//----Ҫ���͵�����
		ByteArrayOutputStream zjbm=new ByteArrayOutputStream();
		//----����һ��������ֽ�������     zjbm   ()���޲���
		DataOutputStream sjbm=new DataOutputStream(zjbm);
		//----����һ��������ݵ��ֽ��������ѸղŶ��������ֽ��������Ž�������     sjbm   ()�����zjbm
		sjbm.writeInt(cc);
		//������д��Ҫ���͵�����
		byte zjsz[]=zjbm.toByteArray();
		//����ֽ����д��õ����ݰ�������� �ֽ�����    ����һ���ֽ�����������     zjsz[]
		ByteArrayInputStream zjjm=new ByteArrayInputStream(zjsz);
		//����һ�������ֽ������� zjjm ()����ӱ�����byte����
		DataInputStream sjjm=new DataInputStream(zjjm);
		//����һ�������ֽ������� sjjm   ()������ֽ�������
		int yy=sjjm.readInt();
		//����һ�� ������     �ѽ��յ������ݻ�ԭ��ԭ���� �����������������
		System.out.println(yy);
	}
}
