/*
3.编写程序，对输入的一个整数，按相反顺序输出该数。例如，输入为 3578，输出为 8753。
		没有解出通式！！ 
*/

import java.util.Scanner;
class Practice{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个四位整数");
		int x=sc.nextInt();
		int[] arr=getArr(x);
		reverse(arr);
		printArr(arr);
	}
		public static void printArr(int[] arr){
			System.out.print("反序输出为：");
			for(int i=0;i<4;i++){
					System.out.print(arr[i]);
			}
		}
		public static void reverse(int[] arr){
			int a=arr[0];
			int b=arr[1];
			int c=arr[2];
			int d=arr[3];
					
			arr[0]=d;
			arr[1]=c;
			arr[2]=b;
			arr[3]=a;
		}
		
		public static int[] getArr(int x){			
				int[] arr=new int[4];
				arr[0]=x/1000;
				arr[1]=(x%1000)/100;
				arr[2]=((x%1000)%100)/10;
				arr[3]=((x%1000)%100)%10;			
				return arr;
		}
}