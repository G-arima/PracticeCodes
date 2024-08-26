package basicprograms;

public class NonStaticMethod {
	void add()
	{
		int a=25;
		int b=35;
		int sum=a+b;
		System.out.println(sum);
	}
	void subtract()
	{
		int a=25;
		int b=35;
		int sub=a-b;
		System.out.println(sub);
	}
	void multiply()
	{
		int a=25;
		int b=35;
		int mul=a*b;
		System.out.println(mul);	
	}
	void divide()
	{
		int a=25;
		int b=35;
		int div=a/b;
		System.out.println(div);	
	}

	public static void main(String[] args) {
		//How to call Non Static method inside Main Method
		//By creating an object with the help of its reference variable we can call Non Static Methods inside the main method
		NonStaticMethod n1=new NonStaticMethod();
		n1.add();
		n1.subtract();
		n1.multiply();
		n1.divide();

	}

}
