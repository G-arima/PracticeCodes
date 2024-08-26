package basicprograms;
class First_Class{
	void login()
	{
		System.out.println("Login with the Mobile Number");
	}
}

public class RunTimePolymorphism_Pgm extends First_Class {
	void login()
	{
		System.out.println("Login with Email id");
		//super.login();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePolymorphism_Pgm p1=new RunTimePolymorphism_Pgm();
		p1.login();
		new First_Class().login();
		
	}

}
