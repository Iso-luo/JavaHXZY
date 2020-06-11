//用while循环计算1-200之间所有3的倍数之和
class GetSum{
	public static void main(String[] args){
	
	int a=getSum();
	System.out.println(a);	
					
	}
	public static int getSum(){
		int i =0; 		//引入计数器
		int x =0;			
		while(true){				//	用while循环语句
			i++;
				if (i%3==0){			// 条件语句
					x += i;  			//x=x+i;				
				}			
				if(x>200){				//结束
					break;
				}
			
		}
		return x;	
	}
}
