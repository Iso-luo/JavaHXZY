import java.util.Scanner;
class Demo2{
	public static void main(String[] args){
		//输入一个年龄 >30 少妇 <30  姑娘
		Scanner sc = new Scanner(System.in);
		System.out.println("请从键盘输入一个年龄");
		int x = sc.nextInt();
		if (12<x && x<40){
			if(x>30){
				System.out.println("少妇");
			}else{
				System.out.println("姑娘");
				
	        }	
        }else{
			System.out.println("结束");
		}
	}
}
