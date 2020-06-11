/*
12.企业发放的奖金根据利润提成。
利润(i)低于或等于10万元时，奖金可提10%；
利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
20万到40万之间时，高于20万元的部分，可提成5%；
40万到60万之间时高于40万元的部分，可提成3%；
60万到100万之间时，高于60万元的部分，可提成1.5%，
高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的利润(万元)：");
		int x=sc.nextInt();
		getSalary(x);
				
	}
	public static void getSalary(int i){
		if(i<=10){
			System.out.println("提成为："+(i*0.1)+"万元");
		}else if(10<i && i<=20){
			System.out.println("提成为："+(10*0.1+(i-10)*0.075)+"万元");
		}else if(20<i && i<=40){
			System.out.println("提成为："+(10*0.1+10*0.075+(i-20)*0.05)+"万元");
		}else if(40<i && i<=60){
			System.out.println("提成为："+(10*0.1+10*0.075+20*0.05+(i-40)*0.03)+"万元");
		}else if(60<i && i<=100){
			System.out.println("提成为："+(10*0.1+10*0.075+20*0.05+20*0.03+(i-60)*0.015)+"万元");
		}else if(100<i){
			System.out.println("提成为："+(10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(i-100)*0.01)+"万元");		
		}
	}
	
	
}