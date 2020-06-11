//Math的几个重要用法
class A{
	public static void main(String[] args){
		double a=12.21;
		System.out.println("round:"+Math.round(a));//round(double a)返回最接近参数的 long。12 四舍五入
		System.out.println("floor:"+Math.floor(a));	//地板floor(double a)返回最大的(最接近正无穷大)double值,该值<=参数,并等于某个整数12.0
		System.out.println("ceil:"+Math.ceil(a));	//天花板ceil(double a)返回最小的(最接近负无穷大)double 值,该值>=参数,并等于某个整数13.0
		System.out.println("random:"+Math.round(a));	
	}
}
