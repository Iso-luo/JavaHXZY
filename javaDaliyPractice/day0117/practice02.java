//2.编写一个方法，输出大于200的最小的质数。

class Practice{
     
	public static void main(String[] args){	 
		int x=200;	
		for(int i=1;i<x;i++){			//每次从头开始循环 可循环x-1次
			for(int j=2;j<x;j++){		//假设每一个数从2依次取模，到它本身之前的一个数
					if(x%j==0){			//一旦碰到可以整除的数 则停止当前循环
						x=x+1;	
						break;
					}else if(x%i!=0){   //
						continue;
					}
			}
		}			
		System.out.println("大于200的最小的质数是"+x);
		
	}	
}