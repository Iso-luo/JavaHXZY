/*24.抽象类、继承、接口综合
设计一个系统 XXX门的实现过程,流程:
设计一张抽象的门Door 那么对于这张门来说 就应该拥有所有门的共性:开门openDoor()和关门closeDoor() 
然后对门进行另外的功能设计,防盗--theftproof()、防水--waterproof()、防弹--bulletproof()、防火、防锈
…… 要求 利用继承、抽象类、接口的知识设计该门
接口 Imen*/

abstract class Door{	//设计一张抽象的门Door 那么对于这张门来说 就应该拥有所有门的共性:开门openDoor()和关门closeDoor() 
	
	abstract void openDoor();			//当抽象类中的方法前无权限修饰时，其子类中继承的方法可以写public或protected
	abstract void closeDoor();
}

interface Imen{
	public abstract void theftproof(); //接口中的方法可以省略修饰public abstract，但不可改成default
	public abstract void waterproof();
	public abstract void bulletproof();
	public abstract void fireproof();
	public abstract void rustproof();	
}
class SpecificDoor extends Door implements Imen{
	protected void openDoor(){						//继承父类抽象方法
		System.out.println("我可以实现开门功能");		
	}
	protected  void closeDoor(){						//继承父类抽象方法
		System.out.println("我可以实现关门功能");		
	}
	
	public void theftproof(){				//实现接口 public
		System.out.println("我能防盗");	
	}
	public void waterproof(){				//实现接口 public
		System.out.println("我能防水");	
	}
	public void bulletproof(){				//实现接口 public
		System.out.println("我能防弹");	
	}
	public void fireproof(){				//实现接口 public
		System.out.println("我能防火");	
	}
	public void rustproof(){				//实现接口 public
		System.out.println("我能防锈");	
	}	
}
class Test{
	public static void main(String[] args){
		SpecificDoor sd=new SpecificDoor();
		sd.openDoor();
		sd.closeDoor();
		sd.theftproof();
		sd.waterproof();
		sd.bulletproof();
		sd.fireproof();
		sd.rustproof();		
	}
}