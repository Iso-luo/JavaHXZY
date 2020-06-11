import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	
		//[1,2,3] --->[3,2,1] 
		
		//让用户从键盘上输入 数据

		//通过操作 让数据进行顺序翻转
		
		//从键盘上输入   存储在数组中
		
		int[] x = getArray();
		printArray(x);
		//顺序的操作
		
		
		printArray(x);
		
	}
	
	public static int[] getArray(){
		Scanner sc  = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int x=0;x<arr.length;x++){
			System.out.println("从键盘上第"+(x+1)+"个数");
			arr[x] = sc.nextInt();
		
		}
	
		return arr;
	}
	
	public static void printArray(int[] x){
		System.out.print("[");
		for(int i=0;i<x.length;i++){
			if(i != x.length-1){
				System.out.print(x[i]+",");
			}else{
				System.out.print(x[i]);
			}
		}
		System.out.print("]");
	}

}