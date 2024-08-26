package basicprograms;

import java.util.Scanner;

public class Area_of_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of Base");
		double base=s1.nextDouble();
		System.out.println("Please enter the value of height");
		double height=s1.nextDouble();
		double area=(base*height)/2;
		System.out.println("The Area of Triangle is : " +area);
		

	}

}
