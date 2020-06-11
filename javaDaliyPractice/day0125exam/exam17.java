/*17.求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
输出结果的形式如：2+22+222=246；
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a=sc.nextInt();
		System.out.println("请输入需要相加的次数：");
		int n=sc.nextInt();		
		int[] arr=getArr(a,n);
		printArr(arr,n);		
	}
		public static void printArr(int[] arr,int n){			
			for(int i=0;i<n;i++){
				if(i<(n-1)){
					System.out.print(arr[i]+"+");
				}
				if(i==(n-1)){
					System.out.print(arr[i]+"="+getSum(arr,n));
				}
			}		
		}
		
		public static int getSum(int[] arr,int n){ //数组里各位数相加 即和
			int i=0;
			int sum=0;
			while(i<n){ //从0~n-1 共执行n次
				sum=sum+arr[i];
				i+=1;
			}			
			return sum;
		}
		
		public static int[] getArr(int a,int n){	//将有规律的一组数据循环录入数组
			int[] arr=new int[n];
			arr[0]=a;
			int j=10;
			for(int i=1;i<n;i++){
				arr[i]=arr[0]*j+arr[i-1];
				j=j*10;
			}
			return arr;
		}
		
		
		
		/*单算加法的结果的话 可以这样：
		public static int getSum(int a,int n){ //先找到规律,然后求和
			int i=1;
			int j=10;
			int sum=0;
			int r=a;//这一步第一次忽略了 有一个定值 不随后面的a改变而改变
			while(i<=n){				
				sum=sum+a;
				a=r*j+a;
				j=j*10;				
				i+=1;
			}
			return sum;
		}
		*/
}