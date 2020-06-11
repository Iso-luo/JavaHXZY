//选择题:	8.方法fun()如何来访问变量m（D） 知识点

class T{
	private int n;//无法从静态上下文引用非静态变量n
	private static int m; 
	
	int getN(){
		return this.n;
	}
	public static void fun(){	//静态的fun()能够访问到变量m的条件是m也是静态的
		System.out.println(m);
	}
}
class Test{
	public static void main(String[] args){
		T t=new T();
		T.fun();
		System.out.println(t.getN());//非静态的变量n,需要用get方法获取后，在用创建的对象调用，才能获取
		
	}
}
