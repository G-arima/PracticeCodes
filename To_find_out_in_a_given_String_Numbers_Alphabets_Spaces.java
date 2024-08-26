package basicprograms;

import java.util.Arrays;

public class To_find_out_in_a_given_String_Numbers_Alphabets_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mom no 1";
		char[] s1=s.toCharArray();
		System.out.println(Arrays.toString(s1));
		//Finding Alphabets
		for(int i=0;i<s.length();i++)
		{
			boolean b1=Character.isAlphabetic(s1[i]);
		System.out.println(b1);
		}
		System.out.println("****************************");
		//Finding Numbers
		for(int i=0;i<s.length();i++)
		{
			boolean b2=Character.isDigit(s1[i]);
		System.out.println(b2);
		}
		System.out.println("*********************************");
		//Finding Space
		for(int i=0;i<s.length();i++)
		{
			boolean b3=Character.isSpaceChar(s1[i]);
		System.out.println(b3);
		}

	}

}
