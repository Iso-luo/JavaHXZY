import java.util.Scanner;
class GetSum{
	public static void main(String[] args){
	
		c();
		
	}
	
	
	
	public static int sum(int num){
		if(num==0){
			return 1;
		}
		return num*sum(num-1);
	}
	
	
	
	public static double b(int x){
		return (1.0/x);
	}
	
	
	public static void c(){
		double r = 0;
		for(int x=0;x<21;x++){
		
			r += b(sum(x));
		}
		System.out.println(r);
	
	
	}
	
	public static void test(){
		
		while(true){
				Scanner sc  = new Scanner(System.in);
				System.out.println("input a number::");
				int x = sc.nextInt();
				
				int number  = sum(x);
				System.out.println("分母是：："+number);
			
				System.out.println("分分数：："+b(number));
				
				System.out.println("finish");
			}
	
	}
}