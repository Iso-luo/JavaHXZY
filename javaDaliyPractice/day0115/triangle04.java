//打印倒直角三角形 最难

class Demo{
	public static void main(String[]agrs){
		for(int x=0;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print(" ");		
			}
			for(int j=1;j<=9-x;j++){
				System.out.print("*");						
			}
		
			
			System.out.println();			
		}	
	}

}