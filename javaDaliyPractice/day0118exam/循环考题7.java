//循环考题试卷 7、编写程序，计算1-100的和。
class Exam{
	public static void main(String[] args){
		
	int i=1;	
	int x=getSum(i);
	System.out.println(x);
	
	}
	public static int getSum(int i){
		//int i=1;
		if(i==100){
			return 100;
		}
		return i+getSum(i+1);		
	}
}
	