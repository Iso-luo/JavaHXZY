class Animal{
	//成员属性
	private int age;
	private double weight;
	private int leg;
	
	Animal(){}								//父类
	Animal(int age,double weight,int leg){	//父类的 有参构造函数	
		this.age=age;						
		this.weight=weight;
		this.leg=leg;
	}
	
	int getAge(){							//父类 调用成员属性的方法
		return this.age;
	}
	void setAge(int age){					//父类 给成员属性赋新值的方法
		this.age=age;
	}
	
	double getWeight(){						//父类 调用成员属性的方法
		return this.weight;
	}
	void setWeight(double weight){			//父类 给成员属性赋新值的方法
		this.weight=weight;
	}

	int getLeg(){							//父类 调用成员属性的方法
		return this.leg;
	}
	void setLeg(int leg){					//父类 给成员属性赋新值的方法
		this.leg=leg;
	}
	
	void eat(){								//父类 功能1
		System.out.println("eat");
	}
	void sleep(){							//父类 功能2
		System.out.println("sleep");
	}
	void shut(){							//父类 功能3
		System.out.println("shut");
	}
}
class Dog extends Animal{	//子类 
	
	private String color ;	//子类 新增的成员属性 
	
	String getColor(){		//子类 调用新增的成员属性的方法
		return this.color;
	}
	
	Dog(){					//子类的无参构造函数 书写格式
		super();			//【super()】即调用父类的无参构造函数，javac会帮你自动添加super()
	}						//（另：如果没有有参构造函数，就可以不用写无参，javac会自动添加）
	
	Dog(int age,double weight,int leg,String color){ //子类的有参构造函数 书写格式 参数列表中 旧有参数 和 新增参数 均列出来		
		super(age,weight,leg);						/*用super()调用父类的[有参构造器]【用途：传参】，可以将[子类有参构造函数]中的参数值，通过[父类有参构造函数]，
													间接传递给[父类的成员属性],从而顺利给[父类相关功能]赋值,进而调用[父类相关功能]进行计算等*/
		this.color=color;							//【参数的新增】新增参数正常赋值，方式与父类相同
	}
	
	void lookDoor(){							//【方法的新增】子类新增功能
		System.out.println("我能看家");
	}
	
	void shut(){						//【方法的覆盖】方法的声明和父类一致，方法的实现根据子类的需要重新添加 default为默认权限可省略不写
		System.out.println("bark  bark !!");
	}
}

class Demo{
	public static void main(String[] args){ 	//如果需要运行 要写main函数
		Animal a = new Animal(10,56.5,4);  		//父类 调用父类的有参构造函数创建对象a

		a.shut();								//对象a调用父类的方法shut()
		System.out.println("这个动物年龄是"+a.getAge());//执行
		
		a.setAge(444444);						//对象a调用父类的方法setAge()，此方法可以访问成员属性，给成员属性赋新值
		System.out.println("更新 这个动物的年龄是"+a.getAge());
		System.out.println("--------");
	
	
		/*
		Dog d = new Dog();	
		d.shut();		
		d.setAge(100);		
		System.out.println(d.age);//此处报错，因为age的访问权限为private，只有本类中可以访问，其他任何类中，需要借助getAge()的方法才能调用出来
		*/
		
		Dog d = new Dog();			//子类 调用子类的无参构造函数创建一个对象d
		d.setAge(100000);		  	//该对象引用子类的功能setAge()（子类的这个功能已经从父类那里继承过来了，直接调用该方法就好了）
		System.out.println(d.getAge());
		
		d.shut();				   	//该对象d引用 子类的功能shut()（子类的这个功能已经从父类那里继承过来了，直接调用该方法就好了，但是后来这个方法的实现被子类重写了，所以同样的功能，功能的实现不同）
		d.lookDoor();				//该对象d引用 子类的功能lookDoor()(这个方法是子类新增的方法)
		
		System.out.println("--------");
		Dog dog = new Dog(1,33,4,"red");//子类 调用子类的有参构造函数创建一个对象dog，参数列表中有：父类旧有参数和子类新增参数
		System.out.println(dog.getColor());
		dog.shut();						//该对象dog引用 子类的方法，该方法覆盖了父类中的同名方法！！！
	}

}












