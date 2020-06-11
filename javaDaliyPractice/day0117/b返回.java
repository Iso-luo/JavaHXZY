//返回的演示  有错误！！


class GetSum{
	public static void main(String[] args){		
		sum();		
	}
	
	
	
	public static int  show1(int x){//第一个方法
	
		System.out.println(show2());//执行打印方法二
		System.out.println("-------------");//执行打印方法二
	
		return 111111;//返回值为111111
	}
	
	public static int show2(){//第二个方法
	
		return 2222;//返回值为2222
	
	}
	
	
	public static int sum (int num){
		if(num==100){
			break;
		}
		return num+sum(num+1);
	}
	
	
}