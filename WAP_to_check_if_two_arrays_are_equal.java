package basicprograms;

import java.util.Arrays;

public class WAP_to_check_if_two_arrays_are_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		int b[]=new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		boolean b1=Arrays.equals(a, b);
		System.out.println(b1);

	}

}
