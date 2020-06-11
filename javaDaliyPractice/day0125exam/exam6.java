/*
6.给定含有n个元素的整型数组a，其中包括0元素和非0元素，对数组进行排序，要求： 
1、排序后所有0元素在前，所有非零元素在后，且非零元素排序前后相对位置不变 
2、不能使用额外存储空间 
*/
import java.util.Scanner;
class Exam{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入数组的长度");
	int[] arr=getArray(sc.nextInt());
	printArr(arr);
	int[] arr1=sort(arr);
	printArr(arr1);		
	}
	
	public static int[] sort(int[] arr){
		for(int i=0;i<arr.length;i++){		//【一共比较几轮】
			for(int j=1;j<arr.length-i;j++){//【每轮比较几次】注意是：j<(arr.length-i)，不是(arr.length-i-1)，请辨别清楚每轮的比较次数，从第二个数开始比，直到最后一个数
				if(arr[j]==0){
					exchange(arr,j,j-1);
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
	
	public static void printArr(int[] arr){		//打印数组
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
	
	public static int[] getArray(int arr_length){	//键入数组（即以数组形式存储一组数）
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[arr_length];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个数：");
			arr[i]=sc.nextInt();					//这个键入的每个数字会在显示器显示出来
		} 
		return arr;		
	}
}
