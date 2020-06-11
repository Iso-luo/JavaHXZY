/*Object类中equals方法的覆盖&比较int类型的值
如果一个 汽车和另一个汽车是
同一个品牌、同一个类型、同一个颜色
即为同一个汽车
*/
class Car extends Object{
	private int tyre;
	private int color;
	private int brand;
	
	Car (){}
	Car(int tyre,int color,int brand){
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
	int getColor(){
		return this.color;
	}
	void setColor(int color){
		this.color=color;
	}
	int getBrand(){
		return this.brand;
	}
	void setBrand(){
		this.brand=brand;
	}
	public String toString(){
		return "轮胎数量:"+this.tyre+",颜色:"+this.color+",品牌:"+this.brand;
	}
	
	public boolean equals(Object obj) {	//Obeject方法的覆盖
		Car c=null;
		if(obj==null){ 			//判断等 如果这个对象就是个空值 那直接返回false
			return false;
		}
		if(obj instanceof Car){	//先判断该对象类型是否属于Car
			c=(Car)obj;			//[类型转换]向下转换
		}
		if(this.tyre==c.tyre && this.color==c.color&&this.brand==c.brand){//判断本类中的属性值是否等于相比较的类中的对应的属性的值
			 return true;	
		}
		return false;
	}
}
class Demo{
	public static void main(String[] args){
		Car c=new Car(4,1,1);
		Car cc=new Car(4,1,2);
		//System.out.println(c.toString());
		
		System.out.println(c.equals(cc));
		
	}
}