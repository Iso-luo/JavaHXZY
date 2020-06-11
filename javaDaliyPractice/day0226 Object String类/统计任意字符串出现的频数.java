//要求：从键盘上输入任意一段字符串,统计某一字符出现的频数

import java.util.Scanner;
class A{	
	int getSum(char x,char[] value){
		int j=0;
		for(int i=0;i<value.length;i++){
			if(value[i]==x){
				j+=1;
			}
		}
		return j;
	}
}
class Demo{
	public static void main(String[] args){
		A a=new A();
		Scanner sc1= new Scanner(System.in);
		System.out.println("请输入您想统计的字符:");		
		char x=sc1.next().charAt(0);
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("请输入一串字符:");
		String str =sc2.nextLine();
		
		char[] value=str.toCharArray();		
		System.out.println(a.getSum(x,value));//【注意】getSum()方法中要把键盘键入的某个字符这个参数传进去！！
	}	
}