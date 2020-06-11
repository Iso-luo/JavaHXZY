/*
封装  缺每行注释！！！！
*/

class Student{	
	//把 成员变量 用private封装起来，这样后面如果有需要，可以set新值，并添加条件 判断 所赋值是否符合要求。
	private String name; 
	private String gender;
	private int age;
	 
	Student(){}				//和下面一并叫做方法的重载
	Student(String name,String gender,int age){
		this.name=name;					//this.[当前对象的引用]
		this.gender=gender;
		this.age=age;
	}
	
	void setName(String name){
		this.name=name;
	}
	void setGender(String gender){
		this.gender=gender;
	}
	void setAge(int age){
		this.age=age;
	}
	
	String getName(){
		return this.name;
	}
	int getAge(){
		return this.age;
	}
	
	void getDay(){
		System.out.println(this.age+" 岁的 "+this.name+" 白天要学习");
	}
	void getNight(){
		System.out.println(this.age+"岁的 "+this.name+" 晚上要睡觉");
	}
	void getBreak(){
		System.out.println(this.age+" 岁的 "+this.name+" 休息时吃饭");
	}
}
class Test{
	public static void main(String[] args){
		
		Student s=new Student(); //调用student类中的无参构造函数，创建当前对象s，即实例化一个Student
		s.setName("罗四");
		s.setGender("女");
		s.setAge(22);
		s.getDay();
		s.getNight();
		s.getBreak();
		
		
		
		Student s1=new Student("张三","男",18);
		s1.getDay();
		s1.getNight();
		s1.getBreak();
		
		s1.setName("李四");
		s1.setAge(88);
		
		System.out.println("新同学叫："+s1.getName());
		System.out.println("新同学年龄："+s1.getAge());
		s1.getDay();
		s1.getNight();
		s1.getBreak();
		
	}
}