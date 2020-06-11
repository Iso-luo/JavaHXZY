/*18.覆盖、继承
建立一个汽车Auto类包括轮胎个数,汽车颜色,车身重量,速度等成员变量。
并通过不同的构造方法创建实例。
至少要求 汽车能够加速 减速 停车。 
再定义一个小汽车类Car 继承Auto 并添加空调、CD等成员变量 覆盖 加速减速的方法

【问题】如果覆盖掉Auto的加速减速方法，Car就无法加速减速了？？？？
*/

class Auto{
	int tyre;
	String color;
	double weight;
	double speed;
	
	Auto(){}
	Auto(int tyre,String color,double weight,double speed){
		this.tyre=tyre;
		this.color=color;
		this.weight=weight;
		this.speed=speed;
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
	
	double add(Auto a,double speed){	//加速方法(车辆类的一个对象,速度)											
		double x=a.getSpeed()+speed;		//创建一个double类型的对象x并赋值加速后的速度
		a.setSpeed(x);						//更新速度值
		return x;							
	}
	
	double cut(Auto a,double speed){	//减速方法(车辆类的一个对象,速度)	
		double x=0.0;						//创建一个double类型的对象x,并初始化它
		if(a.getSpeed()>speed){				//减速时，先判断，避免负值出现
			x=a.getSpeed()-speed;	
		}
		if(a.getSpeed()<=speed){
			x=0.0;			
			System.out.print("已停车！！");
		}
		a.setSpeed(x);	
		return x;
	}		
}
class Car extends Auto{
	double temperature;	//空调升温降温
	int song;			//第几首
	
	Car(){
		super();
	}
	Car(double temperature,int song,int tyre,String color,double weight,double speed){
		super(tyre,color,weight,speed);
		this.temperature=temperature;
		this.song=song;		
	}
	
	double getTemperature(){
		return this.temperature;
	}
	void setTemperature(double temperature){
		this.temperature=temperature;
	}
	int getSong(){
		return this.song;
	}
	void setSong(int song){
		this.song=song;
	}
	
	double add(Car c,double temperature){			//方法的重载 (与返回值类型无关,方法名相同，参数列表不同)(车辆类的一个对象,温度)											
		double x=c.getTemperature()+temperature;	//创建一个double类型的对象x并赋值升温后的温度
		c.setTemperature(x);						//更新温度值
		return x;							
	}
	
	double cut(Car c,double temperature){			//方法的重载(与返回值类型无关,方法名相同,参数列表不同)(车辆类的一个对象,温度)	
		double x=0.0;								//创建一个double类型的对象x,并初始化它
		if(c.getTemperature()-temperature<20){			//减速时，先判断，避免负值出现
			x=c.getTemperature()-temperature;
			System.out.print("温度将低于人体舒适温度20℃!!");
		}else{
			x=c.getTemperature()-temperature;
		}
		c.setTemperature(x);						//更新温度值
		return x;
	}	
	

	
}

class Test{
	public static void main(String[] args){
		
		Auto a=new Auto(6,"天蓝",100.00,80);	 //(int tyre,String color,double weight,double speed)
		Car c=new Car(19,1,4,"黑色",55.5,100.00);//(double temperature,int song,int tyre,String color,double weight,double speed)
		
		Car t=null;//Car类型对象t
		if(t instanceof Auto){
			t=(Car)c;
		}
		
		
		System.out.println("原速度为"+a.getSpeed()+"  "+"加速10后,速度为"+c.add(a,10));//加速
		System.out.println("原速度为"+a.getSpeed()+"  "+"减速70后,速度为"+c.cut(a,70));//减速
		System.out.println("原速度为"+a.getSpeed()+"  "+"减速20后,速度为"+c.cut(a,20));//停车
		
		System.out.println("空调原温度为"+c.getTemperature()+"  "+"升温10后,温度为"+c.add(c,10));//升温
		System.out.println("空调原温度为"+c.getTemperature()+"  "+"升温10后,温度为"+c.cut(c,10));//降温

		
	}
	
}















