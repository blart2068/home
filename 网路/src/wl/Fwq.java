package wl;
import java.io.*;
import java.net.*;
import java.util.*;
public class Fwq {
	public static void main(String [] args){
		new Fwq();
	}
	Fwq(){
		Scanner in=new Scanner(System.in);
		try{
			//System.out.println("fwq:����һһ�ͻ���");//���ز�����Ϣ
			ServerSocket fwq=new ServerSocket(9999);//���÷������˿�
			Socket s=fwq.accept();//�����˿�
			System.out.println("fwq:����һһ�ͻ���");//���ز�����Ϣ
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println("���������ӳɹ�!");//���͸��ͻ�����Ϣ
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			System.out.println(br.readLine());//��ȡ�ͻ�����Ϣ
			String ws="";
			while(true){
				System.out.println("�ͻ���:"+br.readLine());
				
				System.out.println("�ͻ���:");
				
				pw.println(in.next());
				if(ws.equals("88")){
					break;
				}
				
			}
			
			s.close();
			fwq.close();
			pw.close();
			isr.close();
			br.close();
		}catch(Exception e){}
	}
}
