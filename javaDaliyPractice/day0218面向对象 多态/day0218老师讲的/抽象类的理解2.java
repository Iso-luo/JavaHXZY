//抽象类的理解2

abstract class A{   		//抽象类A
       abstract void m1(A a);  //抽象方法m1
	   
       public void m2(A a){	//方法m2
	    System.out.println("A类中定义的m2方法");
       }
}

class B extends A{ //B类继承A类，B不是抽象类
       void m1(A a){ //B类中需要将A类中所有的抽象方法重写
	     System.out.println("B类中重写m1方法");
       }
	    public void m2(A a){	//方法m2，重写了抽象类A中的m2
	    System.out.println("B类中重写的m2方法");
       }
	   
}

class Test{
       public static void main( String args[ ]){
	     A a = new B( );//[多态] 在子类B中创建一个对象a,其类型为A类
	     a.m1(a);		//类型为A的对象a，原本调用的方法是A类中的m1，但由于A类是抽象类，所以实际调用的是B类的m1方法
	     a.m2(a);		//类型为A的对象a，原本调用的方法是A类中的m2，但由于A类是抽象类，所以实际调用的是B类的m1方法
       }
}