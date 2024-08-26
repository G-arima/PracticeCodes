package basicprograms;

public class SIB_IIB {
	static {
		System.out.println("SIB");
	}
	SIB_IIB()
	{
		System.out.println("Constructor");
	}
	SIB_IIB(int a)
	{
		System.out.println("Parameterized Constructor");
	}
	{
		System.out.println("IIB");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
        new SIB_IIB();
     SIB_IIB si=new SIB_IIB();
     new SIB_IIB(1);
        
        }

}
