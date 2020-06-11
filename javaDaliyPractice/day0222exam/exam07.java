/*07.构造方法与重载
为"无名的粉"写一个类class WuMingFen 要求:
1.有三个属性 面码:String theMa,粉的分量(两) int quantity,  是否带汤 boolean likeSoup
2.写一个构造方法,以便于简化初始化过程?????????????,如 WuMingFen f1 = new WuMingFen("牛肉",3,true);
3.重载构造方法 使得初始化过程可以多样化 WuMingFen f2 = new WuMingFen("牛肉",2);
4.如何使得下列语句构造出来的粉对象是:
			酸辣面码,2两,带汤的 WuMingFen f3 = new WuMingFen(); 
5.写一个普通方法 check() 用于查看粉是否符合要求。即:将对象的三个属性打印在控制台上。*/

class WuMingFen{
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	
	WuMingFen(){}
	WuMingFen(String theMa,int quantity){//重载构造方法
		this.theMa=theMa;
		this.quantity=quantity;
	}
	WuMingFen(String theMa,int quantity,boolean likeSoup){
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}
	
	String getTheMa(){
		return this.theMa;
	}
	void setTheMa(String theMa){
		this.theMa=theMa;
	}
	int getQuantity(){
		return this.quantity;
	}
	void setQuantity(int quantity){
		this.quantity=quantity;
	}
	boolean getLikeSoup(){					//返回true或false
		return this.likeSoup;
	}
	void setLikesoup(boolean likeSoup){
		this.likeSoup=likeSoup;
	}	
	
	void judgment(WuMingFen f){				//判断是否带汤并输出
		if(f.getLikeSoup()){				//if(创建的f对象调用F类的getLikesoup()得到true或flase)
			System.out.println("带汤的");
		}else{
			System.out.println("不要汤");
		}
	}
}
class Test{
	public static void main(String[] args){
		WuMingFen f1 = new WuMingFen("牛肉",3,false);		
		WuMingFen f2 = new WuMingFen("牛肉",2);	
		WuMingFen f3 = new WuMingFen();
		f3.setTheMa("酸辣面");
		f3.setQuantity(2);
		f3.setLikesoup(true);
		
		System.out.print(f1.getTheMa()+",");
		System.out.print(f1.getQuantity()+"两"+",");
		f1.judgment(f1);						//调用判断
	
		System.out.print(f2.getTheMa()+",");
		System.out.println(f2.getQuantity()+"两");
		
		System.out.print(f3.getTheMa()+",");
		System.out.print(f3.getQuantity()+"两"+",");
		f3.judgment(f3);						//调用判断
	}
}

