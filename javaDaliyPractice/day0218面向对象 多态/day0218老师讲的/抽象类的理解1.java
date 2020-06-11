//抽象类

abstract class A{
	abstract void show();  //【抽象方法】如果一个方法有abstract修饰。
	void show2(){		   //可以有非抽象方法
		System.out.println("我是a 的show2方法");
	}	
}
abstract class B extends A{		//如果抽象类A的一个子类B也是抽象类，则同样的用abstract修饰
	abstract void getMoney();	//其中也可以新加一些abstract方法	
}

class C extends  B{		//C类继承与B类 但不是抽象类 前面没有abstract修饰
	void show(){};		//需要将其继承的抽象类中的所有抽象方法全部重写
	void getMoney(){};
}

class Demo{
	public static void main(String[] args){
		C c=new C();		
		c.show();		
		c.show2();
		c.getMoney();
	}

}