//匿名类
class A{
	void run(){
		System.out.println("a");
	}
}
class Demo{

	public static void main(String[] args){
		
		A a = new A(){
		
			void run(){
				System.out.println("DEMO");
			}
		
		};
		
		a.run();
	}
}
