class Car{
	// 汽车的特征  成员变量
	int year;
	int wheel;
	String color;
	
	//构造函数  没有返回值 函数名字与类名一直
	Car(){}   //无参数构造函数
	
	Car(int year,int wheel,String color){
		this.year=year;
		this.wheel=wheel;
		this.color=color;
	}
	
	
	
	//汽车的功能   成员函数
	void driver(){
		System.out.println("我能开");
	}
}
class Test{
	public static void main(String[] args){
		//实例化汽车
		
		
		Car c = new Car();
		c.driver();
		c.color="红色";
		System.out.println("----------");
		
		
		Car c1 = new Car(2019,4,"黑色");
		c1.driver();
		int y = c1.year;
		System.out.println(y);
		
		
		System.out.println("----------");
		Car c2 = new Car(2020,4,"黑色");
		System.out.println(c2.year);
		
		//this 代表 当前对象的引用
	}
}