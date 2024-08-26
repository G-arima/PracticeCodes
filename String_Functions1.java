package basicprograms;

public class String_Functions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Raju";;
		String s2="Shalu";
		String s3="shalu";
		String s4="Kumar";
		System.out.println(s1.equals(s2));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		System.out.println(s1.concat(" "+ s4));//Raju Kumar

	}

}
