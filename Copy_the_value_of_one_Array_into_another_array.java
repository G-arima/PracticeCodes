package basicprograms;

import java.util.Arrays;

public class Copy_the_value_of_one_Array_into_another_array {

	public static void main(String[] args) {
	double Xsalary[]=new double[3];
	Xsalary[0]=50500.55;
	Xsalary[1]=55555.55;
	Xsalary[2]=90900.99;
	double Ysalary[]=new double[3];
	for(int i=0;i<Xsalary.length;i++)
	{
	
	Ysalary[i]=Xsalary[i];

	}
	System.out.println("The value of Old array is -> ");
	System.out.println(Arrays.toString(Xsalary));
	System.out.println("The value of new array after copying from old array is ->");
	System.out.println(Arrays.toString(Ysalary));
	}

}
