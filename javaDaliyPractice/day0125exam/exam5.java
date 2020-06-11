//5.快速找出一个数组中的最大数、第二大数。


import java.util.Scanner;
class Exam{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入数组的长度");
	int[] arr=getArray(sc.nextInt());
	printArr(arr);
	int[] arr1=sort(arr);
	printArr(arr1);
	System.out.println("这个数组的最大数是："+arr1[0]);
	System.out.println("这个数组的第二大数是："+arr1[1]);
		
	}
	
	public static int[] sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
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
	
	public static void printArr(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i<arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
		
	} 
	
	public static int[] getArray(int arr_length){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[arr_length];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个数");
			arr[i]=sc.nextInt();
		} 
		return arr;		
	}
	
	
}