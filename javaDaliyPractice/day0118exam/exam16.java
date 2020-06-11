/*
16.制作一个求圆形，矩形，三角形的面积和周长的自动化工具（注意三角形） 
圆形：p=2πr  S=π*(r^2)
矩形： p=2*（a+b） S=a*b
已知三角形三边a,b,c：（海伦公式）（p=(a+b+c)/2）;S=sqrt[p(p-a)(p-b)(p-c)]
*/

import java.util.Scanner;
class Exam{
	public static void main(String[] args){		
		select();		
	}
		public static void select(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要计算的图形 /n 1.圆形 2.矩形 3.三角形");
			int x=sc.nextInt();
			switch(x){
				case 1:
					int r=getR();
					double i=calCircleArea(r);
					double j=calCircumference(r);
					sop(i);
					sop(j);
					break;
				case 2:
					int[] arr=getSideLength();
					int m=arr[0];
					int n=arr[1];
					int y=calRectangleArea(m,n);
					int z=calRectanglePerimeter(m,n);
					sop(y);
					sop(z);
					break;
				case 3:
					double[] arr1=getTriangleSideLength();
					double a=arr1[0];
					double b=arr1[1];
					double c=arr1[2];
					double p=calTrianglePerimeter(a,b,c);
					double temp=calTrianglePerimeter(a,b,c)/2;
					double ta=calTriangleArea(temp,a,b,c);
					sop(p);
					sop(ta);
					break;				
			}			
		}
			public static void sop(int x){
				System.out.println(x);
			}
			public static void sop(double x){
				System.out.println(x);
			}
			
			public static int getR(){
				Scanner sc= new Scanner(System.in);
				System.out.println("请输入半径的面积");
				int r=sc.nextInt();
				return r;
			}		
			public static double calCircleArea(int r){			
				return 3.14*(r^2);			
			}
			public static double calCircumference(int r){			
				return 2*3.14*r;	
			}
			
			
			public static int[] getSideLength(){
				int[] arr={0,0};
				for(int i=0;i<2;i++){
				Scanner sc= new Scanner(System.in);
				System.out.println("请输入边长");
				arr[i]=sc.nextInt();
				}
				return arr;
			}		
			public static int calRectangleArea(int a,int b){			
				return a*b;			
			}			
			public static int calRectanglePerimeter(int a,int b){
				return 2*(a+b);			
			}
			
			
			public static double[] getTriangleSideLength(){
				double[] arr={0.0,0.0,0.0};
				for(int i=0;i<3;i++){
				Scanner sc= new Scanner(System.in);
				System.out.println("请输入边长");
				arr[i]=sc.nextDouble();
				}
				return arr;
			}	
			public static double calTrianglePerimeter(double a,double b,double c){			
				return a+b+c;
			}			
			public static double calTriangleArea(double p,double a,double b,double c){
				return Math.sqrt(p*(p-a)*(p-b)*(p-c));							
			}
			
}