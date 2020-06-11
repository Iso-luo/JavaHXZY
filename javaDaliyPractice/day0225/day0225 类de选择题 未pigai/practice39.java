//39、下面Java代码的运行结果是（A）。X C 
class Penguin {
	private String name=null; 	// 名字
	private int health=0; 		// 健康值
	private String sex=null;	// 性别
	
	public void Penguin(){    	//有返回不是构造方法，后面并没有调用这个用来赋值的方法
	health = 10;
	sex = "雄";
	System.out.println("执行构造方法。");//这句话就是迷惑你的 其实该方法并不是构造方法
	}
	
	public void print() {
		System.out.println("企鹅的名字是" + name + "，健康值是" + health + "，性别是" + sex+ "。");
	} 
	public static void main(String[] args) {
		Penguin pgn = new Penguin();
		pgn.print();
	}
} 