/*
	super（参数）：调用父类中的某一个构造函数（应该为构造函数中的第一条语句）。
	this（参数）：调用本类中另一种形式的构造函数（应该为构造函数中的第一条语句）。
	18、已知: 
	
	还是不太明白
	
*/

class C {
	int x;
	String y;
	
	public C(){						//构造器1(无参)
		this("1");						//调用构造器2(一个String型形参),即调用C("1"){...}
		System.out.print("one");
	}
	public C(String y) {			//构造器2(一个String型形参)
		this(1,y);						//调用构造器3(一个int型形参,一个String型形参),即调用C(1,"1"){...}
		System.out.print("two");
	} 
	public C(int x, String y) {		//构造器3(一个int型形参,一个String型形参),C(1,"1"){...}
		this.x = x;						//给成员属性赋值
		this.y = y;
		System.out.print("three");
	}
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.x +""+ c.y);
	}
} 