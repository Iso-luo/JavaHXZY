/*26.综合题
1.定义一个抽象的"Role"类 有姓名、年龄、性别等成员变量,
要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有),再通过GetXXX()和SetXXX()方法对各变量进行读写。
具有一个抽象的play()方法,该方法不返回任何值,同时至少定义两个构造方法。
Role类中要体现出this的几种用法。???????????????????????????????????????????
2.从Role类派生出一个"Employee"类.该类具有Role类的所有成员(构造方法除外)并扩展salary成员变量,
同时增加一个静态成员变量“职工编号 ID ”。同样要有至少两个构造方法 要体现出this和super的几种用法,
还要求覆盖play()方法 并提供一个final sing()方法
3."Manager"类继承"Employee"类,有一个final成员变量"vehicle"
4.在main()方法中制造Manager和Employee对象,并测试这些对象的方法。


*/

abstract class Role{
	private String name;
	private int age;
	private String gender;
	
	Role(){}
	Role(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	String getName(){
		return this.name;
	}
	void setName(String name){
		this.name=name;
	}
	int getAge(){
		return this.age;
	}
	void setAge(int age){
		this.age =age;
	}
	String getGender(){
		return this.gender;
	}
	void setGender(String gender){
		this.gender=gender;
	}	
	abstract void play(Employee e);			//该方法不返回任何值	
}
class Employee extends Role{
	private double salary;
	static String id;						//静态成员变量
	
	Employee(){
		super();
	}
	Employee(String name,int age,String gender,double salary,String id){
		super(name,age,gender);
		this.salary=salary;
		this.id=id;		
	}

	double getSalary(){
		return this.salary;
	}
	void setSalary(double salary){
		this.salary=salary;
	}
	String getId(){		//【错误】无法从静态上下文引用非静态 this???????????
		return this.id;
	}
	void setId(String id){
		this.id=id;
	}
	
	//覆盖play()方法 并提供一个final sing()方法
	void play(Employee e){
		System.out.println("员工信息为:"+"\n"+"姓名："+e.getName()+"\n"+"年龄："+e.getAge()+"\n"+"性别："+e.getGender()+"\n"+"工资："+e.getSalary()+"\n"+"员工编号："+e.getId());
	}
	final void sing(){
		System.out.println("We are singing!");
	}
	
}

class Manager extends Employee{
	private final String vehicle="奥迪A6";	//final成员变量"vehicle,常量需要直接赋值！
	
	Manager(){
		super();
	}
	Manager(String name,int age,String gender,double salary,String id){
		super(name,age,gender,salary,id);
	}
	Manager(String name,int age,String gender,double salary,String id,String vehicle){
		super(name,age,gender,salary,id);
		//this.vehicle=vehicle; //【错误】无法最终为变量Vehicle分配值
	}
	String getVehicle(){
		return this.vehicle;
	}
	/*void setVehicle(String vehicle){ final常量Vehicle 不能再修改
		this.vehicle=vehicle;
	}*/
	void play(Employee e){}	//父类方法的重写,不调用这个就好了
	void play(Manager m){	//[新增方法]与继承的play方法重载
		System.out.println("总经理:"+"\n"+"姓名："+m.getName()+"\n"+"年龄："+m.getAge()+"\n"+"性别："+m.getGender()+"\n"+"工资："+m.getSalary()+"\n"+"汽车："+m.getVehicle());
	}	
}
class Test{
	public static void main(String [] args){
		Employee e=new Employee("张三",25,"男",6800.00,"0001");
		//System.out.println("员工编号为："+Employee.getId());
		System.out.println("员工编号为："+Employee.id);
		e.play(e);
		e.sing();
		
		Manager m=new Manager("李四",55,"女",10800.00,"0002");//最后一位写不写Vehicle的值都不会传进来，因为它等于常量“奥迪A6”,也不会报错

		m.play(m);
		m.sing();
	}
}






















