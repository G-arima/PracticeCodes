package basicprograms;

public class LocalGlobal {
	static double salary;
	static double pi;
	static int no_of_days_in_leap_year=366;
	static int age;
	static String ab;
	static boolean b;
	static void add()
	{
	String a="Manish";	//Local Variable
	System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(salary);;
     add();
     System.out.println(b);
     System.out.println(pi);
     System.out.println(ab);
     System.out.println(no_of_days_in_leap_year);
     System.out.println(age);
	}

}
