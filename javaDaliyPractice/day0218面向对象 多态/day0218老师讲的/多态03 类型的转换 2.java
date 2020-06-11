//类型的转换 理解

class G{}

class GG extends G{}//GG类型继承G类型

class GGG{ //GGG类型
	void show(G g){} //含有一个方法	
}

class Demo{
	public static void main(String[] args){		
		GGG ggg  = new GGG();//创建一个GGG类的对象ggg，类型为GGG
		G g = new GG();		 //[多态]创建一个GG类的对象g，由于g属于GG类型，GG类型属于G类型，因此g的类型可以定义为其父类类型G【注】如果这里是GG类型，则show()方法调用的时候，g要进行向上的强制类型转换，转化为G类型，才可被调用
		ggg.show(g);		 //对象ggg所属类型GGG有一个show()方法可供其调用，该方法的参数要求为G类型
	}
}