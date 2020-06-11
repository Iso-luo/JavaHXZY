

import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	
		// if /for
		// x ==5 ---->开始for循环
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("plz input a number");
		int x= sc.nextInt();
		
		if (x==5){
		
			for(int i=0;i<10;i++){
				System.out.println("i lao hu U");
			}
			
		}else{
			
			while(true){
				System.out.println("i hate u!");
			}
		}
		
		
	}

}