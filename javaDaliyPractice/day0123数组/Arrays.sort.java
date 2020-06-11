//调用软件编好的程序 Array.toString和Array.sort 实现打印数组和数字排序
import java.util.Arrays;
class Demo{
	public static void main(String[] args){
	
		int[] arr={1,4,4,5,5,6,2};	

		String s1=Arrays.toString(arr);	
	
		System.out.println(s1);
	
		sort(arr);	//这是一个无返回值的方法 所以 不是 用int[] x=sort(arr)再调用x。
	
		System.out.println(Arrays.toString(arr));  //其中的arr是被sort方法操作后的arr，不是一开始的arr
	}
	public static void sort(int[] x){	//方法
		Arrays.sort(x);					//sort包没有返回值void 不要return
	}	