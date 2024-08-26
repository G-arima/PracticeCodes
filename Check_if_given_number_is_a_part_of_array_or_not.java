package basicprograms;

import java.util.Arrays;

public class Check_if_given_number_is_a_part_of_array_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		int givennumber=100;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(givennumber==arr[i])
			{
				System.out.println("Given Number is a part of the Array at index position ->" +i);
			}
				else {
					System.out.println("Given number is not part of Array");
				}
		}
		
	}

}
