package basicprograms;

public class This_Calling_Statement {
	This_Calling_Statement()//Default Constructor
	{
		this(10, 3.14, "Garima");
		System.out.println("With no Para");
		
	}
    This_Calling_Statement(int a)//Parameterized Constructor
    {
    	
		System.out.println("With one para");
	}
    This_Calling_Statement(int a, double b){
    	this(10);
	System.out.println("With two para");	
	}
    This_Calling_Statement(int a, double b, String c){
    	this(10, 3.14);
		System.out.println("With three Para");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This_Calling_Statement();

	}

}
