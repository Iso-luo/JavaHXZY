import java.util.Scanner;
class M {
public static void main(String[] agrs){
	System .out.println("请你从键盘上输入第一个数");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	System .out.println("请你从键盘上输入第二个数");
	int num2 = sc.nextInt();
	System .out.println("请你从键盘上输入第三个数");
	int num3 = sc.nextInt();
	if(num1>num2 && num1>num3){
		if(num2>num3){
		System .out.println(num1+">"+num2+">"+num3);	
		}else{
		System .out.println(num1+">"+num3+">"+num2);
		}
	}else if(num2>num1 && num2>num3){
		if(num1>num3){
		System .out.println(num2+">"+num1+">"+num3);	
		}else{
		System .out.println(num2+">"+num3+">"+num1);
		}
	}else if(num3>num1 && num3>num2){
		if(num1>num2){
		System .out.println(num3+">"+num1+">"+num3);	
		}else{
		System .out.println(num3+">"+num2+">"+num1);
		}
	}else{
	
	
	
	}
	
	}
}
