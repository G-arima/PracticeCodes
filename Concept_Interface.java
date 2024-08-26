package basicprograms;

interface A
{
void add();
void subtract();
}
abstract class concrete implements A
{
	static void multiplication()
	{
		int a=5;
		int b=4;
		System.out.println(a*b);
	}
	void division()
	{
	int a=40;
	int b=20;
	System.out.println(a/b);
	}
}

public class Concept_Interface extends concrete{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concept_Interface c=new Concept_Interface();
		c.add();
		c.subtract();
		c.division();
		multiplication();
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
	int a=10;
	int b=90;
	System.out.println(a+b);
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		int a=50;
		int b=40;
		System.out.println(a-b);
		
	}

}
