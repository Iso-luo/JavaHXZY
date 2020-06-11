//6.计算 1+1/2!+1/3!+1/4!+...1/20!=?

import java.util.Scanner;
class Exam{
	public static void main(String[] args){	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入需要阶乘的数字:");
	int x=sc.nextInt();
	getNum(x);
	getSum(x);
	System.out.print("该数的阶乘结果为："+getSum(x));	
	
	}
		public static double getSum(int i){	//该方法用于相加 每个加数
			if(i==1){
					return 1;
				}
			return getNum(i)+getNum(i-1);	//调用下面的getNum函数 从最大到小依次循环相加每次调用的数		
		}
		
		public static double getNum(int i){	//该方法用于得到 每个加数
			if(i==1){
				return 1;
			}
			return 1/(i*getNum(i-1));		//用return的方法得到某一个加数的分母 如20x19x18...
		}												
	
}