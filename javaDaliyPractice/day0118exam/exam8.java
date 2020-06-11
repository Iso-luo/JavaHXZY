//8.将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int x=sc.nextInt();
		primeFactor(x);
	}
	
	public static void primeFactor(int a){
		System.out.print(a+"=");
		for(int i=2;i<=a;i++){		//每个数一来 就从2开始除 只要能除尽 就打印出来
			while(a%i==0){
				if(a!=i){
					System.out.print(i+"*");
				}
				else{
					System.out.println(i);
				}
				a=a/i;	
			}			
		}			
	}		
}	
