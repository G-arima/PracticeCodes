package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array_from_Scanner_int_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Print the values of int data type one by one");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	     }
		System.out.println(Arrays.toString(a));

}
}
