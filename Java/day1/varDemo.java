//变量分类-作用域-使用规则
public class varDemo
{ 
	 static int age = 1;//成员变量，字段
     public static void main(String[] args)
    {
		 /*
			变量位置
				变量定义位置不同分为两种
				1）、成员变量/字段  直接定义在类的｛｝中的变量 方法外面 public static 前面
					报错 varDemo.java:13: 错误: 无法从静态上下文中引用非静态 变量 age
					需要使用 static修饰 在类内部就可使用胃 
				2）、局部变量  定义在方法中的变量
					除了成员变量之外，其他的都是局部变量
			作用域
				1）、成员变量
					在定义的类中都可以访问
				2）、局域变量
					在定义的地方开始到{}结束  
			使用规则
			1）、必须先声明 然后才能使用
			2）、声明的变量必须要有类型
			3）、同一作用域下变量名不能重复定义
		 */ 
         System.out.println(age);//此时输出的是成员变量  ===========>  1
		 int age = 18;
		 System.out.println(age); //此时输出的是局部变量===============>18
    }
}