import java.util.Scanner;
import java.util.Arrays; //导包，可直接用该方法进行排序
class Demo{
	public static void main(String[] args){
		doAction();
	}
	
	
		

	public static void doAction(){
		//获得数组
		int[] arr = getArray();
		//排序
		Arrays.sort(arr); //可直接用该方法进行排序
		//打印数组
		//printArray(arr);
		double  r = getavg(arr);
		system.out.println("_---------------_")
		System.out.println("这个选手得分是："+r);
	}
	
	//对数组中数据的修改
	public static void modify(int[] arr){
		arr[0]=0;
		arr[arr.length-1]=0;
	}

	public static int[] getArray(){
		int[] arr  = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int x =0;x<arr.length;x++){
			System.out.println("请"+(x+1) +"位评委打分");
			arr[x]= sc.nextInt();
		}
		return arr;
	}
	
	
	//打印数组
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
		
			if(x == arr.length-1){
				System.out.print(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		
		}
		System.out.print("]");
	}
	public static double getavg(int[] arr){
	
		int sum=0;
		for(int x=0;x<arr.length;x++){
			sum +=arr[x];
		
		}
		return (double)sum / (double)(arr.length-2);
	}

}