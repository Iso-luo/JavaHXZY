//

class Person{//这个类默认继承Object类
	int age;
	String name;
	int score;
	
	Person(){}
	Person(int age,String name ,int score){
		this.age=age;
		this.name=name;
		this.score=score;
	
	}
	
	public String toString(){
		return "我的名字是"+this.name+"\n我的年龄是"+this.age+"\n我的分数是"+this.score;
	}	
	
	public boolean equals(Object obj) { //覆盖Object类的equals()方法
	
		Person p =null;
		if(obj == null){
			return false;
		}
		if(obj instanceof Person){
			p = (Person)obj;
		}
		
		if(this.age == p.age){
			return true;
		}
        return false;
    }
}

class Demo{
	public static void main(String[] args){
		Person p  = new Person(23,"cyx",99);		
		Person pp = new Person(23,"cyx",99);
		
		
		/*
		boolean isOk  = p.equals(pp);
		
		boolean isok2 = (p == pp);
		
		System.out.println(isOk);
		System.out.println(isok2);*/
		
		//如果 两个人的年龄是一样的 那么我就认为是同一个人
		
		//boolean isOk = p.equals(pp);
		System.out.println(p.hashCode());
		
	}

}