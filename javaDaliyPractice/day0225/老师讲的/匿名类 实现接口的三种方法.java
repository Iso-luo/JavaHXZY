//匿名对象和匿名类 
interface A{
	pubic static final int X=3;//注意接口中的成员属性默认public static final 变量名X要大写
	void show();//抽象方法
}
class B implements A{
	public void show(){
		System.out.println("我是B类的show方法");
	}
}
class Test{ 
	//实现一个接口的三种方法：
	public static void main(String[] args){
		
		//匿名类 大括号  实现了 接口A 
		
		//匿名类 大括号  继承了 抽象类A  
		
		
		//方法一
		new A(){			//[方法]创建匿名类 "new A(){};" 在匿名类中覆盖接口A的抽象方法(其中new A()为匿名对象因为他没有名字)
			public void show(){
				System.out.println("我是匿名类的show方法");
			}
		}.show();			//用这个覆盖了接口中show()方法的匿名类直接调用重新后的新的show()方法。
							//好处：节约内存资源,这个匿名类过一段时间没有变量引用它，就会被garbage collection
		
		//方法二
		A aa=new A(){		//[方法]把匿名类 "new A(){};" 放入命名为A类型的aa中,匿名类中覆盖接口A中的抽象方法,
			public void show(){
				System.out.println("我是匿名类的show222222方法");
			}	
		};
		aa.show();			//用匿名类(名称为aa)调用该方法show()
		
		//方法三
		B b = new B();		//方法 新建一个B类，在B类中覆盖接口A中的抽象方法show(),再用B类新创建一个对象b调用新的show()方法
		b.show();
	}
}