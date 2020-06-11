/*
4.要求输入一组英文字符串数组，让这个字符串数组中:
前面一个元素的最后一个字母和下一个元素的首位上的字母相等，(这里不会！！！)
且每个元素的长度大于等于2且小于等于100。
(一维数组)

没读懂题目！！
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){	
	
		Scanner sc=new Scanner(System.in);	//创建对象	
		System.out.print("请输入数组长度");		
		String[] s=getArray(sc.nextInt());	//定义一个 字符串数组s，用getArray()函数将字符串依次放入数组s
		printArr(s);
		
		
		
	}
	
	public static void printArr(String[] arr){		//变量printArr的参数为一个 字符串数组arr
		System.out.print("[");
		for(int i=0;i<arr.length;i++){				//输出次数为数组长度
			if(i<arr.length-1){
				System.out.print(arr[i]+",");		//依次输出每位上的字符串arr[i]
			}else{
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
	
	
	
	
	public static String[] getArray(int arr_length){  //变量getArray的参数为 字符串数组arr 的 长度arr_length
		Scanner sc=new Scanner(System.in);		//创建对象
		String[] arr=new String[arr_length];	//字符串数组arr[]一共有几位		
		for(int i=0;i<arr.length;i++){			//（循环）录入次数为数组长度
			System.out.print("请输入第"+(i+1)+"个元素");
			arr[i]=sc.nextLine();				//依次录入每位上的字符串arr[i]
			//int a=arr[i].length();				    //必须有()，表示数组中的一位元素arr[i]的长度
			if(2>arr[i].length() || arr[i].length()>100){ //或者不要参数直接带入arr[i].length()
				System.out.println("请按要求输入字符串");
			}		
		}		
		return arr;//返回字符串
								
	}	
}