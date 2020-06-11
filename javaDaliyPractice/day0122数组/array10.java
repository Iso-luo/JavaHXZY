//输入10个整数存入数组，然后复制到b数组中输出 还没做复制到b

import java.util.Scanner;//导包
class Copy{
	public static void main(String[] args){
	
		int[] arr1=getArray();					//复制到b数组中输出
		int i=0;
		System.out.print("[");
		for(i=0;i<=arr1.length-1;i++){
			if(i<arr1.length-1){
				System.out.print(arr1[i]);
				System.out.print(",");
			}
			if(i==arr1.length-1){
				System.out.print(arr1[i]);
				System.out.print("]");			//复制到b数组中输出
			}
		}
	}
	
	

	
		
	
	public static int[] getArray(){			//输入10个整数存入数组
		
		int[] arr={0,0,0,0,0,0,0,0,0,0,};
		
		int x=0;
		
		Scanner sc=new Scanner(System.in);//创建对象
		System.out.print("[");
		for(x=0;x<=arr.length-1;x++){
			if(x<arr.length-1){
				arr[x]=sc.nextInt(); //接收数据
				System.out.print(",");
			}
			else if(x==arr.length-1){
				arr[x]=sc.nextInt();
				System.out.println("]");
			}			
		}
		
		return arr;	
	}	
			
	
	
	
}