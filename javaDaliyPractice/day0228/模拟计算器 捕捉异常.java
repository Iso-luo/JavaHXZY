/*练习 模拟计算器 int 
捕获异常 不用定义方法*/

import java.util.Scanner;
import java.util.NoSuchElementException;

class A{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数 \n 1加法，2减法，3乘法，4除法");
		//NoSuchElementException nse=new NoSuchElementException("不是数字!");
		int x=1;
		try{
			x=sc.nextInt();
		}catch(Exception e1){
			//System.out.println(n.getMessage());
			e1.printStackTrace();
			System.out.println("不是数字!请重输");
		}
		
		System.out.println("请输入第1个数:");
		int a=0;
		try{
			a=sc.nextInt();
		}catch(Exception e1){
			e1.printStackTrace();
		}
		
		System.out.println("请输入第2个数:");
		int b=0;
		try{
			b=sc.nextInt();
		}catch(Exception e1){
			e1.printStackTrace();
		}
		
		int r=0;	
			switch(x){				
				case 1:
					r=a+b;
					System.out.println("计算结果为:"+r);
					break;
				case 2:
					r=a-b;
					System.out.println("计算结果为:"+r);
					break;
				case 3:
					r=a*b;
					System.out.println("计算结果为:"+r);
					break;
				case 4:
					try{
						r=a/b;
					}catch(Exception e){
						e.printStackTrace();
						//System.out.println("堆栈跟踪信息:"+e.getStackTrace());//输出的堆栈跟踪信息
						System.out.println("----------------");
						System.out.println("throwable的详细消息字符串:"+e.getMessage());	//throwable 的详细消息字符串
						System.out.println("----------------");
						System.out.println("throwable的简短描述:"+e.toString());	// throwable 的简短描述
					}
					System.out.println("计算结果为:"+r);		
		}
	}
}
