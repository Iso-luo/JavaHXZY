class Demo{
	public static void main(String[] args){
		//计数器思想
		int i =0;
		while(true){
			i++;
			if(i%2 ==0 ){
				continue;
			}
			System.out.println(i+"aaa");
			
		}
	}
	
}


class Demo1{								//累加思想
	public static void main(String[] args){
		
		
		int a=0;
		for(int x=1;x<11;x++){
		
			a=x+a;  // x += 中间变量
		}
		System.out.println(a;
		
	}
	
}



class Demo2									//偶数求和							
	public static void main(String[] args){
		
		
		int a=0;
		for(int x=1;x<11;x++){
			if(x%2 ==0){ 
				a=x+a;  // x += 中间变量
			}
			
		}
		System.out.println("偶数和"+a);
		
	}
	
}


/*
	* while和for循环后的练习题目：
	 用for循环输出1—1000之间能被5整除的数，
	 且每行输出3个

*/

class Demo3{
	public static void main(String[] args){
		//每行输出3个（标准方法）
		
		// for/if
		// 外部定义一个变量i
		int i =0;
		for(int x=0;x<1001;x++){
		
			if(x%5==0){
				i++;
				System.out.print(x+" ");
				if(i%3==0){
					System.out.println();
				}
			}
		
		}
		
		
		
	}
	
}


class Demo4{
	public static void main(String[] args){
		// 用for循环输出1—1000之间能被5整除的数，且每行输出3个 同学的方法
	   for(int x=1;x<=1000;x++){
		   if(x%5==0){
			   System.out.print(x+"\t");
			   if(x%15==0){
				   System.out.println();
				   continue;
			   } 
			   continue;
		   }
	   }
	}
}

class Demo5{
	public static void main(String[]agrs){
		print1();  //方法的调用
	}
	
	
	public static void print1(){
		System.out.println("hello world");
			
	}
}

class Demo6{
    public static void main(String[] args){
		//table();
		String x ="hehe";
		String y ="haha";
		printHelloWorld(x,y);
	}	

     public static void table(){
		for(int j=1;j<10;j++){
			for(int i=1;i<=j;i++){
			System.out.print(i+"*"+j+"="+i*j+"\t");
			}
		}		
			
     }
	 
	 //定义一个计算两个数之和的方法
	 //定义一个个人信息介绍的方法
	 
	 public static void printHelloWorld(String msg,String msg2){
		System.out.println(msg+msg2);
	 
	 }
	
	
}



