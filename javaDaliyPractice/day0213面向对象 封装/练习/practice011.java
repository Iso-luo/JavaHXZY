//课堂练习题 01 第一题

class Person{
	private String name;
	private String gender;
	private int age;
	
	Person(){}
	Person(String name,String gender,int age){
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	void showAge(){		
		System.out.println("年龄为："+this.age);
	}
	
	void addAge(){				//给对象的age属性值增加2
		this.age=this.age+2;
		System.out.print(this.age);
	}
	
}

class Test{
	public static void main(String[] args){
		Person p=new Person("李四","女",22);
		p.showAge();
		p.addAge();
		
	}
}