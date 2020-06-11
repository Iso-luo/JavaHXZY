//1.编写程序实现对给定的 4 个整数从大到小的顺序排列。

import java.util.Scanner;
class Practice{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入整数的个数：");
		//int x=sc.nextInt();
		int[] arr=getArr(sc.nextInt());
		int[] arr1=sort(arr);
		printArr(arr1);		
	}
		public static void printArr(int[] arr){
			System.out.print("[");
			for(int i=0;i<arr.length;i++){
				if(i<arr.length-1){
					System.out.print(arr[i]+",");
				}else{
					System.out.println(arr[i]+"]");
				}
			}
		}
		
		public static int[] sort(int[] arr){
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<(arr.length-i)-1;j++){
					if(arr[j]<arr[j+1]){
						exchange(arr,j,j+1);
					}						
				}
			}
			return arr;
		}
		
		public static void exchange(int[] arr,int a,int b){
			int temp=0;
			temp=arr[a];
			arr[a]=arr[b];
			arr[b]=temp;
		}
	
		public static int[] getArr(int arr_length){
			int[] arr=new int[arr_length];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<arr.length;i++){
				System.out.println("请输入第"+(i+1)+"个整数");
				arr[i]=sc.nextInt();
			}
			return arr;
		}
}
