/*
8.定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}
	统计各成绩等级（90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，60~69分为‘D’，60分以下为E）学生人数
	并将其放入到数组count中，其中：count[0]存E级的人数，count[1]存D级的人数，……，count[4]存A级的人数。
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
	
	run();
	}
	public static void run(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("一共有几位同学？");
		int[] arr1=getScore(sc.nextInt());
		
		System.out.println("学生的分数依次为：");
		printScore(arr1);
		int[] count=getLevel(arr1);
		
		System.out.println("各分数段的人数从低到高依次为：");
		printCount(count);
		
		
	}
	public static void printCount(int[] arr){
		System.out.print("[");
		for(int i=0;i<5;i++){
			if(i<4){
				System.out.print(arr[i]+",");
			}
			else{
				System.out.print(arr[i]);
			}
			
		}System.out.print("]");
		
	}
	
	public static int[] getLevel(int[] arr){
		int A=0;
		int B=0;
		int C=0;	
		int D=0;
		int E=0;
		for(int i=0;i<arr.length;i++){	
			if(arr[i]>=90){				
				A+=1;					
			}
			if(80<=arr[i]&&arr[i]<=89){				
				B=B+1;					
			}
			if(70<=arr[i]&&arr[i]<=79){				
				C=C+1;					
			}if(60<=arr[i]&&arr[i]<=69){				
				D+=1;					
			}else if(arr[i]<60)
			{
				E+=1;
			}
			
		}
		int[] count=new int[5];
		count[0]=E;
		count[1]=D;
		count[2]=C;
		count[3]=B;
		count[4]=A;
		System.out.println("A级:"+A+"位同学");
		System.out.println("B级:"+B+"位同学");
		System.out.println("C级:"+C+"位同学");
		System.out.println("D级:"+D+"位同学");
		System.out.println("E级:"+E+"位同学");	
		return count;
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