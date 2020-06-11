
// 看不懂欸！！！

import java.util.Scanner;
class Demo{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz input 1st values");
		int x = sc.nextInt();
		System.out.println("plz input 2nd values");
		int y = sc.nextInt();
		System.out.println("plz input 2nd values");
		int z = sc.nextInt();
	
		//int mid_r  = x>y ? x : y;
		//int final_r = mid_r>z ? mid_r:z;
		System.out.println( x>y && x>z ? x : y);
	}
}