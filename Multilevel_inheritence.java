package typesofinheritence;

class Flipkart
{
static void add()
{
	System.out.println("Addition");
}
void subtract()
{
	System.out.println("Subtraction");
}
}
class Amazon extends Flipkart
{
static void multiplication() 
{
	System.out.println("Multiply");
}

}

public class Multilevel_inheritence extends Amazon {
	void divide()
	{
		System.out.println("Divide");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel_inheritence m1=new Multilevel_inheritence();
		m1.divide();
		m1.subtract();
		multiplication();
		add();
		

	}

}
