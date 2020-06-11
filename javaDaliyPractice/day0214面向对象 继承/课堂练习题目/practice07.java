/*

7.编写一个java应用程序：
设计一个汽车类Vehicle,包含的属性有车轮个数wheels和车重weight。
小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能。

*/

class Vehicle{
	private int wheels;		 //该属性为本类私有的成员属性
	private double weight;	 //该属性为本类私有的成员属性
		
	Vehicle(){}
	Vehicle(int wheels,double weight){
		this.wheels=wheels;
		this.weight=weight;
	}
	
	int getWheels(){		 //如果外部调用本类成员属性 必须使用get函数
		return this.wheels;
	}
	double getWeight(){		 //如果外部调用本类成员属性 必须使用get函数
		return this.weight;
	}
	void show(){
		System.out.println("我是Vehicle类");
	}
	void print(){
		System.out.println("车轮数："+this.wheels);		//试试下面调用能否直接用this.wheels
		System.out.println("车重："+this.weight);
	}
}

class Car extends Vehicle{
	private int loader;						//子类【新增成员属性】该属性为本类私有的成员属性
	
	int getLoader(){						//子类Car的get成员属性功能
		return this.loader;
	}
	
	Car(){
		super();
	}
	Car(int wheels,double weight,int loader){
		super(wheels,weight);				/*用super()调用父类Vehicle的[有参构造器]【用途：传参】，可以将[子类有参构造函数]中的参数值，通过[父类有参构造函数]，
											间接传递给[父类的成员属性],从而顺利给[父类相关功能]赋值,进而调用[父类相关功能]进行计算等*/
		this.loader=loader;
	}
	/*void carStatement(){										//子类 新增功能 声明新的车轮个数 和新的车重
		System.out.println("其中新的车轮个数："+this.wheels);		//【这样写是错的！】子类没有提取父类私有成员属性this.wheels的权利，需要借助get函数调用
		System.out.println("其中新的车重："+this.weight);			//【这样写是错的！】子类没有提取父类私有成员属性this.weight的权利，需要借助get函数调用
	}*/ 
	void show(){												//【方法的重写】
		System.out.println("我是Car类");
	}	
	void carStatement(){											//子类 新增功能 声明新的车轮个数 和新的车重
		System.out.println("其中新的车轮个数："+getWheels());		//【注意】子类新功能中，如果要特别输出成员属性，必须用get函数从其父类提取出来，才能使用
		System.out.println("其中新的车重："+getWeight());			//【注意】子类新功能中，如果要特别输出成员属性，必须用get函数从其父类提取出来，才能使用
	}
	
	void printCar(){											 //子类 新增功能
		System.out.println("载人数："+this.loader);
	}
}
	
class Truck extends Car{
	double payload;
	
	Truck(){
		super();
	}
	Truck(int wheels,double weight,int loader,double payload){ 							//这个参数可以只有payload吗?答：可以
		super(wheels,weight,loader);		/*用super()调用父类Car的[有参构造器]【用途：传参】，可以将[子类有参构造函数]中的参数值，通过[父类有参构造函数]，
											间接传递给[父类的成员属性],从而顺利给[父类相关功能]赋值,进而调用[父类相关功能]进行计算等*/
		this.payload=payload;
	}
	
	void show(){												//【方法的重写】
		System.out.println("我是Truck类");
	}	
	void printTruck(){											 //子类Truck 新增功能
		System.out.println("载重："+this.payload);
	}
	
	void truckStatement(){
		System.out.println("其中新的车轮数："+getWheels());//【注意】子类新功能中，如果要特别输出该成员属性，必须用get函数从父类Vehicle(wheels是Vehicle的私有成员属性，一定要追溯到最开始)提取出来，才能使用
		System.out.println("其中新的车重："+getWeight());  //【注意】子类新功能中，如果要特别输出该成员属性，必须用get函数从父类Vehicle(wight是Vehicle的私有成员属性，一定要追溯到最开始)提取出来，才能使用
		System.out.println("其中新的载人数："+getLoader());//【注意】子类新功能中，如果要特别输出该成员属性，必须用get函数从父类Car(loader是Car的私有成员属性，一定要追溯到最开始)提取出来，才能使用
	}
}	

class Test{
	public static void main(String[] args){
	Vehicle v=new Vehicle(4,50.0);
	v.show();
	v.print();	
	System.out.println("----------------------------------");
	
	Car c=new Car(8,150.0,10);
	c.show();
	c.print();	   //【注意】子类对象c调用继承下来的父类的功能print(),子类Car有访问该功能、赋新值、实现功能的权利，但并没有提取父类私有成员属性的权利
	c.printCar();
	c.carStatement();//【注意】子类对象c调用子类新增功能printAgain(),子类Car有访问赋值的权利，但没有提取父类私有成员属性的权利	
	System.out.println("----------------------------------");	
	
	Truck t=new Truck(100,55555.55,600,66666.66);
	t.show();
	t.print();
	t.printCar();	//Car类新增功能调用
	t.printTruck();
	t.truckStatement();
	}
	
}