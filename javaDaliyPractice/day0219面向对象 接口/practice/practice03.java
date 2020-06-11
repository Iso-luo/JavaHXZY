/*
3.设计一个接口，并设计一个实现类，实现这个接口
*/

interface A{
	void println();
}
class B implements A{
	public void println(){
		System.out.println("我可以实现接口");
	}
}
class Test{
	public static void main(String[] args){
		B b=new B();
		b.println();
	}
}