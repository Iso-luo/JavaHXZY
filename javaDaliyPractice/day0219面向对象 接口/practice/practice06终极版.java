/*
06.试将平面上的圆抽象为类，公有类名为Circle，
请采用合适的视角和逻辑进行抽象和封装，
成员变量和成员方法
需要在对象中提供两个方法，
一个方法：传入一个点对象，判断该圆和点对象的位置关系(即圆外、圆上、圆内);
另一个方法：传入一个圆对象，判断两圆之间的关系(分离,相切,相交)

[注]此做法是标准的嵌套思路，应借鉴
*/
class Graph{
	private double x;	//横坐标
	private double y;	//纵坐标
	private double r;	//圆半径
	private Point dot;	//直接给出圆点
	
	double getAbscissa(){		//横坐标
		return this.x;
	}
	void setAbscissa(double x){
		this.x=x;
	}
	double getOrdinates(){		//纵坐标
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
	Point getDot(){			//【注意】这里要返回Point类型的值，才能get到dot这个点
		return this.dot;
	}
	void setDot(Point dot){	//【注意】该参数类型也是我后面要新创建的Point类，此处引用Point类(型)的一个对象
		this.dot=dot;
	}
	Graph(){}
	Graph(Point dot,double r){
		this.dot=dot;
		this.r=r;
	}
	Graph(double x,double y,double r){
		this.x=x;
		this.y=y;
		this.r=r;
	}	
}	

interface Calc{									
	double distance(Point p1,Point p2);			//接口方法一:求距离.参数列表(p1点,p2圆点)
	void compare(double d,double r);			//接口方法二:比较并得出结论.参数列表(两点间距离值,圆半径)
	void compare(double d,double r1,double r2);	//接口方法三:比较并得出结论.参数列表(两点间距离值,圆1半径,圆2半径)
}
							
class Circle1 extends Graph implements Calc{	//Circle1类继承Graph类实现Calc功能
	
	Circle1(){
		super();
	}
	Circle1(Point dot,double r){
		super(dot,r);
	}
	Circle1(double x,double y,double r){	
		super(x,y,r);
	}	
	
	public double distance(Point p,Point dot){ 	//覆盖接口方法一,参数((Point类型)小点的坐标,(Point类型)圆点的坐标)
		double d=Math.sqrt(Math.pow((p.getAbscissa()-dot.getAbscissa()),2)+Math.pow((p.getOrdinates()-dot.getOrdinates()),2)); //数学方法求两点间的距离
		return d;
	}
	public void compare(double d,double r){		//覆盖接口方法二,参数((double类型)小点到圆点1的距离[上面已求出,在Test类中调用就好了],(double类型)Circle1的半径)
		if(d>r){
			System.out.println("点在圆外");
		}else if(d<r){
			System.out.println("点在圆内");
		}else{
			System.out.println("点在圆上");
		}
	}
	public void compare(double d,double r1,double r2){	//覆盖接口方法三,参数((double类型)圆点1到圆点2的距离[上面已求出,在Test类中调用就好了],(double类型)Circle1的半径,(double类型)Circle2的半径)
		if(d>(r1+r2)){
			System.out.println("两圆外离");
		}else if(d>(r1-r2) && d<(r1+r2)){
			System.out.println("两圆相交");
		}else if(d==(r1+r2)){
			System.out.println("两圆外切");
		}else if(d==(r1-r2)){
			System.out.println("两圆内切");
		}else if(d<(r1-r2)){
			System.out.println("两圆内含");
		}
	}
}
class Point{
	private double a;		//横坐标
	private double b;		//纵坐标	
	Point(){}
	Point(double a,double b){
		this.a=a;
		this.b=b;
	}
	double getAbscissa(){	//获取横坐标
		return this.a;
	}
	void setAbscissa(double a){
		this.a=a;
	}
	double getOrdinates(){	//获取纵坐标
		return this.b;
	}
	void setOrdinates(double b){
		this.b=b;
	}	
}
class Circle2 extends Graph{
	
	Circle2(){
		super();
	}
	Circle2(Point dot,double r){
		super(dot,r);
	}
	Circle2(double x,double y,double r){	
		super(x,y,r);
	}	
}	

class Test{
	public static void main(String[] args){
		Point p=new Point(3,0);		//创建一个点对象p 类型为Point,传入参数()
		Point dot1=new Point(3,3);	//创建一个圆点1对象dot1 类型为Point,传入参数()
		Point dot2=new Point(1,3);	//创建另一个圆点2对象dot1 类型为Point,传入参数()
		Circle1 c1=new Circle1(dot1,3);//利用Circle1中的第二个构造函数，创建第一个圆1，传入符合要求类型的参数(圆点值1,半径值)
		Circle2 c2=new Circle2(dot2,1);//利用Circle2中的第二个构造函数，创建第二个圆2，传入符合要求类型的参数(圆点值2，半径值)
		c1.compare(c1.distance(p,dot1),c1.getR());/*Circle1类的对象c1直接调用本类中的compare(),其参数类型第一个为double 
													而方法distance()的返回值类型恰好为double，
													所以第一个参数直接用对象c1调用distance(),
													此时distance的参数列表(Point p,Point dot)即为前面创建好的(对象p,对象dot1)，
													第二个参数直接用对象c1调用getR(),以获取圆1的半径*/
													
		c1.compare(c1.distance(dot1,dot2),c1.getR(),c2.getR());
		
	}
}
