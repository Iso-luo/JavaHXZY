/*
04.构造方法
编写Java程序模拟简单的计算器。
定义名为Number的类,其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
再为该类定义加addition、减subtration、乘multiplication、除division等公有成员方法
分别对两个成员变量执行加、减、乘、除的运算。
在main方法中创建Number类的对象调用各个方法并显示计算结果。
*/

class Number{
	private int n1;
	private int n2;
	
	Number(){}
	Number(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	
	int getN1(){
		return this.n1;
	}	
	int getN2(){
		return this.n2;
	}
	
	void setN1(int n1){
		this.n1=n1;
	}
	void setN2(int n2){
		this.n2=n2;
	}
	
		
	int addition(){
		return this.n1+this.n2;
	}
	int subtration(){
		return this.n1-this.n2;
	}
	int multiplication(){
		return this.n1*this.n2;
	}
	double division(){
		return (double)this.n1/(double)this.n2;
	}
}
class Test{
	public static void main(String[] args){
		Number n=new Number(3,4);
		System.out.println(n.getN1()+"+"+n.getN2()+"="+n.addition());
		n.setN1(5);
		n.setN2(10);
		System.out.println(n.getN1()+"-"+n.getN2()+"="+n.subtration());
		n.setN1(12);
		n.setN2(23);
		System.out.println(n.getN1()+"/"+n.getN2()+"="+n.division());
		n.setN1(7);
		n.setN2(8);
		System.out.println(n.getN1()+"*"+n.getN2()+"="+n.multiplication());
	}
}