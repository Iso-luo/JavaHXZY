/*
14.	Static关键字与普通变量的区别
创建一个名称为StaticDemo的类,并声明一个静态变量和一个普通变量。
对变量分别赋予10和5的初始值。在main()方法中输出变量值。*/

class StaticDemo{
	static int x;
	int y;
}
class Test{
	public static void main(String[] args){
		StaticDemo.x=10;
		System.out.println(StaticDemo.x);//x是静态变量，可直接用类名调用
		
		
		StaticDemo sd=new StaticDemo();	//y不是静态变量，不可直接用类名调用，需要先创建对象
		sd.y=5;							//用对象调用StaticDemo类的属性y
		System.out.println(sd.y);
	}
}

