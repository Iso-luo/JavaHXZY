import java.util.Scanner;
class Tax{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println("plz input ur salary");
	
		int x= sc.nextInt();
	
		//sum(x);
	
		System.out.println("you should pay  " + sum(x) + "  for the tax");	
	}
    public static double sum(int x)
    {		
		double d  = 0.0;
		if(0< (x-3500) && (x-3500) <=1500 )
		{
			//int sum=(x-3500)*3%-0;(错.sum是方法名，我又定义成变量名)
			//System.out.println("    knkkk");
			//sop(  (x-3500)*0.03 - 0  );
			d = (x-3500)*0.03 - 0 ;
			//return d;
		} 
		else if(1500<x-3500 && x-3500<=4500){
			d= (x-3500)*0.1-105;
		}
		else if(4500<x-3500&&x-3500<=9000){
			d = (x-3500)*0.2-555;		
		}
		else if(9000<x-3500&&x-3500<=35000){
			d = (x-3500)*0.25-1005;		
		}
		else if(35000<x-3500&&x-3500<=55000){
			d = (x-3500)*0.3-2755;
	
		}
		else if(55000<x-3500&&x-3500<=80000){
			d = (x-3500)*0.35-5505;			
		}
		else if(80000<x-3500){
			d = (x-3500)*0.45-13505;			
		}		
		return d;		
   }  
    /*public static void sop(double x)
    {
		
		System.out.println("you should pay "+x+" for the tax");
		
	}*/
} 