interface A{
	public static final int x=3;   //属性 public  static final
	public abstract void show();
}


class B implements A{

	public void show(){
		System.out.println("B");
	}
}
class Demo{
	public static void main(String[] args){
	
		A a = new B();
		a.show();
		
		//a.x=33;
		System.out.println(a.x);
	}
}