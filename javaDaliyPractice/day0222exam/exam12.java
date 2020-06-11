/*12.构造方法与重载
建立一个汽车类包括轮胎个数,汽车颜色,车身重量等属性。
并通过不同的构造方法创建事例。
至少要求 汽车能够加速,减速,停车。
要求:命名规范!代码体现层次!有友好的操作提示!*/

class Vehicle{
	private int tyre;
	private String color;
	private double weight;
	private double speed;
	
	Vehicle(){}
	Vehicle(double speed){
		this.speed=speed;
	}
	Vehicle(int tyre,String color,double weight){
		this.tyre=tyre;
		this.color=color;
		this.weight=weight;
	}
	
	int getTyre(){
		return this.tyre;
	}
	void setTyre(int tyre){
		this.tyre=tyre;
	}
	String getColor(){
		return this.color;
	}
	void setColor(String color){
		this.color=color;
	}
	double getWeight(){
		return this.weight;
	}
	void setWeight(double weight){
		this.weight=weight;
	}
	
	double getSpeed(){
		return this.speed;
	}
	void setSpeed(double speed){
		this.speed=speed;
	}
	
	double speedUp(Vehicle v,double speed){	//加速方法(车辆类的一个对象,速度)											
		double x=v.getSpeed()+speed;		//创建一个double类型的对象x并赋值加速后的速度
		v.setSpeed(x);						//更新速度值
		return x;							
	}
	
	double slowDown(Vehicle v,double speed){//减速方法(车辆类的一个对象,速度)	
		double x=0.0;						//创建一个double类型的对象x,并初始化它
		if(v.getSpeed()>speed){				//减速时，先判断，避免负值出现
			x=v.getSpeed()-speed;
		}
		if(v.getSpeed()<=speed){
			x=0.0;
			System.out.println("已停车！！");
		}
		v.setSpeed(x);						//更新速度值
		return x;
	}
	
}
class Test{
	public static void main(String[] args){
		Vehicle v1=new Vehicle(4,"红色",500.00);
		Vehicle v2=new Vehicle(20.5);
		System.out.println("汽车基本信息:"+"\n"+"轮胎数量:"+v1.getTyre()+"\n"+"颜色:"+v1.getColor()+"\n"+"重量:"+v1.getWeight());
		
		System.out.println("加速后的速度为"+v2.speedUp(v2,10));	//参数第二位为加速值
		System.out.println("减速后的速度为"+v2.slowDown(v2,30));//参数第二位为减速值	
	}
}