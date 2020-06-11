//计算循环100000000次的运行时间
class A{
	public static void main(String[] args){
		long startTime=System.currentTimeMillis();
		System.out.println(startTime);
		int i=1;
		int sum=0;
		while(i<100000000){
			sum=sum+i;
			i+=1;
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println(endTime-startTime);
	}
}