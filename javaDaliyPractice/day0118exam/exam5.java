/*
我国古代数学家张邱建在《算经》中出了一道“百钱买百鸡”的问题，题意是这样的：
5文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只雏鸡。
现在用100文钱买100只鸡，那么各有公鸡、母鸡、雏鸡多少只？
请编写程序实现。
*/

class Exam{
	public static void main(String[] args){
		int x=0;						//公鸡
		int y=0;						//母鸡
		while(x<100){
			if((100-(7*x))%4==0){
				y=(100-(7*x))/4;
				if(y>=0){				
				System.out.print("公鸡:"+x+";");	
				System.out.print("母鸡:"+y+";");	
				System.out.println("雏鸡:"+(100-x-y));
				}
			}
			/*else if((100-(7*x))%4!=0){
				continue;
			}*/
			x++;
		}
				
	}
	
}