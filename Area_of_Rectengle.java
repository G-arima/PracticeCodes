package basicprograms;

import java.util.Scanner;

public class Area_of_Rectengle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of length");
		double l=s1.nextDouble();
		System.out.println("Please enter the value of breadth");
		double b=s1.nextDouble();
		double area_of_rec=l*b;
		System.out.println("Area of the rectengle is : " +area_of_rec);
		
		

	}

}
