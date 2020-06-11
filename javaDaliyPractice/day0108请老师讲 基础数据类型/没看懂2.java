import java.util.Scanner;
class g {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System .out.println("请你从键盘上输入一个数");
		int x = sc.nextInt();
		System .out.println("请你从键盘上输入另一个数");
		int y = sc.nextInt();
		/*
		if(x == y){
			System .out.println("两个数是相等的");
		}else{
			System .out.println("两个数是不相等的");
		}

		}*/
		boolean b = (x == y);	
		
	
		System.out.println(b? "两个数是相等的":"两个数是不相等的");
	}
	
}