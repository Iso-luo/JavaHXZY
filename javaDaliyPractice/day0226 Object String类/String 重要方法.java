class A{
	String str="   hahaHahaha.java  ";/*char[]  data= {' ', ' ', ' ','h','a','h'...};
										String str = new String(data);*/								
	int getSum(char[] value){
		int j=0;
		for(int i=0;i<value.length;i++){
			if(value[i]=='h'){
				j+=1;
			}
		}
		return j;
	}

	String firstStr="aaaa";
	String secondStr="vbbb";

}
class Demo{
	public static void main(String[] args){
		A  a=new A();
		System.out.println("转换成大写:"+a.str.toUpperCase());			//[实现]转换成大写
		System.out.println("转换成小写:"+a.str.toLowerCase());			//[实现]转换成小写
		System.out.println("去掉空格:"+a.str.trim());					//[实现]去掉空格【注意】字符串中间的空格不能去掉的！可以用replace去掉
		
		String str1 =a.str.trim();			//利用方法trim()去掉空格,并放到一个新的对象里 {'h','a','h','a','H','a'...}		
		char[] value=str1.toCharArray();	//把新字符串转换成字符数组
		
		//截取字符串方法一
		String str2=new String(value,0,4);/*
											利用 构造方法 String(char[] value, int offset, int count),创建一个新的对象str2,
											构造方法String()的参数，需要原始的字符数组，开始位0，截取长度4，即得haha
										  */
		System.out.println("方法一,只留前四:"+str2); 					//[实现]只想要前面haha
		String str3=new String(value,6,4);//参数列表(字符数组,从第六位开始,长度是四)
		System.out.println("方法一,只留后四:"+str3);					//[实现]只想要后面haha
		
		System.out.println("---------------------分割线-----------------------");	
		////截取字符串方法二
		System.out.println("方法二,只留前四:"+str1.substring(0,4));		//[实现]只想要前面haha参数列表（第0位，第4位）
		System.out.println("方法二,只留后四:"+str1.substring(6,10));	//[实现]只想要后面haha 参数列表（第六位，第十位）
		System.out.println("---------------------分割线-----------------------");	
		System.out.println("判断结尾条件:"+str1.endsWith(".java"));						//[实现]判断这字符串是否以.java结尾
		
		//codePointCount(int beginIndex, int endIndex);//[实现]统计h的个数 没这个方法 自己造一个
		System.out.println("统计h的个数:"+a.getSum(value));
		System.out.println("两个字符串的拼接:"+a.firstStr.concat(a.secondStr));//[实现]两个字符串的拼接
		
		//getBytes()
		
	}
}