//打印数组
class Array{
	public static void main(String[] args){
	
	int[] arr= {1,3,4,5,6,8,8};
	
	int a=arr[0];//0号位和1号位换位置
	int b=arr[1];//0号位和1号位换位置
	arr [0]= b;//0号位和1号位换位置
	arr [1]= a;//0号位和1号位换位置
	printArray(arr);//0号位和1号位换位置
		
	}
		
	public static void printArray(int[] arr){		
		System.out.print("[");
		
		for(int x=0;x<=arr.length-1;x++){		
			
			System.out.print(arr[x]+",");
			
			if(x==arr.length-1){
				
				System.out.print(arr[x]);
			}
						
		}
		System.out.println("]");
	}
	
}