/*
9.水仙花数定义：
① 一定是3位数
②每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
寻找所有的水仙花数( 用两种方式)
*/

/* 
//方法一：用for循环的方法：
class Exam{
	public static void main(String[] args){		
		for(int i=100;i<1000;i++){
			int x=i/100;
			int y=(i%100)/10;
			int z=(i%100)%10;
			if(i==x*x*x+y*y*y+z*z*z){
				System.out.println(i);
			}			
		}		
	}	
}
*/



//方法二：用while循环的方法（从哪里开始循环老搞不清楚）：
class Exam{
	public static void main(String[] args){		
		int i=100;						//在循环外定义一个初始变量i	
		//int x=i/100;不能这样放在循环外！！！
		//int y=(i%100)/10;不能这样放在循环外！！！
		//int z=(i%100)%10;不能这样放在循环外！！！
		while(i<1000){
			int x=i/100;				//要放在循环里！！！
			int y=(i%100)/10;			//要放在循环里！！！
			int z=(i%100)%10;			//要放在循环里！！！
			if(i==x*x*x+y*y*y+z*z*z){	
				System.out.println(i);			
			}			
		i=i+1;		
		}		
	}

	
}