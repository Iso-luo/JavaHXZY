//16、已知: 第十二行看不懂
class Base {
	public Base(String s){
		System.out.print("B");
	}
}
class Derived extends Base{
	public Derived(String s){
		System.out.print("D");
	}
	public static void main(String [] args) {
		new Derived ("C");
	}
} 