//4.用 while 循环，计算 1~200 之间所有 3 的倍数之和。
 class Practice{
	 public static void main(String[] args){
		 int r=getSum();
		 System.out.print(r);
	 }
		public static int getSum(){
			int i=1;
			int sum=0;
			while(i<=200){
				if(i%3==0){
					sum+=i;
				}
				i+=1;
			}
			return sum;
		}
 }