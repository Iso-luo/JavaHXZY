interface A{
	public abstract void show1();//默认的访问权限public
	public abstract void show2();
}
class B implements A{
	public void show1(){//默认的访问default 改写成public，子类的方法权限要大于等于父类的
		System.out.println("1");
	}
	public void show2(){
		System.out.println("2");
	}
}
class Test{
	public static void main(String[] args){
		B b=new B();
		b.show1();
		b.show2();
	}
}