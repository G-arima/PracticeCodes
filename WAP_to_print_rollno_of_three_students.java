package basicprograms;

import java.util.Arrays;

public class WAP_to_print_rollno_of_three_students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[]=new int[3];
		rollno[0]=24;
		rollno[1]=25;
		rollno[2]=26;
		//First Method
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println("*********************************");
		//Second Way=Using For Loop
		for(int i=0;i<rollno.length;i++) 
		{
		System.out.println(rollno[i]);	
		}
		System.out.println("**************************************");
		//Third Way
		System.out.println(Arrays.toString(rollno));

	}

}
