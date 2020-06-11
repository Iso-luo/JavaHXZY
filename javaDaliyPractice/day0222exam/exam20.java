/*20.抽象类
创建一个Vehicle类并将它声明为抽象类。
在Vehicle类中声明一个NoOfWheels方法使它返回一个字符串值。
创建两个类Car和Motorbike从Vehicle类继承,并在这两个类中实现NoOfWheels方法
在Car类中 应当显示“四轮车”信息;而在Motorbike类中 应当显示“双轮车”信息。
创建另一个带main方法的类 在该类中创建Car和Motorbike的实例 并在控制台中显示消息。
*/

abstract class Vehicle{	
	private String tyre;
	
	Vehicle(){}
	Vehicle(String tyre){
		this.tyre=tyre;
	}
	
	String getTyre(){
		return this.tyre;
	}
	void setTyre(String tyre){
		this.tyre=tyre;
	}
	
	abstract String NoOfWheels();
	
}

class Car extends Vehicle{
	
	Car(){
		super();
	}
	Car(String tyre){
		super(tyre);
	}
	
	String NoOfWheels(){
		return super.getTyre();
	}
}

class Motorbike extends Vehicle{
	
	Motorbike(){
		super();
	}
	Motorbike(String tyre){
		super(tyre);
	}
		
	String NoOfWheels(){
		return super.getTyre();//？？？？这个怎么解释来着？？
	}
	
}

class Test{
	public static void main(String[] args){
		Car c=new Car("四轮车");
		System.out.println(c.NoOfWheels());
		
		Motorbike m=new Motorbike("双轮车");
		System.out.println(m.NoOfWheels());
		
	}
}

