//打印空心菱形
class Demo{
	public static void main(String[] args){

		int a=5;
		int b=0;
		int c=1;
		int d=8;
		for(int z=0;z<11;z++){
			if(z<5){
				for (int x=0;x<a;x++){				
					System.out.print(" ");				
				}	
				for (int y=0;y<1;y++){
					System.out.print("*");					
				}
				for (int j=0;j<b;j++){
					System.out.print(" ");					
				}
				for (int y=0;y<1;y++){
					System.out.print("*");					
				}
					System.out.println();
				a=a-1;
				b=b+2;
			}	
			if(z>5){
				for(int q=0;q<c;q++){
					System.out.print(" ");
				}
				for(int w=0;w<1;w++){
					System.out.print("*");
				}
				for(int e=0;e<d;e++){
					System.out.print(" ");	
				}
				for(int r=0;r<1;r++){
					System.out.print("*");
				}
					c=c+1;
					d=d-2;
				System.out.println();
		
			}	
		}
	
	}
}
