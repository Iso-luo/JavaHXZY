import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	
		//顺序结构
		
		//System.out.println( "a");System.out.println( "b");
		//System.out.println( "c");
		//System.out.println( "d");
		//System.out.println( "e");
		
		//如果 。。。 那么。。。。
		/*
		if(3>5){
			System.out.println("3<5成立");
			System.out.println("abc");
		}
		
		System.out.println("finish");*/
		
		// 如果 。。。否则。。。
		
		/*
		if(3>5){
			System.out.println("3<5成立");
			System.out.println("a");
		}else{
			System.out.println("3<5 不成立");
			System.out.println("b");
		}
		System.out.println("finish");
		*/
		
		//  如果 a  那么---》
		//	如果 b  那么---》
		//	如果 c  那么---》
		//	如果 d  那么---》
		//  其他  ---》
		
		System.out.println("plz  input ur  money");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		
		
		
		if(x>100){
			x = x-80;
			if(  x >100 ){
				System.out.println("哥们来吃火锅");
			}
				
		}else if( 90<x && x<=100){
			System.out.println("哥们来吃串串");
		}else if( 20<x && x<30){
			System.out.println("米饭");
			
		}else if(0< x&& x<20){
			System.out.println("面条");
		}else{
			System.out.println("不想吃");
		}
		
		System.out.println("哥们我吃饱了");
		
	}

}