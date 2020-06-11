/*
8.(图在题目上)
Account 表示银行账户,id 属性表示账户id,balance 表示账户余额,password 表示账户密码;
SavingAccount 表示储蓄账户,interestRate 表示存款利率;
CreditAccount 表示信用账户,creditLine 表示信用额度.
完成下列任务：
1） 所有属性都应设为私有，根据需要增加构造方法和get/set 方法。
2） *修改setPassword 方法，要求：
setPassword 判断新密码长度是否是6 位，如果不是则不予修改；
修改getPassword 方法，要求每次都返回null 值。  				不会null！！！！！
3） *修改interestRate 的set 方法，要求利率大于0 并小于10%。

10.创建一个Bank 类，其中包括三个方法：开户、存款、取款
a) 开户方法
Account openAccount(long id, String password, int type)
其中,id 表示账户id,password 表示账户密码,type 表示账户类型.
如果type为0则创建一个Account 账户,
如果type为1则创建一个储蓄账户SavingAccount,
如果type为2则创建一个信用账户CreditAccount.
返回值为开户时创建的Account对象
b) 存款方法
double deposit(Account a, double amount)
其中,a 表示存入账号,amount 表示存入的金额.返回值表示存款之后的余额
c) 取款方法
double withdraw(Account a, double amount)
其中，a 表示取款账号，amount 表示取出的金额，返回值表示取款之后的余额。
特别的，除非Account 类型是CreditAccount，否则不允许透支。

*/
import java.util.Arrays; //导包
class Bank {			  	 //银行类
	private int type;	  	 //成员属性:类型
	private double amount;	 //成员属性:存入或取出的金额
	private long id;		 //成员属性:账户id
	private String password; //成员属性:账户密码	
	private double balance;  //成员属性:账户余额
	
	double getBalance(){
		return balance;
	}
	void setBalance(double balance){
		this.balance=balance;
	}
	int getType(){
		return this.type;
	}
	void setType(int type){
		this.type=type;
	}
	double getAmount(){
		return this.amount;
	}
	 void setAmount(double amount){
		 this.amount=amount;
	}
	long getId(){
		return this.id;
	}
	void setId(long id){
		this.id=id;
	}	
	
	String getPassword(){	//修改getPassword 方法，要求每次都返回null 值。				
		return this.password;
	}
	void setPassword(String password){
		String[] arr=password.split("");//字符串转化成数组
		//Arrays.toString(arr);
		//System.out.println(arr.length);//这个用来测试一下这样写对不对 是不是数组长度
		if (arr.length==6){
			this.password=password;			
		}else if(arr.length!=6){
			System.out.println("请输入六位密码!!否则不予修改");
		}
		//System.out.println(Arrays.toString(arr));
		//this.password=password;
	}
	
	
	
	Bank(){																 //无参构造函数
		super();
	}
	Bank(long id,double balance,String password){						 //2参构造函数
		this.id=id;
		this.balance=balance;
		this.password=password;	
	}
	Bank(int type, double amount, long id,double balance,String password){//全参构造函数
		this.type=type;
		this.amount=amount;
		this.id=id;		
		this.balance=balance;
		this.password=password;	
	}
	
	Account openAccount(long id, String password, int type){
		setPassword(password);
		setId(id);


																		  /*开户方法	:	如果type为0则创建一个Account 账户,
																			如果type为1则创建一个储蓄账户SavingAccount,
																			如果type为2则创建一个信用账户CreditAccount.
																			返回值为开户时创建的Account对象*/
		Account a=null;																	
		if(type==0){
			a=new Account();
		}else if(type==1){
			a=new SavingAccount();
		}else if(type==2){
			a=new CreditAccount();
		}
		return a;
		
	}	
	double deposit(Account a, double amount){			//a 表示存入账号(这个类型包含了三个参数呢),amount 表示存入的金额.返回值表示存款之后的余额		
		double x;		
		x=this.balance + amount;						//存款之后的余额：原来的余额+存入的金额
		setBalance(x);
		setAmount(amount);			//在这里新加一个setAmount()方法,以便Test{}中显示
		return x;
	}
		
	double withdraw(Account a, double amount){			//a 表示取款账号，amount 表示取出的金额，返回值表示取款之后的余额。特别的，除非Account 类型是CreditAccount，否则不允许透支。
		//this.balance-amount;							//取款之后的余额：原来的余额-取出的金额
		double x;
		x=this.balance-amount;
		setBalance(x);
		setAmount(amount);
		return x;
    }
}
class Account extends Bank{							//银行账户类	
	Account(){										//无参构造函数
		super();
	}											
	Account(long id,double balance,String password){//3参构造函数
		super(id,balance,password);			
	}	
}

class SavingAccount extends Account{ 				//储蓄账户类
	private double interestRate;					//成员属性存款利率
	
	double getInterestRate(){
		return interestRate;
	}	
	void setInterestRate(double interestRate){		//利率大于0 并小于10%
		if (interestRate>0 &&interestRate<0.1){
			this.interestRate=interestRate;
		}else{
			System.out.println("请输入正确的利率");
		}		
	}
	
	SavingAccount(){															//无参构造函数
		super();
	}
	SavingAccount(long id,double balance,String password,double interestRate){	//4参构造函数
		super(id,balance,password);
		this.interestRate=interestRate;
	}
	
}
class CreditAccount extends Account{ //类：信用账户
	private double creditLine;		 //成员属性信用额度	
	
	CreditAccount(){														//无参构造函数
		super();
	}
	CreditAccount(long id,double balance,String password,double creditLine){//4参构造函数
		super(id,balance,password);
		this.creditLine=creditLine;
	}		
}


class Test{
	public static void main(String[] args){
		
		/*Account a=new Account();
		a.setPassword("1234567");
		System.out.println("密码为："+a.getPassword());
		System.out.println("------------分割线-------------");
		a.setPassword("666666");		
		System.out.println("密码为："+a.getPassword());
		System.out.println("------------分割线-------------");
		SavingAccount sa=new SavingAccount();
		sa.setInterestRate(0.2);
		System.out.println("利率为："+sa.getInterestRate());
		System.out.println("------------分割线-------------");
		sa.setInterestRate(0.05);
		System.out.println("利率为："+sa.getInterestRate());
		System.out.println("------------分割线-------------");
		System.out.println("------------分割线-------------");
		*/
		
		Bank b=new Bank(0,0.0,001L,0.0,"000000");//Bank(int type, double amount, long id,double balance,String password)
		
		Account account=b.openAccount(888L,"123456",1);//开户openAccount(long id, String password, int type)	在开户的时候就是重置了id、密码和账户类型
		System.out.println("当前存入："+b.getAmount());
		System.out.println("当前id："+b.getId());
		System.out.println("当前余额："+b.getBalance());
		System.out.println("用户密码："+b.getPassword());
		
		double w1=b.withdraw(account,1.0);
		if(account instanceof CreditAccount){											//判断账户类型
			if(w1>=0){
				System.out.println("取款"+b.getAmount()+"后,账户余额为:"+w1);
			}else{
				System.out.println("取款"+b.getAmount()+"后,账户余额为0,不可透支");
			}
		}else{
			System.out.println("取款"+b.getAmount()+"后,账户余额为:"+w1);
		}
		double w2=b.deposit(account,666);
		System.out.println("存款"+b.getAmount()+"后,账户余额为:"+w2);//deposit(Account a, double amount)		
	}	
}