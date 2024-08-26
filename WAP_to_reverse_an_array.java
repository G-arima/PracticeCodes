package basicprograms;

import java.util.Arrays;

public class WAP_to_reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int old[]=new int[3];
		old[0]=78;
		old[1]=80;
		old[2]=62;
		int reverse[]=new int[3];
		
		for(int i=0, k=reverse.length-1; i<old.length; i++,k--)
		{
		
		reverse[k]=old[i];
		
		}
		System.out.println("The value of old array is ->");
		System.out.println(Arrays.toString(old));
		System.out.println("The value of reverse array is ->");
		System.out.println(Arrays.toString(reverse));

	}

}
