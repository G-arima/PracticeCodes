package basicprograms;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Let's do addition of two numbers
		Scanner s1=new Scanner(System.in);//Scanner is a pre defined class
		// will not use Scanner_Class for purpose of Object creation here
		System.out.println("Please enter the value of a");
	    int a=s1.nextInt();
	    System.out.println("Please enter the value of b");
	    int b=s1.nextInt();
	    int c=a+b;
	    System.out.println("Sum of the two numbers is : ->" +c);
	
	}

}
