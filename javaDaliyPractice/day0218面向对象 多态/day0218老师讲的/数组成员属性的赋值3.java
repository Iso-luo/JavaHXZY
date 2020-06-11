//【习题讲解】[day0215exam]2.指出下列程序运行的结果 【单项选择题】

class E{
	
	char[] ch={'a','b','c'}; 					//成员属性	
	void change(char ch[]){ 					//成员方法		
		System.out.println(ch);					//打印的change的参数值			
		for(int x=0;x<ch.length;x++){	
			System.out.print(ch[x]+"-");
		}
		System.out.println("\n"+"修改第0位的元素后：");
		
		//char[] ch2 = {'c','b','a'};
		ch[0]='g';//给字符数组里的某一元素赋值，则不用this.也可以直接给成员属性中的数组元素重新赋值，即打印出的成员属性ch[0],就是g不再是a
		//ch = ch2;
		for(int x=0;x<ch.length;x++){
			System.out.print(ch[x]+"*");
		}
		System.out.println("\n"+"-------分割线-------");
	}
}
class Test{
		public static void main(String[] args){	
		E e = new E();		
		e.change(e.ch);	
		
		char[] ch1={'c','b','a'};//【此处删掉 来测试不整体给字符数组赋值】 如果这样用change给整体字符数组进行赋值又不加this.,则新的char[]无法传递给成员属性中的数组，打印的还是原数组
		e.change(ch1);
		
		for(int i=0;i<e.ch.length;i++){
			System.out.print(e.ch[i]);//这个打印的结果是更改后的成员属性的值gbc，change方法改变原始的成员属性			
		}		
	}	
}