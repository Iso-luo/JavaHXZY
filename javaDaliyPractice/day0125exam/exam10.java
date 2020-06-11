//10.定义一个方法能够判断并返回两个整数的最大值。 并调用？？自己的方法测试是否正确。？？？？？？

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
	
	int a=getNum();
	int b=getNum();
	getMax(a,b);
	
	
	}
		public static void getMax(int a,int b){
			
			if(a>=b){
				System.out.println("这两个整数中最大的是"+a);
			}
			else if(a<b){
				System.out.println("这两个整数中最大的是"+b);
			}
		}
	
		public static int getNum(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入一个数：");
			int x=sc.nextInt();
			return x;			
		}
}