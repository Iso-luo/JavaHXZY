//13.输入三个整数x,y,z，请把这三个数由小到大输出。

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		
	int[] i=getArr();
	sort(i);
	getPrint(i);
	}
		public static void getPrint(int[] arr){
			
			for(int i=0;i<3;i++){
				System.out.print(arr[i]);
			}
		}
		public static void sort(int[] arr){
			for(int i=0;i<2;i++){
				for(int j=0;j<3-i-1;j++){
					if(arr[j]>arr[j+1]){
						exchange(arr,j,(j+1));
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
		public static int[] getArr(){			
			Scanner sc=new Scanner(System.in);		
			int[] arr=new int[3];
			
			for(int i=0;i<3;i++){
				System.out.println("请输入第"+(i+1)+"个数");						
				arr[i]=sc.nextInt();
			}
		return arr;	
		}
}	