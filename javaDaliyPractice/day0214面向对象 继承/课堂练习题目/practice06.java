/*
6.编写一个java应用程序：
(1)定义一个类，描述一个矩形，包含长、宽两种属性，和计算面积的方法
(2)编写一个类，继承自矩形类，同时该类描述长方体，具有长、宽、高属性，
	和计算体积的方法
(3)编写一个测试类，对以上两个类进行测试，
	创建一个长方体，定义其长、宽、高，输出其底面积和体积。
*/

class Rectangle{
	private double length;//父类长度
	private double width;//父类宽度
	
	double getLength(){
		return this.length;
	}
	double getWidth(){
		return this.width;
	}
	
	Rectangle(){}
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	
	double calculateArea(){				//父类 功能 计算面积
		return this.length*this.width;
	}
}

class Cuboid extends Rectangle{
	private double height;
	
	Cuboid(){
		super();
	}
	Cuboid(double length,double width,double height){
		super(length,width);
		this.height=height;
	}
	
	double calculateVolume(){						//子类 新增的一个功能
		return getLength()*getWidth()*this.height;  /*【注意！！】不能写成this.length*this.width*this.height,this.length和this.width的值虽然
														是由super()已经赋给父类构造器从而间接赋给了父类的成员属性,但是父类成员属性依旧是父类私有化的,
														还是不能直接取出来给子类用,所以如果要取出来,还是用get函数,子类通过调用get函数,
														调用父类中私有化的成员属性的值，简言之super()只有给父类私有化的成员属性赋值的作用,
														子类不能以此直接调用父类私有化的成员属性
													*/													
	}
}
class Test{
	public static void main(String[] args){
		Rectangle r=new Rectangle(3.0,4.0);
		System.out.println("长方形的面积为"+r.calculateArea());
		
		
		Cuboid c=new Cuboid(3.0,4.0,5.0);	
		System.out.println("长方体的底面积为"+c.calculateArea());
		System.out.println("长方体的体积为"+c.calculateVolume());
	}
}