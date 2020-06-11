class Animal{
	#属性
	private int age;		
	private double weight;
	private int leg;
	
	Animal(){}
	Animal(int age,double weight,leg){
	
		this.age=age;
		this.weight=weight;
		this.leg=leg;
	}
	
	int getAge(){
		return this.age;
	}
	void setAge(int age){
		this.age=age;
	}
	
	doulbe getWeight(){
		return this.weight;
	}
	void setWeight(double weight){
		this.weight=weight;
	}

	int getLeg(){
		return this.leg;
	}
	void setLeg(int leg){
		this.leg=leg;
	}
	
	void eat(){
		System.out.println("eat");
	}
	void sleep(){
		System.out.println("sleep");
	}
	void shut(){
		System.out.println("shut");
	}
}

class Demo{
	public static void main(String[] args){
		Animal a = new Animal(10,56.5,4);
		
		a.shut();
		a.log=44;
		
	
	}

}












