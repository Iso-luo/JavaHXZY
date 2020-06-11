
import java.util.Random;
import java.util.Scanner;
class A{
		String getString(int i){			//电脑猜拳			
			String s="";		
			if(i==0){
				s="剪刀";
			}
			if(i==1){
				s="石头";
			}
			if(i==2){
				s="布";
			}
			return s;
		}
		
		void judgement(String x,String ss){  //(对象，人猜拳，电脑随机数)
			if(ss.equals(x)){
				System.out.println("平局");
			}
			else{
				if(ss.equals("剪刀")){
					if(x.equals("石头")){
						System.out.println("You Win！");
					}else{
						System.out.println("You lose");
					}
				}
				if(ss.equals("石头")){
					if(x.equals("布")){
						System.out.println("You Win！");
					}else{
						System.out.println("You lose");
					}
				}
				if(ss.equals("布")){
					if(x.equals("剪刀")){
						System.out.println("You Win！");
					}else{
						System.out.println("You lose");
					}
				}
			}
		}	
}

class Demo{
	public static void main(String[] args){
		System.out.println("请输入: \n 1石头，2剪刀，3布");//人猜拳
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		
		Random r=new Random();		
		int i=r.nextInt(3);		//随机生成数
		
		A a=new A();
		String ss=a.getString(i);//电脑猜的拳
		System.out.println("computer："+ss);
		a.judgement(x,ss);
	
	}
}