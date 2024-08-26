package basicprograms;

public class LocalGlobal_Program {
	static int a=30;
	static int b=10;
	
	static void add()
	{
		int a=90;
	System.out.println(a+b);	
	}
	static void subtract()
	{
		System.out.println(a-b);
	}
	static void multiply()
	{
	System.out.println(a*b);	
	}
	static void divide()
	{
	System.out.println(a/b);	
	}

	public static void main(String[] args) {
		add();
		subtract();
		multiply();
		divide();

	}

}
