//歌手打分 一维数组
import java.util.Scanner;
class Exam{
	public static void main(String[] args){
	
	run();
	
	}
	
	
	public static void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("一共有几位评委打分？");
		int[] arr1=getScore(sc.nextInt());
		printScore(arr1);
		System.out.println("分数从小到大排序为：");
		sort(arr1);
		printScore(arr1);
		System.out.println("该选手的最高分为："+getMax(arr1)+"分");
		System.out.println("该选手的最低分为："+getMin(arr1)+"分");
		System.out.println("去掉最高分和最低分：");
		int[] arr2=getNew(arr1);
		printScore(arr2);
		System.out.println("该选手的最终得分为："+getAvg(arr2)+"分");
		getAvg(arr2);
	}
	
	public static int getAvg(int[] x){ //
		int a=getTotal(x);
		return a/(x.length);					
	}
	
	public static int getTotal(int[] x){
		int total=0;
		for(int i=0;i<x.length;i++){
			total +=x[i];
		}
		return total;
	}
		
	public static int[] getNew(int[] arr){	
		int[] x=new int[arr.length-2];		//定义一个新的数组 长度比原数组短2
		for(int j=0;j<arr.length-2;j++){	//新数组的每一序号上的值 是对应原数组的下一序号上的值	
			x[j]=arr[j+1];				
		}		
	return x;								//返回新数组
			
	}
	
	public static int getMax(int[] arr){		
		
		return arr[arr.length-1];
	}
	
	public static int getMin(int[] arr){
		return arr[0];
	}
	
	public static void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){   //把最大的放到最后 把第二大的放到倒数第二
				if(arr[j]>arr[j+1]){
					exchange(arr,j,j+1);
				}
			}
		}
	}
	
	public static void exchange(int[] arr,int a,int b){
		int temp=0;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
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
			System.out.println("请输入第"+(x+1)+"位评委的打分");
			arr[x]=sc.nextInt();
		}
		return arr;
		
	}
	
	
	
}