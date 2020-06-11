/*
1.实现如图之间的继承关系，并编写Music类来测试这些类
	传递一个父类的方法 调用子类的方法
	这个没有弄出来。
*/

class Instrument{
	void play(){
		System.out.println("弹奏乐器");
	}
}

class Wind extends Instrument{
	void play(){				//重写
		System.out.println("弹奏wind");
	}
	void play2(){				//新增
		System.out.println("调用wind的play2");
	}	
}

class Brass extends Instrument{
	void play(){				//重写
		System.out.println("弹奏brass");
	}
	void play2(){				//新增
		System.out.println("调用brass的play2");
	}
}

class Music{	
	public static void tune(Instrument i){	//【方法】tune 是方法名;参数列表里的Instrument是类型,i是名称
		i.play();		//实现：调用对象i的play方法
       
		Wind w =(Wind) i;
		w.play2();
		
		Brass b  = (Brass) i;//强制类型转换
		b.play2();
	}
	
	public static void main(String[] args){
				
		Instrument w=new Wind();//【父类的引用 指向 子类对象的实例】创建wind类型的一个对象w 
		tune(w);				//调用tune方法
		/*
		w.play();	//对象w引用wind类play()功能
		w.play2();	//对象w引用wind类play2()功能
		*/
		
		System.out.println("----------------");
		Instrument b=new Brass();//【父类的引用 指向 子类对象的实例】创建brass类型的一个对象b
		tune(b);				 //调用tune方法
		

		/*Instrument i=new Instrument();	
		tune(i);*/
	}
}