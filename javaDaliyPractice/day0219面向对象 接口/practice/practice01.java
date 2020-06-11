/*1.设计一个商品类 字段：商品名称，重量，价格，配件数量，
配件制造商(这个是数组，因为可能有多个制造厂商)
要求：有构造函数

难点：类中包含数组
*/
import java.util.Scanner;
class Commodity{
	
	private String name;
	private double weight;
	private double price;
	private int accessories;
	private String[] manufacturer=new String[3]; //数组成员属性 一定要写后半部分才能在堆内存中开辟出相应的存储空间
												 //????????如何写不同长度的数组?????????????????
	String getName(){
		return this.name;
	}
	void setName(String name){
		this.name=name;
	}
	double getWeight(){
		return this.weight;
	}
	void setWeight(double weight){
		this.weight=weight;
	}
	double getPrice(){
		return this.price;
	}
	void setPrice(double price){
		this.price=price;
	}
	int getAccessories(){
		return this.accessories;
	}
	void setAccessories(){
		 this.accessories=accessories;
	}
	
	String[] getManufacturer(){  						//获取字符串数组		
		String[] arr=new String[this.manufacturer.length];
		for(int i=0;i<this.manufacturer.length;i++){
			arr[i]=this.manufacturer[i];
		}
		return arr;										//返回一个字符串数组arr
	}
	void setManufacturer(String[] manufacturer){		//设置字符串数组
		for(int i=0;i<manufacturer.length;i++){			//给数组依次赋值
			this.manufacturer[i]=manufacturer[i];
		}	
	}
	

	Commodity(){}
	Commodity(String name,double weight,double price,int accessories,String[] manufacturer){
		this.name=name;
		this.weight=weight;
		this.price=price;
		this.accessories=accessories;
		this.manufacturer=manufacturer;				//这里数组直接写数组名称没问题
	}
		
}
class Test{
	public static void main(String[] args){
		
		
		String[] arr ={"供应商A","供应商B","供应商C"};
		Commodity c=new Commodity("电脑",20.56,1000,4,arr);
		
		System.out.println("产品名称:"+c.getName());
		System.out.println("重量:"+c.getWeight());
		System.out.println("价格:"+c.getPrice());
		System.out.println("零件数量:"+c.getAccessories());
		
		System.out.println("供应商依次为:");
		String[] arr1=c.getManufacturer();	//在栈内存新建一个arr1来接收对象c调用的Commodity类中的字符串数组
		for(int i=0;i<arr1.length;i++){		//打印出该字符串数组
			if(i<arr1.length-1){
				System.out.print(arr1[i]);
			}else{
				System.out.print(arr1[i]+"\n");
			}			
		}
		System.out.println("更新后为:");
		String[] arr2 ={"AAA","BBB","CCC"}; //重新设置供应商的信息的字符串数组
		c.setManufacturer(arr2);			//【注】arr2一定要在外面先创建并赋值，c.setManufacturer({"AAA","BBB","CCC"})不能这样写！！
		
		String[] arr3=c.getManufacturer();	//得到新的字符串数组
		for(int i=0;i<arr1.length;i++){		//打印出该字符串数组
			System.out.print(arr3[i]);
		}
	}
}