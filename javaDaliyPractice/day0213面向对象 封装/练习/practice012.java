////课堂练习题 01 第二题 计算圆的面积

class Circle{
	int r;
	
	Circle(){}
	Circle(int r){
		this.r=r;
	}
	void getArea(){
		System.out.println("圆的面积为："+(this.r*this.r*3.14));
	}
}

class Test{
	public static void main(String[] args){
		Circle c=new Circle(5);
		c.getArea();
	}
	
}