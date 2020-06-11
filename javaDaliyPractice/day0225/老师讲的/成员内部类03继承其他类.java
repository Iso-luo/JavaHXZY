//成员内部类继承其他类

class C{}
class CC{}


class A extends C{	
	class B extends CC{	//内部类可以当做一个独立的类 来继承其他的类
		void show(){	//【新增方法】
			System.out.println("1");
		}
	}
}

class D extends A{
	class B extends CC{	//【复写方法】成员内部类中方法的覆盖(如果不用覆盖,可不写)
		void show(){
			System.out.println("2");
		}
	}
}

class Demo{
	public static void main(String[] args){
		//Out out = new Out();
		//Out.In in  = out.new In();
		
		A a=new A();
		A.B b1=a.new B();//创建内部类的对象
		b1.show();
	
		D d  =new D();
		D.B b2= d.new B();//创建内部类的对象
		b2.show();
	}
}
