//打印 1，1，2，3，5，8，13，21，34

class getSum{
	public static void main(String[] agrs){	
		print();
	 
	}
	public static void print(){
		for(int i=1;i<11;i++){
			System.out.print(getSum(i)+" ");
		}	
	}
	public static int getSum(int x){
		if(x==1 || x==2){
		
			return 1;		
		}
		return getSum(x-2)+getSum(x-1);  //调用getSum函数时 命令返回前两个数的和
	
	} 

}