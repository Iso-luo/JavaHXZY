//1.求一元二次方程的根
import java.util.Scanner;
//import java.util.Arrays;
class Root{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);			
		int[] arr = {0,0,0};		
		for(int x=0;x<=arr.length-1;x++){				//依次输入方程系数a,b,c
			System.out.println("请输入第"+(x+1)+"个数");
			arr[x]=sc.nextInt();
		}
		
	    //arr[1]=sc.nextInt();		
		equationRoot(arr);
	}
	public static void equationRoot(int[] arr){
		int a=arr[0];
		int b=arr[1];
		int c=arr[2];	//ax*x+bx+c=0
		double x1=0.0;
		double x2=0.0;
		if(b*b>=4*a*c){
			x1=((-b)-Math.sqrt(b*b-4*a*c))/2;
			sop(x1);
			x2=((-b)+Math.sqrt(b*b-4*a*c))/2;
			sop(x2);
		}
	
	}
		public static void sop(double x){
		
		//System.out.println(Arrays.toString(x));
		System.out.println(x);
	}
	
}