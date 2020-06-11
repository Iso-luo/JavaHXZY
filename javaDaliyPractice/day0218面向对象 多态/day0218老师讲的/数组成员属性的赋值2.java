//【习题讲解】[day0215exam]2.指出下列程序运行的结果 【单项选择题】

class E{
	String str= "good";		 //成员属性
	char[] ch={'a','b','c'}; //成员属性	
	void change(String str,char ch[]){ 		//成员方法
		System.out.println("---测试---"+str);	//即打印的change的参数值
		System.out.println("---测试---"+ch);	//即打印的change的参数值
		str ="test ok";						//给该方法的参数str赋值,但由于没有this.所以并没有改变成员属性的值
		System.out.println("---测试---"+str);//此处的打印结果是 test ok 说明在该方法中 已经成功给str赋值			
		System.out.println("修改之前");//测试修改之前
		
		for(int x=0;x<ch.length;x++){	
			System.out.print(ch[x]+"   ");
		}
		System.out.println("----------------");
		
		//char[] ch2 = {'c','b','a'};
		ch[0]='g';//给字符数组里的某一元素赋值，则不用this.也可以直接给成员属性中的数组元素重新赋值，即打印出的成员属性ch[0],就是g不再是a
		//ch = ch2;

		System.out.println("修改之后");
		for(int x=0;x<ch.length;x++){
			System.out.print(ch[x]+"   ");
		}
		System.out.println("----------------");	
	}
}
class Demo{
		public static void main(String[] args){	
		E e = new E();
		//char[] ch_a={'c','b','a'};//【此处删掉 来测试不整体给字符数组赋值】 如果这样用change给整体字符数组进行赋值又不加this.,则新的char[]无法传递给成员属性中的数组，打印的还是原数组
		e.change("aaaa",e.ch);		
		System.out.println(e.str);	//e调用的是成员属性,而非change的参数列表当中的str值
		for(int i=0;i<e.ch.length;i++){
			System.out.print(e.ch[i]);//这个打印的结果是更改后的成员属性的值，change方法改变原始的成员属性	
		}		
	}	
}