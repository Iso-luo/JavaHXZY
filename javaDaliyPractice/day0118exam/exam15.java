//15.制作一个简易的计算器，实现基本的加减乘除功能。（我这个只能两个数加减）

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		distinguishType();	
	}
		public static void distinguishType(){
			System.out.println("请输入运算类型 \n 1加法,2减法,3乘法,4除法");
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int[] arr=getNum();
			int a=arr[0];
			int b=arr[1];
			switch(x){			
				case 1:					
					int k=addition(a,b);
					sop(k);
					break;
				case 2:
					int l=subtraction(a,b);
					sop(l);
					break;
				case 3:
					int m=multiplication(a,b);
					sop(m);
					break;
				case 4:
					double n=division((double)a,(double)b);			//这里a b要分别转换为double类型 计算式小数点后才不为零
					sop(n);
					break;
			}
		
		}
		
		public static int[] getNum(){
			int[] arr={0,0};
			for(int i=0;i<2;i++){
			Scanner sc=new Scanner(System.in);	
			System.out.println("请输入第"+(i+1)+"个数字");	
			arr[i]=sc.nextInt();					
			}
			return arr;
		}
		
		//每种计算类型 分别运行	
		public static int addition(int a,int b){
			return a+b;		
		} 
		public static int subtraction(int a,int b){
			return a-b;		
		} 
		public static int multiplication(int a,int b){
			return a*b;		
		}
		public static double division(double a,double b){
			return a/b;		
		}
		
		public static void sop(int x){
			System.out.println("运算得："+x);			
		}
		public static void sop(double x){
				System.out.println("运算得："+x);				
		}
		
}