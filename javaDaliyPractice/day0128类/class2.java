//面向对象 第二节 计算三角形面积 周长


class Tr{								//这个人的类型
	int a;
	int b;
	int c;
	void getArea(int a,int b,int c){							//定义 一个方法。注意该方法不用加前面的public static，并且像打印功能一样 无返回
	    
		System.out.println("我能计算面积:"+a*b*0.5);
		
	}
	void getPerimeter(int a,int b,int c){						//定义 另一个方法。
		
		System.out.println("我能计算周长："+(a+b+c));
	}
	
}

class Myself{
	public static void main(String[] args){		//运行 要用main方法!!
		//实例化 人
		Tr t= new Tr();							//在Myself类型里 创建Tr类型的对象
		t.getArea(3,4,5);						//调用Tr类型的一个方法
		//System.out.print(t);
		
		t.getPerimeter(3,4,5);					//调用Tr类型的另一个方法
		//System.out.print(t);
	}
	
}	
