package znkz;
import java.awt.Desktop;
import java.net.*;
public class Sjxs {
	static boolean ktd,sfd,zwd,cwd,xsjd,cfd,ktcl,sfcl,zwcl,
	ktkt,sfkt,zwkt,cwkt,kttv,zwtv,jk,th=false;
	static int ktdi,sfdi,zwdi,cwdi,xsjdi,cfdi,ktcli,sfcli,zwcli,
	ktkti,sfkti,zwkti,cwkti,kttvi,zwtvi,jki,thi;
	public static void ktdxs(){//������
		ktdi++;
		if(ktdi%2==0){
		ktd=false;
		HTTP.sendPost("http://192.168.199.241/?pin=OFF1");
		}else{
			ktd=true;
			HTTP.sendPost("http://192.168.199.241/?pin=ON1");
			System.out.println("�����ƴ�");
		}
	}
	public static void sfdxs(){//�鷿��
		sfdi++;
		if(sfdi%2==0){
		sfd=false;
		}else{
			sfd=true;
		}
	}
	public static void zwdxs(){//���Ե�
		zwdi++;
		if(zwdi%2==0){
		zwd=false;
		}else{
			zwd=true;
		}
	}
	public static void cwdxs(){//���Ե�
		cwdi++;
		if(cwdi%2==0){
		cwd=false;
		}else{
			cwd=true;
		}
	}
	public static void xsjdxs(){//ϴ�ּ��
		xsjdi++;
		if(xsjdi%2==0){
		xsjd=false;
		}else{
			xsjd=true;
		}
	}
	public static void cfdxs(){//������
		cfdi++;
		if(cfdi%2==0){
		cfd=false;
		}else{
			cfd=true;
		}
	}
	public static void ktclxs(){//��������
		ktcli++;
		if(ktcli%2==0){
		ktcl=false;
		}else{
			ktcl=true;
		}
	}
	public static void sfclxs(){//�鷿����
		sfcli++;
		if(sfcli%2==0){
		sfcl=false;
		}else{
			sfcl=true;
		}
	}
	public static void zwclxs(){//���Դ���
		zwcli++;
		if(zwcli%2==0){
		zwcl=false;
		}else{
			zwcl=true;
		}
	}
	public static void ktktxs(){//�����յ�
		ktkti++;
		if(ktkti%2==0){
		ktkt=false;
		}else{
			ktkt=true;
		}
	}
	public static void sfktxs(){//�鷿�յ�
		sfkti++;
		if(sfkti%2==0){
		sfkt=false;
		}else{
			sfkt=true;
		}
	}
	public static void zwktxs(){//���Կյ�
		zwkti++;
		if(zwkti%2==0){
		zwkt=false;
		}else{
			zwkt=true;
		}
	}
	public static void cwktxs(){//���Կյ�
		cwkti++;
		if(cwkti%2==0){
		cwkt=false;
		}else{
			cwkt=true;
		}
	}
	public static void kttvxs(){//��������
		kttvi++;
		if(kttvi%2==0){
		kttv=false;
		}else{
			kttv=true;
		}
	}
	public static void zwtvxs(){//���Ե���
		zwtvi++;
		if(zwtvi%2==0){
		zwtv=false;
		}else{
			zwtv=true;
		}
	}
	public static void jkxs(){//���Ե���
		jki++;
		if(jki%2==0){
		jk=false;
		}else{
			jk=true;
		}
	}
	public static void th(){//���Ե���
		thi++;
		if(thi%2==0){
		th=false;
		}else{
			th=true;
		}
	}
}


