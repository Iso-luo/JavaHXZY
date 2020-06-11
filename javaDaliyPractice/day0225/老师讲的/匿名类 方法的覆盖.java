//匿名类中对show2()方法覆盖！
class A{
	void show2(){
		System.out.println("heh");
	}
}

class Demo{

	public static void main(String[] args){
		//匿名类 覆盖类中的方法
		//方法一：
		new A(){
		
			void show2(){
				System.out.println("haha");
			}
		
		}.show2();
		
		/*
		//方法二：
		A a = new A(){
		
			void show2(){
				System.out.println("heheeeeeeeee");
			}
		};
		
		a.show2();*/
	
	}
}