/*
2.现在有如下一个数组： 
int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}; 
要求将以上数组中的0项去掉，将不为0的值存入一个新的数组，生成新的数组为 
int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5};
*/


import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组的长度");			 
		int[] arr=getOldArr(sc.nextInt());		
		int x=getNewLength(arr);		
		System.out.println("0的个数为："+(arr.length-x));		
		int[] arr1=getNewArr(arr,x);
		printNewArr(arr1,x);
	}
		public static void printNewArr(int[] arr,int j){//参数为：新数组和新数组的长度
			System.out.print("新数组为：[");
			for(int i=0;i<j;i++){
				if(i!=(j-1)){
					System.out.print(arr[i]+",");
				}
				else{
					System.out.print(arr[i]+"]");
				}
			}			
		}
		
		public static int[] getNewArr(int arr[],int j){  //参数为：旧数组和新数组的长度 
			int[] arr1=new int[j];
			int z=0;
			int i=0;
			while(i<j){
											  /*if(z<arr.length){
												  if(arr[z]==0){
														continue;
													}							
													else if(arr[z]!=0){
														arr1[i]=arr[z];
														i+=1;
													}
													z+=1;					
												}
											不能这样写 是死循环*/		
				
				
				if(arr[z]!=0){			//只写执行条件 不需要再写不执行的条件
					arr1[i]=arr[z];
					i+=1;	
				}
				z+=1;				
			}			
			return arr1;
		}
					
		public static int getNewLength(int[] arr){ //得到新数组的长度
			int j=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]!=0){
					j+=1;
				}
				else{
					continue;
				}
			}			
			return j;			
		}
		
		public static int[] getOldArr(int arr_length){ //录入旧数组
			Scanner sc=new Scanner(System.in);		
			int[] arr=new int[arr_length];		
			for(int i=0;i<arr.length;i++){
				System.out.println("请输入第"+(i+1)+"个数");
				arr[i]=sc.nextInt();
			}			
			return arr;	
		}
}