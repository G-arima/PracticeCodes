package basicprograms;

public class This_Keyword {
	String name;
	int age;
	double salary;
	
	void getData(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		}

	public static void main(String[] args) 
	{

		This_Keyword t1=new This_Keyword();
		t1.getData("Abhimanyu", 30, 1800000.78);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);
	}

}
