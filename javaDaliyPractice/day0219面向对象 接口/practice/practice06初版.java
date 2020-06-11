/*
06.试将平面上的圆抽象为类，公有类名为Circle，
请采用合适的视角和逻辑进行抽象和封装，
成员变量和成员方法
需要在对象中提供两个方法，
一个方法：传入一个点对象，判断该圆和点对象的位置关系(即圆外、圆上、圆内);
另一个方法：传入一个圆对象，判断两圆之间的关系(分离,相切,相交)
*/

interface PointCircle{								//算点和圆距离的接口，注意参数
	abstract void distance(Point p,Circle01 c);	
}
interface CircleCircle{								//算圆和圆距离的接口，注意参数
	abstract void distance(Circle01 c1,Circle02 c2);	
}
abstract class Circle{}								//抽象类

class Circle01 extends Circle implements PointCircle{	
	private double x;//横坐标
	private double y;//纵坐标
	private double r;//圆半径
	
	double getAbscissa(){//横坐标
		return this.x;
	}
	void setAbscissa(double x){
		this.x=x;
	}
	double getOrdinates(){//纵坐标
		return this.y;
	}
	void setOrdinates(double y){
		this.y=y;
	}
	double getR(){
		return this.r;
	}
	void setR(double r){
		this.r=r;
	}
	
	Circle01(){
		super();
	}
	Circle01(double x,double y,double r){
		super();		
		this.x=x;
		this.y=y;
		this.r=r;
	}								
														/*P(a,b)
														Circle(x,y,r)
														a>x&&a<x+(2*r)&&b>y&&b<y+(2*r)在圆内
														a=x||a=x+(2*r)||b=y||b=y+(2*r)在圆上
														(a<x||a>x+(2*r))&&（b<y||b<y+(2*r)）在圆外 为啥这样算不对呢?????????!!!!!!!*/
	/*void location(Point p,Circle01 c){
		if((p.getAbscissa()>c.getAbscissa()) && (p.getAbscissa()<c.getAbscissa()+2*c.getR()) && (p.getOrdinates()>c.getOrdinates()) && (p.getOrdinates()<c.getOrdinates()+2*c.getR())){
			System.out.println("点在圆内");
		}else{
			System.out.println("等一下");
		}
	}*/
	
	public void distance(Point p,Circle01 c){ //implements PointCircle接口，其中有一个抽象方法，参数为XX
		double d=Math.sqrt((p.getAbscissa()-c.getAbscissa())*(p.getAbscissa()-c.getAbscissa())+(p.getOrdinates()-c.getOrdinates())*(p.getOrdinates()-c.getOrdinates()));
		if(d>c.getR()){
			System.out.println("该点在圆外");
		}else if(d<c.getR()){
			System.out.println("该点在圆内");
		}else if(d==c.getR()){
			System.out.println("该点在圆上");
		}		
	}

}
class Point{
	private double	a;//横坐标
	private double b;//纵坐标	
	Point(){}
	Point(double a,double b){
		this.a=a;
		this.b=b;
	}
	double getAbscissa(){//横坐标
		return this.a;
	}
	void setAbscissa(double a){
		this.a=a;
	}
	double getOrdinates(){//纵坐标
		return this.b;
	}
	void setOrdinates(double b){
		this.b=b;
	}	
}

class Circle02 extends Circle implements CircleCircle{  //implements CircleCircle接口，其中有一个抽象方法，参数为XX
	private double r;//圆半径
	private double x;//横坐标
	private double y;//纵坐标
	
	double getAbscissa(){//横坐标
		return this.x;
	}
	void setAbscissa(double x){
		this.x=x;
	}
	double getOrdinates(){//纵坐标
		return this.y;
	}
	void setOrdinates(double y){
		this.y=y;
	}
	double getR(){
		return this.r;
	}
	void setR(double r){
		this.r=r;
	}
	
	Circle02(){
		super();
	}
	Circle02(double x,double y,double r){
		super();
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public void distance(Circle01 c1,Circle02 c2){
		double d=Math.sqrt((c1.getAbscissa()-c2.getAbscissa())*(c1.getAbscissa()-c2.getAbscissa())+(c1.getOrdinates()-c2.getOrdinates())*(c1.getOrdinates()-c2.getOrdinates()));
		if(d>(c1.getR()+c2.getR())){
			System.out.println("两圆相离");
		}else if(d<(c1.getR()+c2.getR())){
			System.out.println("两圆是包含关系");
		}else if(d==(c1.getR()+c2.getR())){
			System.out.println("两圆外切");
		}else if(d==(c1.getR()-c2.getR())){
			System.out.println("两圆内切");
		}		
	}
}
class Test{
	public static void main(String[] args){
		Point p=new Point(2,3);
		Circle c1=new Circle01(2,3,5);
		c1.distance(p,c1);
		Circle c2=new Circle02(3,4,4);
		c2.distance(c1,c2);
	}
}
