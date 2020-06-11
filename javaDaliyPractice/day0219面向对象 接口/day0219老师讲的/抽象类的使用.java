abstract class A{			//抽象类
	abstract void show();	//抽象方法
	void show2(){}			
}

class B extends A{			//抽象类的使用
	void show(){			//把从抽象类继承来的所有方法具体化
		System.out.println("我是b类中的show方法");
	}				
}

class Demo{
	public static void main(String[] args){
		// c		
		B  b = new B();  
		b.show();
	
	}
}