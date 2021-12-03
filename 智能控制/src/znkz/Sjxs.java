package znkz;
import java.awt.Desktop;
import java.net.*;
public class Sjxs {
	static boolean ktd,sfd,zwd,cwd,xsjd,cfd,ktcl,sfcl,zwcl,
	ktkt,sfkt,zwkt,cwkt,kttv,zwtv,jk,th=false;
	static int ktdi,sfdi,zwdi,cwdi,xsjdi,cfdi,ktcli,sfcli,zwcli,
	ktkti,sfkti,zwkti,cwkti,kttvi,zwtvi,jki,thi;
	public static void ktdxs(){//客厅灯
		ktdi++;
		if(ktdi%2==0){
		ktd=false;
		HTTP.sendPost("http://192.168.199.241/?pin=OFF1");
		}else{
			ktd=true;
			HTTP.sendPost("http://192.168.199.241/?pin=ON1");
			System.out.println("客厅灯打开");
		}
	}
	public static void sfdxs(){//书房灯
		sfdi++;
		if(sfdi%2==0){
		sfd=false;
		}else{
			sfd=true;
		}
	}
	public static void zwdxs(){//主卧灯
		zwdi++;
		if(zwdi%2==0){
		zwd=false;
		}else{
			zwd=true;
		}
	}
	public static void cwdxs(){//次卧灯
		cwdi++;
		if(cwdi%2==0){
		cwd=false;
		}else{
			cwd=true;
		}
	}
	public static void xsjdxs(){//洗手间灯
		xsjdi++;
		if(xsjdi%2==0){
		xsjd=false;
		}else{
			xsjd=true;
		}
	}
	public static void cfdxs(){//厨房灯
		cfdi++;
		if(cfdi%2==0){
		cfd=false;
		}else{
			cfd=true;
		}
	}
	public static void ktclxs(){//客厅窗帘
		ktcli++;
		if(ktcli%2==0){
		ktcl=false;
		}else{
			ktcl=true;
		}
	}
	public static void sfclxs(){//书房窗帘
		sfcli++;
		if(sfcli%2==0){
		sfcl=false;
		}else{
			sfcl=true;
		}
	}
	public static void zwclxs(){//主卧窗帘
		zwcli++;
		if(zwcli%2==0){
		zwcl=false;
		}else{
			zwcl=true;
		}
	}
	public static void ktktxs(){//客厅空调
		ktkti++;
		if(ktkti%2==0){
		ktkt=false;
		}else{
			ktkt=true;
		}
	}
	public static void sfktxs(){//书房空调
		sfkti++;
		if(sfkti%2==0){
		sfkt=false;
		}else{
			sfkt=true;
		}
	}
	public static void zwktxs(){//主卧空调
		zwkti++;
		if(zwkti%2==0){
		zwkt=false;
		}else{
			zwkt=true;
		}
	}
	public static void cwktxs(){//次卧空调
		cwkti++;
		if(cwkti%2==0){
		cwkt=false;
		}else{
			cwkt=true;
		}
	}
	public static void kttvxs(){//客厅电视
		kttvi++;
		if(kttvi%2==0){
		kttv=false;
		}else{
			kttv=true;
		}
	}
	public static void zwtvxs(){//主卧电视
		zwtvi++;
		if(zwtvi%2==0){
		zwtv=false;
		}else{
			zwtv=true;
		}
	}
	public static void jkxs(){//主卧电视
		jki++;
		if(jki%2==0){
		jk=false;
		}else{
			jk=true;
		}
	}
	public static void th(){//主卧电视
		thi++;
		if(thi%2==0){
		th=false;
		}else{
			th=true;
		}
	}
}


