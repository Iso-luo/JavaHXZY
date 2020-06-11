import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


abstract class Employee{
	private String name;		//名字
	private int number;			//编号
	private MyDate birthday;	//出生日期
	Employee(){}   
	Employee(String name,int number,MyDate birthday){
		this.name=name;	
		this.number=number;
		this.birthday=birthday;
	}
	abstract int earnings();     //抽象方法
	public String toString(){
		return "姓名："+getName()+"  员工编号："+getNumber()+"  出生日期："+birthday.toDateString();
	}
	String getName(){
		return this.name;
	}
	int getNumber(){
		return this.number;
	}
	MyDate getBirthay(){
		return this.birthday;
	}
	
	void setName(String name){
		this.name=name;
	}
	void setNumber(int number){
		this.number=number;
	}
	void setBirthay(MyDate birthday){
		this.birthday=birthday;
	}
}	
class MyDate{
	private int year,month,day;
	MyDate(){}
	MyDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	int getYear(){
		return this.year;
	}
	int getMonth(){
		return this.month;
	}
	int getDay(){
		return this.day;
	}
	
	void setYear(int year){
		this.year=year;
	}
	void setMonth(int month){
		this.month=month;
	}
	void setDay(int day){
		this.day=day;
	}
	
	
	String toDateString(){
		return getYear()+"年 "+this.getMonth()+"月 "+this.getDay()+"日";
	}
}

class SalariedEmployee extends Employee{
	private int monthlySalary;//月薪
	SalariedEmployee(){
		super();
	}
	SalariedEmployee(String name,int number,MyDate birthday,int monthlySalary){
		super(name,number,birthday);
		this.monthlySalary=monthlySalary;
	}
	
	int getMonthlySakary(){
		return this.monthlySalary;
	}
	void setMonthaySalary(int monthlySalary){
		this.monthlySalary=monthlySalary;
	}
	int earnings(){   //工资
		return getMonthlySakary();
	}    
	public String toString(){
		return "合同工  "+super.toString();
	}
}


class HourEmployee extends Employee{
	private int wage,hour;
	HourEmployee(){
		super();
	}
	HourEmployee(String name,int number,MyDate birthday,int wage,int hour){
		super(name,number,birthday);
		this.wage=wage;
		this.hour=hour;
	}
	//小时工工资
	int earnings(){
		return this.getWage()*getHour();
	}
	public String toString(){
		return "小时工  "+ super.toString();
		//return "合同工  "+"姓名："+getName()+"  员工编号："+getNumber()+"  出生日期："+birthay.toDateString();
	}
	int getWage(){
		return this.wage;
	}
	int getHour(){
		return this.hour;
	}
	void setWage(int wage){
		this.wage=wage;
	}
	void setHour(int hour){
		this.hour=hour;
	}

}
class PayrollSystem{
	Employee[] createEmployARR (Employee e ,Employee[] empArr){
		
		for(int x;x<empArr.length;x++){
			empArr[x]=e;
		}
		return empArr;
	}
	Employee getE(){
		///从数据库里面读出来数据 JDBC  IO
		
		Employee e  =  new Employee();
		return  e;
	}
	
	public static String getStringDate() {  
		Date currentTime = new Date();  
	
		SimpleDateFormat formatter = new SimpleDateFormat("MM");  
		String dateString = formatter.format(currentTime);  
		return dateString;  
		
	}
	
	
	boolean judegment(Employee e){
		String date_str = PayrollSystem.getStringDate();
		char[] x = date_str.toCharArray();
		String r = x[1]+"" ;
		currentMonth =  Integer.parseInt(r);
		
		if(e != null){
			if(  e.getMonth()  == currentMonth ){			
				e.earnings()+100;
			}	
		}				
		return false;	
	}	
}

class Test{
	public static void main(String[] args){
		/*
		Employee[] emp= new Employee[6];
		emp[0]=new SalariedEmployee("赵十一",001,new MyDate(1990,2,17),4000); 
		emp[1]=new SalariedEmployee("赵十二",002,new MyDate(1991,4,27),5000);
		emp[2]=new SalariedEmployee("赵十三",003,new MyDate(1992,6,11),6000);
		
		emp[3]=new HourEmployee("十一",004,new MyDate(1980,3,17),40,2); 
		emp[4]=new HourEmployee("十二",005,new MyDate(1981,5,27),50,3);
		emp[5]=new HourEmployee("十三",006,new MyDate(1982,7,11),60,5);
		
		System.out.println("请在控制台输入月份");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		System.out.println("****************************财务单****************************");
		System.out.println();
		for(int x=0;x<emp.length;x++){
			if(emp[x].getBirthay().getMonth() == y){
				System.out.println("--------------------------------------------------------------");
				System.out.println(emp[x].toString());
				System.out.println();
				System.out.println("生日 工资加一百");
				System.out.println();
				System.out.println("实得工资："+(emp[x].earnings()+100));	
				System.out.println("--------------------------------------------------------------");
			}else{
				System.out.println(emp[x].toString());
				System.out.println("实得工资："+emp[x].earnings());	
			}
			System.out.println();
		}
		System.out.println("**************************************************************");
	
		*/
		Employee[] emp= new Employee[6];
		PayrollSystem ps =  new PayrollSystem()
		
		emp = ps.createEmployARR(emp);
		
		emp.judegment()
	}

}
