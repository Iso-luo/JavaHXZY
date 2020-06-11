/*实验题目： 还没有弄完 ！！！！！！！！！！！！！！
编写工资系统，实现不同类型员工(多态)的按月发放工资。如果当月出现某个Employee对象的生日，则将该雇员的工资增加100元。
实验目的：对象、继承、封装、多态、抽象类的组合应用。
实验说明：
（1）定义一个Employee类，该类包含：
	private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
	abstract方法earnings()；toString()方法输出对象的name,number和birthday。	
（2）MyDate类包含:
	private成员变量month,day,year；
	toDateString()方法返回日期对应的字符串：xxxx年xx月xx日	
（3）定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。该类包括：
	private成员变量monthlySalary；
	实现父类的抽象方法earnings(),该方法返回monthlySalary值；toString()方法输出员工类型信息及员工的name，number,birthday。	
（4）参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。该类包括：
	private成员变量wage和hour；
	实现父类的抽象方法earnings(),该方法返回wage*hour值；toString()方法输出员工类型信息及员工的name，number,birthday。	
（5）定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
	利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
	当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
提示：
	//定义People类型的数组
		People c1[]=new People[10];
	//数组元素赋值
		c1[0]=new People("John","0001",20);
		c1[1]=new People("Bob","0002",19);
	//若People有两个子类Student和Officer，则数组元素赋值时，可以使父类类型的数组元素指向子类。
		c1[0]=new Student("John","0001",20,85.0);
		c1[1]=new Officer("Bob","0002",19,90.5);
*/
import java.text.SimpleDateFormat;//导入该包,该全称在工具包中可以找到(lang[language]的包不用导入)
import java.util.Date;	//导入该包
import java.util.Scanner;
class Employee{
	private String name;
	private int number;
	private MyDate birthday;

	Employee(){}
	Employee(String name,int number,MyDate birthday){
		this.name=name;
		this.number=number;
		this.birthday=birthday;
	}	
	
	String getName(){
		return this.name;
	}
	void setName(String name){
		this.name=name;
	}	
	int getNumber(){
		return this.number;
	}
	void setName(int number){
		this.number=number;
	}
	MyDate getBirthday(){
		return this.birthday;
	}
	void setBirthday(MyDate birthday){
		this.birthday=birthday;
	}
		
	double earnings(SalariedEmployee e){
		return 0.0;
	}	
	double earnings(HourlyEmployee e){	//定义一个方法的重载，子类需要用哪个，可以根据参数的不同，调用相同的名称，实现不用的操作
		return 0.0;
	}
	void toString(Employee e){			//输出对象的name,number和birthday	
		System.out.println("姓名:"+e.getName()+"工号:"+e.getNumber()+"生日:"+e.getBirthday().toDateString(e.getBirthday()));
	}	
}
class MyDate{
	private int year;
	private int month;
	private int day;
	
	MyDate(){}
	MyDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	int getYear(){
		return this.year;
	}
	void setYear(int year){
		this.year=year;
	}
	int getMonth(){
		return this.month;
	}
	void seMonth(int month){
		this.month=month;
	}
	int getDay(){
		return this.day;
	}
	void seDay(int day){
		this.day=day;
	}

	String toDateString(MyDate birthday){	//方法返回日期对应的字符串：xxxx年xx月xx日		
		return birthday.getYear()+"年"+birthday.getMonth()+"月"+birthday.getDay()+"日";
	}	
}
class SalariedEmployee extends Employee{	//雇佣对象1
	private double monthlySalary;
	
		SalariedEmployee(){
			super();
		}
		SalariedEmployee(double monthlySalary,String name,int number,MyDate birthday){
			super(name,number,birthday);
			this.monthlySalary=monthlySalary;
		}
		
		double getMonthlySalary(){
			return this.monthlySalary;
		}
		
		double earnings(SalariedEmployee e){		//该方法返回earning值
			return e.getMonthlySalary();
		}	
		double earnings(HourlyEmployee e){			//【重载】
			return 0.0;
		}
		
		void toString(Employee e){					//输出员工类型信息?????及员工的name，number,birthday。
			System.out.println("员工类型:SalariedEmployee"+"\n"+"姓名:"+e.getName()+" 工号:"+e.getNumber()+"生日:"+e.getBirthday().toDateString(e.getBirthday()));
		}
}
class HourlyEmployee extends Employee{//雇佣对象2
	private double wage;	
	private int hour;
	
	HourlyEmployee(){
		super();
	}
	HourlyEmployee(double wage,int hour,String name,int number,MyDate birthday){
		super(name,number,birthday);
		this.wage=wage;
		this.hour=hour;
	}
	
	double getWage(){
		return this.wage;
	}
	void setWage(double wage){
		this.wage=wage;
	}
	int getHour(){
		return this.hour;
	}
	void setHour(int hour){
		this.hour=hour;
	}
		
	double earnings(SalariedEmployee e){					//【重载】
		return 0.0;
	}	
	double earnings(HourlyEmployee e){						//该方法返回earning值
		return e.getWage()*e.getHour();
	}
	
	void toString(Employee e){//输出员工类型信息及员工的name，number,birthday。
		System.out.println("员工类型:HourlyEmployee"+"\n"+"姓名:"+e.getName()+" 工号:"+e.getNumber()+"生日:"+e.getBirthday().toDateString(e.getBirthday()));
	}
}
class PayrollSystem{
	Employee[] creatEmpArr(Employee[] emp,Employee e){ //参数(创建的Employee[]类型的数组arr,每一个Employee类型的对象e)返回一个遍历添加了数组值的Employee类型的数组
		for(int i=0;i<emp.length;i++){	//给Employee类型的arr中的每一位添加员工的信息列表
			emp[i]=e;					//Employee创建的新对象e,其中每个新创建的e中均包含一位员工的所有信息
		}
		return emp;						//返回这个充值后的arr
	}
	
	//这个数据本应是从数据库利用JDBC(java database )技术中读出来的数据 或是从Excel中利用IO(import object)技术导入的数据
	Employee getE(){				//在该类中写一个创建对象的方法
		Employee e=new Employee();
		return e;
	}
	public static String getStringDate(){	//静态方法，不需要用类创建一个对象再调用，可直接用类名调用
		Date currentTime=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("MM");
		String dateString=formatter.format(currentTime);
		return dateString;
	}
	double judgment(PayrollSystem ps){		//计算每位员工的实际工资								
		String date_str=PayrollSystem.getStringDate();	//创建String类型的对象 date_str,并为其赋上值
		char[] x=date_str.toCharArray();				//String类中非静态方法toCharArray(),需利用新创建的对象date_str调用该方法,而不能直接用String类来调用,返回值为一个新的字符数组char[]
		String r=x[1]+"";								//创建一个String类型的对象r,将char[]数组的第1位转化成字符串类型
		int currentMonth=Integer.parseInt(r);			//Integer类中的parseInt()方法是static静态方法,直接用类型Integer调用，并附上参数String类型的值，结果返回一个integer类型的值	
		double income=0.0;
		if(ps.getE() != null){							 //如果创建的对象不为空
			if(ps.getE().getBirthday().getMonth() == currentMonth){ //如果某个对象的月份为当前月
				if(ps.getE() instanceof SalariedEmployee){			//如果该对象属于SE	
					income=ps.getE().earnings((SalariedEmployee)ps.getE())+100.00;//调用重载的earning()放入不同类型的参数
				}else{
					income=ps.getE().earnings((HourlyEmployee)ps.getE())+100.00;
				}				
			}else{
				if(ps.getE() instanceof SalariedEmployee){				
					income=ps.getE().earnings((SalariedEmployee)ps.getE());
				}else{
					income=ps.getE().earnings((HourlyEmployee)ps.getE());
				}		
			}
		}
		return income;
	}	
		/*获取当前日期
		Date currentTime = new Date();  											//创建Date类的对象
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//创建SimpleDateFormat(格式化器)类的对象,命名为formatter
		String dateString = formatter.format(currentTime); //SimpleDateFormat类中含有一个非静态的方法format(),返回值类型为StringBuffer,用formatter调用该方法,并传入一个参数(Date date(Date类型的一个对象))[见工具包]
		System.out.println(dateString);
		*/		
		/*获取当前月份 并将字符串形的月份转化为int类型
		Date currentTime = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("MM");  
		String dateString = formatter.format(currentTime);  
		System.out.println(dateString);
		int m=Integer.parseInt(dateString);	字符串转int,如果该方法是静态方法static,则不需要创建Integer的对象,		
											直接(Integer.parseInt()方法名）;如果该方法不是静态static,则需要先创建Integer的对象,
											再用对象调用parseInt()方法
		System.out.println(m);*/				
}
class Test{ //问题：没有分清Employee[] emp和Employee e！！！！！
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入本月月份值：");
		int x=sc.nextInt();	
		
		Employee[] emp=new Employee[4]; //创建Employee类型的数组
		//给Employee类型的数组emp[]分别赋值：
		emp[0]=new SalariedEmployee(3888.8,"张三",3,new MyDate(1977,7,7)); //创建一个Employee类型的SalariedEmployee类的对象
		emp[1]=new SalariedEmployee(4888.8,"李四",4,new MyDate(1988,8,8));
		emp[2]=new HourlyEmployee(100.00,5000,"王五",5,new MyDate(1999,9,9));
		emp[3]=new HourlyEmployee(100.00,6000,"赵六",6,new MyDate(1966,6,6));
			
		PayrollSystem ps=new PayrollSystem();//创建PayrollSystem类的对象ps
		emp=ps.creatEmpArr(emp,ps.getE()); /*ps调用PayrollSystem类中的方法creatEmpArr(创建的Employee类型的数组emp,Employee类型的ps.getE()),
											其中ps.getE()每调用一次就新创建一个Employee的对象e,
											然后把所有的对象e依次放入emp数组的每一位上，最终返回一个Employee类型的数组*/
		ps.judgment(ps);
		
		for(int i=0;i<emp.length;i++){		//用for循环打印Employee类型的数组
					System.out.println(emp[i])
					
					/*if(emp[i] instanceof HourlyEmployee){
						System.out.println(emp[i].toString((HourlyEmployee)e[i]));
					}else if(emp[i] instanceof SalariedEmployee){
						System.out.println(emp[i].earnings((SalariedEmployee)e[i]));
					}*/
				
				emp[i].toString(emp[i]);
				System.out.println(emp[i].getName()+"生日:"+emp[i].getBirthday().toDateString(e[i].getBirthday()));
				if(emp[i].getBirthday().getMonth()==x){
					System.out.println("请给"+emp[i].getName()+"增加工资!!!!");
				}
		}		
	}
}
