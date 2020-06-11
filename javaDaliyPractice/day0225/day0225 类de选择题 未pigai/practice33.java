//33、分析如下所示的Java代码，则选项中的说法正确的是（C）。
class Parent{
	public String name;
	public Parent(String pName){
		this.name = pName;
	}
}   
class Test extends Parent {
	 public Test(String Name){//2		
		name="hello";//3
		super("kitty");//4 对super的调用必须是子类构造器的第一个
	}
}
class Demo{
	public static void main(String[] args){
		Test t=new Test("huahau");
		System.out.println(t);
	}
} 