package basicprograms;
class St
{
	 St(int a,int b,int c)//Parameterized Constructor
	{
		System.out.println("St");
	}
}

public class Super_Calling_Statement extends St{
	 Super_Calling_Statement()
	{
		 super(10,20,30);//Super calling statement can be called implicitly and explicitly, explicitly in case of parameterized and implicitly in case of non para
		 //Super calling statement is used whenever there is a constructor and whenever there is inheritance. Super keyword is called in case of Method Overriding to called parent class method inside the child class method.
		System.out.println("SCS");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Super_Calling_Statement();
	}

}
