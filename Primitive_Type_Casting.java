package basicprograms;

public class Primitive_Type_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert int into Double
		int a=1000;
		double b=a;
		System.out.println(b);//Widening Type Casting
		//This is implicit widening
		
		//Explicit Widening
		int b2=100;
		double b1=(double)b2;
		System.out.println(b1);

	}

}
