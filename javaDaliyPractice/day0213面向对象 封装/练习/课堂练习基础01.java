//
class Triangle{
	//***三角形的特征 成员变量
	int a;
	int b;
	int c;
	
	//方法名称：构造函数constructor [用途:实例化类的对象] 没有返回值（void含义是一种返回值类型 返回空值 两者不一样 此处无void了）函数名字和类的名字要一致！！
	Triangle(){}				 //无参构造函数	 Test测试类中的“实例化的一个三角形”调用该方法，需要给Triangle类的各成员变量手动赋值（见下）
	
	Triangle(int a,int b,int c){ //有参构造函数  Test测试类中的“实例化的一个三角形”调用该方法，需要给该方法的各参数(成员变量)赋值:												
		this.a=a; 			     //【this解释为：当前对象的引用】 赋给this.a的值，传递给成员变量中的int a
		this.b=b;				 //【this解释为：当前对象的引用】 赋给this.b的值，传递给成员变量中的int b	
		this.c=c;				 //【this解释为：当前对象的引用】 赋给this.c的值，传递给成员变量中的int c
								 //这些this.的不能直接传递给 Triangle类下面的各功能，只在构造函数中生效，calculatePerimeter()等功能使用的是成员变量的值
	}
	
	//***三角形的功能 成员函数
	void calculatePerimeter(){								//计算周长 该方法没有参数
		System.out.println("周长为"+(this.a+this.b+this.c));//Test测试类中的“实例化的一个三角形”调用该功能，this.a即指使用成员变量中的int a,用this.a才能给int a赋予参数的值
	}
	double p(){												//计算中间变量	该方法没有参数
		double p=(this.a+this.b+this.c)/2;
		return p;
	}
	void calculateArea(){										//计算面积，引用中间变量
		double area=Math.sqrt(p()*(p()-this.a)*(p()-this.b)*(p()-this.c));
		System.out.println("面积为"+area);					//Test测试类中的“实例化的一个三角形”调用该功能，则this.a即指使用成员变量中的int a
	}
}

class Test{
	public static void main(String[] args){
		Triangle t0=new Triangle();	//调用Triangle类中的无参构造函数创建当前对象t0，即实例化一个Triangle
		System.out.println("初始的 三边长分别为："+t0.a+" "+t0.b+" "+t0.c+" "); //这个初始的结果为默认值
		t0.a=3;						//手动依次给Triangle类中的各 成员变量 赋值		
		t0.b=4;
		t0.c=5;   
		System.out.println("三边长分别为："+t0.a+" "+t0.b+" "+t0.c+" "); //已给初始成员变量赋值
		t0.calculatePerimeter();	//在当前对象中，调用Triangle类中的calculatePerimeter()功能，该功能不含参,执行时,使用成员变量现在所赋的值
		t0.calculateArea();			//在当前对象中，调用Triangle类中的calculateArea(),该功能不含参,执行时,使用成员变量现在所赋的值
		System.out.println("________________完成________________");	
		
		Triangle t00=new Triangle();//
		
		t00.a=5;
		t00.b=12;
		t00.c=15;   
		t00.calculatePerimeter();
		t00.calculateArea();
		System.out.println("________________完成________________");	
		
		
		Triangle t=new Triangle(3,4,5);//调用Triangle类中的有参构造函数创建当前对象t，即实例化一个Triangle，需要给该方法的各参数(本处指成员变量)赋值，
		System.out.println("三边长分别为："+t.a+" "+t.b+" "+t.c+" ");
		t.calculatePerimeter();//在当前对象中，调用Triangle类中的calculatePerimeter()功能,该功能不含参,执行时,间接使用成员变量的值（即指构造函数中的参数先赋值给成员变量，成员变量的值再传给成员函数）
		t.calculateArea();	   //在当前对象中，调用Triangle类中的calculateArea(),该功能不含参,执行时,间接使用成员变量的值（即指构造函数中的参数的值先赋给成员变量，成员变量的值再传给成员函数）
		System.out.println("________________完成________________");		
		
		
		Triangle t1=new Triangle(5,12,13);//调用Triangle类中的有参构造函数创建当前对象t1，即实例化一个Triangle类，需要给该方法的各参数赋值，
		System.out.println("三边长分别为："+t1.a+" "+t1.b+" "+t1.c+" ");
		t1.calculatePerimeter();
		t1.calculateArea();
		System.out.println("________________完成________________");	
		
		
		
		/*
		Triangle t1=new Triangle(3,4,5);		
		System.out.println(t1.a);
		
		Triangle t2=new Triangle(4,4,5);		
		System.out.println(t2.a);
		
		Triangle t3=new Triangle(5,4,5);		
		System.out.println(t3.a);
		*/
		
		
	}
	
}