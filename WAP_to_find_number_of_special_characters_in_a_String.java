package basicprograms;

import java.util.Arrays;

public class WAP_to_find_number_of_special_characters_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s="Dinu Maurya $1*";
				int lengthofString=s.length();
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
				System.out.println("The count of Alphabet is ->" + countofAlphabet);
				
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
				System.out.println("The count of Numbers is ->" +countofNumbers);
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
				System.out.println("The count of Spaces is ->" +countofSpaces);
				System.out.println("Finding count of Special Characters");
				int countofSpecialCharacters=lengthofString-(countofAlphabet+countofNumbers+countofSpaces);
				System.out.println("The count of Special Characters is ->" +countofSpecialCharacters);

			}

	}


