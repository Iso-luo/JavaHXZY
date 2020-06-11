interface A{						//接口
	public abstract void show1(); 	//接口中的方法默认的访问权限public
	public abstract void show2();	//接口中的方法默认的访问权限public
}

class B implements A{  		//实现接口
	public void show1(){	//默认的访问权限  default需要修改为public子类方法的权限应大于等于父类该方法	
		System.out.println("我是B类中的方法show1");//将抽象方法1具化
	}
	public void show2(){
		System.out.println("我是B类中的方法show2");//将抽象方法2具化
	}
	
}

class Demo{
	public static void main(String[] args){		
		B b = new B(); 		//创建B类型的对象b
		b.show1();			//b对象引用其所在类中的方法
		b.show2();
	}
}