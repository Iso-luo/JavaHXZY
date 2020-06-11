//输入3个正数，判断能否构成一个三角形。

import java.util.Scanner;
class Judgment{
	public static void main(String[] args){
		
	judgeTriangle();
	
	}
	public static void judgeTriangle(){
		int[] arr1 =getSideLength();
		int a=arr1[0];
		int b=arr1[1];
		int c=arr1[2];
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.println("可以构成三角形");
		}else{
			System.out.println("无法构成三角形");
		}
		
	}
	public static int[] getSideLength(){
		int[] arr={0,0,0};
		for(int x=0;x<=arr.length-1;x++){
			System.out.println("请输入第"+(x+1)+"个数");
			Scanner sc = new Scanner(System.in);
			arr[x]=sc.nextInt();			
		}
		return arr;
		
	}
	
	
	
}