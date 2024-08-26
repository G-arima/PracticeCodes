package access_specifiers1;

public class Within_class {
	public static void add()
	{
	System.out.println("addition");	
	}
	private static void subtract()
	{
		System.out.println("subtraction");		
	}
	static void multiply()
	{
	System.out.println("multiplication");	
	}
	protected static void divide()
	{
		System.out.println("division");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    add();
    subtract();
    multiply();
    divide();
	}

}
