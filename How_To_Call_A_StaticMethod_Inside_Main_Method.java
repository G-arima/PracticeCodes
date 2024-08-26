package basicprograms;

public class How_To_Call_A_StaticMethod_Inside_Main_Method {
	static void addition()
	{
		System.out.println("Hey i am addition method");
	}
	static void subtraction()
	{
		System.out.println("Hey i am subtraction method");
	}
	static void multiply()
	{
		System.out.println("Hey i am multiply method");
	}
	static void divide()
	{
		System.out.println("Hey i am divide method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi i am main method");
		addition();
		subtraction();
		multiply();
		divide();

	}

}
