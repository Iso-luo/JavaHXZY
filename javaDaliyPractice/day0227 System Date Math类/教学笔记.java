object
	equals  --->  ==
	String toString(){}
	public native int hashCode();
	
String类：
	
	构造函数 new String(char[] str)
	构造函数 new String(String str)
	构造函数 new String(StringBuffer str)
	构造函数 new String(StringBuilder str)
	
String类中重要的方法：
	
	1,两边去空格 						方法:trim() [注]不能去掉中间的空格 
	2,大小写转换						方法:toLowerCase()
											toUpperCase()
	3,字符串截取 						方法:subString(从第x位,到第y位)
	4,替换   							方法:replace(需要替换的字符,替换成什么)
	5,分隔   							方法:split(用于分割的字符如空格或',')  变为-->char[]  [注]sep:separator
	6,字符串 -----> 字节数组 			方法:getBytes()   
					字符数组  			方法:tocharArray()
	  <---------------------------->
	  字符数组 -----> 字符串 			方法:String.valueOf(x);
	  如:char[] x = ['1','2'] 
	     char[] x =	['a','b']			 	
			
	7,字符串"12345" ---> 整型int     	方法:Interger.parseInt("13456")
	8,整型 13 ---> 字符串"13"		  	方法:13+""	
	9,判断是否以XX结尾  				方法:endswith()
-------------------------------------------------------------------------
-------------------------------------------------------------------------

StringBuffer类
	
	构造函数：StringBuffer() 
	构造函数：StringBuffer(String str)


	StringBuffer ---> String 的两种方法:	
	1， sb.toString();
	2,  String str = new String(StringBuffer sb);
	
	一般方法：
		 append() 
		 insert(int offset, String str) 
----------------------------------------------
系统类:System

	private System() {}
	
	public final static PrintStream out = null
	public final static PrintStream err = null;
	public final static InputStream in = null;
	 
	static String getenv(String name) 
    static String getProperty(String key) 
	static void exit(int status) 
 
  /**常用啥啥列举
     * System properties. The following properties are guaranteed to be defined:
     * <dl>
     * <dt>java.version         <dd>Java version number
     * <dt>java.vendor          <dd>Java vendor specific string
     * <dt>java.vendor.url      <dd>Java vendor URL
     * <dt>java.home            <dd>Java installation directory
     * <dt>java.class.version   <dd>Java class version number
     * <dt>java.class.path      <dd>Java classpath
     * <dt>os.name              <dd>Operating System Name
     * <dt>os.arch              <dd>Operating System Architecture
     * <dt>os.version           <dd>Operating System Version
     * <dt>file.separator       <dd>File separator ("/" on Unix)
     * <dt>path.separator       <dd>Path separator (":" on Unix)
     * <dt>line.separator       <dd>Line separator ("\n" on Unix)
     * <dt>user.name            <dd>User account name
     * <dt>user.home            <dd>User home directory
     * <dt>user.dir             <dd>User's current working directory
     * </dl>
     */
	
	<tr><td><code>os.version</code></td>
     *     <td>Operating system version</td></tr>
     * <tr><td><code>file.separator</code></td>
     *     <td>File separator ("/" on UNIX)</td></tr>
     * <tr><td><code>path.separator</code></td>
     *     <td>Path separator (":" on UNIX)</td></tr>
     * <tr><td><code>line.separator</code></td>
     *     <td>Line separator ("\n" on UNIX)</td></tr>
     * <tr><td><code>user.name</code></td>
     *     <td>User's account name</td></tr>
	 
	 







		
		