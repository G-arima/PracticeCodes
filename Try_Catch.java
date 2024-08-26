package basicprograms;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=b/c;//Can b come from Grandparent class and c come from parent class->Answer is Yes for both
        
		try {
			System.out.println("Hello World");
		int a=1/0;	
		System.out.println(a);
		}
		catch(ArithmeticException a1) {
			System.out.println("Handling the Exception");
		}
		
		
		
		
		
		
		//ArithmeticException
	
		
	}

}
