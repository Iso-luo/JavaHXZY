//【理解】类 都是引用数据类型 类里面可以因为其他的类(类型)

class Person{//Person类
	Eye eye; //含有一个成员属性eye 其类型为Eye
}
class Eye{ 							//定义Eye类型
	Color color; 					//含有一个成员属性color 其类型是Color;
	
	void show(Color color){			//Eye类的show方法中：参数列表为含有Color类型的参数 color
		System.out.println(color.r);//由于Color类型中定义了属性r的值，对象color可调用所属类中的属性r，结果打印值为1
	}
	
}
class Color{	//定义Color类
	int r=1;	//成员属性r的值为1;
	int g=2;	//成员属性g的值为2;
	int b=3;
}
class Demo{
	public static void main(String[] args){//运行
		Eye e = new Eye();		//在Eye类创建一个对象e
		Color r = new Color();	//在Color类创建一个对象r
		e.show(r);				/*对象e所属的Eye类中有一个show()方法，e.show()即表示对象e可调用所属类中的show()方法;
									show()方法含有参数r 其类型为Color*/	
	}
}
