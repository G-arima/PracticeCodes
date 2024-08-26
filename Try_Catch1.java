package basicprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Hey!!!!Please Enter your Age");
		try {
		int age=s1.nextInt();
		//s1.close();
		}
		catch(InputMismatchException i1)
		{
			Scanner s2=new Scanner(System.in);
			System.out.println("Hey!!!!Please read the question carefully again");
			System.out.println("Enter Age");
			int age1=s2.nextInt();
			//s2.close();
		}
		Scanner s3=new Scanner(System.in);
		System.out.println("Hey!!!!Please Enter your first name");
		String firstname=s3.next();
		//s3.close();
		

	}

}
