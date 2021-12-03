package l4;
import java.util.*;

public class Sp_main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Spgl spgl=new Spgl();
		while(true){
			System.out.println("请按提示输入以下功能");
			System.out.println("添加食品请按1");
			System.out.println("查找食品请按2");
			System.out.println("修改食品价格请按3");
			System.out.println("删除食品请按4");
			System.out.println("显示所有商品信息5");
			System.out.println("退出系统请按0");
			String xz=in.next();
			if(xz.equals("1")){
				System.out.println("请输入编号：");
				String bh=in.next();
				System.out.println("请输入食品名称");
				String mc=in.next();
				System.out.println("请输入食品价格");
				double jg=in.nextDouble();
				spgl.tj(bh,mc,jg);
			}else if(xz.equals("2")){
				System.out.println("请输入要查询食品的编号：");
				String bh=in.next();
				spgl.cx(bh);
			}else if(xz.equals("3")){
				System.out.println("请输入要修改食品的编号：");
				String bh=in.next();
				try{
				spgl.xg(bh);}catch(Exception e){
					System.out.println("你的输入有错误！！");
				}
			}else if(xz.equals("4")){
				System.out.println("请输入要删除食品的编号：");
				String bh=in.next();
				spgl.sc(bh);
			}else if(xz.equals("5")){
				System.out.println("\t             以下是所有商品信息\n");
				spgl.tv();
			}else if(xz.equals("0")){
				System.out.println("已经退出系统");
				System.exit(0);
				String i="0";
			}
			
			
		}
	}
}



