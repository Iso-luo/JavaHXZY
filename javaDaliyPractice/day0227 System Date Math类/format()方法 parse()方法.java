/*Date类及SimpleDateFormat类
format()方法及parse()方法的使用*/

import java.util.Date;				//导包
import java.text.SimpleDateFormat;  //导包

class A{
	public static void main(String[] args){
		Date d = new Date();			
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); /*利用SimpleDateFormat的重载构造函数中的
																				SimpleDateFormat(String pattern) */
		System.out.println(sdf.format(d)); //SimpleDateFormat的动态方法format(),该方法在新版本里面有很多重载方法,可在源代码中查
		String str = "2019-02-27 16:39:46";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf1.parse(str); //SimpleDateFormat类中的动态方法parse(字符串),用SimpleDateFormat创建的一个对象调用该方法,返回一个Date类型的值
		System.out.println(dd);
	}
}