/*07.编写一个图形类，
子类，
	三角形类：
		等腰三角
		等边三角
		直角
		分别实现计算周长 面积的方法
    圆形类：
		分别实现计算周长 面积的方法
*/

class Figure{ //这个是干嘛的？？？？？？？？？？
	
}

class Triangle extends Figure{
	private int a;
	private int b;
	private int c;
	
	Triangle(){
		super();
	}
	Triangle(int a,int b,int c){
		super();
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	int getA(){
		return this.a;
	}
	int getB(){
		return this.b;
	}
	int getC(){
		return this.c;
	}
	void setA(int a){
		this.a=a;
	}
	void setB(int b){
		this.b=b;
	}
	void setC(int c){
		this.c=c;
	}
	
	int getPerimeter(){	
		return this.a+this.b+this.c;
	}
	double getArea(){
		double p=(double)(this.a+this.b+this.c)/2;		
		return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
	}
	
}
class DengBianTr extends  Triangle{
		DengBianTr(){
			super();
		}
		DengBianTr(int a,int b,int c){
			super(a,b,c);
		}	
		void printPerimeter(){
			if(getA()==getB()&& getA()==getC()){
				System.out.println("我是等边三角形"+"\n"+"我的周长:"+getPerimeter());
			}else{
				System.out.println("我不是等边三角形！！无法计算周长");
			}			
		}
		void printArea(){
			if(getA()==getB()&& getA()==getC()){
				System.out.println("我的面积:"+getArea());
			}else{
				System.out.println("我不是等边三角形！！无法计算面积");
			}		
		}
}
class DengYaoTr extends Triangle {
		DengYaoTr(){
				super();
			}
			DengYaoTr(int a,int b,int c){
				super(a,b,c);
			}	
	void printPerimeter(){
			if(getA()==getB()||getA()==getB()||getB()==getC()){
				System.out.println("我是等腰三角形"+"\n"+"我的周长:"+getPerimeter());
			}else{
				System.out.println("我不是等腰三角形！！无法计算周长");
			}			
	}
	void printArea(){
			if(getA()==getB()||getA()==getB()||getB()==getC()){
					System.out.println("我的面积:"+getArea());
				}else{
					System.out.println("我不是等腰三角形！！无法计算面积");
				}			
	}
}

class RightTr extends Triangle {
		RightTr(){
				super();
			}
			RightTr(int a,int b,int c){
				super(a,b,c);
			}	
	void printPerimeter(){
			if(getA()*getA()+getB()*getB()==getC()*getC()||getB()*getB()+getC()*getC()==getA()*getA()||getA()*getA()+getC()*getC()==getB()*getB()){
				System.out.println("我是直角三角形"+"\n"+"我的周长:"+getPerimeter());
			}else{
				System.out.println("我不是直角三角形！！无法计算周长");
			}			
	}
	void printArea(){
			if(getA()*getA()+getB()*getB()==getC()*getC()||getB()*getB()+getC()*getC()==getA()*getA()||getA()*getA()+getC()*getC()==getB()*getB()){
				System.out.println("我的面积:"+getArea());
			}else{
				System.out.println("我不是直角三角形！！无法计算面积");
			}			
	}
}

class Circle extends Figure{
	private int r;
	
	Circle(){
		super();
	}
	Circle(int r){
		super();
		this.r=r;
	}
	void show(){
		System.out.println("我是圆");
	}
	void getPerimeter(){
		System.out.println("周长为："+2*3.14*r);
	}
	void getArea(){
		System.out.println("面积为："+3.14*r*r);
	}
	
}

class Test{
	public static void main(String[] args){
		//Triangle t=new Triangle(4,5,5);
		DengBianTr dbt=new DengBianTr(5,5,5);
		dbt.printPerimeter();
		dbt.printArea();
		System.out.println("------------分割线-------------");
		DengYaoTr dyt=new DengYaoTr(4,5,5);
		dyt.printPerimeter();
		dyt.printArea();
		System.out.println("------------分割线-------------");
		RightTr right=new RightTr(3,5,5);
		right.printPerimeter();
		right.printArea();
		System.out.println("------------分割线-------------");
		Circle c=new Circle(3);
		c.show();
		c.getPerimeter();
		c.getArea();
	}
}


