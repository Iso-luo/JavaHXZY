//5.判断101-200之间有多少个素数，并输出所有素数。

class Practice{
	public static void main(String[] args){
		System.out.println("共有"+primeNum()+"个素数");
		int l=primeNum();
		int[] arr1=getArr(l);
		printArr(arr1);
	}	
		public static void printArr(int[] arr){
			for(int i=0;i<arr.length;i++){
				System.out.println("第"+(i+1)+"个素数："+arr[i]);
			}
		}
		public static int[] getArr(int l){
			int[] arr=new int[l];
			int j=0;
				for(int x=101;x<200;x++){					
					for(int i=2;i<x;i++){
						if(x%i==0){
							break;
						}else if(x%i!=0){					
							if(i==(x-1)){							
								arr[j]=x;
								j+=1;
							}
						}						
					}
				}
				return arr;
			}
		
		public static int primeNum(){
			int sum=0;
			for(int x=101;x<200;x++){
				for(int i=2;i<x;i++){
					if(x%i==0){
						break;
					}else if(x%i!=0){					
						if(i==(x-1)){							
							sum+=1;
						}
					}						
				}
			}
		return sum;		
		}
}