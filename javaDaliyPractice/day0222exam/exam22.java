/*22.接口
创建一个名称为Vehicle的接口
在接口中添加两个带有一个参数的方法start()和stop()。
在两个名称分别为Bike和Bus的类中实现Vehicle接口。
创建一个名称为interfaceDemo(Test)的类 
在interfaceDemo的main()方法中创建Bike和Bus对象 
并访问start()和stop()方法。*/

interface Vehicle{	
	void start(String start);
	void stop(String stop);
}
class Bike implements Vehicle{
	/*private String start;
	private String stop;
	
	Bike(){}
	Bike(String start,String stop){
		this.start=start;
		this.stop=stop;
	}*/
	
	public void start(String start){
		System.out.println("我是Bike,我要"+start);
	}
	public void stop(String stop){
		System.out.println("我是Bike,我要"+stop);
	}
}
class Bus implements Vehicle{
	public void start(String start){
		System.out.println("我是Bus,我要"+start);
	}
	public void stop(String stop){
		System.out.println("我是Bus,我要"+stop);
	}
}
class Test{
	public static void main(String[] args){
		Bike b1=new Bike();
		Bus b2=new Bus();
		b1.start("飞起来了");
		b1.stop("刹车了");
		
		b2.start("发动了");
		b2.stop("停下等红灯");
		
		
		
	}
}