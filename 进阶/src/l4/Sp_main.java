package l4;
import java.util.*;

public class Sp_main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Spgl spgl=new Spgl();
		while(true){
			System.out.println("�밴��ʾ�������¹���");
			System.out.println("���ʳƷ�밴1");
			System.out.println("����ʳƷ�밴2");
			System.out.println("�޸�ʳƷ�۸��밴3");
			System.out.println("ɾ��ʳƷ�밴4");
			System.out.println("��ʾ������Ʒ��Ϣ5");
			System.out.println("�˳�ϵͳ�밴0");
			String xz=in.next();
			if(xz.equals("1")){
				System.out.println("�������ţ�");
				String bh=in.next();
				System.out.println("������ʳƷ����");
				String mc=in.next();
				System.out.println("������ʳƷ�۸�");
				double jg=in.nextDouble();
				spgl.tj(bh,mc,jg);
			}else if(xz.equals("2")){
				System.out.println("������Ҫ��ѯʳƷ�ı�ţ�");
				String bh=in.next();
				spgl.cx(bh);
			}else if(xz.equals("3")){
				System.out.println("������Ҫ�޸�ʳƷ�ı�ţ�");
				String bh=in.next();
				try{
				spgl.xg(bh);}catch(Exception e){
					System.out.println("��������д��󣡣�");
				}
			}else if(xz.equals("4")){
				System.out.println("������Ҫɾ��ʳƷ�ı�ţ�");
				String bh=in.next();
				spgl.sc(bh);
			}else if(xz.equals("5")){
				System.out.println("\t             ������������Ʒ��Ϣ\n");
				spgl.tv();
			}else if(xz.equals("0")){
				System.out.println("�Ѿ��˳�ϵͳ");
				System.exit(0);
				String i="0";
			}
			
			
		}
	}
}



