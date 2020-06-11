//2，题目：打印出如下图案（菱形）

class Exam{
	public static void main(String[] args){
	
	getTriangle();
	getInvertedTriangle();		
	
	}
	public static void getTriangle(){
		for(int i=1;i<10;i++){				//一共打印9行
			for(int j=1;j<10-i;j++){		//第i行 空格的数量，空格数量递减，i值递增，所以是负向关系（10-i）
				System.out.print(" ");
			}
		    for(int k=1;k<=(i*2-1);k++){	//第i行 *的数量，*数量递增，i值递增，所以是正向关系（i*2-1）
				if(k<(i*2-1)){
					System.out.print("*");
				}
				else{
					System.out.println("*");
				}
			}				
		}
	}
	
	public static void getInvertedTriangle(){
		for(int i=1;i<9;i++){				//一共打印8行
			for(int j=1;j<=i;j++){			//第i行 空格的数量，空格数量⬆，i值递增，所以是正向关系i
				System.out.print(" ");
			}
			for(int k=1;k<=(17-2*i);k++){	//第i行 *的数量，*数量⬇，i值递增，所以是负向关系（17-2*i）
				if(k<(17-2*i)){
					System.out.print("*");
				}else{
					System.out.println("*");
				}
			}			
		}
	}
}
