//输入一个数，计算它的阶乘 如：5x4x3x2x1=? 两种方法如下：


/*
//方法一：
import java.util.Scanner;
class GetSum{
	public static void main(String[] args){	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入需要阶乘的数字____.");
		int x=sc.nextInt();		
		System.out.print("该数的阶乘结果为："+getSum(x));			
		}	

	//以下为计算阶乘的精华部分
	public static int getSum(int x){		//定义一个有返回值的含参函数
		if(x==1){									
			return 1;						//如果给定的x是1，getSum()返回的是1;
			}		
		return x*getSum(x-1);				//getSum()返回的是x*getSum(x-1)，而其中getSum(x-1)返回的是(x-1)*getSum((x-1)-1)..
		}									//以此类推直到getSum()里面的值为1，则返回数值1代入。


}
*/



//方法二：
import java.util.Scanner;
class GetSum{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入需要阶乘的数字____.");	
	int x = sc.nextInt();
	System.out.print("该数的阶乘结果为："+sum(x));	
	}
	
	//以下为计算阶乘的精华部分
	public static int sum (int x){			//定义一个有返回值的含参函数			
		int y=1;							//定义一个返回值y
		for(int i=x;i<=x;i--){				//循环代入相乘
			y=y*i;
			if(i==1){						//停止循环的条件
			break;
			}		
		}
		return y;							//返回最终算得的y
	}	
}