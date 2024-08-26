package basicprograms;
 abstract class Supermost//Abstract Class
{
	abstract void add();//Abstract Method
	abstract void subtract();//Abstract Method
	static void multiply(int a, int b)//Concrete 
	{
		System.out.println(a*b);
	}
}
class Super1 extends Supermost   //Concrete class
{
	static void divide() {
		int a=50;
		int b=10;
		int c=a/b;
		System.out.println(c);
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		System.out.println(a+b);
	}

	@Override
	void subtract() {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		System.out.println(a-b);
		
	}

}
public class Abstraction extends Super1   //Concrete Class 
{
	static void modulus(int a, int b) {
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Abstraction ab=new Abstraction();
    ab.add();
    ab.subtract();
    divide();
    multiply(40,50);
    modulus(10,10);
	}

}

