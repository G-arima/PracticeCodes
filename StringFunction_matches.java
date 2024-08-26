package basicprograms;

public class StringFunction_matches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ramu";
		System.out.println(s.matches("r(.*)"));//true
		System.out.println(s.matches("(.*)u"));//true
		System.out.println(s.matches("(.*)m(.*)"));//true
		System.out.println(s.matches("...."));//true

	}

}
