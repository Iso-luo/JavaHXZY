//局部内部类
class A{
	void show(){
		
		class B{  //这个class相当于局部变量，出了这个show()方法即失效
			void show1(){
				System.out.println("我是局部内部类的方法");
			}
		}
		B b=new B();
		b.show1();
	}
}
class Test{
	public static void main(String[] args){
		A a=new A();
		a.show();
	}
}
