/*
4.设计一个接口，可以同时实现多个接口
*/

interface A{     
	void show1();//每个接口中的方法命名都不能一样，否则就是重复
}
interface B{
	void show2();//每个接口中的方法命名都不能一样，否则就是重复
}
interface C{
	void show3();//每个接口中的方法命名都不能一样，否则就是重复
}
class D implements A,B,C{
	public void show1(){
		System.out.println("我可以实现A接口");
	}
	public void show2(){
		System.out.println("我可以实现B接口");
	}
	public void show3(){
		System.out.println("我可以实现C接口");
	}
}
class Test{
	public static void main(String[] args){
		D d=new D();
		d.show1();
		d.show2();
		d.show3();
	}
}