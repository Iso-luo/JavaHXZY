/*

没写判断条件！！！时分秒都是有范围的！！！

03.类的成员变量与方法、构造方法
在程序中经常要对时间进行操作但是并没有时间类型的数据，
那么我们可以自己实现一个时间类来满足程序中的需要：
定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
为了保证数据的安全性这三个成员变量应声明为私有。
为MyTime类定义构造方法以方便创建对象时 初始化成员变量。
再定义display方法用于将时间信息打印出来。
为MyTime类添加以下方法 addSecond(int sec);addMinute(int min);addHour(int hou)
subSecond(int sec);subMinute(int min);subHour(int hou) 分别对时、分、秒进行加减运算。
*/

class MyTime{
	private int hou;
	private int min;
	private int sec;
	
	MyTime(){}
	MyTime(int hou,int min,int sec){
		this.hou=hou;
		this.min=min;
		this.sec=sec;
	}
	
	void setHour(int hou){
		this.hou=hou;
	}
	void setMinute(int min){
		this.min=min;
	}
	void setSecond(int sec){
		this.sec=sec;
	}
	
	int getHour(){
		return this.hou;
	}
	int getMinute(){
		return this.min;
	}
	int getSecond(){
		return this.sec;
	}
	
	void display(){
		System.out.println("时间为："+this.hou+"时"+this.min+"分"+this.sec+"秒");
	}
	
	int addHour(int hou){	//加 时
		this.hou=this.hou+hou;
		return this.hou;
	} 
	int addMinute(int min){	//加 分
		this.min=this.min+min;
		return this.min;
	} 
	int addSecond(int sec){	//加 秒
		this.sec=this.sec+sec;
		return this.sec;
	} 
	int subHour(int hou){	//减 时
		this.hou=this.hou-hou;
		return this.hou;
	} 
	int subMinute(int min){	//减 分
		this.min=this.min-min;
		return this.min;
	} 
	int subSecond(int sec){	//减 秒
		this.sec=this.sec-sec;
		return this.sec;
	} 
}
class Test{
	public static void main(String[] args){
		MyTime mt=new MyTime(3,4,5);
		mt.display();
		System.out.print("--初始化后--");
		mt.setHour(0);
		mt.setMinute(0);
		mt.setSecond(0);
		mt.display();
		System.out.println("--------对时间进行计算-------");
		mt.addHour(1);
		mt.addMinute(2);
		mt.addSecond(3);
		System.out.println("小时更新为"+mt.getHour());
		System.out.println("--新的时间--");
		mt.display();
		mt.subHour(1);
		mt.subMinute(2);
		mt.subSecond(3);
		System.out.println("小时更新为"+mt.getHour());
		System.out.println("--新的时间--");
		mt.display();
		
		
	}
}