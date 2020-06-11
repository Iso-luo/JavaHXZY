//打印二位数组（打印已给出的二维数组）

class toString2D{
	public static void main(String[] args){
	int[][] arr ={{1,2},{1,2,3},{1,2}};         //给出数组
	int[][] x=printArr(arr);			  //定义一个新二维数组x
	//String s = Arrays.toString(x);
	//System.out.println(s);	
	}
	
	public static int[][] printArr(int[][] arr){	//变量printArr的参数是二维数组arr，输出为二维数组
		System.out.print("[");			
		for(int x=0;x<arr.length;x++){				//二维输出的循环次数：即为二维数组的长度（从0到arr.length-1）
			System.out.print("[");
			for(int y=0;y<(arr[x]).length;y++){		//一维输出的循环次数：二维数组每一位上的一维数组的长度（从0到数值arr[x].length）
				if(y!=(arr[x]).length-1){
				System.out.print(arr[x][y]+",");	//				//x第几位 y：第x位的第y个数				
				}else{
					System.out.print(arr[x][y]);
				}
			}	
			System.out.print("]");	
			if(x!=arr.length-1){
			System.out.print(",");				
			}				
		} System.out.print("]");
		
		return arr;
	}
	
}