/*Object类中equals方法的覆盖&比较String类型的值

如果一个 汽车和另一个汽车是同一个品牌、同一个类型、同一个颜色
则是同一个汽车
1.传递进来的对象是不是空
2.判断 传递进来的对象是不是自己
3.判断品牌相同
4.判断颜色相同
5.判断轮子个数相同

*/
class Car extends Object{
	private int tyre;
	private String color;
	private String brand;
	
	Car (){}
	Car(int tyre,String color,String brand){
		this.tyre=tyre;
		this.color=color;
		this.brand=brand;
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
	String getBrand(){
		return this.brand;
	}
	void setBrand(String brand){
		this.brand=brand;
	}
	public String toString(){
		return "轮胎数量:"+this.tyre+",颜色:"+this.color+",品牌:"+this.brand;
	}
	
	public boolean equals(Object anObject) {  		
		if(anObject==null){ 	//[判断等]判断传递进来的对象是不是空,如果这个对象就是个空值,那没有可比性直接返回false
			return false;
		}
		if(this == anObject){	//判断 传递进来的对象是不是自己
			return true;
		}
		Car c=null;
		if(anObject instanceof Car){//判断传进来的对象类型是否属于Car
			c=(Car)anObject;		//[类型转换]向下转换
		}
		if(this.tyre==c.tyre && this.color.equals(c.color)&&this.brand.equals(c.brand)){//判断本类中的属性值是否等于相比较的类中的对应的属性的值
			 return true;		//不同的方式判断int及String类型的值的内容是否相同	
		}
		return false;
	}
}
class Demo{
	public static void main(String[] args){
		Car c1=new Car(4,"红色","奔驰");
		Car c2=new Car(4,"红色","奔驰");
		
		String str1=c1.toString();
		String str2=c2.toString();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("判断是否时同一个车:"+c1.equals(c2));
		
		
		
		
	}
}