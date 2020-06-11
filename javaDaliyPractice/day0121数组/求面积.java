//制作一个求圆形，矩形，三角形的面积和周长的自动化工具

//三角形的还没有做！！


/*Switch的用法|
	16，制作一个求圆形，矩形，三角形的面积和周长的自动化工具（注意三角形） 
	已知三角形三边a,b,c，则（海伦公式）（p=(a+b+c)/2）S=sqrt[p(p-a)(p-b)(p-c)]	
	1, 区分 图形等功能
	2，分别对图形进行计算	
	swith(x){
		case 1:
			//
			break;
		case 1:
			//
			break;
		case 1:
			//
			break;
		default:	
	}	
*/
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
	
		distinguishGraphical();				//引用区分
	}	
	//① 区分图形
	public static void distinguishGraphical(){
		System.out.println("请输入一个数 \n 1圆形，2矩形，3三角形");
		Scanner sc = new Scanner(System.in);		
		int x =  sc.nextInt();		
		switch(x){
			case 1:												//情况1圆形
				int r = getR();
				int area =(int)getCircularArea(r);
				double cc = getCircularCircumference(r);
				sop(area);
				sop(cc);
				break;
			case 2:							//情况2矩形
			    int[] arr1 =getSideLength();//新定义一个arr1，把getSideLength()的返回数组arr放在arr1盒子里
				int a=arr1[0];				//定义a的类型，新数组arr1的第一位的值赋给a
				int b=arr1[1];				//定义b的类型，新数组arr1的第二位的值赋给b
				int area1 =getRectangularArea(a,b);
				int rp = getRectangularPerimeter(a,b);
				sop(area1);
				sop(rp);
				break;
			/*default:											//情况3三角形
				//
				break;
			*/
		}
	}	
	//对每个图形分别计算
	public static double getCircularArea(int r){				//三角形面积
		return r*r *3.14;
	}	
	public static double getCircularCircumference(int r){		//三角形周长
		return 2*3.14*r;
	}	
	public static int getR(){                          			//获取半径r
		System.out.println("请你输入一个半径");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}	
	public static void sop(int x){				//定义打印integer
		System.out.println(x);
	}
	public static void sop(double x){			//定义打印double
		System.out.println(x);
	}
	
	public static int getRectangularArea(int a ,int b){			//矩形面积，定义参数类型个数
		return a*b;
	}
	public static int getRectangularPerimeter(int a,int b){ 	//矩形周长，定义参数类型个数
		return 2*(a+b);	
	}
	public static int[] getSideLength(){		//获取边长a b
		int[] arr={0,0};						//定义一个数组arr及其长度2，这个arr只在这个public..里有效，所以出去只能再定义一个arr1，把返回的arr装进去
		for(int x=0;x<=arr.length-1;x++){					//x是序列号，序列号的范围为数组长度减1
			System.out.println("请输入第"+(x+1)+"个数");	//循环键入数据
			Scanner sc = new Scanner(System.in);
			arr[x]=sc.nextInt();				//键入arr[1]、arr[2]
		}
		return arr;								//返回一个类型(数组类型)
	}
		
		
	
	
}





