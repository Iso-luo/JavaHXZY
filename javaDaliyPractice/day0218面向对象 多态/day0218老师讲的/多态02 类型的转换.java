// 类型转换 （类的对象）

class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}

class Person{					
	void eat(Fruit fruit){	
		if ( fruit instanceof  Apple){
			System.out.println("我想吃苹果");
		}else{
			System.out.println("我想吃香蕉");
		}
	}
}
class Xiaoming extends Person{						//Xiaoming类继承Person类
	void eat(Apple app){							/*Xiaoming类中有一个eat()功能，参数列表与父类的eat()的参数列表不一样啊，
													  不是方法的重写而是方法的重载？？？？！！！也就是说 这个是新加的功能*/
		System.out.println("我是子类 我喜欢吃苹果");
	}
}

class Demo{
	public static void main(String[] args){			//运行
													/*我传递进来的水果是什么，我在控制台上就打印 什么水果(中文)	*/														
		Person xm = new Xiaoming(); //[多态]实例化一个Xiaoming类的对象xm，其类型为(Xiaoming类的父类)Person类，xm属于Xiaoming类，Xiaoming类属于Person类，因此xm属于Person类型
		//Banana fruit = new Banana();
		Fruit fruit = new Apple(); //[多态]实例化一个Apple类的对象fruit，其类型为Apple类的父类Fruit类，apple属于Apple类，Apple类属于Fruit类，因此apple属于Fruit类型
		Fruit fruit2=new Banana();
		
		xm.eat(fruit);//当子类新增方法与所继承的父类的方法发生重载，要确定创建的对象的类型，再调用对应参数列表的功能，实现主体
		xm.eat(fruit2);	
		System.out.println("-------上下对比--------");
		((Xiaoming)xm).eat((Apple)fruit);//[写法一] 强制类型转换 从左向右执行
		
		/*
		if (  xm  instanceof Xiaoming){  //[写法二] 加入一个判断:如果Person类型的对象xm也属于Xiaoming类型
			//类型向下缩小
			Xiaoming 小明xiao=(Xiaoming)xm;//将Person类型的对象xm强制缩小为Xiaoming类型的对象，便可以执行Xiaoming类中的eat()方法，否则只能执行父类Person中的eat()方法
			//类型向上提升
			小明xiao.eat( (Apple)fruit ); //由于Xiaoming类中的eat()功能的参数需要Apple类型，但是一开始创建的对象fruit是Fruit类型,
										  //此时，仍需要将Fruit类型的fruit，强制转化为Apple类型的fruit，才能被eat()功能调用	
		}
		*/
	}
}