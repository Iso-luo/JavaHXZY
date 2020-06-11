/*
05.构造方法
编写Java程序用于显示人的姓名和年龄。
定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
定义构造方法用来初始化数据成员。
再定义显示display方法将姓名和年龄打印出来。
在main方法中创建人类的实例然后将信息显示。
*/

class Person{
	private String name;
	private int age;
	
	Person(){}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println("姓名:"+this.name+"\n"+"年龄:"+this.age);
	}	
}
class Test{
	public static void main(String[] args){
		Person p=new Person("张三",88);
		p.display();
	}
}