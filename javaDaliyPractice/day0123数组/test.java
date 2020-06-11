//还没有练习完 2019.1.23


import java.util.Scanner;

class Demo{
	public static void main(String[] args){
		
	run();	
	}
	
	public static void run(){
	System.out.println("请从键盘上输入长度");	
	Scanner sc= new Scanner (System.in);
	int[] x=getArray(sc.nextInt());
	printArray(x);

	
	}
	public static void sort(){
		for(int i=0;i<x.length-1){
			for(int){int j=0;
				
			}
		}
	}
	public static void printArray(int[] x){		
		System.out.print("[");
		for(int i=0;i<x.length;i++){
			if(i!=x.length-1){
				System.out.print(x[i]+",");
			}else{
				System.out.print(x[i]);
			}
		}
		System.out.print("]");		
	}
	
	public static int[] getArray(int arr_length){
		Scanner sc= new Scanner (System.in);
		int[] arr=new int[arr_length];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个数");
			arr[i]=sc.nextInt();
		}
		return arr;
	}	
	
}		
		
		
		
		
	
	
	
	



