//7.定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，计算并输出学生的平均成绩。

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
	
	run();
	}
	public static void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("一共有几位同学？");
		int[] arr1=getScore(sc.nextInt());
		printScore(arr1);
		System.out.println("该选手的最终得分为："+getAvg(arr1)+"分");
		
	}
	
	
	public static int getAvg(int[] arr){
		int a=getTotal(arr);
		return a/(arr.length);					
	}
	
	public static int getTotal(int[] arr){
		int total=0;
		for(int i=0;i<arr.length;i++){
			total +=arr[i];
		}
		return total;
	}
			
	public static void printScore(int[] arr){
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}
			else{
				System.out.print(arr[i]);
			}
		}System.out.println("]");
	}
	
	
	public static int[] getScore(int arr_length){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[arr_length];
		
		for(int x=0;x<arr.length;x++){
			System.out.println("请输入第"+(x+1)+"位同学的成绩");
			arr[x]=sc.nextInt();
		}
		return arr;
		
	}
	
	
	
}