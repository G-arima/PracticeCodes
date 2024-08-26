package basicprograms;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Try_catch2 {
	static String output;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
	
		try {
			System.out.println("ll");
			arr[4]=50;
			
		System.out.println("Array Program");
		}catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Handled the Exception");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("Let's check if it executes or not");
		}
		for(int i=0;i<=4;i++)
		{
			output=Arrays.toString(arr);
		}
		System.out.println("The output of the program is : "+output);

	}
}


