//如果一个方法 被final 修饰 那么这个方法就不能被覆盖
class A{
	final void show(){
		System.out.println("a");
	}

}

class B extends A{
	void show(){
		System.out.println("B");
	}
}


class Demo{
	public static void main(String[] args){
		B b = new B();
		b.show();
		
	}	
}