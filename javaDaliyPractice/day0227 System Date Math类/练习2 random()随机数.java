class A{//0<=Math.random()<=1
	public static void main(String[] args){
		getNum1();	
		getNum2();	
	}	
	public static void getNum1(){	//(0,100]
		double x=100*Math.random();
		System.out.println(x);	
		}
			
	public static void getNum2(){	//(10,100]
		double y=0.0;
		if(100*Math.random()<=10){
			y=100*Math.random()+10;
		}else if(100*Math.random()>10){
			y=100*Math.random();
		}		
		System.out.println(y);		
	}	
}