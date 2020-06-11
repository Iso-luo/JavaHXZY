//append的使用
class A{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer();//原本new出来的对象sb应该带有地址值,可惜它的类型是StringBuffer,表明他是在缓冲区,并没有带地址值
		String s=sb.toString();//对象sb调用StringBuffer类的toString()方法转换成String类型的一个匿名对象,再取名为s.
		sb.append("haha");//返回值类型是StringBuffer
		
		System.out.println(s);//打印这个s是没有地址值的,所以打印出来什么也没有
		System.out.println(sb);//这个sb是创建的对象sb调用append方法在原缓冲区字符串的基础上追加了一个"haha",因此有值打印出来
			
	}
}