//匿名对象
class A{}

class B{
	
	void show(A a){
		System.out.println("我是B类的show方法");
	}
	
	A show2(){				//该方法返回类型为A类
		return new A();
	}
}

class Demo{
	public static void main(String[] args){		
		B b = new B();
		b.show(new A());//匿名对象 ---》可以当做参数进行传递。优点:节省内存资源
	}
}