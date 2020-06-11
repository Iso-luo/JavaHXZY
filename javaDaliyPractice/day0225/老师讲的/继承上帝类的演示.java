//继承上帝类

class A extends Object{
	//覆盖掉toString()	
	String name;
	int age;
	
	A(){}						//A类的无参构造函数
	A(String name,int age){		//A类的有参构造函数
		this.name=name;
		this.age=age;
	}
	
	public String toString(){							//Object中toString()方法的覆盖
		return "姓名是:"+this.name+",年龄是"+this.age;	/*把Object中toString方法的返回[getClass().getName()+"@"+Integer.toHexString(hashCode());]
														 的重写，则不再返回一串地址值,如A@15db9742*/
	}
}

class Demo{
	public static void main(String[] args){
	
		A a  = new A();//调用无参构造函数,创建一个对象
		/*a.name="cyx"; //由于调用的是无参构造函数。所以需要依次给成员属性赋值
		a.age=32;*/
		
		System.out.println(a.toString());//这两个打印结果是一样的
		System.out.println(a);

		A aa  = new A("ave",3333);//这里是调用了有参构造函数,即重新给各成员属性赋值	
		
		System.out.println(aa.toString());//这两个打印结果是一样的
		System.out.println(aa);
		
		
	
		
		
	}
}