import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	
		//if -else
		
		//	 定义  0  代表饿
		//   定义 1  代表 不饿
		//   如果客户输入的数据 不是0  也不是1  那么我们就让程序停止。
		
		System.out.println("plz input ur number");
		Scanner sc = new Scanner(System.in);
		
		int x  = sc.nextInt();		
		if (x==1 || x==0){
			if(x==1){
				System.out.println("不饿");
			}else{
				System.out.println("饿");
			}
			
		}else{
			System.out.println("程序结束");
		}
		System.out.println("程序结束");
		
		
		
		
	
	}
}