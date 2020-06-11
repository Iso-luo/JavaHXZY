/*
4.编写一个方法用于求任意两个正整数的最大公约数，调用此方法求16和24的最大公约数。
备注：求最大公约数使用 辗转相除法 ，我国古代数学家秦九韶1247年在《数书九章》中记载了此方法，其处理过程如下：
（1）提供两个数m和n
（2）以n除m，求得余数r（r=m%n）
（3）判断r是否为0，若r=0，此时的n值即为最大公约数，计算结束。
				   若r≠0，更新被除数和除数，n送m（即m=n），r送n（即n＝r），转到（2）。
	r=m%n;
	while(r!=0){m=n;n=r;r=m%n}
*/

import java.util.Scanner;
class Practice04{
	public static void main(String[] args){
		
		int n=getNum();
		int m=getNum();
		int r=m%n;
		while(r!=0){			
			m=n;
			n=r;
			r=m%n;
		}
		
		if(r==0){
			System.out.println("这两个正整数的最大公约数是"+n);
		}
		
	}
		public static int getNum() {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个正整数");
			int m = sc.nextInt();
			return m;
		}
	}