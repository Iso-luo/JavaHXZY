//课堂练习题 02

class Point{
	private int x;
	private int y;
	private int z;
	
	Point(){}
	Point(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	void setX(int x){//提供可设置三个坐标的方法
		this.x=x;
	}
	void setY(int y){//提供可设置三个坐标的方法
		this.y=y;
	}
	void setZ(int z){//提供可设置三个坐标的方法
		this.z=z;
	}
	
	double getDistance(){//提供可计算该点到原点距离的方法
		return Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
	}	
}

class Test{
	public static void main(String[] args){
		Point p=new Point(1,2,3);//生成具有特定坐标的点对象
		System.out.println("该点距原点的距离："+p.getDistance());
		
		p.setX(3);
		p.setY(4);
		p.setZ(5);
		System.out.println("该点距原点的距离 变为："+p.getDistance());
		
	}
}
