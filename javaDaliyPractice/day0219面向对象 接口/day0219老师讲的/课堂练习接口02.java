//求三角形、圆的面积周长

class Graph{}
class T extends Graph{
	//getter  setter
	int a;
	int b;
	int c;
	
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
	
	// construction
	T(){
		super();
	}	
	T(int a,int b,int c){
		super();
		this.a=a;
		this.b=b;
		this.c=c;
	}	
}

interface Calc{									//计算三角形的接口
	abstract int getPe(int a,int b,int c); 		//求周长的抽象方法
	abstract double getArea(int a,int b,int c); //求面积的抽象方法
}

interface CalCircle{							//计算圆形的接口
	abstract double getPe(int r);				//求周长的抽象方法
	abstract double getArea(int r);				//求面积的抽象方法
}
class Circle extends Graph implements CalCircle{
	int r;
	int getR(){
		return this.r;
	}
	void setR(int r){
		this.r=r;
	}
	
	Circle(){
		super();
	}
	Circle(int r){
		super();
		this.r=r;
	}
	public double getPe(int r){
		return 2*3.14*r;
	}
	public double getArea(int r){
		return 3.14*r*r;
	}
}
//等腰 等边 其他三角形
//圆形类

class Rt extends T implements Calc{	
	Rt(){
		super();
	}
	Rt(int a,int b,int c){
		super(a,b,c);
	}
		
	public int getPe(int a,int b,int c){
		return a+b+c;
	}
	public double getArea(int a,int b,int c){		
		double x;
		if(a>b&&a>c){
			x=b*c/2;
		}else if(b>a&&b>c){
			x=a*c/2;
		}else{
			x=a*2/2;
		}
		//判断最长的那个 ，默认 a *b /2
		return x;
	}
	
}
class DengBianT extends T implements Calc{
	DengBianT(){
		super();
	}
	DengBianT(int a,int b,int c){
		super(a,b,c);
	}
	
	public int getPe(int a,int b,int c){
		int x;
		if(a==b&& b==c){
			x=a+b+c;
		}else{
			x=0;
		}
		return x;
	}
	public double getArea(int a,int b,int c){			
		double x;
		if(a==b && b==c){
			double p;
			p=(double)(a+b+c)/2;	
			x=Math.sqrt(p*(p-a)*(p-b)*(p-c));	
		}else{
			x=0;
		}
		return x;
	}
}
class DengYaoT extends T implements Calc{
	DengYaoT(){
		super();
	}
	DengYaoT(int a,int b, int c){
		super(a,b,c);
	}
	public int getPe(int a,int b,int c){
		int x=0;
		if(a==b||a==c||b==c){
			x=a+b+c;
		}else{
			x=0;
		}
		return x;		
	}
	
	public double getArea(int a,int b,int c){
		double x;
		if(a==b||a==c||b==c){
			double p=(double)(a+b+c)/2;
			x = Math.sqrt(p*(p-a)*(p-b)*(p-c));	
		}else{
			x=0.0;
		}
		return x;
	}
	
}

class Demo{
	public static void main(String[] args){	
		
		T t = new Rt(12,13,5);	
		T t1=new DengBianT(5,5,5);
		T t2=new DengYaoT(6,7,10);
		Rt rt=null;			//先在栈内存创建一个空间，里面是空值
		if(t instanceof Rt){//类型转换时，首先进行判断
			rt = (Rt)t;
		}		
		System.out.println("直角三角形周长是"+ rt.getPe(rt.getA(),rt.getB(),rt.getC()));
		System.out.println("直角三角形面积是"+ rt.getArea(rt.getA(),rt.getB(),rt.getC()) );
		
		DengBianT dbt=null;
		if(t1 instanceof DengBianT){
			dbt=(DengBianT)t1;
		}
		System.out.println("等边三角形周长是"+ dbt.getPe(dbt.getA(),dbt.getB(),dbt.getC()));
		System.out.println("等边三角形面积是"+ dbt.getArea(dbt.getA(),dbt.getB(),dbt.getC()));
		
		DengYaoT dyt=null;
		if(t2 instanceof DengYaoT){
			dyt=(DengYaoT)t2;
		}
		System.out.println("等腰三角形周长是"+ dyt.getPe(dyt.getA(),dyt.getB(),dyt.getC()));
		System.out.println("等腰三角形面积是"+ dyt.getArea(dyt.getA(),dyt.getB(),dyt.getC()));
		
		Circle c=new Circle(3);
		System.out.println("圆的周长是"+ c.getPe(c.getR()));
		System.out.println("圆的面积是"+ c.getArea(c.getR()));
	}
}













