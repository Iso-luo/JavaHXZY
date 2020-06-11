//replace()的使用
class Demo{
	public static void main(String[] args){
		String s = " sdasds".replace("a","   ");//参数列表(需要被替换的字符,替换成什么),其中替换成什么,如果是空格,每个空格占字符数组的一位
		System.out.println(s.toCharArray());		
	}
}