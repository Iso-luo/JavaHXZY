//16.输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数.

import java.util.Scanner;
class Exam{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//System.out.print("请输入字符串的长度");
		//int l=sc.nextInt();
		char[] arr1=getArr();
		printArr(arr1);
		getLetterNum(arr1);
		
	}
		public static void getLetterNum(char[] arr){
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			for(int i=0;i<arr.length;i++){
				if((65<=(int)arr[i] && (int)arr[i]<=90) || (97<=(int)arr[i] && (int)arr[i]<=122)){//英文字母
					a+=1;
				}else if(49<=(int)arr[i] && (int)arr[i]<=57){//数字
					b+=1;
				}else if((int)arr[i]==32){
					c+=1;
				}else{
					d+=1;
				}
			}
			System.out.println("共有"+a+"个英文字母");
			System.out.println("共有"+b+"个数字");
			System.out.println("共有"+c+"个空格");
			System.out.println("共有"+d+"个其他字符");
			
		}
		
		public static void printArr(char[] arr){
			System.out.print("[");
			for(int i=0;i<arr.length;i++){
				if(i<arr.length-1){
					System.out.print(arr[i]+",");
				}else{
					System.out.println(arr[i]+"]");
				}
			}
		}
		
		/*
		public static char[] getChar(int arr_length){	//注意 char可以与int转换 String不行的	
			char[] arr=new char[arr_length];			这个方法不能键盘录入空格
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<arr.length;i++){
				System.out.println("请输入第"+(i+1)+"个字符");
				//获取
				arr[i]=sc.next().charAt(0);	
			}
		return arr;	
						
		}
		*/
		
		public static char[] getArr(){					//不需要数组长度的参数 int arr_length
			//char[] arr=new char[arr_length];不需要
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();						//键盘录入字符串
			char x[]=s.toCharArray(); 					//利用toCharArray方法转换
			return x;
		}
		
		
}