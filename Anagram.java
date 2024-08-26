package basicprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="listen";
		String a2="silent";
		if(a1.length()!=a2.length())
		{
			System.out.println("Not Anagram");
		}
		else {
			
			char arr1[]=a1.toCharArray();
			char arr2[]=a2.toCharArray();
		    Arrays.sort(arr1);//[e,i,l,n,t]
			Arrays.sort(arr2);//[e,i,l,n,t]
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			boolean answer=Arrays.equals(arr1, arr2);
			System.out.println(answer);
			if(answer==true)
			{
				System.out.println("The given two strings are Anagram");
			}
			else {
				System.out.println("The given two strings are not Anagram");
			}
		}

	}

}
