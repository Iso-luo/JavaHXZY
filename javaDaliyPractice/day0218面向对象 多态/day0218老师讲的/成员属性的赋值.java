//【习题讲解】[day0215exam]2.指出下列程序运行的结果 【单项选择题】

class Example{
	String str=new String("good");//成员属性
	char[]ch={'a','b','c'}; 	//成员属性
	
	public static void main(String args[]){ //执行
		Example ex=new Example();
		ex.change(ex.str,ex.ch);//Example类的对象ex调用类中的方法change(),该方法含参，第一个参数为 对象ex调用成员属性str;第二个参数为 ex调用成员属性[]ch
		System.out.print(ex.str+" and ");//执行打印ex调用的成员属性str其值为"good"
		
		for(int i=0;i<ex.ch.length;i++){//执行给字符数组ch赋值，
			System.out.print(ex.ch[i]);
		}
	}
	
	public void change(String str,char ch[]){//
		str="test ok";//给成员属性赋值 必须加this.
		ch[0]='g';//给成员属性中的字符数组中的单一元素重新赋值 可以直接标出赋值
	}
}