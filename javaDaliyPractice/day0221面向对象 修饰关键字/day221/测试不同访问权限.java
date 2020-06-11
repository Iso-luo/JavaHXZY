//测试不用权限下的方法能否使用
abstract class A{			//抽象类
	int x=3;				//在抽象类中定义一个成员属性x并赋值
	
	abstract void show();	//private default
	void show1(){
		
	}
}
class B extends A{			//一个类B继承抽象类A
	
	void show(){ 			//default	
		System.out.println("B");
	}
}
class Demo{
	public static void main(String[] args){
	
		A a = new B();		//多态
		a.show();
		a.show1();
		a.x=33;
		System.out.println(a.x);
	}
}