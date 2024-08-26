package basicprograms;
public class How_To_Call_Static_And_NonStaticMethod_Inside_MainMethod 
{
	static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	void subtract()
	{
		int a=10;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) 
	{
		add();
		How_To_Call_Static_And_NonStaticMethod_Inside_MainMethod n1=new How_To_Call_Static_And_NonStaticMethod_Inside_MainMethod();
		n1.subtract();
	}

}
