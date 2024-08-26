package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array_from_Scanner_String_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[3];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Pass the values of String data types one by one");
	    for(int i=0;i<names.length;i++)
	    {
	     names[i]=sc.next();
	    }
	    System.out.println(Arrays.toString(names));
		
		

	}

}
