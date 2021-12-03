package my;

/**  
* @Title: TestMain.java
* @Package org.test
* @Description: TODO该方法的主要作用：
* @author A18ccms A18ccms_gmail_com  
* @date 2017-5-29 下午8:15:33
* @version V1.0  
*/


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**   
*    
* 项目名称：Test  
* 类名称：TestMain   
* 类描述：   加密
* 创建人：Mu Xiongxiong  
* 创建时间：2017-5-29 下午8:15:33   
* 修改人：Mu Xiongxiong   
* 修改时间：2017-5-29 下午8:15:33   
* 修改备注：   
* @version    
*    
*/
public class TestMain {
	
	/**
	 * 
	* @Title: main
	* @Description: 该方法的主要作用：
	* 最新加密法，将一串数字进行加密
	* 加密规则：先把这串数字降序，然后将每个数字进行加5，
	* 再用和除以10的余数代替该数字，
	* 最后将第一位数和最后一位数进行交换,加密完成
	* @param  @param args 设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	public static void main(String[] args) {
		// 加密
		System.out.println("请输入你要加密的数字：");
		Scanner in = new Scanner(System.in);
		String num = in.next();
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(num.trim());
		if (isNum.matches()) {
			// 执行加密的方法
			encrypt(num);
		} else {
			System.out.println("输入的不是数字，请输入数字");
		}
	}
	
	/**
	 * 
	* @Title: encrypt
	* @Description: 该方法的主要作用：
	* @param   设定文件  
	* @return  返回类型：void   
	* @throws
	 */
	public static void encrypt(String stuNum){
		String  	encrypt =   "";					//加密后的字符串
		String  	yuan    =   "";					//交换位置前
		int  		num   	=   0;               	//拆分成单个数字
		int  		sNum  	=   0;               	//每个数字加5之后
		int  		yNum  	=   0;               	//每个数字的和除以10的余数 
		
		
		
		int n [] = new int[stuNum.length()];
		//将每个数字转换成int类型的
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(String.valueOf(stuNum.charAt(i)));
			
		}
		
		//通过冒泡排序法进行降序排序
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 0; j < n.length - 1 - i; j++) {
				if (n[j] < n[j + 1]) {
					int temp;
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			String cNum = n[i]+"";
			num = Integer.parseInt(cNum);
			//进行每个数字加5
			sNum = num+5;
			//再用和除以6的余数代替该数字
			yNum = sNum % 6;
			//该和除以6的余数
			num  = yNum; 
			//把每个数字都放在yuan的字符串里面
			yuan += num;
		}
		//将最后一个数字和第一个数字交换位置
		int m [] = new int[yuan.length()];
		//将每个数字转换成int类型的
		for (int i = 0; i < m.length; i++) {
			m[i] = Integer.parseInt(String.valueOf(yuan.charAt(i)));
		}
		//交换位置
		int fristNum = m[0];
		m[0]= m[m.length-1];
		m[m.length-1] = fristNum;
		for (int i = 0; i < m.length; i++) {
			encrypt += m[i];
		}
		//把加密后的数组放在字符串中
		System.out.println("原来的电话号码："+stuNum);
		System.out.println("加密后的电话号码："+encrypt);
	}

}


