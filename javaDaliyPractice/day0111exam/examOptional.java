import java.util.Scanner;
class test{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Plz input a number");
		int x = sc.nextInt();
		judgement(x);
    }
	public static void judgement(int x)
	{	
		if(x%2 ==0)
		{
			while(true)
			{
				 x=x/2;
				 if(x==1){
					break;					
				 }				
			}
			System.out.println("the outcome is true 1");
		}	
		else if(x%2 !=0)
		{
			x=x*3+1; 
				while(x%2 ==0)
				{
					x=x/2;
					if(x==1){
						break;					
					}
				
				}
				System.out.println("the outcome is true 2");
		}
		
	}
				

}