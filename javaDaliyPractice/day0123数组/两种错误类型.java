//两种错误类型

import java.util.Scanner;
//[1,2,3,4] --->[4,3,2,1] 
//[3,4,1,2] --->[1,2,3,4]
class Demo{
	public static void main(String[] args){
		/*   NullPointerException
		int[] arr = {1,2,4};
		arr = null;
		System.out.println(arr[0]);
		
		*/
		
		// Array index out of bound exception
		int[] arr = {1,2,3};
		System.out.println(arr[33]);
	}
	
}