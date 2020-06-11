class Demo{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int x=1;x<=9-i;x++){
				System.out.print(" ");
			}
			for(int y=1;y<=i;y++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
}