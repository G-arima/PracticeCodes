package basicprograms;

public class Non_Static_Method {
	
	void add()
	{
	System.out.println("Hello");	
	}
	void subtract(int a,int b)
	{
		System.out.println("World");
	}
	

	public static  void main(String[] args) {
		Non_Static_Method n1=new Non_Static_Method();
		n1.add();
		n1.subtract(5, 3);
		

	}

}
