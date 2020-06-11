/*
3.编写一个java程序，该程序包括3个类：Monkey类、People类和主类E。要求：
(1)Monkey类中有个构造方法：Monkey(String s),并且有个public void speak()方法，
	在speak方法中输出"咿咿呀呀......"的信息;
(2)People类是Monkey类的子类,在People类中重写方法speak(),
	在speak方法中输出"小样的,不错嘛会说话了！"的信息;	
(3)在People类中新增方法void think(),在think()方法中输出"别说话！认真思考！"的信息。
(4)在主类E的main方法中创建Monkey与People类的对象来测试这2个类的功能
*/

class Monkey{
	String s;
	Monkey(){}
	Monkey(String s){
		this.s=s;
	}	
	void speak(){
		System.out.println("咿咿呀呀......");
	}	
}
class People extends Monkey{
	People(){
			super();
	}
	People(String s){
		super(s);
	}
	void speak(){
		System.out.println("小样的,不错嘛会说话了！");	//对父类方法覆盖
	}
	void think(){
		System.out.println("别说话！认真思考！");//子类新增的方法
	}
}
class E{
	public static void main(String[] args){
		Monkey m=new Monkey();//调用的是无参构造函数
		m.speak();
		System.out.println("----------------");
		
		People p=new People();//调用的是无参构造函数
		p.speak();
		p.think();
		
	}
}