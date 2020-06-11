/*
11.利用条件运算符的嵌套来完成此题：
学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
( 用两种方式)


不会第二种方法？？？
*/

//方法一：
import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生的成绩");
		int x=sc.nextInt();
		num(x);		
	}
	public static void num(int a){
		if(a<60){
			System.out.println("C");
		}else if(60<=a && a<=89){
			System.out.println("B");
		}else{
			System.out.println("A");
		}		
	}	
}