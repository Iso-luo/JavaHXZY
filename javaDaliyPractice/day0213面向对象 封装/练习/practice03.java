//课堂练习题 03 调用不同的构造方法创建对象

class Person{
	String name;
	int age;
	String school;
	String major;
	
	Person(String n,int a){ //第一个构造方法，含2个参数
		this.name=n;
		this.age=a;
	}
	Person(String n,int a,String s){ //第二个构造方法，含3个参数
		this.name=n;
		this.age=a;
		this.school=s;
	}
	Person(String n,int a,String s,String m){ //第三个构造方法，含4个参数
		this.name=n;
		this.age=a;
		this.school=s;
		this.major=m;
	}
	
	void getName(){
		System.out.println(this.name);
	}
	void getAge(){
		System.out.println(this.age);
	}
	void getSchool(){
		System.out.println(this.school);
	}
	void getMajor(){
		System.out.println(this.major);
	}
}

class Test{
	public static void main(String[] args){
		Person p1=new Person("张三",18);//不同构造方法创建的对象，【实例化一个对象】该方法含2个参数 【Person("张三",18)即为有参构造函数】
		p1.getName();
		p1.getAge();
		System.out.println("_______________");
		
		Person p2=new Person("李四",22,"西工大");//不同构造方法创建的对象，该方法含3个参数
		p2.getName();
		p2.getAge();
		p2.getSchool();
		System.out.println("_______________");
		
		Person p3=new Person("王五",58,"北大","土木工程");//不同构造方法创建的对象，该方法含4个参数
		p3.getName();
		p3.getAge();
		p3.getSchool();
		p3.getMajor();
		
	}
}
