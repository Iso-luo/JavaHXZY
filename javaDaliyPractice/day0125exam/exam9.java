/*
9.从键盘输入8个整数存放在一个数组中
  然后将奇数和偶数分别存入到两个不同的数组中，
  并按奇数、偶数交替的顺序输出这两个数组中的所有数据。
（先交替输出，如果奇数个数多，则再输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数）
提示与要求：
（1）定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，才能定义存储奇数和偶数的数组的长度；
（2）把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法）
*/
import java.util.Scanner;

class Exam{
	public static void main(String[] args){
		
		run();				
	}
	public static void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("一共有几个整数？");
		int[] arr=getArr(sc.nextInt());
		
		System.out.println("得到原始数组为：");
		printArr(arr);
		
		int x=evenSum(arr);
		System.out.println("一共有"+x+"个偶数");
		
		System.out.println("偶数数组为：");
		//getArrEven(arr,x);
		int[] arr1=getArrEven(arr,x);
		
		int y=OddSum(arr);
		System.out.println("一共有"+y+"个奇数");
		
		System.out.println("奇数数组为：");
		//getArrOdd(arr,y);
		int[] arr2=getArrOdd(arr,y);
		
		System.out.println("奇数偶数交替输出得到数组：");
		alternatePrint(arr1,arr2,x,y);
		
	}
	public static void alternatePrint(int[] arr1,int[] arr2,int x,int y){
		System.out.print("[");	
		if(x>y){
			for(int i=0;i<y;i++){
			System.out.print(arr1[i]+",");
			System.out.print(arr2[i]+",");
			}	
			for(int j=y;j<x;j++){
				if(j<x-1){
					System.out.print(arr1[j]+",");
					}else{
						System.out.print(arr1[j]);
					}				
			}
		}
		else if(x<y){
			for(int i=0;i<x;i++){
			System.out.print(arr1[i]+",");
			System.out.print(arr2[i]+",");
			}	
			for(int j=x;j<y;j++){
				if(j<y-1){
					System.out.print(arr2[j]+",");
					}else{
						System.out.print(arr2[j]);
					}				
			}
		}
		System.out.println("]");
	}
	
	
	public static int OddSum(int[] arr){		//统计奇数的个数
		int x=0;
		for(int i=0;i<arr.length;i++){	
			if(arr[i]%2!= 0){
				x+=1;
			}				
		}return x;
	}
	
	
	public static int[] getArrOdd(int[] arr,int x){	//得到奇数数组 同时 打印
		int[] arr2=new int[x];						//定义一个新的数组 装奇数们
		int a=0;									//循环外定义一个计数器
		System.out.print("[");						//打印一次左括号
		for(int i=0;i<arr.length;i++){				//记录并储存每一个奇数，并打印出来
			if(arr[i]%2 != 0){
				if(a<x-1){
					System.out.print(arr[i]+",");					
				}else{
					System.out.print(arr[i]);
					}
				arr2[a]=arr[i];
				a++;								//arr2[a],a一次加一位
			}		
		}
		System.out.println("]");
		return arr2;
	}
	
	
	public static int evenSum(int[] arr){		//统计偶数的个数，以便getArrEven()使用偶数的长度arr_length
		int x=0;
		for(int i=0;i<arr.length;i++){	
			if(arr[i]%2==0){
				x+=1;
			}				
		}return x;
	}
	
	
	public static int[] getArrEven(int[] arr,int x){	//得到偶数数组 同时 打印
		int[] arr1=new int[x];
		int a=0;	
		System.out.print("[");
		for(int i=0;i<arr.length;i++){	
			if(arr[i]%2==0){
				if(a<x-1){
					System.out.print(arr[i]+",");					
				}else{
					System.out.print(arr[i]);
					}
				arr1[a]=arr[i];
				a++;								//arr1[a],a一次加一位
			}		
		}
		System.out.println("]");
		return arr1;
	}
	
	
	public static void printArr(int[] arr){			//打印原数组
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i<arr.length-1){
				System.out.print(arr[i]+",");
			}
			else{
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
	
	public static int[] getArr(int arr_length){		//键入8个整数存放在一个数组
		Scanner sc=new Scanner(System.in);		
		int[] arr=new int[arr_length];
		
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个数");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
}