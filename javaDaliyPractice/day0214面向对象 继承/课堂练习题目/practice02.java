/*
2.创建如图三个类:
(People类中的三个方法分别输出一些信息,
ChinaPeople和AmericanPeople类重写父类的三个方法)
*/
class People{
	protected double height;//权限:本类的子类可调用
	protected double weight;//权限:本类的子类可调用
	People(){}							//父类的无参构造函数
	People(double height,double weight){//父类的有参构造函数
		this.height=height;
		this.weight=weight;
	}	
	public void speakHello(){				//父类的功能1
		System.out.println("Hello World");
	}	
	public void averageHeight(){			//父类的功能2
		System.out.println("平均身高为："+this.height);
	}	
	public void averageWeight(){			//父类的功能3
		System.out.println("平均重量为："+this.weight);
	}
}

class ChinaPeople extends People{			//子类ChinaPeople
	ChinaPeople(){							//子类的无参构造函数
		super();
	}							
	ChinaPeople(double height,double weight){//子类的有参构造函数
		super(height,weight);
	}
	public void speakHello(){			//覆盖父类功能1
		System.out.println("你好");
	}	
	public void averageHeight(){		//覆盖父类功能2
		System.out.println("平均身高为："+this.height);
	}
	public void averageWeight(){		//覆盖父类功能3
		System.out.println("平均重量为："+this.weight);
	}
	public void chinaGongfu(){
		System.out.println("坐如钟，站如松");
	}
	
	
}

class AmericanPeople extends People{	
	//因为没有用到父类的成员属性,所以此处可以省略子类的构造函数javac会自动构造无参函数AmericanPeople()和里面的调用父类无参super()
	
	AmericanPeople(){							//子类的无参构造函数
		super();
	}							
	AmericanPeople(double height,double weight){//子类的有参构造函数
		super(height,weight);
	}
	public void speakHello(){			//覆盖父类功能1
		System.out.println("Hi");
	}	
	public void averageHeight(){		//覆盖父类功能2
		System.out.println("平均身高为："+this.height);
	}
	public void averageWeight(){		//覆盖父类功能3
		System.out.println("平均重量为："+this.weight);
	}	
	public void amerianBoxing(){
		System.out.println("直拳，勾拳");
	}
}

class Demo{
	public static void main(String[] args){
		People p=new People(1.7,50);
		p.speakHello();
		p.averageHeight();
		p.averageWeight();
		System.out.println("--------");
		
		ChinaPeople c=new ChinaPeople(1.75,55);
		c.speakHello();
		c.averageHeight();
		c.averageWeight();
		c.chinaGongfu();
		System.out.println("--------");
		
		
		AmericanPeople a=new AmericanPeople(1.81,70);
		a.speakHello();
		a.averageHeight();
		a.averageWeight();
		a.amerianBoxing();
		System.out.println("--------");	
	}
}