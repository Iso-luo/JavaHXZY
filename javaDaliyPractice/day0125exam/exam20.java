//20.输出9*9口诀表

class Exam{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				if(j<i){
					System.out.print(j+"*"+i+"="+(i*j)+"	");
				}
				else if(j==i){
					System.out.println(j+"*"+i+"="+(i*j));	
				}
			}
		}
	}	
}