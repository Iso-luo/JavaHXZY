/*32、分析如下Java代码，
如果想在控制台以多态的形式上输出“B类的test()方法”，
则在横线处应填入（D）。X 		A
*/

class A {
	public void test() {
		System.out.println("A类的test()方法");
	}
}

 class B extends A {
	public void test() {						//【覆盖方法】
		System.out.println("B类的test()方法");
	}
	public void show() {						//【新增方法】
		System.out.println("B类的show方法");
	}
	public static void main(String args[]) {
		A a=new B();	//【多态】父类的引用 指向 子类的对象。new B()依旧是创建了B类的匿名对象
		a.test();		//A类型的B的对象a调用test()方法:1.test()必须在父类A中存在同时由B类继承(可以覆盖)的方法！！！！ 
		a.show();		//show()是子类新增的方法，用多态创建的对象由于是A类型的而A类型中并没有这个方法,所以对象a无法调用这个方法
	}
}