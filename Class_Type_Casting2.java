package basicprograms;
class Super_Casting{
	static void add()
	{
		System.out.println(1);
	}
	static void subtract()
	{
		System.out.println(2);
	}
	void multiply()
	{
		System.out.println(3);
	}
	void divide()
	{
		System.out.println(4);
	}
	
}

public class Class_Type_Casting2 extends Super_Casting{
	static void method1()
	{
		System.out.println(5);
	}
	static void method2()
	{
		System.out.println(6);
	}
	void method3()
	{
		System.out.println(7);
	}
	void method4()
	{
		System.out.println(8);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Upcasting
		Super_Casting s1=new Class_Type_Casting2();
		add();
		subtract();
		s1.multiply();
		s1.divide();
		Class_Type_Casting2 c1=(Class_Type_Casting2) s1;
		method1();
		method2();
		c1.method3();
		c1.method4();
		c1.multiply();
		c1.divide();
		add();
		subtract();

	}

}
