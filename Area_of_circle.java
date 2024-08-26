package basicprograms;

import java.util.Scanner;

public class Area_of_circle {
	static double pi=Math.PI;

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please enter the value of r");
		
		double r=s1.nextDouble();
		
		System.out.println("Area of the circle is :" +pi*r*r);
		

	}

}
