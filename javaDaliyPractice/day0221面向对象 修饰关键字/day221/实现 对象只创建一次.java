//要求B的对象只能创建一次

class Test{
	public static void main(String[] args){ //有static即在内存的方法区存入该方法，随着jvm的启动，main方法也启动了
		B b=new B();
		b.show();
		
		A aa=A.getInstance();		
		System.out.println(aa);
		
		A aaa=A.getInstance();
		System.out.println(aaa);

		C cc=C.getInstance();
		System.out.println(cc);
		
		C ccc=C.getInstance();
		System.out.println(ccc);
	}	
}

//简易方法：
class A{
	private static A a=new A();/*应该将创建对象这一步，写在调用getInstance()外部。相当于[被私有化的成员属性]，然后通过getInstance()方法调用该实例化的对象
								此处的变量a必须是静态的,这样在Test类中静态main()方法才能调用静态方法getInstance()返回的静态变量a*/									
	private A(){}	
	static A getInstance(){ /*1.由于A类中的构造函数被私有化,只能在本类中调用，外部无法使用A类中的构造函数创建对象，
								所以只能在A类中自己建一个[调用实例化对象]的方法
							  2.static的原因:由于Demo中的main()方法是静态的,如果getInstance()这个方法是非静态的，则在用A类A.getInstance()调用A类中该方法时，
							  该方法还是无法在main中使用,因此前面必须加static修饰符方能用A类调用该创建A类对象的方法在main()中创建出唯一的对象*/
							  
		//final A a=new A();//创建对象不能这样写在方法里哦！！ 否则,外部通过调用该方法,仍旧可以创建不同地址值的对象,就没有意义了，即使前面有final 也意味着调用出去的值是固定的不能修改而已，但每次调用新创建的地址值都是不一样的，所以该方法应该放在调用该对象的方法getInstance()外面。
		return a;
	}
	void show(){									/*非静态方法，在Demo类中的静态main()方法中无法直接使用，
														必须要在Demo类中创建A类的对象再用对象a调用A类中的非静态方法show(),
														但是由于A类中的构造函数被private私有化了，所以..
													*/
		System.out.println("我是A类的非静态方法");
	}
}


//标准方法：思路就是先固定一个堆内存的地址，再在getInstance()方法中判断C类型的一个对象c指向的堆内存的位置是否是成员属性这个对象指向的地址,如果是，就给这个地址赋一个值
class C{

	private static C c = null;	//私有化成员属性c,静态变量,类型为C,null为引用数据类型的空即指向的堆内存什么都没有,但是这样就把地址定下来了
	private C(){}
	static C getInstance(){	
		if(c == null){			//如果栈内存的c指向的堆内存里什么都没有，则给c指向的堆内存的地址(或位置)里面放一个C类型的实例化对象
			c = new C();
		}
		return c;				//这样返回的地址就是固定的
	}
}

class B{
	
	B(){}									//构造函数的默认访问修饰符是public
	
	void show(){
		System.out.println("我是B类非静态方法");
	}							//这个在B类的 没有被static修饰的方法，随着B类在堆内存new(新创建)一个对象，调用该方法，这个方法才能启动

}