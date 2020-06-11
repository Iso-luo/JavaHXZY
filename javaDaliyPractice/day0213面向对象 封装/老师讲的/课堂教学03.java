//封装


class T{
	//三个边长
	private int a;
	private int b;
	private int c;
		
	T(){}
	private T(int a,int b,int c){

		this.a=a;
		this.b=b;
		this.c=c;
	}
		
	int getA(){
		return this.a;
	}
	void setA(int a){
		if(a<0){
			System.out.println("sorry");
		}else{
			this.a=a;
		}
	}
	int getB(){
		return this.b;
	}
	int getC(){
		return this.c;
	}
	
	
	
	int getPer(){
		return this.a+this.b+this.c;
	}
		
	double getArea(){
		double per =(double) getPer();
		per = per * 0.5;		
		return Math.sqrt(per*(per-this.a)*(per-this.b)*(per-this.c));
	}
}

class Demo{
	public static void main(String[] args){
		T t = new T();
		t.getT(33333,1,2);
			
		System.out.println(t.getPer());
		System.out.println(t.getArea());
		
	}
}