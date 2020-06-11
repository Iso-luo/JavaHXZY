/*
18.一球从h米高度自由落下,每次落地后反跳回原高度的一半,再落下...
求它在第n次落地时，共经过多少米？
第n次反弹多高？
程序分析：反弹的高度:(1/2)的n次方*h

需要再测试几个数！！
*/


import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("从几米高处落下");
		double h=sc.nextDouble();
		System.out.println("第几次？");
		int n=sc.nextInt();
		getReverseMeter(h,n);
		getMiddleSum(h,n);
		double y=getWholeLength(h,n);
		System.out.println("第"+n+"次落地共经过"+y+"米");
				
	}
		
		
		
		public static double getWholeLength(double h,int n){	//算共经过多少米的方法		
			return h+2.0*h*(getMiddleSum(h,n)); //根据规律整理得 共经过[h+2*h*(1/2+1/2*1/2+1/2*1/2*1/2+1/2*1/2*1/2*1/2+...)]米			
		}
		
		public static double getMiddleSum(double h,int n){ 		//getWholeLength（）里面有规律的中间数算出来						
			double sum=0.0;
			int i=2;
			double a=0.5;			
			if(n==1){					//第一次落，
				sum=0.0;
			}
			else{								
				while(i<=n){			//实际共执行（n-i+1）次
					sum=sum+a;			//把每一个有规律的数字相加！
					a=0.5*a;			//给每一个加数新赋值！
					i+=1;
				}				
			}							//if和else里都算一个sum的值 getMiddleSum()的返回值就是sum
			return sum;
		}
		
		public static void getReverseMeter(double h,int n){	//算第n次反弹的高度的方法
			int i=1;			
			while(i<=n){
				h=0.5*h;
				i+=1;								
			}
			if(i==n+1){
				System.out.println("第"+n+"次反弹的高度为"+h+"米");		
			}			
		}
}


