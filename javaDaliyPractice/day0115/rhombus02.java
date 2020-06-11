// 空心菱形

class Demo{
	public static void main(String[] args){		
		for(int i=1;i<10;i++){
			for(int n=1;n<10-i;n++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int n=1;n<(2*i-1);n++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int j=1;j<10;j++){
			for(int n=1;n<j;n++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int m=1;m<19-j*2;m++){
				System.out.print(" ");
			}
			System.out.print("*");	
			System.out.println();
		}
		
	}	
}