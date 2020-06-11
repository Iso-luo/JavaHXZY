//未完成


import java.util.Scanner;
class toString2D{
	public static void main(String[] args){		
	Scanner sc  = new Scanner(System.in);						
	System.out.println("请用户从键盘上输入三角形的行数:");	
	int [][] x= getArray(sc.nextInt());
	System.out.println(x);	
	}
	/*
	public static int[][] printArray(int[][] arr){		
		for(int x=0;x<=7;x++){			
			for(int y=1;y<=i+1;y++){
				System.out.print(arr[x][y]);				
			}			
		}
		return arr;		
	}
	*/
	public static int[][] getArray(int arr_length){
	Scanner sc  = new Scanner(System.in);
	int[][] arr =new int[arr_length][];	
		int i=0;							    	//第几位 或 第几行
		int j=0;										//每行个数
		int[][] arr1=new int[i][j];
		arr[0][0] =1;
		//arr[1][0] =1;
		//arr[1][1] =1;
		
		for(i=1;i<=arr_length-1;i++){														//j/2+1 //个数
			for(j=1;j<=i;j++){
				if(j==0){
					System.out.print(1);
				}
				else{
				arr1[i][j]=arr1[i-1][j-1]+arr1[i-1][j];
				
				System.out.print(arr1[i][j]);
				}
				
			}
		}return arr1;
						
	}
			
}