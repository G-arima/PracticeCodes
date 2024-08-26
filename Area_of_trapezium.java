package basicprograms;

import java.util.Scanner;

public class Area_of_trapezium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter the value of a");
      double a=sc.nextDouble();
      System.out.println("Please enter the value of b");
      double b=sc.nextDouble();
      System.out.println("Please enter the value of h");
      double h=sc.nextDouble();
      double area=(a+b)*h/2;
      System.out.println("Area of trapezium is : " +area);
      
      
      
	}

}
