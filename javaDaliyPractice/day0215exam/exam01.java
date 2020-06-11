/*01.类的成员变量
 猜数字游戏一个类A 有一个成员变量v 有一个初值100。
 定义一个类对A类的成员变量v进行猜。
 如果大了则提示大了,小了则提示小了。等于则提示猜测成功。
 */

import java.util.Scanner; 
class A{
	 private int v=100;
	 
	 A(){}
	 A(int v){
		 this.v=v;
	 }
	 
	 int getV(){
		 return this.v;
	 }
 }
 
 class Guess{
	 public static void main(String[] args){
		 System.out.println("请猜写一个数字");
		 Scanner sc= new Scanner(System.in);
		 int x=sc.nextInt();
		 
		 A a=new A();
		 if(x>a.getV()){
			 System.out.println("大了");
		 } else if(x<a.getV()){
			 System.out.println("小了");
		 }else{
			 System.out.println("猜测成功");
		 }
		 
	 }
	 
 }