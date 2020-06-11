import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	
		Scanner sc  = new Scanner(System.in);
		System.out.println("请输入你的性别：：");
		
		// 0  女性    1 男性
		
		int sex = sc.nextInt();
	
		//int age = sc.nextInt();
		
		if( sex ==0 || sex==1){
		
		
			if (sex ==0){
				System.out.println("女士请输入的年龄；；");
				int age = sc.nextInt();
				if( age >0 && age <100){
					if(  age <30){
						System.out.println("姑娘");
					}else{
						System.out.println("老阿姨");
					}	
					
				}else{
					System.out.println("不是人");
				}

			}else{
				System.out.println("男性");
			}
		
		
		}else{
			System.out.println("对不起你输入的数据非法");
		}
		
	}
	
}