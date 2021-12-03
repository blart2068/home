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
			//System.out.println("fwq:连接一一客户端");//本地测试信息
			ServerSocket fwq=new ServerSocket(9999);//设置服务器端口
			Socket s=fwq.accept();//监听端口
			System.out.println("fwq:连接一一客户端");//本地测试信息
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println("服务器连接成功!");//发送给客户端信息
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			System.out.println(br.readLine());//读取客户端信息
			String ws="";
			while(true){
				System.out.println("客户端:"+br.readLine());
				
				System.out.println("客户端:");
				
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
