/*
14、古典问题：
有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第三个月后每个月又生一对兔子，
假如兔子都不死，问每个月的兔子对数为多少？

*/
import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入想要计算到第几个月的兔子对数：");
		int i=sc.nextInt();
		
		int[] arr=getEveryMonthNum(i);
		
		System.out.println("每个月新增兔子数量依次为：");
		printEveryMonthNum(arr);
		int y=getEveryMonthSum(arr);
		System.out.print("第"+i+"个月共有"+y+"对兔子");
				
	}
		public static int getEveryMonthSum(int[] arr){		//数组中每个数相加
			int sum=0;										//定义一个初始值0
			for(int j=0;j<=arr.length-1;j++){				
				sum+=arr[j];								//用sum=sum+arr[j]循环,可以从arr[0]加到arr[9]	
			}			
		return sum;				
		}
		
		public static void printEveryMonthNum(int[] arr){	//打印该数组，显示每月新增数量	
			System.out.print("[");
			
			for(int j=1;j<=arr.length-1;j++){			//可从arr[1]开始，第0个月的兔子数arr[0]不用打印出来，如：打印序列号为arr[1]~arr[9],又arr长度arr.length=10...
				if(j<arr.length-1){
					System.out.print(arr[j]+",");
				}
				else if(j==arr.length-1){
					System.out.println(arr[j]+"]");
				}
			}
		} 
		
		public static int[] getEveryMonthNum(int i){	
			int[] arr=new int[i+1];						//数列的长度是i+1
			for(int j=0;j<=i;j++){						//将0-i月的新增数量依次放入数组中（遍历？），如：arr[0]~arr[9],可见长度为10。
				arr[j]=getMonthNum(j);			
			}
		return arr;		
		}
		
		public static int getMonthNum(int i){			//参数为第i个月
			if(i==1 || i==2 ){							//特殊1：第1、2个月 新增数量为0对
				return 0;
			}	
			if(i==0||i==3){								//特殊2：第0、3个月，兔子数量为1对
				return 1;
			}
			return getMonthNum(i-2)+getMonthNum(i-1);	//从第三个月起 每个月新增数量依次为1，1，2，3，5，8，13...即第三个数是前两数之和，用return循环带入，根据i的不同可得不同月份的新增数量
				
		}
	
		
}
