//成员内部类 创建对象的方法
class Out{
	private int x =3;
	private String name="cyx";
	
	class In{
		void show(int y){			
			x=y;
			System.out.println(x);
			System.out.println(name);//【注意】内部类可以无限制的访问外部类的私有属性！！
		}
	}
}

class Demo{
	public static void main(String[] args){
		Out out = new Out();		
		//对象的类型 对象名
		Out.In in  = out.new In();//创建一个内部类的对象  
		in.show(333);
		
		
		
		
		
		
		
		
		
		
	}
}
