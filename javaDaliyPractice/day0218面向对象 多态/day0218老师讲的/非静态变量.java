//演示一种错误
class A{
	int x;//x是非静态的变量
}
class Demo{
	public static void main(String[] args){
		A a = new A();
		A.x =3; //A类型不可以直接调用非静态变量 会报错
		System.out.println(A.x);
	}
}