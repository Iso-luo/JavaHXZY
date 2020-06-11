/*8、编写程序，判断一个三位数是不是水仙花数。
水仙花数指的是个三位数，其各位数字立方和等于该数本身。
例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
100*X+10*y+z=x^3+y^3+z^3
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
			
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个三位数");
	int x=sc.nextInt();
	judgment(x);
		
	}
	public static void judgment(int a){		
		int x=a/100;
		int y=(a%100)/10;
		int z=(a%100)%10;
		if(a==x*x*x+y*y*y+z*z*z){
			System.out.println("该数是水仙花数");
		}else{
			System.out.println("该数不是水仙花数");
		}		
	}
}