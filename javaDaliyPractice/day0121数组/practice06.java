//将一个正整数分解质因数。例如输入90 打印出90=2*3*3*5 
//没解出来！
import java.util.Scanner;
class Factorize{
	public static void main(String[] args){
	//输入x=8
	System.out.println("请你输入一个数");
	Scanner sc=new Scanner(System.in);
	int x =sc.nextInt();
		for(int i=2;i<x;i++){ 
		
			if(x%i==0){  
				System.out.println(i);
				x=x/i;   
					if(x%i!=0)
					{ 
						System.out.println(x);
					}
					else if(x%i==0)
					{
						while(true){ 
							System.out.println(i);
							x=x/i;	
							if(x%i!=0){
								break;
							}
						}					
					}
			}
			else if(x%i!=0){
				while(true){
					x=x/i++;
					if(x%i==0){
						System.out.println(i);		
						break;	
					}
				}				
		
			System.out.println(x);
			
		
			}
		}
	
	}	
	
	
	
}

/*同学的做法
import java.util.Scanner;
class a1807{
	public static void main(String[] args){
		System.out.println("请输任意整数");		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		dg(a);
	}
	public static void dg(int x){
		System.out.print(x+"=");
		for(int y=2;y<=x/2;y++){						
			if(x%y==0){					//如果x可被y整除					
				System.out.print(y+"*");//输出y	（不换行）			
				x=x/y;					//x重新赋值						
				y=2;					//y重新计数
			}	
		}								//for循环结束y<=x/2;x%y!=0
		System.out.print(x);			//最后一个数是x （不换行）
	}	
		
	
}
*/