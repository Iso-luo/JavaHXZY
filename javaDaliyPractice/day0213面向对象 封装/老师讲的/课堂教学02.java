class T{
	private int a; //用private封装起来
	private int b;
	private int c;
	
	T(){}
	
	T(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	int getA(){
		return this.a;
	}
	
	void setA(int a){ //
		if(a<0){
			System.out.println("边长必须为正!!");
		}else{
			System.out.println("新的边长a为："+a);
			this.a=a;
		}
	}
	
	int getPer(){
		return this.a+this.b+this.c;
	}
	double getArea(){
		//√[p(p-a)(p-b)(p-c) ]其中p=1/2(a+b+c) 
		double per =(double) getPer();
		per = per * 0.5;		
		return Math.sqrt(per*(per-this.a)*(per-this.b)*(per-this.c));
	}
}

class Demo{
	public static void main(String[] args){
		
		T t = new T(3,4,5);
		System.out.println(t.getA());
		t.setA(5);
		System.out.println(t.getPer());
		System.out.println(t.getArea());
	}

}