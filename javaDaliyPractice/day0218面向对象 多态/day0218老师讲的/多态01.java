//多态 方法的重写！
class Food {}				
class Apple extends Food{}
class Icecream extends Food{}
class DogFood extends Food{}

class  Animal{						
	void eat(Food food){				//Animal类 里面的一个功能，调用Food类
		System.out.println("我吃"+food);
	}
}
class Xiaoming extends Animal{ 			// Xiaoming类在继承Animal类时,不能一味继承，需要判断是否符合实际情况
	void eat(Food food){				//【方法的重写】 方法名称eat((调用参数的类型)Food (名称)food)		
		if( !( food instanceof DogFood) ){				//instance译为"实例"
			System.out.println("我吃"+ food);			//[如果父类Food实例化对象food属于子类Apple或是子类Icecream，则人可以吃]
		}else{
			System.out.println("我不吃"+food);			//[如果父类Food实例化对象food属于子类Dogfood,则人不能吃]
		}		
	}	
}
class Dog extends Animal{}
class Demo{
	public static void main(String[] args){
		Animal xm  = new Xiaoming();//【父类的引用指向子类对象】父类Animal实例化的对象xm属于子类Xiaoming，其实际类型为Xiaoming类，前面的Animal并不是xm的精准类型,这个范围更大的类型在这里并没有被用到
		/*
		Apple apple= new Apple();	//创建一个Apple类的对象apple
		xm.eat(apple);				//Xiaoming类的对象xm，调用继承来的父类的功能时，根据需要填写该方法的参数
		Icecream i = new Icecream();
		xm.eat(i);*/
		Food f = new DogFood();		//【父类的引用 指向 子类对象】创建的对象f，其 实际类型 为 DogFood类，前面的Food并不是f的精准类型
		xm.eat(f);					/*对象xm 调用继承来的父类Animal的功能eat(),里面的参数为在Animal类里面定义好的 Food类型的f对象，并实现打印f，
									但是在Animal的子类Xiaoming类中,该方法被重写了，所以实现的时候，以Xiaoming类中的该方法的描述实现，即先判断
									父类Food指向的子类对象的实例f是否符合。由于父类Food此时指向的对象f的实例为Dogfood类型的，所以执行else条件*/
	}


}
