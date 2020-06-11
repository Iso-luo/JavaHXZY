 //九九乘法表
 
 class Table{
	public static void main(String[] args){
		
	table();	
	}
	public static void table(){
		for(int j=1;j<10;j++){
			for(int i=1;i<=j;i++){
			System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}		
			
     }
}