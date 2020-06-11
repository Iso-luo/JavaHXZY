import java.util.Random;

class A{			//0<=Math.random()<=1
	public static void main(String[] args){
		getNum1();	
		getNum2();	
	
	}
		public static void getNum1(){		//(0,100]
			Random r=new Random();
			int x=r.nextInt(101);			
			System.out.println(r.nextInt(101));
		}
		
		public static void getNum2(){		//(10,100]
			Random r=new Random();
			int y=0;
			int x=r.nextInt(101);
			if(x<10){
				y=x+10;
			}else{
				y=x;
			}
			System.out.println(y);
		}	
		
}