package basicprograms;

class Super//Parent Class
{
	static void login_with_email_id()//static method inside the parent class
	{
		System.out.println("Please login with your Email Id");
	}
	void registration()//non static method inside the parent class
	{
		System.out.println("Please complete the Registration");
	}
}


public class Single_Level_Inheritance extends Super{
	static void login_with_mobile()//static method inside the child class
	{
		System.out.println("mobile");
	}
	
	void Sign_up()//Non Static Method inside the child class
	{
		System.out.println("Sign up");
	}
	

	public static void main(String[] args) {
		
		
		login_with_email_id();
		login_with_mobile();
		Single_Level_Inheritance s1=new Single_Level_Inheritance();
		s1.registration();
		s1.Sign_up();
		

	}

	

}
