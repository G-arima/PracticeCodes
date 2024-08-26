package basicprograms;

import java.util.Scanner;

public class Circumference_of_rectengle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of length");
		double l=sc.nextDouble();
		System.out.println("Please enter the value of breadth");
		double b=sc.nextDouble();
		double c=2*(l+b);
		System.out.println("Circumference of rectengle is : " +c);
		
		

	}

}
