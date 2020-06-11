class GetSum{
	public static void main(String[] args){
	
		
		//zhishu();
		System.out.println(sum(8));
	}
	// zy
	public static void num1(int number){
		for(int x =1;x<number;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}System.out.println();

		}
	}
	
	public static void num1(){
		for(int x =1;x<10;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	// lpx
	public static void biao(){
		// 84 行 public 可以不用写！！！
		for(int x=1;x<10;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}

	//bz
	public static void zhishu(){
		
		for(int b=200;b>0;b++){
			
			
			if(b%2==0){
				continue;
			
			}else if(b%3==0){
			
				continue;
			}else if(b%5==0){
				continue;	
			}else if(b%7==0){
				continue;
			}else if(b%13==0){
				continue;

			}else if(b%11==0){
				continue;		
			}else{
				if(b>200){
					System.out.println(b);
					break;
					
				}
			}
			
		}
	
	
	
	}
	
	//gn
	 public static void table(){
		for(int j=1;j<10;j++){
			for(int i=1;i<=j;i++){
			System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			 System.out.println();
		}		
			
     }
	 
	 public static int sum(int num){
		if(num==1||num==2){
			return 1;
		}else{	
			return sum(num-2)+sum(num-1);
		}
	
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
}