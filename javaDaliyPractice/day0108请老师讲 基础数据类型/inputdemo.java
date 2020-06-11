import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	
		/*
		
		1, 导包
		   import java.util.Scanner;
		2, 创建对象
			Scanner sc = new Scanner(System.in);
		3, 接收数据
		int x = sc.nextInt();

		*/
		System.out.println("请你从键盘上输入一个数：");
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int r = x +100;
		System.out.println(r);
	}

}