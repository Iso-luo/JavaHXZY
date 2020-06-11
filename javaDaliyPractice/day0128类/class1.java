// 面向对象 第一节

class ComputPeople{								//这个人的类型
	int age;									//定义 属性1
	double height;								//定义 属性2
	String gender;								//定义 属性3

	void person(String a,int b){						//定义 一个方法。
														//注意该方法不用加前面的public static，并且像打印功能一样 无返回
		System.out.println("我叫"+a+","+"今年"+b+"岁");
	}
	void makeComput(String type){						//定义 另一个方法。注意该方法不用加前面的public static，并且像打印功能一样 无返回				    
		System.out.println("我会装"+ type +"电脑");
	}
	
}

class Myself{
	public static void main(String[] args){		//运行 要用main方法
		
		ComputPeople c=new	ComputPeople();		//在类myself里，创建类ComputPeople的对象；格式【类型名 标识符=new 类型名()】
		c.person("张三",18);					//调用 类ComputPeople的对象 的一个方法，并赋值；格式【标识符.所调用的方法名】
		
		c.makeComput("联想");					//调用 类ComputPeople的对象 的另一个方法，并赋值；格式【标识符.所调用的方法名】
		c.makeComput("苹果");
		c.makeComput("所有类型");
		
	}
	
	
}
