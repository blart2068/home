package wl;
import java.io.*;
import java.net.*;
import java.util.*;
public class Khd {
	public static void main(String[] args){
		new Khd();
	}
	Khd(){
		Scanner in=new Scanner(System.in);
		try{
			Socket s=new Socket("127.0.0.1",9999);
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println("�ͻ����Ѿ���λ");
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			System.out.println("������:"+br.readLine());
			String ws="";
			while(true){
				System.out.print("��:");
				pw.println(ws=in.next());
				//System.out.println(ws);
				System.out.println("������:"+br.readLine());
				if(ws.equals("88")){
					break;
				}
			}

			isr.close();
			br.close();
			s.close();
			pw.close();
		}catch(Exception e){}finally{
			try{

			}catch(Exception e2){}
		}
	}
}
