//2.编写程序求一元二次方程的根

import java.util.Scanner;
class Practice{
	public static void main(String[] args){
		int[] arr=getArr();
		calculate(arr);
		
		
	}
		public static void calculate(int[] arr){
			double a=(double)arr[0];
			double b=(double)arr[1];
			double c=(double)arr[2];
			if((b*b-4*a*c)>=0){
			double x1=((-b)+Math.sqrt(b*b-4*a*c))/(2*a);
			double x2=((-b)-Math.sqrt(b*b-4*a*c))/(2*a);	
			
			System.out.println("该一元二次方程的第一个根:x1="+x1);
			System.out.println("该一元二次方程的第二个根:x2="+x2);
			}else{
				System.out.println("该一元二次方程无实根");
			}
		}
		public static int[] getArr(){
			int[] arr=new int[3];
			Scanner sc=new Scanner(System.in);	
			System.out.println("请依次输入方程的系数:");
			for(int i=0;i<=2;i++){
				arr[i]=sc.nextInt();
			}
			return arr;
		 } 
}