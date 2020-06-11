//数组的赋值
class P{}

class C{
	public static void main(String[] args){
		P p1 = new P();	//p类的对象p1
		P p2 = new P(); //p类的对象p2
		
		P[] arr = new P[2];	//定义一个数组P，将以上两个对象装进来
		
		arr[0]=p1;
		arr[1]=p2;
		
		System.out.println(arr[1]);
	}
}