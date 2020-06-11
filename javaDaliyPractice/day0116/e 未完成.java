//未完成 请找一下当时的题目
 
class Demo{
	public static void main(String[] args){
	
		for(int x=0;x<4;x++){
		
			for(int y=0;y<4;y++){
			
				if (y==2){
					continue;
				}
				System.out.println(x+" "+y+"a");
			
			}  
		}
		System.out.println("finish");
	}
}
