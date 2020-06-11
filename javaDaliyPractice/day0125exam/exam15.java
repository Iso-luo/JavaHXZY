/*
15、利用条件运算符的嵌套来完成此题：
学习成绩大于等于90分的同学用A表示，
		60-89分之间的用B表示，
		60分以下的用C表示。
程序分析：(a>b)?a:b这是条件运算符的基本例子。
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入该生的成绩：");
		int x=sc.nextInt();
		
		if(x<0||x>100){
			System.out.println("请输入百分制成绩！");
		}else{
			String r=(x>=90)?"该成绩属于A等级":((x<60)?"该成绩属于A等级":"该成绩属于B等级");		
			System.out.println(r);
		}
	}	
}
