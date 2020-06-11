
/*

     1+1/2!+1/3!+1/4!+...1/20!=?
	 
	 
	 5!
	 6!
	 --->递归
	 
	 1，求和
	 2，求倒数
	 3，求递归阶乘
	 

*/
import java.util.Scanner;
class Demo{
	//  1 +1/2!  =1.5
	public static void main(String[] args){
	
		System.out.println("请输入n");
		Scanner sc  = new Scanner(System.in);
		int input  = sc.nextInt();
	
		double r = getSum(input);
		
		System.out.println("结果"+r);
	}
	
	
	//求任意数的阶乘
	//2个明确   
	//  1 明确参数列表   2 明确有没有返回值
	
	// 递归套路  1，递归结束的条件 2，自己调用自己
	
	//阶乘 n! n*(n-1)*(n-2)*2*1
	public static int getFactorial(int x){
		if(x ==1){
			
			return 1;
		}
		return x*getFactorial(x-1);
	}
	// 求 倒
	public static double getReciprocal(int x){
		return 1.0/x;
	}
	
	// 求 和   累加思想
	//  1, 在循环外面定义一个变量   2，在循环里面  +=
	public static double getSum(int n){
		double total=0.0;
		//System.out.println("hahah"+d);
		for(int x=1;x<=n;x++){
			total +=  getReciprocal(    getFactorial(x)      )   ;
		
		}

		return total;
	}
	

	
}