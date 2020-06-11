//1、编写一个方法，判断该年份是平年还是闰年。

import java.util.Scanner;
class Practice{
     
	public static void main(String[] args){	 
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入您需要判断的年份");
	int x=sc.nextInt();
	judgment(x);
	}
	public static void judgment(int a){
		if(a%100==0)
		{
			a=a/100;
			if(a%4==0){
				System.out.println("该年份为闰年");
			}else{
				System.out.println("该年份为平年");
			}
		}
		else{
			if(a%4==0){
				System.out.println("该年份为闰年");
			}else{
				System.out.println("该年份为平年");
			}
		}
		
	}
}