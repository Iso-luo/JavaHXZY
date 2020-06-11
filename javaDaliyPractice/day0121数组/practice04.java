//对输入的一个整数，按相反的顺序输出该数。

import java.util.Scanner;

class Order{
	public static void main(String[] args){		
	int[] arr2=reverse();
	
	System.out.print(arr2[0]);
	System.out.print(arr2[1]);
	System.out.print(arr2[2]);
	System.out.print(arr2[3]);
	
	}
	public static int[] reverse(){
		int[] arr1=getNum();
		int a=arr1[0];
		int b=arr1[1];
		int c=arr1[2];
		int d=arr1[3];
		arr1[0]=d;
		arr1[1]=c;
		arr1[2]=b;
		arr1[3]=a;
		return arr1;
	}
	public static int[] getNum(){
		int[] arr={0,0,0,0};
		for(int x=0;x<=arr.length-1;x++){
		
		Scanner sc=new Scanner(System.in);
		arr[x]=sc.nextInt();
		
		}
		return arr;
	}
	
	
	
}