package basicprograms;

import java.util.Arrays;

public class To_find_out_in_a_given_String_count_of_Alphabet_Space_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mom no 1";
		int countofAlphabet=0;
		int countofNumbers=0;
		int countofSpaces=0;
		
		char[] s1=s.toCharArray();
		System.out.println(Arrays.toString(s1));
		System.out.println("Finding Alphabets");
		for(int i=0;i<s.length();i++)
		{
			boolean b1=Character.isAlphabetic(s1[i]);
			
			//System.out.println(b1);
			if(b1==true)
			{
				countofAlphabet++;
				
			}
		}
		System.out.println("The count of Alphabet is ->" +countofAlphabet++);
		
		System.out.println("Finding Numbers");
		//Finding Numbers
		for(int i=0;i<s.length();i++)
		{
			boolean b2=Character.isDigit(s1[i]);
		//System.out.println(b2);
		if(b2==true)
		{
			countofNumbers++;
		}
		}
		System.out.println("The count of Numbers is ->" +countofNumbers++);
		System.out.println("Finding Spaces");
		//Finding Space
		for(int i=0;i<s.length();i++)
		{
			boolean b3=Character.isSpaceChar(s1[i]);
		//System.out.println(b3);
		if(b3==true)
		{
			countofSpaces++;
		}
		}
		System.out.println("The count of Spaces is ->" +countofSpaces++);

	}

}
