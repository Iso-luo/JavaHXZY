//StringBuffer的理解
class A{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer();	//创建一个新的对象sb,由于类型是StringBuffer,表明他是在缓冲区,所以在堆内存中没有对象空间
		sb.append("hahaha");				//给sb追加了一个字符串"hahaha"(有内容了),返回的StringBuffer类型
		String s=new String(sb);			//创建一个String对象,把sb从缓冲区移出来,放入堆内存中
		String s1="a";
		
		System.out.println(s);//
		System.out.println(sb);//可打印出新的内容
		System.out.println(s1);//	
	}
}