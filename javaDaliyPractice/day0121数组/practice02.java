//判断是否为小写字母，如果是，转换为大写字母，否则不转换。

import java.util.Scanner;
class Alphabet{
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("plz input a char");
		//String s = sc.nextLine();
		char ch = sc.next().charAt(0);
		
		// char  --->int  Scii
		int x = (int)ch;
		
		if (    97<=x  && x<=122){
			System.out.println("这个是小写"+ch);
			
			 System.out.println(ch+"的大写是"+ (char)(x-32) );
		}else{
			
			System.out.println("这个是大写字母"+ch);
		}
		
	}
	
	
	
}