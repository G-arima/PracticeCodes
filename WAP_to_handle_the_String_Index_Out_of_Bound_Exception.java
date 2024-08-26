package basicprograms;

public class WAP_to_handle_the_String_Index_Out_of_Bound_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Garima";
		int a=s.length();
		System.out.println(a);
		try {
		char b=s.charAt(6);
		}catch(StringIndexOutOfBoundsException a1) {
		System.out.println("Handled the Exception");
		}

	}

}
