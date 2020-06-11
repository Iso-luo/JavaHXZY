import java.util.Scanner;
class Demo{
	
	public static void main(String[] args){
		
		/*
			从键盘上录入数据 
			
			1,int x=nextInt()   
			2,Double x=nextDouble()			   
			3,String x =sc.nextLine();
			4,char x =sc.next().charAt(0);
		
		
			---------------从键盘上录入数据有3个步骤
			1，导包
			2, 创建Scanner对象
			
			3, 接受数据
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz intput  a  number");
		int x =  sc.nextInt();
		System.out.println("这个数是："+x);
		
	}
	
}