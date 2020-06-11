/*
06.get方法和set方法
定义一个类,该类有一个私有成员变量,通过构造方法将其进行赋初值,
并提供该成员的getXXX()和setXXX()方法 提示假设有private String name;
*/

class Member{
	private String name;
	
	Member(){}
	Member(String name){
		this.name=name;
	}
	
	String getName(){
		return this.name;
	}
	void setName(String name){
		this.name=name;
	}
}
class Test{
	public static void main(String[] args){
		Member m=new Member("张三");
		System.out.println(m.getName());
		m.setName("王五");
		System.out.println(m.getName());
	}
}