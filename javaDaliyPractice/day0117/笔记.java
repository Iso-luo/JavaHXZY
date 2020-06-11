class GetSum{
	public static void main(String[] args){
			
		//String  x = introduce("cyx",35);
				
		//sop(x);
				
		//int y = getSum(1+111);
		
		//sop("ads");
		//sop(12321);
	
		int x = getSum(5);
		
		System.out.print(x);
	}
														
	public static int getSum(int x,int y){	//定义方法 I  求a+b  -返回--> 结果(返回值)
	
		return x+y;
	}
		
	public static void sop(String x){	//定义方法 II
		System.out.println(x);
	}
	
	public static int sop(int x){		//定义方法 III
		return 3;
		
	}
	
	// 1,参数列表    2，返回值类型 string
	public static String introduce(String name,int age){
		return "我的名字是"+name +" "+ "我的年龄是："+age;
	}
	
	
	/*
	方法的重载 见上方法II和III
	
	1, 多个方法的名字 必须一模一样
	2, 参数列表不一样
			1，参数的个数
			2, 参数的类型
	3, 和返回值类型( 以及访问修饰符  )无关
	
	
	*/
	
	

	public static int getinfo(int x){
		return 3;
	}
	public static void getinfo(){
	
	}
	
	public static void sum (int num){
		int num1=1;
		for(int x=num;x<=num;x--){
			num1=num1*x;
			if(x==1){
			break;
		}
			
		}
		System.out.println(num1);
		
	}

	
}