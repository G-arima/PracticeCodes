package basicprograms;

public class Method_Overloading {
	
	static void add(int a)
	{
	System.out.println(a);	
	}
	static void add()
	{
		System.out.println("2");	
	}
	
	
	static void add(String a)
	{
		System.out.println("3");	
	}
	static void add(String a, char b, double c)
	{
		System.out.println("4");	
	}
     void add(boolean b)
    {
    System.out.println(false);	
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(100);
		add();
		add("Garima");
		add("MKT",'C',3.14);
		Method_Overloading m1=new Method_Overloading();
		m1.add(false);
		

	}

}
