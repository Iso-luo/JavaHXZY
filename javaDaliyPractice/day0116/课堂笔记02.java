//【课堂笔记】比较break和continue的区别

class Demo{
	public static void main(String[] args){
		
		// 写一个循环 
		// break 更多的是和if 语句一起使用
		
		
		for(int x=0;x<10;x++){
			if(x==5){
				break;
			}
			System.out.println(x+"a");
		}
		System.out.println("finish");
		
		//更多的是在某种条件下 使用continue
		
		// //  if  continue 连用
		
		for(int x=0;x<10;x++){
			if(x==5){
				continue;
			}
			System.out.println(x+"b");
		}
	}
	
}
