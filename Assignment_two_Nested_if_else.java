package basicprograms;

public class Assignment_two_Nested_if_else {

	public static void main(String[] args) {
		char gender1='F';
		char gender2='M';
		char gender;
		int age;
		age=33;
		if(gender1=='M')
		{
			System.out.println("Ticket is free in government buses");
		}
		else {
			if(age<=12)
			{
				System.out.println("Half Ticket");
			}
			else if(age>12 && age<=59)
			{
				System.out.println("Full ticket");
			}
			else {
				System.out.println("Senior Citizen");
				
			}
			
		}

	}

}
