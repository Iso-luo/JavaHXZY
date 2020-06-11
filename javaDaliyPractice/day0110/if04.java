import java.util.Scanner;
class Demo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数,0或1");
		int sex = sc.nextInt();
		if(sex == 0){
			System.out.println("女士，请输入年龄");
			int age = sc.nextInt();
			if (0<age && age<100){
				System.out.println('a');
				if(age>=30 && age<=40){
					System.out.println("少妇");
				
				}else if(age<30 && age>=18){
					System.out.println("姑娘");
				}
				else if(age>0 && age<18){
					System.out.println("女娃");
				
				}else{
					System.out.println("老阿姨了");	
				}	
            }
		}
		else{
			System.out.println("你不是女性，请走开！！！");
		}
	}
}
