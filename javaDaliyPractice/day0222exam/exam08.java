/*08.构造方法的重载
定义一个名为 Vehicles的基类,该类中应包含String类型成员属性brand商标和color颜色
包含成员方法run在控制台显示"我已经开动了"和showInfo在控制台显示商标和颜色.并编写构造方法初始化其成员属性.
编写Car类继承于Vehicles类,增加int型成员属性seats座位,增加成员方法showCar在控制台显示小汽车的信息.并编写构造方法。 
编写Truck卡车类继承于Vehicles类,增加float型成员属性load载重,增加成员方法showTruck在控制台显示卡车的信息,并编写构造方法。
在main方法中测试以上各类。*/

class Vehicles{
	private String brand;
	private String color;
	
	Vehicles(){}
	Vehicles(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
	
	String getBrand(){
		return this.brand;
	}
	void setBrand(String brand){
		this.brand=brand;
	}	
	String getColor(){
		return this.color;
	}
	void setColor(String color){
		this.color=color;
	}
	
	void run(){
		System.out.println("我已经开动了");
	}
	void showInfo(Vehicles v){
		System.out.println("商标为:"+v.getBrand());
		System.out.println("颜色为:"+v.getColor());
	}	
}

class Car extends Vehicles{
	int seats;
	
	Car(){
		super();
	}
	Car(int seats,String brand,String color){
		super(brand,color);
		this.seats=seats;
	}
	
	int getSeats(){
		return this.seats;
	}
	void setSeats(){
		this.seats=seats;
	}
	
	void showCar(Car c){
		System.out.println("座位:"+c.getSeats());
	}	
}
class Truck extends Vehicles{
	float load;
	
	Truck(){
		super();
	}
	Truck(float load,String brand,String color){
		super(brand,color);
		this.load=load;
	}
	
	float getLoad(){
		return this.load;
	}
	void setLoad(){
		this.load=load;
	}

	void showTruck(Truck t){
		System.out.println("载重:"+t.getLoad());
	}
	
}
class Test{
	public static void main(String[] args){
		Car c=new Car(4,"大众","银色");//不能用 多态啊！！！！！！！！多态是父类有重载的方法，子类根据根据需要调用自己的???????
		Truck t=new Truck(500.0f,"奔驰","深蓝");
		c.run();
		c.showInfo(c);
		c.showCar(c);
		
		t.run();
		t.showInfo(t);
		t.showTruck(t);
		
	}
}












