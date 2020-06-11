

import java.util.Scanner;
//[1,2,3,4] --->[4,3,2,1] 
class Demo{
	public static void main(String[] args){	
		run();		
	}
	
	public static void run(){						//运行
		Scanner sc  = new Scanner(System.in);
		System.out.println("请用户从键盘上输入数组的长度:");	
		int[] x = getArray(sc.nextInt());			//1.录入数组,括号里直接放（sc.nextInt）分解：int xx = sc.nextInt();int[] x = getArray(xx);	
		printArray(x);								//2.输出录入的数组
		
		sort(x);
		//顺序的操作
		//exchangeArray(x);							//3.颠倒位置
		System.out.println("交换后");
		printArray(x);								//4.输出交换后的数组
	}
	
	public static void exchangeArray(int[] arr){	//颠倒位置 参数含义：	
		int tmp=0;									//定义交换参数类型和值
		for(int x=0;x<arr.length*0.5;x++){			
			
			tmp = arr[x];
			arr[x]=arr[arr.length-(1+x)];
			arr[arr.length-(1+x)]=tmp;
		}
	
	}
	

	public static int[] getArray(int arr_length){	//录入数组 参数含义：
		Scanner sc  = new Scanner(System.in);
		int[] arr = new int[arr_length];
		
		for(int x=0;x<arr.length;x++){
			System.out.println("从键盘上输入数组中第"+(x+1)+"个数");
			arr[x] = sc.nextInt();
		
		}
	
		return arr;
	}
	
	public static void printArray(int[] x){ 		//输出录入的数组 参数含义：
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


	public static void sort(int[] arr){			// 比较大小 参数含义：	
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){			//理解？？
			
				if(arr[j] >arr[j+1]){
						exchange(arr,j,j+1);
				}	
			}
			
		}
	}
		
	public static void exchange(int[] arr,int a,int b){
				int temp = 0;
				temp = arr[a];
				arr[a]=arr[b];
				arr[b]=temp;
					
	}		
	
}