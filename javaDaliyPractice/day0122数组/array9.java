//请将”我” “爱” “你”存入数组，然后正着和反着输出
class Order{
	public static void main(String[] args){
	char[] arr1=reverse();
	System.out.println(arr1);
	char a=arr1[0];
	char b=arr1[1];
	char c=arr1[2];
	
	arr1[0]=c;
	arr1[1]=b;
	arr1[2]=a;
	System.out.println(arr1);
	
	
	}
	public static char[] reverse(){
	char[] arr={0,0,0};
		arr[0]='我';
		arr[1]='爱';
		arr[2]='你';
	   return(arr);
	}
}