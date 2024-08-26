package basicprograms;
class Down_Casting
{
	
}
public class Class_Type_Casting1 extends Down_Casting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Down_Casting d1=new Class_Type_Casting1();//Implicit upcasting
		Down_Casting d2=(Down_Casting)new Class_Type_Casting1();//Explicit Upcasting
               Class_Type_Casting1 c1=(Class_Type_Casting1) d1;//Explicit Downcasting
               //After Explicit Downcasting You will be able to access the Properties of both Parent and child class with the help of Reference Variable
	}

}
