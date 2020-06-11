/*
5.编写一个Animal类,具有属性:种类; 具有功能:吃，睡。
  定义其子类Fish和Dog，
  定义主类E，在其main方法中分别创建其对象，并测试对象的特性。
*/

class Animal{
	private String species;
	
	Animal(){}
	Animal(String species){
		this.species=species;
	}
	String getAnimal(){
		return this.species;
	}
	void eat(){
		System.out.println("我能吃");
	}
	void sleep(){
		System.out.println("我能睡");
	}
}
class Fish extends Animal{
	Fish(){
		super();
	}
	Fish(String species){
		super(species);
	}
	
}

class Dog extends Animal{
	Dog(){
		super();
	}
	Dog(String species){
		super(species);
	}
}

class E{
	public static void main(String[] args){
		Dog d=new Dog("狗");
		System.out.println("我是"+d.getAnimal());
		d.eat();
		d.sleep();
		System.out.println("----------------");
		
		Fish f=new Fish("鱼");
		System.out.println("我是"+f.getAnimal());
		f.eat();
		f.sleep();	
		}
	
}