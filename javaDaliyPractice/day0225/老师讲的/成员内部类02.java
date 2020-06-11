//成员内部类
class A{
	class B{
		void show(){
			System.out.println("我是成员内部类show");
		}
	}
}
class Test{
	public static void main(String[] args){
		A a=new A();
		A.B b=a.new B();
		b.show();
	}
}