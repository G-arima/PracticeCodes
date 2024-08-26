package basicprograms;

import java.util.Scanner;

public class Circumference_of_circle {
	
	final static double pi=3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of r");
		double r=sc.nextDouble();
		double c=2*pi*r;
		System.out.println("Circumferance of the circle is : " +c);
		
		

	}

}
