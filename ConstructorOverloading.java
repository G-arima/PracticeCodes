package basicprograms;

public class ConstructorOverloading {
	ConstructorOverloading()//THIS IS CONSTRUCTOR
	{
		System.out.println("This is Amazon Constructor");
	}
	ConstructorOverloading(int a)//THIS IS Parameterized CONSTRUCTOR
	{
		System.out.println("This is Amazon Constructor with one parameter");
	}
	ConstructorOverloading(int a, double c)
	{
		System.out.println("This is Amazon Constructor with two parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Amazon a1=new Amazon();
		new Amazon();*/
		new ConstructorOverloading();
		new ConstructorOverloading(55);
		ConstructorOverloading cl=new ConstructorOverloading(19,3.14);

	}

}
