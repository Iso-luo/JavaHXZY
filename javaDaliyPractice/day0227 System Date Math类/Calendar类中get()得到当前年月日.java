//Calendar类中方法的使用
import java.util.Calendar;
class A{
	public static void main(String[] args){
		
		java.util.Calendar c =java.util.Calendar.getInstance();//java.util.Calendar如果直接写绝对路径就可以不用导包,创建对象
		System.out.println("Calendar的一个对象包含的所有信息:\n"+c);
		
		//错误使用方式(无法打印出想要的当前年月日)的演示：
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DAY_OF_MONTH);
		
		int year = c.get(Calendar.YEAR);		//用Calendar类中的get(filed)方法得到 当前年
		//calendar 返回的月份要+1
		int month = c.get( Calendar.MONTH +1);	//用Calendar类中的get(filed)方法得到 当前月
		int day = c.get(Calendar.DAY_OF_MONTH);	//用Calendar类中的get(filed)方法得到 当前日
		
		System.out.println(year+"年"+month+"月"+day+"日");
	
		//作业：calendar --->date  --> " 年-月-日 时分秒"
	}
	
}