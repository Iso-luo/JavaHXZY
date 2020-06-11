/*
11. 编写一个方法public static int round(double n)能够对小数n进行四舍五入返回一个整数,注意考虑n的正负。

用一些正的或负的的小数测试一下自己编写的方法是否正确。
（基本思想：n是一个小数，那么（int）n则得到n的整数部分，
n减去自己的整数部分以后，通过跟正或负0.5比较大小，可决定四舍五入后的整数是多少）
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个小数：");
	double x=sc.nextDouble();					
	getInt(x);	
		
	}
		public static void getInt(double x){
			int a=(int)x;
			if(x>0){
				double r=x-a;
				if(r>=0.5){
					System.out.println("该小数四舍五入结果:"+(a+1));
				}
				else{
					System.out.println("该小数四舍五入结果:"+a);
				}
			}
			else if(x<=0){
				double r1=a-x;
				if(r1>=0.5){
					System.out.println("该小数四舍五入结果:"+(a-1));
				}
				else{
					System.out.println("该小数四舍五入结果:"+a);
				}
				
			}
			
			
		}
	
}