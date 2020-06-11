// 无法运行！！

import java.util.Scanner;
class flower{
	public static void main(String[] args){
		
	Scanner sc=new Scanner (System.in);
	System.out.println("plz intput three number");
	int x=sc.nextInt();	
	int y=sc.nextInt();
	int z=sc.nextInt();
	
	}
	
	public static String flowerNum(int x,int y,int z){
		
		if((100*x)+(10*y)+(1*z) =(x^3)+(y^3)+(z^3)){
		
			System.out.println("这个数是水仙花数");	
		}
		else if((100*x)+(10*y)+z != (x^3)+(y^3)+(z^3)){
			System.out.println("这个数不是水仙花数");
		}
				
	}
		
}