//字符串的比较

class Demo{
	public static void main(String[] args){
	
		/*由于字符串常量池的存在,同一内容(同值)的字符串的地址(地址值)是一样的
		即s1==s2(==比较的是地址值)，s1.equals(s2)返回true(equals比较的是字符串的内容)
		*/								
		String s1 ="aa"; 
		String s2 ="aa";
		String s3 ="bb";
		
		//[new String();]的含义为:在堆内存开辟一个新的空间,即任何两个new出来的地址值一定是不一样的,然后将匿名对象"aa"放进String这个无参构造器中
		String ss  = new String("aa");/*其中"aa"为一个匿名对象,new String("aa")也为一个匿名对象,
										但由于匿名对象【new String("aaa")】被起了一个名字叫x,此时的new String("aa");
										就变成了有名字的对象*/
		String sss = new String("aa");
		
		System.out.println(s1.equals(s2));//两字符串的内容相同
		System.out.println(s1.equals(s3));//两字符串的内容不相同
		System.out.println("==================");
		
		//创建字符串的时候  字符串常量池
		
		System.out.println(s1 == s2);//两字符串的地址值一样,原因存在【字符串常量池】,只要不是新创建的对象，同一个字符串可以起不同的名字
		System.out.println(s1 == s3);//两字符串的地址值不一样
		System.out.println("==================");
		
		System.out.println(ss.equals(sss));//ss和sss的区别在于将内容相同的字符串值放入两个不同的地址值中
		System.out.println(ss == sss);//new的对象其地址值一定不同
		System.out.println("==================");
		System.out.println(s1 == sss);
	}
}