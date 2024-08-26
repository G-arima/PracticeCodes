package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array_from_Scanner_Double_Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1[]=new double[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the values of the double data type one by one");
		for(int i=0;i<d1.length;i++)
		{
		d1[i]=sc.nextDouble();
		}
		
		System.out.println(Arrays.toString(d1));
		

	}

}
