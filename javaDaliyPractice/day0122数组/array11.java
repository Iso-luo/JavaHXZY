//声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分。

//求最值还没有完成！！！！
import java.util.Scanner;
class Score{
	public static void main(String[] args){
	
	
	getAverage();
	
	}
	public static void getAverage()
	{
		int[] arr={0,0,0,0,0,0,0,0};//必须在此public再定义一次arr，后面还要用；
		getScore();					//引用getScore()函数的返回值arr
		int l=arr.length;			//把数组长度赋值给l
		int sum=0;					//定义和的类型
			for(int i=0;i<=arr.length-1;i++){	//数组的各位相加求和！！
				sum+=arr[i];//即：sum=sum+arr[i]
			}	
		System.out.println("这8个学生的总分是:"+sum);				//输出学生总分
		System.out.println("这8个学生的平均分是:"+(sum/l));		    //输出学生平均分
	}
	
	public static int[] getScore()
	{										//录入学生成绩
		int x=0;
		int[] arr={0,0,0,0,0,0,0,0};		//定义数组arr
		Scanner sc=new Scanner(System.in);
		for(x=0;x<=arr.length-1;x++){
			System.out.println("请输入第"+(x+1)+"个学生的成绩");
			arr[x]=sc.nextInt();
		}
		return arr;	
		
	}
	
}