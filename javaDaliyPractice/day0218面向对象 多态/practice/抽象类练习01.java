//抽象类题目见图片
abstract class Vehicle{
	
	abstract void calculateRate();
	abstract void calculateDistance();
}
class Truck extends Vehicle{
	void calculateRate(){
		System.out.println("计算卡车的燃料效率");
	}
	 void calculateDistance(){
		System.out.println("计算卡车的行驶距离");
	 }
}

class RiverBarge extends Vehicle{
	void calculateRate(){
		System.out.println("计算驳船的燃料效率");
	}
	void calculateDistance(){
		System.out.println("计算驳船的行驶距离");
	}
}

class Test{
	public static void main(String[] args){
		 Vehicle t=new Truck();
		 t.calculateRate();
		 t.calculateDistance();
		 
		 Vehicle rb=new RiverBarge();
		 rb.calculateRate();
		 rb.calculateDistance();
	}
}