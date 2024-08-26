package basicprograms;

public class Check_if_a_given_string_is_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
		}
		System.out.println("The reverse of this string is -> "+output);
        if(input.equals(output))
        {
        	System.out.println("The given string is a Palindrome");
        }
        else
        {
        	System.out.println("Not a Palindrome");
        }
	}

}
