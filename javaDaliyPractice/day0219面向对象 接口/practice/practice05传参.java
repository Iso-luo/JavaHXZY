/*
5.设计一个类，在继承一个类的同时，实现其的两个接口(具体是什么接口自行设计)

注意：类中的方法如何调用一个其他类型的对象
*/
class A{
	private int a;
	
	int getA(){
		return this.a;
	}
	void setA(int a){
		this.a=a;
	}
	
	A(){}
	A(int a){
		this.a=a;
	}
	void show3(B b){								/*【注意！！！】方法一：传参。如果show3()方法里想用b.getA(),则show3()的参数必须传入一个B类型的对象，
														才能实现b对象调用父类A中的getA()方法，从而得到A类的私有属性a的值。
														否则，方法二：不传参。属性a是本类的私有属性，此主体中直接引用this.a,
															  方法三：不传参。可以在Test类中,创建对象b,b再调用A类的getA()方法,从而获得a的值	*/
		System.out.println("我是父类的"+b.getA());//这里其实就是把放在Test类中的创建对象b，b再调用A类中的私有属性的方法，直接放在A类的方法中直接用。
	}
}
interface Num1{
	void show1();//接口中的方法的默认权限修饰符为public
}
interface Num2{
	void show2();
}
class B extends A implements Num1,Num2{
	B(){
		super();
	}
	B(int r){
		super(r);
	}
	public void show1(){		
		System.out.println("我是接口Num1的show1方法");
	}
	public void show2(){		
		System.out.println("我是接口Num2的show2方法");
	}
}

class Test{
	public static void main(String[] args){
	
		A b=new B(3);//多态
		B bb=null;   //先在栈内存中开辟一块位置，命名为bb
		if(b instanceof B){//创建的对象b的父类类型A,如果b精确后，类型属于B
			bb=(B)b;	   //则可将b的类型向下转化，放在bb所指向的堆内存中
		}
		
		b.show3(b);	//这里用b或者bb来调用继承来的父类方法都可以，但是show3(参数)里的参数必须和父类中继承的参数类型一致(AB均可)
		bb.show1();
		bb.show2();
	}
}