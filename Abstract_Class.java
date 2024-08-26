package basicprograms;

public abstract class Abstract_Class {//Abstract class will always be the parent class
	
	abstract void login();
	abstract void registration();
//Abstract class is solely meant for Exposing purpose.
	//Exposing to the third organization
public class Myntra extends Abstract_Class//Concrete class
//this class is meant for us as this concrete class holds the real logic
{
	@Override
	void login() {
		
		
	}
	@Override
	void registration() {
		
	}
	static void resetpassword()//Concrete Method
	{
		
	}
	static void logout()//Concrete Method
	{
		
	}
	public static void main(String[] args) {
		
	}
	
		
	}
}


