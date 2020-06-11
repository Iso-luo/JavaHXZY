//实心菱形

class Demo{
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			for(int x=1;x<10-i;x++){
				System.out.print(" ");
			}
			for(int y=1;y<=(2*i-1);y++){
				System.out.print("*");
			}
		System.out.println();
		}
		for(int j=1;j<10;j++){
			for(int m=1;m<j;m++){
				System.out.print(" ");
			}
			for(int n=1;n<2*(10-j);n++){
				System.out.print("*");
			}
		System.out.println();
		}
		
		
	}
}