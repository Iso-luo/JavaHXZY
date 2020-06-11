//19、以下代码运行输出是（A）X  	选C 
class Person{
	private String name="Person";
	int age=0;
}
class Child extends Person{
	public String grade;
	
	public static void main(String[] args){
		Person p = new Child(); 		//多态
		System.out.println(p.name);		//name是Person类私有的不能被外部直接调用 所以错啦！！
	}
} 