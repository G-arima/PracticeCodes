package basicprograms;

public class CompiletimePolymorphism_Pgm {
	
	void calculation(int a, int b)
	{
		System.out.println("Addition of two numbers is : " +(a+b));
	}
	void calculation(int a, int b,int c)
	{
		System.out.println("Addition of three numbers is : " +(a+b+c));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompiletimePolymorphism_Pgm c1=new CompiletimePolymorphism_Pgm();
		c1.calculation(10, 50);
		c1.calculation(5, 80, 9);
	}

}
