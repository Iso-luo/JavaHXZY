class Fu{}

class Zi extends Fu{
	void show(){
		System.out.println("我是Zi 的show方法");
	}
}

class Demo{
	public static void main(String[] args){		
		Fu f = new Zi();				//父类的引用指向子类对象
		// 把  f  ---->转化成  Zi类型
		Zi z =  null;                 	//必须要现在栈内存开辟一个Zi类的空间 再把创建的对象放进去
		if( f instanceof Zi ){			//如果Fu类型的f可实例为Zi类
			z = (Zi)f;
		}
		z.show();
	}
}