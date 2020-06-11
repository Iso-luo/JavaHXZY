//代码块及静态代码块 运行顺序见下

class A{
	int x;
	//在A类的无参构造器中加一个操作“打印1”
	A(){						
		System.out.println(1);
	}
	
	A(int x){
		this.x=x;
	}
	
	//A类的方法show()
	void show(){				
		System.out.println(3);
	}
	
	//static静态代码块先于类A执行,即先打印2，与其放置顺序无关
	static {						
		System.out.println(2);
	}	
}

class B extends A{				
	B(){				//B类的无参构造器	
		super();/*B类的无参构造函数主体中需要先调用其父类A类的无参构造器super(),
					所以在执行的时候父类的静态代码块先执行,且仅执行一次。
					如果父类的那个代码块不是静态的,则每次调用到父类无参构造器的时候,都会执行一次。
					*/
	}
	B(int x){			//B类的有参构造器,同时需要调用A类的有参构造器
		super(x);
	}
	
	void show(){
		System.out.println(33);
	}
}

class Demo{
	public static void main(String[] args){
		
		A a = new A();	/*调用A类的无参构造器,创建对象a,[第一步]此时优先执行A类的代码块,即“打印2”
						接着，由于A类的无参构造器中有一个输出操作，所以[第二步]再执行“打印1”*/
		a.show();		//[第三步]调用A类的show()“打印3”
		System.out.println("----------");
		/*A aa = new A();
		aa.show();*/

		B b =new B();/*调用B类的无参构造器,创建对象b,如果此时A类的代码块不是static的，需要[第一步]再先执行一次该代码块“打印2”
						接着，由于B类的无参构造器调用父类的无参构造器,其中有一个输出操作，所以[第二步]再执行“打印1”*/
		B bb=new B(2);//调用B类的有参构造器,创建对象bb,如果此时A类的代码块不是static的，需要[第三步]再先执行一次该代码块“打印2”
		
		b.show();	//[第四步]执行该对象的调用“打印33”
		bb.show();	//[第五步]执行该对象的调用“打印33”
	}
}