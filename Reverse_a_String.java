package basicprograms;

public class Reverse_a_String {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String input="anurag";
        String output=" ";
        for(int i=input.length()-1;i>=0;i--)
        {
        	output=output+input.charAt(i);
        	
        }
        System.out.print("The Output of the String is :" +output);
	}

}
