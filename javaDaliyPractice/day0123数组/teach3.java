//一维数组的录入，打印，排序，求最值、平均值、和等；

import java.util.Scanner;
//[1,2,3,4] --->[4,3,2,1] 
//[3,4,1,2] --->[1,2,3,4]
class Demo{
	public static void main(String[] args){
	
		run();														//运行 run函数无返回值，这里不要写成x=sun()
		
		//int[] arr = {1,4,3};
		//sort(arr);
		//printArray(arr);
	}
	
	public static void run(){
		Scanner sc  = new Scanner(System.in);						//创建对象
		System.out.println("请用户从键盘上输入数组的长度:");		//必须放在这里，为下一步做铺垫，先提示客户 不能放在getArray函数中！
		int[] x = getArray(sc.nextInt());							//1.录入数组,括号里直接放（sc.nextInt）分解：int xx = sc.nextInt();int[] x = getArray(xx);				
		printArray(x);
		//顺序的操作
		//exchangeArray(x);	
		sort(x);
		System.out.println("交换后");
		printArray(x);
		
		getMax(x);										//获取 最大值  获取最小值
		getMin(x);
		
		geAvg(x);										// 求均值  求和
		getTotal(x);
		
	}
	
	public static double geAvg(int[] x){				//数组求平均数
		int a=getTotal(x);
		return a/x.length;
	}
	
	public static int getTotal(int[] x){				//数组各位求和
		int total =0;
		for(int i=0;i<x.length;i++){
			total +=x[i];
		}		
		return total;
	}	
	
	public static int getMax(int[] x){					//最大数
		sort(x);
		return x[x.length-1];
	
	}
	public static int getMin(int[] x){					//最小数
		sort(x);
		return x[0];
		
	}
	
	public static void sort(int[] arr){					//从小到大排序  （冒泡排序法）
			
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if( arr[j] > arr[j+1]){					//注意是arr[j]>arr[j+1]不是j>j+1
					exchange(arr,j,j+1);				//注意exchange()里要加arr，确保调用的是数组及其序号
				}
			}
		}
	}
	
	public static void exchange(int[] arr,int a,int b){			//调换位置
		int tmp =0;												//注意exchange()里的参数列表要包含参数：数组int[]arr,序号a,序号b
		tmp =arr[a];											//注意是将序号a和b位置上的数arr[a]和arr[b]调换，而不是调换序号a和b
		arr[a]=arr[b];											//注意参数是序号，调换的是序号所对应的数值
		arr[b]=tmp;
	}
	
	public static void exchangeArray(int[] arr)	{		//从小到大排序  （非 冒泡排序法）未调用的方法
		int tmp=0;
		for(int x=0;x<arr.length*0.5;x++){
			
			tmp = arr[x];
			arr[x]=arr[arr.length-(1+x)];
			arr[arr.length-(1+x)]=tmp;
		}
	
	}
	
	public static void printArray(int[] x){			//打印数组
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
	
	public static int[] getArray(int arr_length){		//录入数组长度及各位数字 getArray(变量类型+变量名)
		Scanner sc  = new Scanner(System.in);			//必须要有这个 创建对象，否则下一行的sc.nextInt（） 无法使用		
		int[] arr = new int[arr_length];				//定义一个未确定长度的数组 int[] arr=new int[x]
		
		for(int x=0;x<arr.length;x++){					//使用循环方式录入数组的每一位数
			System.out.println("从键盘上输入数组中第"+(x+1)+"个数");
			arr[x] = sc.nextInt();						//一个数的录入
		
		}
	
		return arr;										//只是返回一个数组 并没有输出
	}
	

}