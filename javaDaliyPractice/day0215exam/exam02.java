/*
02.类的成员变量
请定义一个交通工具(Vehicle)的类其中有: 
属性速度(speed)体积(size)等等 方法:移动(move()) 设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等. 

最后在测试类Vehicle中的main()中实例化一个交通工具对象
并通过方法给它初始化speed,size的值并且通过打印出来。
另外调用加速减速的方法对速度进行改变。
*/

class Vehicle{
	private int speed;
	private int size;
	
	Vehicle(){}
	Vehicle(int speed,int size){
		this.speed=speed;
		this.size=size;
	}
	
	void setSpeed(int speed){//设置速度
		this.speed=speed;
	}
	void setSize(int size){//设置体积
		this.size=size;
	}
	
	int getSpeed(){
		return this.speed;
	}
	int getSize(){
		return this.size;
	}
	void move(){
		System.out.println("开始移动");
	}
	
	int speedUp(){				//是这样改变的吗？？？？？另外调用加速减速的方法对速度进行改变。
		return this.speed+3;
	}
	int speedDown(){			//是这样改变的吗？？？？？另外调用加速减速的方法对速度进行改变。
		return this.speed-1;
	}
}

class Test{
	public static void main(String[] args){
		Vehicle v=new Vehicle(4,500);
		System.out.println("原速度："+v.getSpeed()+"\n"+"原体积:"+v.getSize());
		v.setSpeed(10);
		v.setSize(888);
		System.out.println("初始化后，速度为："+v.getSpeed()+"\n"+"初始化后，体积为："+v.getSize());		
		v.move();
		System.out.println("加速后速度为"+v.speedUp());
		System.out.println("减速后速度为"+v.speedDown());
	}
}

