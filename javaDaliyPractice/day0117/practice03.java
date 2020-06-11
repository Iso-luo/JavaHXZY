/*
3.接收一个层数值n，打印一个有n层的直角三角形.
并返回底边最后一个值,并打印出来。---这个没解出来！！！
*/

import java.util.Scanner;
class Practice{
     
	public static void main(String[] args){	 
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入层数");
		int n=sc.nextInt();
		print(n);
		
	}	
	public static String print(int n){
		for(int i=1;i<=n;i++){		
			for(int j=1;j<=i;j++){				
				if(j<i){
					System.out.print("*");
				}else{
					System.out.println("*");
				}	
			}			
		}
	}
	
}